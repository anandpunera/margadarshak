package com.margadarshak.travelmantra.dataupdater.restHandler;

import com.google.gson.JsonObject;
import com.margadarshak.travelmantra.dataupdater.DataUpdater;
import com.margadarshak.travelmantra.gateway.FlightInfoRESTHandler;
import com.margadarshak.travelmantra.gateway.IRESTHandler;
import com.margadarshak.travelmantra.urlgenerator.*;

import org.apache.log4j.Logger;
import org.json.JSONException;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class DataUpdateRestHandlerFlightImpl implements DataUpdateRestHandler {
    private static final int SEVEN = 7;
    private SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
	static Logger logger = Logger.getLogger(DataUpdateRestHandlerFlightImpl.class.getName());
    @Override
    public boolean updateDB() {
        return false;
    }

    @Override
    public boolean makeRestCall() throws IOException, JSONException, ParseException, InterruptedException {
        //write code for src and destination
        CityPairsGenerator cityPairsGenerator = new CityPairsGenerator();
        List<CityPair> cityPairList = cityPairsGenerator.getCityPairList();
        String srcCode, destCode;
        int count=0;
        for(CityPair cityPair: cityPairList) {

            String dateString = format.format(new Date());  // Start date
            Calendar c = Calendar.getInstance();
            c.setTime(format.parse(dateString));
            c.add(Calendar.DATE, 1);  // number of days to add
            dateString = format.format(c.getTime());
            boolean[] connectedFlightsDays={false,false,false,false,false,false,false};
            srcCode = cityPairsGenerator.getCityCodesForFlight().get(cityPair.getSource());
            destCode = cityPairsGenerator.getCityCodesForFlight().get(cityPair.getDestination());
            for(int i=0;i<SEVEN;i++)
            {
                JsonObject response;
                IurlGenerator iurlGenerator = new UrlGeneratorFlight();
                count++;
                String url = iurlGenerator.generateUrl(srcCode, destCode, dateString);

                IRESTHandler restHandler = new FlightInfoRESTHandler();
               try {
                   response =  (JsonObject) restHandler.makeRequest(url);
                   if(response.size()>=1) {
                       connectedFlightsDays[getIndexFromDate(dateString)] = true;
                   }
               }
               catch(Exception e)
               {
                  logger.info("OMGGGGGG in catch");
                  logger.info("Sleeping for 20 sec");

                  TimeUnit.SECONDS.sleep(20);
                  logger.info("Slept for 20 sec");
                   response = (JsonObject) restHandler.makeRequest(url);
                   if(response.size()>=1) {
                       connectedFlightsDays[getIndexFromDate(dateString)] = true;
                   }
                   logger.info(restHandler.makeRequest(url));


               }
                Calendar tempCalendar=c;
                tempCalendar.add(Calendar.DAY_OF_MONTH, 1);  // number of days to add
                dateString = format.format(tempCalendar.getTime());

                logger.info("Counter of hits"+count);

            }
            logger.info(" boolean array " + connectedFlightsDays);
        }
        return false;
    }

    private int getIndexFromDate(String dateString) throws ParseException {
        Date date = format.parse(dateString);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("IST"));
        calendar.setTime(date);
        return calendar.get(Calendar.DAY_OF_WEEK)-1;
    }
}

package com.margadarshak.travelmantra.urlgenerator;

import com.margadarshak.travelmantra.utility.FlightRestUrlGeneratorImpl;
import com.margadarshak.travelmantra.utility.RestHelperConstants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UrlGeneratorFlight implements IurlGenerator {
    @Override
    public String generateUrl(String source, String destination, String date) {
        List<String> dynamicParams=new ArrayList<>(Arrays.asList(RestHelperConstants.FLIGHT_API_ID,
                RestHelperConstants.FLIGHT_API_KEY, source, destination, date,"E","1","0","0","100"));
        FlightRestUrlGeneratorImpl flightRestUrlGeneratorImpl=new FlightRestUrlGeneratorImpl();
        String url = flightRestUrlGeneratorImpl.generateUrl(RestHelperConstants.FLIGHT_API, dynamicParams);
        return url;
    }
}

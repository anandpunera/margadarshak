//package com.margadarshak.travelmantra.dataupdater.restHandler;
//
//import com.margadarshak.travelmantra.gateway.BusInfoRESTHandler;
//import com.margadarshak.travelmantra.gateway.IRESTHandler;
//import com.margadarshak.travelmantra.urlgenerator.CityPairsGenerator;
//import com.margadarshak.travelmantra.urlgenerator.IurlGenerator;
//import com.margadarshak.travelmantra.urlgenerator.UrlGeneratorBus;
//import org.json.JSONException;
//
//import java.io.IOException;
//
//public class DataUpdateRestHandlerBusImpl implements DataUpdateRestHandler {
//
//    @Override
//    public boolean updateDB() {
//
//        return false;
//    }
//
//    @Override
//    public boolean makeRestCall() throws IOException, JSONException {
//        IurlGenerator iurlGenerator = new UrlGeneratorBus();
//        //String url = iurlGenerator.generateUrl();
//        //write code for src and destination
//        CityPairsGenerator cityPairsGenerator=new CityPairsGenerator();
//        cityPairsGenerator.getCityPairList();
//
//        IRESTHandler restHandler = new BusInfoRESTHandler();
//        //restHandler.makeRequest(url);
//        return false;
//    }
//}

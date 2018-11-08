//package com.margadarshak.travelmantra.dataupdater.restHandler;
//
//import com.margadarshak.travelmantra.gateway.BusInfoRESTHandler;
//import com.margadarshak.travelmantra.gateway.IRESTHandler;
//import com.margadarshak.travelmantra.gateway.TrainInfoRESTHandler;
//import com.margadarshak.travelmantra.urlgenerator.*;
//import org.json.JSONException;
//
//import java.io.IOException;
//import java.util.List;
//
//public class DataUpdateRestHandlerRailImpl implements DataUpdateRestHandler {
//    @Override
//    public boolean updateDB() {
//        return false;
//    }
//
//    @Override
//    public boolean makeRestCall() throws IOException,JSONException {
//
//        IurlGenerator iurlGenerator = new UrlGeneratorRail();
//        String url = iurlGenerator.generateUrl();
//        CityPairsGenerator cityPairsGenerator=new CityPairsGenerator();
//        //write code for src and destination
//        List<CityPair> cityPairs = cityPairsGenerator.getCityPairList();
//
//        for(CityPair cityPair:cityPairs)
//        {
//            IRESTHandler restHandler = new TrainInfoRESTHandler();
//            restHandler.makeRequest(url, cityPair.getSource(), cityPair.getDestination());
//        }
//        return false;
//    }
//}

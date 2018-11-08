package com.margadarshak.travelmantra.urlgenerator;

import com.google.gson.JsonObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class CityPairsGenerator {
    private List<CityPair> cityPairList = new ArrayList<>();
    private Map<String, String> cityCodesForFlight = new HashMap<>();
    private Map<String, String> cityCodesForTrain = new HashMap<>();
    private Map<String, String> cityCodesForBus = new HashMap<>();

    public CityPairsGenerator() throws IOException, JSONException {
        generateCityPairs();
    }

    public Map<String, String> getCityCodesForFlight() {
        return cityCodesForFlight;
    }

    public Map<String, String> getCityCodesForTrain() {
        return cityCodesForTrain;
    }

    public Map<String, String> getCityCodesForBus() {
        return cityCodesForBus;
    }

    private List<CityPair> generateCityPairs() throws IOException, JSONException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("CityList.json").getFile());
        if( file.exists()) {
            String content = new String(Files.readAllBytes(file.toPath()));
            JSONObject jobj = new JSONObject(content);
            JSONArray jarr = new JSONArray(jobj.getJSONArray("cityList").toString());
            //flight codes from json
            JSONArray flightCodesJsonArray = new JSONArray(jobj.getJSONArray("cityCodeFlight").toString());
            JSONArray railCodesJsonArray = new JSONArray(jobj.getJSONArray("cityCodeRail").toString());

            for(int i=0;i<flightCodesJsonArray.length();i++)
            {
                JSONObject flightCodeObject = flightCodesJsonArray.getJSONObject(i);
                Iterator<String> keys = flightCodeObject.keys();

                while(keys.hasNext()) {
                    String key = keys.next();
                    if (flightCodeObject.get(key) instanceof String) {
                        cityCodesForFlight.put(key,flightCodeObject.get(key).toString());
                    }
                }
            }

            for(int i=0;i<railCodesJsonArray.length();i++)
            {
                JSONObject railCodeObject = railCodesJsonArray.getJSONObject(i);
                Iterator<String> keys = railCodeObject.keys();

                while(keys.hasNext()) {
                    String key = keys.next();
                    if (railCodeObject.get(key) instanceof String) {
                        cityCodesForTrain.put(key, railCodeObject.get(key).toString());
                    }
                }
            }
            String cityName;
            for( int i = 0; i < jarr.length(); i++) {
                 cityName=jarr.getString(i);
                if(cityName.contains("("))
                {
                    cityCodesForBus.put(cityName,cityName.substring(0,cityName.indexOf("(")));
                }
                for( int j = 0; j < jarr.length(); j++) {
                    if(i != j) {
                       cityPairList.add(new CityPair(jarr.getString(i), jarr.getString(j)));
                    }
                }
                System.out.println("list of city pairs: " + cityPairList.size());
            }
        }
        System.out.println("Size of listOf Cities is :" + cityPairList.size());
        System.out.println("Size of flight code map is :" + cityCodesForFlight.size());
        System.out.println("Size of rail code map is :" + cityCodesForTrain.size());
        System.out.println("Size of bus code map is :" + cityCodesForBus.size());

        return null;
    }

    public void setCityPairList(List<CityPair> cityPairList) {
        this.cityPairList = cityPairList;
    }

    public List<CityPair> getCityPairList() throws IOException, JSONException {
        return cityPairList;
    }
}

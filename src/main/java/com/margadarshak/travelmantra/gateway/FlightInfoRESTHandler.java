package com.margadarshak.travelmantra.gateway;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.core.MediaType;

import javax.ws.rs.core.UriBuilder;

import org.apache.http.client.ClientProtocolException;

import com.sun.jersey.api.client.Client;

import com.sun.jersey.api.client.WebResource;

import com.sun.jersey.api.client.config.ClientConfig;

import com.sun.jersey.api.client.config.DefaultClientConfig;


import com.margadarshak.travelmantra.utility.FlightRestUrlGeneratorImpl;
import com.margadarshak.travelmantra.utility.RestHelperConstants;

public class FlightInfoRESTHandler implements RESTHandler{

	@Override
	public Object makeRequest(String url, String src, String dest) throws ClientProtocolException, IOException {
		
		String localUrl = "http://developer.goibibo.com/api/search/?app_id=157ecf62&app_key=a3fecb67a5a59eb5db036728b5cd9342&format=json&source=BLR&destination=LKO&dateofdeparture=20181024&seatingclass=E&adults=1&children=0&infants=0&counter=100";;
		FlightRestUrlGeneratorImpl flightRestUrlGeneratorImpl=new FlightRestUrlGeneratorImpl();
		List<String> dynamicParams=new ArrayList<>(Arrays.asList(RestHelperConstants.FLIGHT_API_ID,RestHelperConstants.FLIGHT_API_KEY,"BLR","LKO","20181024","E","1","0","0","100"));
		String dynamicUrl=flightRestUrlGeneratorImpl.generateUrl(RestHelperConstants.FLIGHT_API, dynamicParams);
		System.out.println(" check equality of urls "+ dynamicUrl.equals(localUrl));
		return getRESTResponse(dynamicUrl);
		
	}
	
	public static Object getRESTResponse(String url) throws ClientProtocolException, IOException {
		  ClientConfig config = new DefaultClientConfig();
		  Client client = Client.create(config);
		  WebResource service = client.resource(UriBuilder.fromUri(url).build());
		  // getting JSON data
		  System.out.println(service.accept(MediaType.APPLICATION_JSON).get(String.class));
		  return service;
		
		 }

}
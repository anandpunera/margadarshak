package com.margadarshak.travelmantra.gateway;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import javax.ws.rs.core.UriBuilder;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import org.apache.http.client.ClientProtocolException;
import org.apache.log4j.Logger;


public class FlightInfoRESTHandler implements IRESTHandler{
	
	static Logger logger = Logger.getLogger(FlightInfoRESTHandler.class.getName());

	@Override
	public Object makeRequest(String url) throws ClientProtocolException, IOException {
		String localUrl = "http://developer.goibibo.com/api/search/?app_id=157ecf62&app_key=a3fecb67a5a59eb5db036728b5cd9342&format=json&source=BLR&destination=LKO&dateofdeparture=20181024&seatingclass=E&adults=1&children=0&infants=0&counter=100";;
		logger.info(" check equality of urls "+ url);
		return getRESTResponse(url);
		
	}
	
	public static Object getRESTResponse(String url) throws ClientProtocolException, IOException {
		  ClientConfig config = new DefaultClientConfig();
		  Client client = Client.create(config);
		  WebResource service = client.resource(UriBuilder.fromUri(url).build());
		  // getting JSON data
		  logger.info(service.accept(MediaType.APPLICATION_JSON).get(String.class));
		  return service;
		 }
}

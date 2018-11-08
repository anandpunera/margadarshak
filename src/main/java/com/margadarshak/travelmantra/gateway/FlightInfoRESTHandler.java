package com.margadarshak.travelmantra.gateway;

import java.io.IOException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import org.apache.http.client.ClientProtocolException;

import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;


public class FlightInfoRESTHandler implements IRESTHandler{

	static Logger logger = Logger.getLogger(FlightInfoRESTHandler.class.getName());

	@Override
	public Object makeRequest(String url) throws ClientProtocolException, IOException {
		logger.info(" check equality of urls "+ url);
		return getRESTResponse(url);
	}

	public static Object getRESTResponse(String url) throws ClientProtocolException, IOException {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(UriBuilder.fromUri(url).build());
		// getting JSON data
		String jsonString = service.accept(MediaType.APPLICATION_JSON).get(String.class);
		logger.info(jsonString);
		JSONObject jsonObject = null;
		try {
			jsonObject = new JSONObject(jsonString);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return jsonObject;
	}
}

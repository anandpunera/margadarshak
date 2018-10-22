package com.margadarshak.travelmantra.gateway;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

public interface RESTHandler {
	public Object makeRequest(String url, String src, String dest) throws ClientProtocolException, IOException;
}

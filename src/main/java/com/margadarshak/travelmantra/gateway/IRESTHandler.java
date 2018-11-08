package com.margadarshak.travelmantra.gateway;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

public interface IRESTHandler {
	public Object makeRequest(String url) throws ClientProtocolException, IOException;
}

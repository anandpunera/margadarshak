package com.margadarshak.travelmantra.gateway;

import java.util.ArrayList;
import java.util.List;

import com.margadarshak.travelmantra.utility.BusRestUrlGeneratorImpl;
import com.margadarshak.travelmantra.utility.RestHelperConstants;

public class BusInfoRESTHandler implements RESTHandler{

	@Override
	public Object makeRequest(String url, String src, String dest) {
		BusRestUrlGeneratorImpl busRestUrlGeneratorImpl=new BusRestUrlGeneratorImpl();
		List<String> dynamicParams=new ArrayList<>();
		busRestUrlGeneratorImpl.generateUrl(RestHelperConstants.BUS_API, dynamicParams);
		return null;
	}
}

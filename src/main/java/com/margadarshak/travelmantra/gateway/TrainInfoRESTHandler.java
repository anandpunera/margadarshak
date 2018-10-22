package com.margadarshak.travelmantra.gateway;

import java.util.ArrayList;
import java.util.List;

import com.margadarshak.travelmantra.utility.RestHelperConstants;
import com.margadarshak.travelmantra.utility.TrainRestUrlGeneratorImpl;

public class TrainInfoRESTHandler implements RESTHandler{

	@Override
	public Object makeRequest(String url, String src, String dest) {
		TrainRestUrlGeneratorImpl trainRestUrlGeneratorImpl=new TrainRestUrlGeneratorImpl();
		List<String> dynamicParams=new ArrayList<>();
		trainRestUrlGeneratorImpl.generateUrl(RestHelperConstants.TRAIN_ROUTE_API, dynamicParams);
		return null;
		
	}
}

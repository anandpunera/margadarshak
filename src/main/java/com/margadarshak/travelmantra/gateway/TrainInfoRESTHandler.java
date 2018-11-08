package com.margadarshak.travelmantra.gateway;

import java.util.ArrayList;
import java.util.List;

import com.margadarshak.travelmantra.utility.RestHelperConstants;
import com.margadarshak.travelmantra.utility.TrainRestUrlGeneratorImpl;

public class TrainInfoRESTHandler implements IRESTHandler{

	@Override
	public Object makeRequest(String url) {
		TrainRestUrlGeneratorImpl trainRestUrlGeneratorImpl=new TrainRestUrlGeneratorImpl();
		List<String> dynamicParams=new ArrayList<>();
		trainRestUrlGeneratorImpl.generateUrl(RestHelperConstants.TRAIN_ROUTE_API, dynamicParams);
		return null;
		
	}
}

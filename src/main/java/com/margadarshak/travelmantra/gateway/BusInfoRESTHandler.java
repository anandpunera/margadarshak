package com.margadarshak.travelmantra.gateway;

import java.util.ArrayList;
import java.util.List;

import com.margadarshak.travelmantra.utility.BusRestUrlGeneratorImpl;
import com.margadarshak.travelmantra.utility.RestHelperConstants;

public class BusInfoRESTHandler implements IRESTHandler{

	@Override
	public Object makeRequest(String url) {
		BusRestUrlGeneratorImpl busRestUrlGeneratorImpl=new BusRestUrlGeneratorImpl();
		List<String> dynamicParams=new ArrayList<>();
		busRestUrlGeneratorImpl.generateUrl(RestHelperConstants.BUS_API, dynamicParams);
		return null;
	}
}

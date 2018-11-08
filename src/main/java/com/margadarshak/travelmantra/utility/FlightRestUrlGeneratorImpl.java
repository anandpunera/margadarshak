package com.margadarshak.travelmantra.utility;

import java.util.List;

public class FlightRestUrlGeneratorImpl implements RestUrlGenerator{

	@Override
	public String generateUrl(String url, List<String> dynamicParams) {
		// TODO Auto-generated method stub
		url = String.format(url, dynamicParams.toArray());
		return url;
	}

}

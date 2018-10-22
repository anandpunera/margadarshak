package com.margadarshak.travelmantra.utility;

import java.util.List;

public interface RestUrlGenerator {

	public String generateUrl(String url,List<String> dynamicParams);
	
}

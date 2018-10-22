package com.margadarshak.travelmantra.margadarshak;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.margadarshak.travelmantra.controller.TravelMantraControllerImpl;

@Component
public class JerseyConfig extends ResourceConfig{
	public JerseyConfig() {
		register(TravelMantraControllerImpl.class);
		
	}
}

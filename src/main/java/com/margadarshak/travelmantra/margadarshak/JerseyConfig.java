package com.margadarshak.travelmantra.margadarshak;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.margadarshak.travelmantra.controller.TravelMantraControllerImpl;
import com.margadarshak.travelmantra.dataupdater.DataUpdater;

@Component
public class JerseyConfig extends ResourceConfig{
	public JerseyConfig() {
		register(TravelMantraControllerImpl.class);
		register(DataUpdater.class);
		
	}
}

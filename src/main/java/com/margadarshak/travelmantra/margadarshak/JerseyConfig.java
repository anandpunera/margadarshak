package com.margadarshak.travelmantra.margadarshak;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.margadarshak.travelmantra.controller.TravelMantraControllerImpl;
import com.margadarshak.travelmantra.dataupdater.DataUpdaterRestInterface;

@Component
public class JerseyConfig extends ResourceConfig{
	public JerseyConfig() {
		register(TravelMantraControllerImpl.class);
    register(DataUpdaterRestInterface.class);
    register(DataUpdater.class);
	}
}

package com.margadarshak.travelmantra.dataupdater;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;


import com.margadarshak.travelmantra.dataupdater.restHandler.DataUpdateRestHandlerFlightImpl;

import org.apache.log4j.Logger;
import org.json.JSONException;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Component;

import com.margadarshak.travelmantra.entity.CityEntity;
import com.margadarshak.travelmantra.entity.ConnectedCityByBus;
import com.margadarshak.travelmantra.entity.ConnectedCityByFlight;
import com.margadarshak.travelmantra.entity.ConnectedCityByTrain;

@Component
@ComponentScan
public class DataUpdater {

	static Logger logger = Logger.getLogger(DataUpdater.class.getName());

	public boolean updateData(MongoOperations mongoOperations) throws IOException, JSONException, ParseException, InterruptedException {
        DataUpdateRestHandlerFlightImpl dataUpdateRestHandlerFlight = new DataUpdateRestHandlerFlightImpl();
        dataUpdateRestHandlerFlight.makeRestCall();
		CityEntity cityEntity = new CityEntity();
		logger.info("cityEnity" + cityEntity.getCityName());

		List<ConnectedCityByBus> connectedCityByBus = new ArrayList<>();
		connectedCityByBus.add(new ConnectedCityByBus());

		List<ConnectedCityByFlight> connectedCityByFlights = new ArrayList<>();
		connectedCityByFlights.add(new ConnectedCityByFlight());

		List<ConnectedCityByTrain> connectedCityByTrains = new ArrayList<>();
		connectedCityByTrains.add(new ConnectedCityByTrain());

		cityEntity.setConnectedCitiesByBus(connectedCityByBus);
		cityEntity.setConnectedCitiesByFlight(connectedCityByFlights);
		cityEntity.setConnectedCitiesByTrain(connectedCityByTrains);
		mongoOperations.save(cityEntity);
		return true;
	}
}

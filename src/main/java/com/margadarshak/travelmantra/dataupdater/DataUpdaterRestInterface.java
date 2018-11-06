package com.margadarshak.travelmantra.dataupdater;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Controller;

import com.margadarshak.travelmantra.entity.CityEntity;
import com.margadarshak.travelmantra.entity.ConnectedCityByBus;
import com.margadarshak.travelmantra.entity.ConnectedCityByFlight;
import com.margadarshak.travelmantra.entity.ConnectedCityByTrain;

@Controller
@Path("/dataupdater")
public class DataUpdaterRestInterface {
	
	@Autowired
	MongoOperations mongoOperations;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage() throws ClientProtocolException, IOException {
		// TODO Auto-generated method stub
		CityEntity cityEntity = new CityEntity();
		System.out.println("cityEnity" + cityEntity.getCityName());

		List<ConnectedCityByBus> connectedCityByBus = new ArrayList<>();
		connectedCityByBus.add(new ConnectedCityByBus());

		List<ConnectedCityByFlight> connectedCityByFlights = new ArrayList<>();

		connectedCityByFlights.add(new ConnectedCityByFlight());
		List<ConnectedCityByTrain> connectedCityByTrains = new ArrayList<>();

		connectedCityByTrains.add(new ConnectedCityByTrain());

		cityEntity.setConnectedCitiesByBus(connectedCityByBus);
		cityEntity.setConnectedCitiesByFlight(connectedCityByFlights);
		cityEntity.setConnectedCitiesByTrain(connectedCityByTrains);
		System.out.println("modnsns" + mongoOperations.toString());
		mongoOperations.save(cityEntity);
		
		return "Tested the response22222";
	}
}

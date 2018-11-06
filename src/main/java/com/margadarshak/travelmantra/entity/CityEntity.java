package com.margadarshak.travelmantra.entity;

import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
@EntityScan
public class CityEntity {

	@Id
	private String cityName="Pune(MAH)";
	
	private List<ConnectedCityByTrain> connectedCitiesByTrain;
	private List<ConnectedCityByFlight> connectedCitiesByFlight;
	private List<ConnectedCityByBus> connectedCitiesByBus;

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public List<ConnectedCityByTrain> getConnectedCitiesByTrain() {
		return connectedCitiesByTrain;
	}

	public void setConnectedCitiesByTrain(List<ConnectedCityByTrain> connectedCitiesByTrain) {
		this.connectedCitiesByTrain = connectedCitiesByTrain;
	}

	public List<ConnectedCityByFlight> getConnectedCitiesByFlight() {
		return connectedCitiesByFlight;
	}

	public void setConnectedCitiesByFlight(List<ConnectedCityByFlight> connectedCitiesByFlight) {
		this.connectedCitiesByFlight = connectedCitiesByFlight;
	}

	public List<ConnectedCityByBus> getConnectedCitiesByBus() {
		return connectedCitiesByBus;
	}

	public void setConnectedCitiesByBus(List<ConnectedCityByBus> connectedCitiesByBus) {
		this.connectedCitiesByBus = connectedCitiesByBus;
	}

}

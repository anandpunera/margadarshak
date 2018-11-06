package com.margadarshak.travelmantra.entity;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class ConnectedCityByBus {

	private String cityName="Chennai(TN)";
	private boolean[] connectedDays = { false, false, false, false, false, false, false };

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public boolean[] getConnectedDays() {
		return connectedDays;
	}

	public void setConnectedDays(boolean[] connectedDays) {
		this.connectedDays = connectedDays;
	}
}

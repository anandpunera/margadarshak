package com.margadarshak.travelmantra.domain;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="cityInfo")
public class CityNode {
	private String cityName="Pune(MAH)";
	private List<ConnectedByTrainCityInfo> connectedByTrainCityInfo;
	private List<ConnectedByAirCityInfo> connectedByAirCityInfo;
	private List<ConnectedByBusCityInfo> connectedByBusCityInfo;


	public List<ConnectedByAirCityInfo> getConnectedByAirCityInfo() {
		return connectedByAirCityInfo;
	}
	public void setConnectedByAirCityInfo(List<ConnectedByAirCityInfo> connectedByAirCityInfo) {
		this.connectedByAirCityInfo = connectedByAirCityInfo;
	}
	public List<ConnectedByBusCityInfo> getConnectedByBusCityInfo() {
		return connectedByBusCityInfo;
	}
	public void setConnectedByBusCityInfo(List<ConnectedByBusCityInfo> connectedByBusCityInfo) {
		this.connectedByBusCityInfo = connectedByBusCityInfo;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public List<ConnectedByTrainCityInfo> getConnectedByTrainCityInfo() {
		return connectedByTrainCityInfo;
	}
	public void setConnectedByTrainCityInfo(List<ConnectedByTrainCityInfo> connectedByTrainCityInfo) {
		this.connectedByTrainCityInfo = connectedByTrainCityInfo;
	}
}

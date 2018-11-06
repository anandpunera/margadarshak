package com.margadarshak.travelmantra.dataupdater;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
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
	public boolean updateData(List<CityEntity> cityEntities) {
		return true;
	}
}

package com.margadarshak.travelmantra.dataupdater;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.http.client.ClientProtocolException;
import org.json.JSONException;
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
	public String getMessage() throws ClientProtocolException, IOException, JSONException, ParseException, InterruptedException {
		// TODO Auto-generated method stub
		new DataUpdater().updateData(mongoOperations);
		return "dataUpdater running...";
	}
}

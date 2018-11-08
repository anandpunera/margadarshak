package com.margadarshak.travelmantra.controller;

import java.io.IOException;

import javax.ws.rs.Path;

import org.apache.http.client.ClientProtocolException;
import org.springframework.stereotype.Controller;

import com.margadarshak.travelmantra.gateway.FlightInfoRESTHandler;

@Controller
@Path("")
public class TravelMantraControllerImpl implements TravelMantraController {

	@Override
	public String getMessage() throws ClientProtocolException, IOException {
		// TODO Auto-generated method stub
		new FlightInfoRESTHandler().makeRequest(" ");
		return "Tested the response1111";
	}

}

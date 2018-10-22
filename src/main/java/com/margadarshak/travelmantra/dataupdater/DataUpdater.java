package com.margadarshak.travelmantra.dataupdater;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.http.client.ClientProtocolException;
import org.springframework.stereotype.Controller;

import com.margadarshak.travelmantra.gateway.FlightInfoRESTHandler;

@Controller
@Path("/dataupdater")
public class DataUpdater {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage() throws ClientProtocolException, IOException {
		// TODO Auto-generated method stub
		new FlightInfoRESTHandler().makeRequest(" ", " ", " ");
		return "Tested the response22222";
	}
}

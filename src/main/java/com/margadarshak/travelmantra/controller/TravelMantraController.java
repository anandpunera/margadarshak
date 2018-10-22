package com.margadarshak.travelmantra.controller;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.http.client.ClientProtocolException;
import org.springframework.stereotype.Controller;

@Controller
@Path("")
public interface TravelMantraController {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage() throws ClientProtocolException, IOException;
}

package com.margadarshak.travelmantra.controller;

import javax.ws.rs.Path;

import org.springframework.stereotype.Controller;

@Controller
@Path("")
public class TravelMantraControllerImpl implements TravelMantraController {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Tested the response1111";
	}

}

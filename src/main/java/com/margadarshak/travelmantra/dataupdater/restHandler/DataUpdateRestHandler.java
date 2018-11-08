package com.margadarshak.travelmantra.dataupdater.restHandler;

import org.json.JSONException;

import java.io.IOException;
import java.text.ParseException;

public interface DataUpdateRestHandler {
    public boolean updateDB();
    public boolean makeRestCall() throws IOException, JSONException, ParseException, InterruptedException;
}

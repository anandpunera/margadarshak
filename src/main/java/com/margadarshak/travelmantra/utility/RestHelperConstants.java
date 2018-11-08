package com.margadarshak.travelmantra.utility;

public class RestHelperConstants {

	public static final String TRAIN_API_KEY = "nvv48ymgs6";
	public static final String TRAIN_API_ID = "";
	public static final String FLIGHT_API_KEY = "a3fecb67a5a59eb5db036728b5cd9342";
	public static final String FLIGHT_API_ID = "157ecf62";
	public static final String BUS_API_KEY = "a3fecb67a5a59eb5db036728b5cd9342";
	public static final String BUS_API_ID = "157ecf62";

	/*
	 * public static final String TRAIN_ROUTE_API=
	 * "https://api.railwayapi.com/v2/between/source/sbc/dest/nzm/date/23-10-2018/apikey/nvv48ymgs6/";
	 * public static final String TRAIN_FAIR_API=
	 * "https://api.railwayapi.com/v2/fare/train/12555/source/gkp/dest/ndls/age/18/pref/SL/quota/PT/date/15-12-2017/apikey/myapikey/";
	 * public static final String FLIGHT_API=
	 * "http://developer.goibibo.com/api/search/?app_id=157ecf62&app_key=a3fecb67a5a59eb5db036728b5cd9342&format=json&source=BLR&destination=LKO&dateofdeparture=20181022&seatingclass=E&adults=1&children=0&infants=0&counter=100";
	 * public static final String BUS_API=
	 * "http://developer.goibibo.com/api/bus/search/?app_id=157ecf62&app_key=a3fecb67a5a59eb5db036728b5cd9342&format=json&source=delhi&destination=bareilly&dateofdeparture=20181022";
	 */

	public static final String TRAIN_ROUTE_API = "https://api.railwayapi.com/v2/between/source/%s/dest/%s/date/%s/apikey/%s/";
	public static final String TRAIN_FAIR_API = "https://api.railwayapi.com/v2/fare/train/%s/source/%s/dest/%s/age/%s/pref/%s/quota/%s/date/%s/apikey/myapikey/";
	public static final String FLIGHT_API = "http://developer.goibibo.com/api/search/?app_id=%s&app_key=%s&format=json&source=%s&destination=%s&dateofdeparture=%s&seatingclass=%s&adults=%s&children=%s&infants=%s&counter=%s";
	public static final String BUS_API = "http://developer.goibibo.com/api/bus/search/?app_id=%s&app_key=%s&format=json&source=%s&destination=%s&dateofdeparture=%s";

}



//http://developer.goibibo.com/api/search/?app_id=157ecf62&app_key=a3fecb67a5a59eb5db036728b5cd9342&format=json&source=BLR&destination=LKO&dateofdeparture=20181124&seatingclass=E&adults=1&children=0&infants=0&counter=100
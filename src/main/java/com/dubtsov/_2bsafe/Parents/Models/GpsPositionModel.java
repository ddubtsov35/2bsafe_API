package com.dubtsov._2bsafe.Parents.Models;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 28.08.17.
 */
public class GpsPositionModel {

    private float lat;
    private float lon;
    private String date;

    private JSONParser parser;
    private Object obj;
    private JSONObject jsonObj;


    public GpsPositionModel(String jsonObjectString) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;
        jsonObj = (JSONObject) jsonObj.get("geo");


        if(jsonObj.get("lat") != null) {setLat(Float.parseFloat(jsonObj.get("lat").toString()));}
        if(jsonObj.get("lon") != null) {setLon(Float.parseFloat(jsonObj.get("lon").toString()));}
        if(jsonObj.get("date") != null) {setDate(jsonObj.get("date").toString());} else{setDate("");}
    }


    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

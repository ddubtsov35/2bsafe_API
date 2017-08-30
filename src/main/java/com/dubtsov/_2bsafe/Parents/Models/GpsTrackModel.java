package com.dubtsov._2bsafe.Parents.Models;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.List;

/**
 * Created by user on 28.08.17.
 */
public class GpsTrackModel {

    private float currentLat;
    private float currentLon;
    private String currentDate;
    private List<Float> lat;
    private List<Float> lon;
    private List<String> date;

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;
    private static JSONArray jsonArray;


    public GpsTrackModel(String jsonObjectString) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;
        jsonArray = (JSONArray) jsonObj.get("track");
        jsonObj = (JSONObject) jsonObj.get("geo");


        if(jsonObj.get("lat") != null) {setCurrentLat(Float.parseFloat(jsonObj.get("lat").toString()));}
        if(jsonObj.get("lon") != null) {setCurrentLon(Float.parseFloat(jsonObj.get("lon").toString()));}
        if(jsonObj.get("date") != null) {setCurrentDate(jsonObj.get("date").toString());} else{setCurrentDate("date");}

        for(int i = 0; i < jsonArray.size(); i++){
            setObjectArray(jsonArray.get(i).toString());
        }
    }

    private void setObjectArray(String jsonObjectString) throws ParseException, java.text.ParseException {
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;

        lat.add(Float.parseFloat(jsonObj.get("lat").toString()));
        lon.add(Float.parseFloat(jsonObj.get("lon").toString()));
        date.add(jsonObj.get("date").toString());

        if(jsonObj.get("lat") != null) {setLat(lat);}
        if(jsonObj.get("lon") != null) {setLon(lon);}
        if(jsonObj.get("date") != null) {setDate(date);}
    }

    @Override
    public String toString() {
        return "GpsTrackModel{" +
                "currentLat=" + currentLat +
                ", currentLon=" + currentLon +
                ", currentDate='" + currentDate + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                ", date=" + date +
                '}';
    }

    public float getCurrentLat() {
        return currentLat;
    }

    public void setCurrentLat(float currentLat) {
        this.currentLat = currentLat;
    }

    public float getCurrentLon() {
        return currentLon;
    }

    public void setCurrentLon(float currentLon) {
        this.currentLon = currentLon;
    }

    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }

    public List<Float> getLat() {
        return lat;
    }

    public void setLat(List<Float> lat) {
        this.lat = lat;
    }

    public List<Float> getLon() {
        return lon;
    }

    public void setLon(List<Float> lon) {
        this.lon = lon;
    }

    public List<String> getDate() {
        return date;
    }

    public void setDate(List<String> date) {
        this.date = date;
    }
}

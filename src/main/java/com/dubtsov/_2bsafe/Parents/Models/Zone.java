package com.dubtsov._2bsafe.Parents.Models;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 30.08.17.
 */
public class Zone {

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;
    private static JSONArray jsonArray;

    private String scs;
    private Integer lat;
    private Integer lon;
    private String name;
    private Float rad;


    public Zone(String jsonObjectString,String scs) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
        setScs(scs);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;
        jsonArray = (JSONArray) jsonObj.get("data");

        if(jsonObj.get("lat") != null) {setLat(Integer.parseInt(jsonObj.get("lat").toString()));}
        if(jsonObj.get("lon") != null) {setLon(Integer.parseInt(jsonObj.get("lon").toString()));}
        if(jsonObj.get("name") != null) {setName(jsonObj.get("name").toString());}
        if(jsonObj.get("rad") != null) {setRad(Float.parseFloat(jsonObj.get("rad").toString()));}

    }

    @Override
    public String toString() {
        return "Zone{" +
                "scs='" + scs + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                ", name='" + name + '\'' +
                ", rad=" + rad +
                '}';
    }

    public String getScs() {
        return scs;
    }

    public void setScs(String scs) {
        this.scs = scs;
    }

    public Integer getLat() {
        return lat;
    }

    public void setLat(Integer lat) {
        this.lat = lat;
    }

    public Integer getLon() {
        return lon;
    }

    public void setLon(Integer lon) {
        this.lon = lon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getRad() {
        return rad;
    }

    public void setRad(Float rad) {
        this.rad = rad;
    }
}

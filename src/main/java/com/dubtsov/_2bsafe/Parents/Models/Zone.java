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

    private JSONParser parser;
    private Object obj;

    private String scs;
    private Float lat;
    private Float lon;
    private String name;
    private Float rad;


    public Zone(String jsonObjectString,String scs) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
        setScs(scs);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        JSONObject jsonObj = (JSONObject) obj;
        JSONArray jsonArray = (JSONArray) jsonObj.get("data");

        if(jsonObj.get("lat") != null) {setLat(Float.parseFloat(jsonObj.get("lat").toString()));} else {setLat(null);}
        if(jsonObj.get("lon") != null) {setLon(Float.parseFloat(jsonObj.get("lon").toString()));} else {setLon(null);}
        if(jsonObj.get("name") != null) {setName(jsonObj.get("name").toString());}
        if(jsonObj.get("rad") != null) {setRad(Float.parseFloat(jsonObj.get("rad").toString()));} else {setRad(null);}

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

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Float getLon() {
        return lon;
    }

    public void setLon(Float lon) {
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

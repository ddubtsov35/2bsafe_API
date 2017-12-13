package com.dubtsov._2bsafe.Parents.Models;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 20.07.17.
 */
public class Device {

    private JSONObject jsonObj;

    private Integer cid;
    private String date;
    private Integer bat;
    private Integer sig;
    private Geo geo;

    private static JSONParser parser;
    private static Object obj;

    private JSONParser parser2;
    private Object obj2;
    private JSONObject jsonObj2;

    public Device(String jsonObjectString) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;

        if(jsonObj.get("cid") != null) {setCid(Integer.parseInt(jsonObj.get("cid").toString()));} else {setCid(null);}
        if(jsonObj.get("date") != null) {setDate(jsonObj.get("date").toString());} else {setDate(null);}
        if(jsonObj.get("bat") != null) {setBat(Integer.parseInt(jsonObj.get("bat").toString()));} else {setBat(null);}
        if(jsonObj.get("sig") != null) {setSig(Integer.parseInt(jsonObj.get("sig").toString()));} else {setSig(null);}

        jsonObj = (JSONObject) jsonObj.get("geo");
        if (!jsonObj.isEmpty()) {
            geo = new Device.Geo(jsonObj.toString());
        }
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getBat() {
        return bat;
    }

    public void setBat(Integer bat) {
        this.bat = bat;
    }

    public Integer getSig() {
        return sig;
    }

    public void setSig(Integer sig) {
        this.sig = sig;
    }

    public static JSONParser getParser() {
        return parser;
    }

    public static void setParser(JSONParser parser) {
        Device.parser = parser;
    }

    public static Object getObj() {
        return obj;
    }

    public static void setObj(Object obj) {
        Device.obj = obj;
    }


    private class Geo{

        private float lat;
        private float lon;

        public Geo(String jsonObjectString) throws ParseException, java.text.ParseException {
            setObject(jsonObjectString);
        }

        private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
            parser2 = new JSONParser();
            obj2 = parser2.parse(jsonObjectString);
            jsonObj2 = (JSONObject) obj2;

            if(jsonObj2.get("lat") != null) {setLat(Float.parseFloat(jsonObj2.get("lat").toString()));}
            if(jsonObj2.get("lon") != null) {setLon(Float.parseFloat(jsonObj2.get("lon").toString()));}
        }

        @Override
        public String toString() {
            return "Geo{" +
                    "lat=" + lat +
                    ", lon=" + lon +
                    '}';
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
    }
}

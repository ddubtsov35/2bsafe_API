package com.dubtsov._2bsafe.Models;

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

    private String jsonObjectString;
    private List<Device> deviceList;

    private int cid;
    private String date;
    private int bat;
    private int sig;
    private List<Float> geo;

    private static JSONParser parser;
    private static Object obj;
    private static JSONArray jsonArray;
    private static JSONObject jsonObject;

    public Device(String jsonObjectString){
        this.jsonObjectString = jsonObjectString;
    }

    public List<Device> getDeviceList() throws ParseException {
        deviceList = new ArrayList<>();
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonArray = (JSONArray) jsonObject.get("device");
        for (int i = 0; i < jsonArray.size(); i++) {
            deviceList.add(new Device(jsonArray.get(i).toString()));
        }
        return deviceList;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getBat() {
        return bat;
    }

    public void setBat(int bat) {
        this.bat = bat;
    }

    public int getSig() {
        return sig;
    }

    public void setSig(int sig) {
        this.sig = sig;
    }

    public List<Float> getGeo() {
        return geo;
    }

    public void setGeo(List<Float> geo) {
        this.geo = geo;
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
}

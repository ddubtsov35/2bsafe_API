package com.dubtsov._2bsafe.Parents.Models;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 01.09.17.
 */
public class Permission {

    private String scs;
    private int geo;
    private int wifi;
    private int datetime;
    private int bt;
    private int tether;
    private int gsm;

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;
    private static JSONArray jsonArray;


    public Permission(String jsonObjectString, String scs) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
        setScs(scs);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;

        if(jsonObj.get("geo") != null) {setGeo(Integer.parseInt(jsonObj.get("geo").toString()));}
        if(jsonObj.get("wifi") != null) {setWifi(Integer.parseInt(jsonObj.get("wifi").toString()));}
        if(jsonObj.get("datetime") != null) {setDatetime(Integer.parseInt(jsonObj.get("datetime").toString()));}
        if(jsonObj.get("bt") != null) {setBt(Integer.parseInt(jsonObj.get("bt").toString()));}
        if(jsonObj.get("tether") != null) {setTether(Integer.parseInt(jsonObj.get("tether").toString()));}
        if(jsonObj.get("gsm") != null) {setGsm(Integer.parseInt(jsonObj.get("gsm").toString()));}

    }

    @Override
    public String toString() {
        return "Permission{" +
                "scs='" + scs + '\'' +
                ", geo=" + geo +
                ", wifi=" + wifi +
                ", datetime=" + datetime +
                ", bt=" + bt +
                ", tether=" + tether +
                ", gsm=" + gsm +
                '}';
    }

    public String getScs() {
        return scs;
    }

    public void setScs(String scs) {
        this.scs = scs;
    }

    public int getGeo() {
        return geo;
    }

    public void setGeo(int geo) {
        this.geo = geo;
    }

    public int getWifi() {
        return wifi;
    }

    public void setWifi(int wifi) {
        this.wifi = wifi;
    }

    public int getDatetime() {
        return datetime;
    }

    public void setDatetime(int datetime) {
        this.datetime = datetime;
    }

    public int getBt() {
        return bt;
    }

    public void setBt(int bt) {
        this.bt = bt;
    }

    public int getTether() {
        return tether;
    }

    public void setTether(int tether) {
        this.tether = tether;
    }

    public int getGsm() {
        return gsm;
    }

    public void setGsm(int gsm) {
        this.gsm = gsm;
    }
}

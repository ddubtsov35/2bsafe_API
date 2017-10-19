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
    private Integer geo;
    private Integer wifi;
    private Integer datetime;
    private Integer bt;
    private Integer tether;
    private Integer gsm;

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;
    private static JSONArray jsonArray;


    public Permission(String jsonObjectString) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;

        try {
            if (jsonObj.get("scs") != null) { setScs(jsonObj.get("scs").toString()); } else { setScs(null); }
           } catch (Exception e){
            setScs(null);
        }


        jsonObj = (JSONObject) jsonObj.get("data");

        try {
            if (jsonObj.get("geo") != null) { setGeo(Integer.parseInt(jsonObj.get("geo").toString())); } else { setGeo(null); }
            if (jsonObj.get("wifi") != null) { setWifi(Integer.parseInt(jsonObj.get("wifi").toString())); } else { setWifi(null); }
            if (jsonObj.get("datetime") != null) { setDatetime(Integer.parseInt(jsonObj.get("datetime").toString())); } else { setDatetime(null); }
            if (jsonObj.get("bt") != null) { setBt(Integer.parseInt(jsonObj.get("bt").toString())); } else { setBt(null); }
            if (jsonObj.get("tether") != null) { setTether(Integer.parseInt(jsonObj.get("tether").toString())); } else { setTether(null); }
            if (jsonObj.get("gsm") != null) { setGsm(Integer.parseInt(jsonObj.get("gsm").toString())); } else { setGeo(null); }
        } catch (Exception e){
            setGeo(null);
            setWifi(null);
            setDatetime(null);
            setBt(null);
            setTether(null);
            setGsm(null);
        }
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

    public Integer getGeo() {
        return geo;
    }

    public void setGeo(Integer geo) {
        this.geo = geo;
    }

    public Integer getWifi() {
        return wifi;
    }

    public void setWifi(Integer wifi) {
        this.wifi = wifi;
    }

    public Integer getDatetime() {
        return datetime;
    }

    public void setDatetime(Integer datetime) {
        this.datetime = datetime;
    }

    public Integer getBt() {
        return bt;
    }

    public void setBt(Integer bt) {
        this.bt = bt;
    }

    public Integer getTether() {
        return tether;
    }

    public void setTether(Integer tether) {
        this.tether = tether;
    }

    public Integer getGsm() {
        return gsm;
    }

    public void setGsm(Integer gsm) {
        this.gsm = gsm;
    }
}

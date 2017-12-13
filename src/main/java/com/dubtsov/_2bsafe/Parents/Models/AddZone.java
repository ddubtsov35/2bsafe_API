package com.dubtsov._2bsafe.Parents.Models;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 31.08.17.
 */
public class AddZone {

    private String scs;
    private Integer zone_id;

    private JSONParser parser;
    private Object obj;
    private JSONObject jsonObj;


    public AddZone(String jsonObjectString) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;

        if(jsonObj.get("scs") != null) {setScs(jsonObj.get("scs").toString());}
        if(jsonObj.get("zone_id") != null) {setZone_id(Integer.parseInt(jsonObj.get("zone_id").toString()));}else{setZone_id(null);}

    }

    @Override
    public String toString() {
        return "AddZone{" +
                "scs='" + scs + '\'' +
                ", zone_id=" + zone_id +
                '}';
    }

    public String getScs() {
        return scs;
    }

    public void setScs(String scs) {
        this.scs = scs;
    }

    public Integer getZone_id() {
        return zone_id;
    }

    public void setZone_id(Integer zone_id) {
        this.zone_id = zone_id;
    }
}

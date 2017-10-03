package com.dubtsov._2bsafe.Parents.Models;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.List;

/**
 * Created by user on 31.08.17.
 */
public class AddIntervalBlock {

    private String scs;
    private Integer intervals;

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;


    public AddIntervalBlock(String jsonObjectString) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;

        if(jsonObj.get("scs") != null) {setScs(jsonObj.get("scs").toString());}
        if(jsonObj.get("intervals") != null) {setIntervals(Integer.parseInt(jsonObj.get("intervals").toString()));}
    }

    @Override
    public String toString() {
        return "AddIntervalBlock{" +
                "scs='" + scs + '\'' +
                ", intervals=" + intervals +
                '}';
    }

    public String getScs() {
        return scs;
    }

    public void setScs(String scs) {
        this.scs = scs;
    }

    public Integer getIntervals() {
        return intervals;
    }

    public void setIntervals(Integer intervals) {
        this.intervals = intervals;
    }
}

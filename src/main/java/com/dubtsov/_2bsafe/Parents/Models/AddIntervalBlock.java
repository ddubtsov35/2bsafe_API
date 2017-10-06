package com.dubtsov._2bsafe.Parents.Models;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 31.08.17.
 */
public class AddIntervalBlock {

    private String scs;
    private List<Integer> intervals;

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;


    public AddIntervalBlock(String jsonObjectString) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        intervals = new ArrayList<>();
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;

        if(jsonObj.get("scs") != null) {setScs(jsonObj.get("scs").toString());} else{setScs(null);}

        JSONArray jsonArray = (JSONArray) jsonObj.get("intervals");
        for(int i = 0; i < jsonArray.size(); i++) {
            if (jsonArray.get(i) != null) {
                intervals.add(Integer.parseInt(jsonArray.get(i).toString()));
            } else {
                intervals.add(null);
            }
        }
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

    public List<Integer> getIntervals() {
        return intervals;
    }

}

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
public class IntervalBlock {

    private String scs;
    private int id;
    private int type;
    private String interval_start;
    private String interval_end;
    private List<Integer> repeat;

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;
    private static JSONArray jsonArray;


    public IntervalBlock(String jsonObjectString, String scs) throws ParseException, java.text.ParseException {
        setScs(scs);
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        repeat = new ArrayList<>();
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;

        if(jsonObj.get("id") != null) {setId(Integer.parseInt(jsonObj.get("id").toString()));}
        if(jsonObj.get("type") != null) {setType(Integer.parseInt(jsonObj.get("type").toString()));}
        if(jsonObj.get("interval_start") != null) {setInterval_start(jsonObj.get("interval_start").toString());}
        if(jsonObj.get("interval_end") != null) {setInterval_end(jsonObj.get("interval_end").toString());}

        jsonArray = (JSONArray) jsonObj.get("repeat");
        if(!jsonArray.isEmpty()) {
            for (int i = 0; i < jsonArray.size(); i++) {
                repeat.add(Integer.parseInt(jsonArray.get(i).toString()));
                }
        }
    }


    @Override
    public String toString() {
        return "IntervalBlock{" +
                "scs='" + scs + '\'' +
                ", id=" + id +
                ", type=" + type +
                ", interval_start=" + interval_start +
                ", interval_end=" + interval_end +
                ", repeat=" + repeat +
                '}';
    }

    public String getScs() {
        return scs;
    }

    public void setScs(String scs) {
        this.scs = scs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getInterval_start() {
        return interval_start;
    }

    public void setInterval_start(String interval_start) {
        this.interval_start = interval_start;
    }

    public String getInterval_end() {
        return interval_end;
    }

    public void setInterval_end(String interval_end) {
        this.interval_end = interval_end;
    }

    public List<Integer> getRepeat() {
        return repeat;
    }

    public void setRepeat(List<Integer> repeat) {
        this.repeat = repeat;
    }
}

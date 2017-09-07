package com.dubtsov._2bsafe.Parents.Models;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 30.08.17.
 */
public class PollTittle {

    private String scs;
    private int pid;
    private String title;

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;

    public PollTittle(String jsonObjectString) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;

        if(jsonObj.get("scs") != null) {setScs(jsonObj.get("scs").toString());}

        jsonObj = (JSONObject) jsonObj.get("data");
        jsonObj = (JSONObject) jsonObj.get("poll");
        if(jsonObj.get("pid") != null) {setPid(Integer.parseInt(jsonObj.get("pid").toString()));}
        if(jsonObj.get("title") != null) {setTitle(jsonObj.get("title").toString());}
    }

    @Override
    public String toString() {
        return "PollTittle{" +
                "scs='" + scs + '\'' +
                ", pid=" + pid +
                ", title='" + title + '\'' +
                '}';
    }

    public String getScs() {
        return scs;
    }

    public void setScs(String scs) {
        this.scs = scs;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

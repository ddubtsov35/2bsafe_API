package com.dubtsov._2bsafe.Parents.Models;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.List;

/**
 * Created by user on 30.08.17.
 */
public class Poll {

    private String scs;
    private String query;
    private String title;
    private int type;
    private List<Integer> vid;
    private List<String> options;
    private List<String> txt;

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;
    private static JSONArray jsonArray;


    public Poll(String jsonObjectString) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;
        jsonObj = (JSONObject) jsonObj.get("data");
        jsonArray = (JSONArray) jsonObj.get("vars");



        if(jsonObj.get("scs") != null) {setScs(jsonObj.get("scs").toString());}
        if(jsonObj.get("query") != null) {setQuery(jsonObj.get("query").toString());}
        if(jsonObj.get("title") != null) {setTitle(jsonObj.get("title").toString());}
        if(jsonObj.get("type") != null) {setType(Integer.parseInt(jsonObj.get("type").toString()));}

        for(int i = 0; i < jsonArray.size(); i++){
            setObjectArray(jsonArray.get(i).toString());
        }
    }

    private void setObjectArray(String jsonObjectString) throws ParseException, java.text.ParseException {
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;

        vid.add(Integer.parseInt(jsonObj.get("vid").toString()));
        txt.add(jsonObj.get("txt").toString());
        options.add(jsonObj.get("options").toString());

        if(jsonObj.get("vid") != null) {setVid(vid);}
        if(jsonObj.get("txt") != null) {setTxt(txt);}
        if(jsonObj.get("options") != null) {setOptions(options);}
    }


    public String getScs() {
        return scs;
    }

    public void setScs(String scs) {
        this.scs = scs;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<Integer> getVid() {
        return vid;
    }

    public void setVid(List<Integer> vid) {
        this.vid = vid;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public List<String> getTxt() {
        return txt;
    }

    public void setTxt(List<String> txt) {
        this.txt = txt;
    }
}

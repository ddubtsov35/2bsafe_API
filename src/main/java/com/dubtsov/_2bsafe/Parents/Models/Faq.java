package com.dubtsov._2bsafe.Parents.Models;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 30.08.17.
 */
public class Faq {

    private JSONParser parser;
    private Object obj;
    private JSONObject jsonObj;

    private int pos;
    private String label;
    private String title;
    private int fid;

    public Faq(String jsonObjectString) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;
        if(jsonObj.get("pos") != null) {setPos(Integer.parseInt(jsonObj.get("pos").toString()));}
        if(jsonObj.get("label") != null) {setLabel(jsonObj.get("label").toString());}
        if(jsonObj.get("title") != null) {setTitle(jsonObj.get("title").toString());}
        if(jsonObj.get("fid") != null) {setFid(Integer.parseInt(jsonObj.get("fid").toString()));}
    }


    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }
}

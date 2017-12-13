package com.dubtsov._2bsafe.Parents.Models;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 31.08.17.
 */
public class GroupApp {

    private String scs;
    private Integer group_id;

    private JSONParser parser;
    private Object obj;
    private JSONObject jsonObj;

    public GroupApp(String jsonObjectString) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;

        if(jsonObj.get("scs") != null) {setScs(jsonObj.get("scs").toString());}
        if(jsonObj.get("group_id") != null) {setGroup_id(Integer.parseInt(jsonObj.get("group_id").toString()));}else{setGroup_id(null);}
    }

    @Override
    public String toString() {
        return "GroupApp{" +
                "scs='" + scs + '\'' +
                ", group_id=" + group_id +
                '}';
    }

    public String getScs() {
        return scs;
    }

    public void setScs(String scs) {
        this.scs = scs;
    }

    public Integer getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Integer group_id) {
        this.group_id = group_id;
    }
}

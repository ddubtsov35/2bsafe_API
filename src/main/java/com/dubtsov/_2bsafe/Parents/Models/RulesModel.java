package com.dubtsov._2bsafe.Parents.Models;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by user on 29.08.17.
 */
public class RulesModel {

    private int id;
    private String name;
    private List<Integer> profiles;
    private String triggers;
    private String actions;

    private int intTriggers;
    private String dataTriggers;

    private int intActions;
    private String dataActions;

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;
    private static JSONArray jsonArray;
    private static JSONObject jsonObj2;
    private static JSONObject jsonObj3;

    public RulesModel(String jsonObjectString) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;

        jsonObj2 = (JSONObject) jsonObj.get("triggers");
        jsonObj3 = (JSONObject) jsonObj.get("actions");
        if(jsonObj.get("id") != null) {setId(Integer.parseInt(jsonObj.get("id").toString()));}
        if(jsonObj.get("name") != null) {setName(jsonObj.get("name").toString());}
        if(jsonObj2.get("triggers") != null) {setTriggers(jsonObj2.get("triggers").toString());}
        if(jsonObj3.get("actions") != null) {jsonObj3.get("actions").toString();}
        //profiles.add(Integer.parseInt(jsonObj.get("profiles").toString()));
        if(jsonObj.get("profiles") != null) {setProfiles(profiles);}
    }

    @Override
    public String toString() {
        return "RulesModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", profiles=" + profiles +
                ", triggers='" + triggers + '\'' +
                ", actions='" + actions + '\'' +
                ", intTriggers=" + intTriggers +
                ", dataTriggers='" + dataTriggers + '\'' +
                ", intActions=" + intActions +
                ", dataActions='" + dataActions + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<Integer> profiles) {
        this.profiles = profiles;
    }

    public String getTriggers() {
        return triggers;
    }

    public void setTriggers(String triggers) {
        this.triggers = triggers;
    }

    public String getActions() {
        return actions;
    }

    public void setActions(String actions) {
        this.actions = actions;
    }
}

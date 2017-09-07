package com.dubtsov._2bsafe.Childrens.Models;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 23.08.17.
 */
public class ProfileCard {

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;

    private int profile_id;
    private String name;
    private int age;
    private int busy;

    public ProfileCard(){};

    public ProfileCard(String jsonObjectString) throws ParseException, java.text.ParseException {
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;

        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        if(jsonObj.get("profile_id") != null) {setProfile_id(Integer.parseInt(jsonObj.get("profile_id").toString()));}
        if(jsonObj.get("name") != null) {setName(jsonObj.get("name").toString());} else{setName(null);}
        if(jsonObj.get("age") != null) {setAge(Integer.parseInt(jsonObj.get("age").toString()));}
        if(jsonObj.get("busy") != null) {setBusy(Integer.parseInt(jsonObj.get("busy").toString()));}
    }

    public int getProfile_id() {
        return profile_id;
    }

    public void setProfile_id(int profile_id) {
        this.profile_id = profile_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBusy() {
        return busy;
    }

    public void setBusy(int busy) {
        this.busy = busy;
    }
}

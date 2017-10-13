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

    private String scs;
    private Integer profile_id;
    private String name;
    private Integer age;
    private Integer busy;

    public ProfileCard(String jsonObjectString, String scs) throws ParseException, java.text.ParseException {
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;

        setScs(scs);
        setObject();
    }

    private void setObject() throws ParseException, java.text.ParseException {
        if(jsonObj.get("profile_id") != null) {setProfile_id(Integer.parseInt(jsonObj.get("profile_id").toString()));} else {setProfile_id(null);}
        if(jsonObj.get("name") != null) {setName(jsonObj.get("name").toString());} else{setName(null);}
        if(jsonObj.get("age") != null) {setAge(Integer.parseInt(jsonObj.get("age").toString()));} else {setAge(null);}
        if(jsonObj.get("busy") != null) {setBusy(Integer.parseInt(jsonObj.get("busy").toString()));} else {setBusy(null);}
    }

    @Override
    public String toString() {
        return "ProfileCard{" +
                "scs='" + scs + '\'' +
                ", profile_id=" + profile_id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", busy=" + busy +
                '}';
    }

    public Integer getProfile_id() {
        return profile_id;
    }

    public void setProfile_id(Integer profile_id) {
        this.profile_id = profile_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getBusy() {
        return busy;
    }

    public void setBusy(Integer busy) {
        this.busy = busy;
    }

    public String getScs() {
        return scs;
    }

    public void setScs(String scs) {
        this.scs = scs;
    }
}

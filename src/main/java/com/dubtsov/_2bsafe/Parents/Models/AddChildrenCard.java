package com.dubtsov._2bsafe.Parents.Models;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 11.09.17.
 */
public class AddChildrenCard {

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;

    private String scs;
    private String profile_id;

    public AddChildrenCard(String jsonObjectString) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;
        if(jsonObj.get("scs") != null) {setScs(jsonObj.get("scs").toString());}
        if(jsonObj.get("profile_id") != null) {setProfile_id(jsonObj.get("profile_id").toString());}
    }

    @Override
    public String toString() {
        return "AddChildrenCard{" +
                "scs='" + scs + '\'' +
                ", profile_id='" + profile_id + '\'' +
                '}';
    }

    public String getScs() {
        return scs;
    }

    public void setScs(String scs) {
        this.scs = scs;
    }

    public String getProfile_id() {
        return profile_id;
    }

    public void setProfile_id(String profile_id) {
        this.profile_id = profile_id;
    }
}

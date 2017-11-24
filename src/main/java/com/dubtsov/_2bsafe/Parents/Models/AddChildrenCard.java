package com.dubtsov._2bsafe.Parents.Models;

import com.dubtsov._2bsafe.Parents.Pool.ChildrenCardPool;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 11.09.17.
 */
public class AddChildrenCard {

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;

    private String scs;
    private int profile_id;

    public AddChildrenCard(String jsonObjectString) throws ParseException, java.text.ParseException, IOException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException, IOException {
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;
        if(jsonObj.get("scs") != null) {setScs(jsonObj.get("scs").toString());}
        if(jsonObj.get("profile_id") != null) {setProfile_id(Integer.parseInt(jsonObj.get("profile_id").toString()));}
        ChildrenCardPool.setChildrenCard(jsonObj);
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

    public int getProfile_id() {
        return profile_id;
    }

    public void setProfile_id(int profile_id) {
        this.profile_id = profile_id;
    }
}

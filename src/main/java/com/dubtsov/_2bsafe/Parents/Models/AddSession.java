package com.dubtsov._2bsafe.Parents.Models;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 31.08.17.
 */
public class AddSession {

    private String scs;
    private String ses_key;

    private JSONParser parser;
    private Object obj;
    private JSONObject jsonObj;


    public AddSession(String jsonObjectString) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;

        if(jsonObj.get("scs") != null) {setScs(jsonObj.get("scs").toString());}
        if(jsonObj.get("ses_key") != null) {setSes_key(jsonObj.get("ses_key").toString());}

    }

    @Override
    public String toString() {
        return "AddSession{" +
                "scs='" + scs + '\'' +
                ", ses_key='" + ses_key + '\'' +
                '}';
    }

    public String getScs() {
        return scs;
    }

    public void setScs(String scs) {
        this.scs = scs;
    }

    public String getSes_key() {
        return ses_key;
    }

    public void setSes_key(String ses_key) {
        this.ses_key = ses_key;
    }
}

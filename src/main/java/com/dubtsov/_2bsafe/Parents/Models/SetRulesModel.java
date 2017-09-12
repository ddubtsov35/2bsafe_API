package com.dubtsov._2bsafe.Parents.Models;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 12.09.17.
 */
public class SetRulesModel {

    private String scs;
    private int rule_id;

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;


    public SetRulesModel(String jsonObjectString) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;

        if(jsonObj.get("scs") != null) {setScs(jsonObj.get("scs").toString());}
        if(jsonObj.get("rule_id") != null) {setRule_id(Integer.parseInt(jsonObj.get("rule_id").toString()));}

    }

    @Override
    public String toString() {
        return "SetRulesModel{" +
                "scs='" + scs + '\'' +
                ", rule_id=" + rule_id +
                '}';
    }

    public String getScs() {
        return scs;
    }

    public void setScs(String scs) {
        this.scs = scs;
    }

    public int getRule_id() {
        return rule_id;
    }

    public void setRule_id(int rule_id) {
        this.rule_id = rule_id;
    }
}

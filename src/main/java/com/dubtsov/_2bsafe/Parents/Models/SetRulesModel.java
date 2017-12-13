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
    private Integer rule_id;

    private JSONParser parser;
    private Object obj;


    public SetRulesModel(String jsonObjectString) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        JSONObject jsonObj = (JSONObject) obj;

        try {
            if (jsonObj.get("scs") != null) { setScs(jsonObj.get("scs").toString()); } else {setScs(null);}
            if (jsonObj.get("rule_id") != null) { setRule_id(Integer.parseInt(jsonObj.get("rule_id").toString())); } else { setRule_id(null); }
        } catch (Exception e){
            setScs(null);
            setRule_id(null);
        }
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

    public Integer getRule_id() {
        return rule_id;
    }

    public void setRule_id(Integer rule_id) {
        this.rule_id = rule_id;
    }
}

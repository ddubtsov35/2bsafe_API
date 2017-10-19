package com.dubtsov._2bsafe.Parents.Models;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 12.09.17.
 */
public class TurboButton {

    private String scs;
    private Integer turbo;

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;

    public TurboButton(String jsonObjectString) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;
        if(jsonObj.get("scs") != null) {setScs(jsonObj.get("scs").toString());}

        jsonObj = (JSONObject) jsonObj.get("data");
        try {
            if (jsonObj.get("turbo") != null) { setTurbo(Integer.parseInt(jsonObj.get("turbo").toString())); }
        } catch (Exception e){
            setTurbo(null);
        }
    }

    @Override
    public String toString() {
        return "TurboButton{" +
                "scs='" + scs + '\'' +
                ", turbo=" + turbo +
                '}';
    }

    public String getScs() {
        return scs;
    }

    public void setScs(String scs) {
        this.scs = scs;
    }

    public Integer getTurbo() {
        return turbo;
    }

    public void setTurbo(Integer turbo) {
        this.turbo = turbo;
    }
}

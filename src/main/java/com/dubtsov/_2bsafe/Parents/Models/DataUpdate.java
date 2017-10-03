package com.dubtsov._2bsafe.Parents.Models;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 28.08.17.
 */
public class DataUpdate {

    private String scs;
    private int ito;

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;


    public DataUpdate(String jsonObjectString) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;
        if(jsonObj.get("data") != null) {
            jsonObj = (JSONObject) jsonObj.get("data");
            if (jsonObj.get("scs") != null) {setScs(jsonObj.get("scs").toString());}
            if (jsonObj.get("ito") != null) {setIto(Integer.parseInt(jsonObj.get("ito").toString()));}
        } else{
            return;
        }
    }

    @Override
    public String toString() {
        return "DataUpdate{" +
                "scs='" + scs + '\'' +
                ", ito=" + ito +
                '}';
    }

    public int getIto() {
        return ito;
    }

    public void setIto(int ito) {
        this.ito = ito;
    }

    public String getScs() {
        return scs;
    }

    public void setScs(String scs) {
        this.scs = scs;
    }
}

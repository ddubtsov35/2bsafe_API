package com.dubtsov._2bsafe.Parents.Models;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 28.08.17.
 */
public class GetDataUpdate {

    private int ito;

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;


    public GetDataUpdate(String jsonObjectString) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;
        jsonObj = (JSONObject) jsonObj.get("data");


        System.out.println("jsonObj.get(\"ito\") " + jsonObj.get("ito"));
        if(jsonObj.get("ito") != null) {setIto(Integer.parseInt(jsonObj.get("ito").toString()));}
        if(jsonObj.get("turbo") != null) {setIto(Integer.parseInt(jsonObj.get("turbo").toString()));}
    }

    public int getIto() {
        return ito;
    }

    public void setIto(int ito) {
        this.ito = ito;
    }
}

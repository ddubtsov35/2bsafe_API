package com.dubtsov._2bsafe.Parents.Models;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 28.08.17.
 */
public class DataUpdate {

    private String scs;
    private Integer ito;

    private JSONParser parser;
    private Object obj;


    public DataUpdate(String jsonObjectString) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        JSONObject jsonObj = (JSONObject) obj;

        try {
            if (jsonObj.get("scs") != null) {setScs(jsonObj.get("scs").toString());} else {setScs(null);}
        } catch (Exception e){
            setScs(null);
        }


        if(jsonObj.get("data") != null) {
            jsonObj = (JSONObject) jsonObj.get("data");
            try {
                if (jsonObj.get("ito") != null) {setIto(Integer.parseInt(jsonObj.get("ito").toString()));}
                else {setIto(null);}
            } catch (Exception e){
                setIto(null);
            }
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

    public Integer getIto() {
        return ito;
    }

    public void setIto(Integer ito) {
        this.ito = ito;
    }

    public String getScs() {
        return scs;
    }

    public void setScs(String scs) {
        this.scs = scs;
    }
}

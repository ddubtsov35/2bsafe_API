package com.dubtsov._2bsafe.Parents.Models;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 07.09.17.
 */
public class AuthorisationUser {

    private String scs;
    private Integer emsg;
    private String lkid;


    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;


    public AuthorisationUser(String jsonObjectString) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        parser = new JSONParser();
        try {
            obj = parser.parse(jsonObjectString);
            jsonObj = (JSONObject) obj;
            if (jsonObj.get("scs") != null) { setScs(jsonObj.get("scs").toString()); } else{setScs(null);}
            if (jsonObj.get("emsg") != null) { setEmsg(Integer.parseInt(jsonObj.get("emsg").toString()));} else {setEmsg(null);}
            if (jsonObj.get("lkid") != null) { setLkid(jsonObj.get("lkid").toString()); } else{setLkid(null);}
        } catch (Exception e){
            setScs(null);
            setEmsg(null);
            setLkid(null);
        }


    }

    @Override
    public String toString() {
        return "AuthorisationUser{" +
                "scs='" + scs + '\'' +
                ", emsg=" + emsg +
                ", lkid='" + lkid + '\'' +
                '}';
    }

    public String getScs() {
        return scs;
    }

    public void setScs(String scs) {
        this.scs = scs;
    }

    public Integer getEmsg() {
        return emsg;
    }

    public void setEmsg(Integer emsg) {
        this.emsg = emsg;
    }

    public String getLkid() {
        return lkid;
    }

    public void setLkid(String lkid) {
        this.lkid = lkid;
    }
}

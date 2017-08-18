package com.dubtsov._2bsafe.Childrens.Models;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 16.08.17.
 */
public class ResponseAuthorisation {

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;

    private int bto;
    private int cid;
    private String ckey;
    private String aid;
    private int sto;

    public ResponseAuthorisation(String jsonObjectString) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;

        if(jsonObj.get("bto") != null) {setBto(Integer.parseInt(jsonObj.get("bto").toString()));} else{setBto(Integer.parseInt(null));}
        if(jsonObj.get("cid") != null) {setCid(Integer.parseInt(jsonObj.get("cid").toString()));} else{setCid(Integer.parseInt(null));}
        if(jsonObj.get("ckey") != null) {setCkey(jsonObj.get("ckey").toString());} else{setCkey("");}
        if(jsonObj.get("aid") != null) {setAid(jsonObj.get("aid").toString());} else{setAid("");}
        if(jsonObj.get("sto") != null) {setSto(Integer.parseInt(jsonObj.get("sto").toString()));} else{setSto(Integer.parseInt(null));}
    }


    public int getBto() {
        return bto;
    }

    public void setBto(int bto) {
        this.bto = bto;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCkey() {
        return ckey;
    }

    public void setCkey(String ckey) {
        this.ckey = ckey;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public int getSto() {
        return sto;
    }

    public void setSto(int sto) {
        this.sto = sto;
    }
}

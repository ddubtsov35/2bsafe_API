package com.dubtsov._2bsafe.Childrens.Models;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 16.08.17.
 */
public class ChildrenResponseAuthorisationModel {

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;

    private int ito;
    private String cid;
    private String ckey;
    private String aid;
    private int sto;

    public ChildrenResponseAuthorisationModel(){};

    public ChildrenResponseAuthorisationModel(String jsonObjectString) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;
        if(jsonObj.get("ito") != null) {setIto(Integer.parseInt(jsonObj.get("ito").toString()));} else{setIto(Integer.parseInt(null));}
        jsonObj = (JSONObject) jsonObj.get("res");
        if(jsonObj.get("cid") != null) {setCid(jsonObj.get("cid").toString());} else{setCid("");}
        if(jsonObj.get("ckey") != null) {setCkey(jsonObj.get("ckey").toString());} else{setCkey("");}
        if(jsonObj.get("aid") != null) {setAid(jsonObj.get("aid").toString());} else{setAid("");}
        if(jsonObj.get("sto") != null) {setSto(Integer.parseInt(jsonObj.get("sto").toString()));} else{setSto(Integer.parseInt(null));}
    }

    @Override
    public String toString() {
        return "ChildrenResponseAuthorisationModel{" +
                "ito=" + ito +
                ", cid='" + cid + '\'' +
                ", ckey='" + ckey + '\'' +
                ", aid='" + aid + '\'' +
                ", sto=" + sto +
                '}';
    }

    public int getIto() {
        return ito;
    }

    public void setIto(int ito) {
        this.ito = ito;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
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

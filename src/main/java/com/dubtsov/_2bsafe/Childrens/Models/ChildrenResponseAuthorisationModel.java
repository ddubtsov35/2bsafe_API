package com.dubtsov._2bsafe.Childrens.Models;

import com.dubtsov._2bsafe.Parents.Pool.CidCkeyPool;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 16.08.17.
 */
public class ChildrenResponseAuthorisationModel {

    private String scs;
    private Integer ito;
    private String cid;
    private String ckey;
    private String aid;
    private Integer sto;

    public ChildrenResponseAuthorisationModel(){};

    public ChildrenResponseAuthorisationModel(String jsonObjectString) throws ParseException, java.text.ParseException, IOException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException, IOException {
        JSONParser parser = new JSONParser();
        JSONObject jsonObj = (JSONObject) parser.parse(jsonObjectString);
        if(jsonObj.get("scs") != null) {setScs(jsonObj.get("scs").toString());} else{setScs(null);}
        if(jsonObj.get("ito") != null) {setIto(Integer.parseInt(jsonObj.get("ito").toString()));} else{setIto(null);}
        try {
            jsonObj = (JSONObject) jsonObj.get("res");
            if (jsonObj.get("cid") != null) {setCid(jsonObj.get("cid").toString());} else {setCid(null);}
            if (jsonObj.get("ckey") != null) {setCkey(jsonObj.get("ckey").toString());} else {setCkey(null);}
            if (jsonObj.get("aid") != null) {setAid(jsonObj.get("aid").toString());} else {setAid(null);}
            if (jsonObj.get("sto") != null) {setSto(Integer.parseInt(jsonObj.get("sto").toString()));} else {setSto(null);}
            if(CidCkeyPool.getCidFromFile() == null){CidCkeyPool.setCidCkey(jsonObj);}
        } catch (Exception e){
            {setCid(null);}
            {setCkey(null);}
            {setAid(null);}
            {setSto(null);}
        }
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

    public Integer getIto() {
        return ito;
    }

    public void setIto(Integer ito) {
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

    public Integer getSto() {
        return sto;
    }

    public void setSto(Integer sto) {
        this.sto = sto;
    }

    public String getScs() {
        return scs;
    }

    public void setScs(String scs) {
        this.scs = scs;
    }
}

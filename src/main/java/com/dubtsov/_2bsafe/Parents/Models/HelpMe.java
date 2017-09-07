package com.dubtsov._2bsafe.Parents.Models;

import javafx.beans.binding.BooleanBinding;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by user on 31.08.17.
 */
public class HelpMe {

    private String scs;
    private int state;
    private int push;
    private String phone;
    private List<Sms> smsList;

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;
    private static JSONArray jsonArray;

    private static JSONParser parser2;
    private static Object obj2;
    private static JSONObject jsonObj2;


    public HelpMe(String jsonObjectString, String scs) throws ParseException, java.text.ParseException {
        setScs(scs);
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        smsList = new LinkedList<>();
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;
        jsonArray = (JSONArray) jsonObj.get("sms");
        System.out.println(jsonArray.toJSONString());

        if(jsonObj.get("state") != null) {setState(Integer.parseInt(jsonObj.get("state").toString()));}
        if(jsonObj.get("push") != null) {setPush(Integer.parseInt(jsonObj.get("push").toString()));}
        if(jsonObj.get("phone") != null) {setPhone(jsonObj.get("phone").toString());}

        for(int i=0; i < jsonArray.size();i++){
            smsList.add(new Sms(jsonArray.get(i).toString()));
        }
        System.out.println(smsList.size());
    }

    @Override
    public String toString() {
        return "HelpMe{" +
                "scs='" + scs + '\'' +
                ", state=" + state +
                ", push=" + push +
                ", phone='" + phone + '\'' +
                ", smsList=" + smsList +
                '}';
    }

    public String getScs() {
        return scs;
    }

    public void setScs(String scs) {
        this.scs = scs;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getPush() {
        return push;
    }

    public void setPush(int push) {
        this.push = push;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Sms> getSmsList() {
        return smsList;
    }

    public void setSmsList(List<Sms> smsList) {
        this.smsList = smsList;
    }





    private class Sms{
        private boolean defaul;
        private String phone;

        public Sms(String jsonObjectString) throws ParseException, java.text.ParseException {
            setObject(jsonObjectString);
        }

        private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
            parser2 = new JSONParser();
            obj2 = parser2.parse(jsonObjectString);
            jsonObj2 = (JSONObject) obj;

            if(jsonObj2.get("defaul") != null) {setDefaul(Boolean.parseBoolean(jsonObj2.get("defaul").toString()));}
            if(jsonObj2.get("phone") != null) {setPhone(jsonObj2.get("phone").toString());} else{setPhone("0");}
        }

        @Override
        public String toString() {
            return "Sms{" +
                    "defaul=" + defaul +
                    ", phone='" + phone + '\'' +
                    '}';
        }

        public boolean isDefaul() {
            return defaul;
        }

        public void setDefaul(boolean defaul) {
            this.defaul = defaul;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }
    }
}


package com.dubtsov._2bsafe.Models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 14.07.17.
 */
public class RegisteredUser {

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;

    private String name;
    private int cnum;
    private Date act_date;
    private int act_code;
    private String em;
    private String ph;
    private int acc_id;
    private Date reg_date;
    private int tnum;
    private int count;

    public RegisteredUser(){}

    public RegisteredUser(String jsonObjectString) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;

        DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date actDate;
        if(!jsonObj.get("act_date").toString().equals("None")) {actDate =format.parse(jsonObj.get("act_date").toString());} else {actDate = null;}
        Date regDate = format.parse(jsonObj.get("reg_date").toString());


        if(jsonObj.get("name") != null) {setName(jsonObj.get("name").toString());} else{setName("");}
        setCnum(Integer.parseInt(jsonObj.get("cnum").toString()));
        setAct_date(actDate);
        if(jsonObj.get("em") != null) {setEm(jsonObj.get("em").toString());} else{setEm("");}
        if(jsonObj.get("ph") != null) {setPh(jsonObj.get("ph").toString());} else{setPh("");}
        setAcc_id(Integer.parseInt(jsonObj.get("acc_id").toString()));
        setReg_date(regDate);
        setTnum(Integer.parseInt(jsonObj.get("tnum").toString()));
        if(jsonObj.get("act_code") != null) {setAct_code(Integer.parseInt(jsonObj.get("act_code").toString()));}
    }

    @Override
    public String toString() {
        return "RegisteredUser{" +
                "name='" + name + '\'' +
                ", cnum=" + cnum +
                ", act_date=" + act_date +
                ", em='" + em + '\'' +
                ", ph='" + ph + '\'' +
                ", acc_id=" + acc_id +
                ", reg_date=" + reg_date +
                ", tnum=" + tnum +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCnum() {
        return cnum;
    }

    public void setCnum(int cnum) {
        this.cnum = cnum;
    }

    public Date getAct_date() {
        return act_date;
    }

    public void setAct_date(Date act_date) {
        this.act_date = act_date;
    }

    public String getEm() {
        return em;
    }

    public void setEm(String em) {
        this.em = em;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public int getAcc_id() {
        return acc_id;
    }

    public void setAcc_id(int acc_id) {
        this.acc_id = acc_id;
    }

    public Date getReg_date() {
        return reg_date;
    }

    public void setReg_date(Date reg_date) {
        this.reg_date = reg_date;
    }

    public int getTnum() {
        return tnum;
    }

    public void setTnum(int tnum) {
        this.tnum = tnum;
    }

    public int getAct_code() {
        return act_code;
    }

    public void setAct_code(int act_code) {
        this.act_code = act_code;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

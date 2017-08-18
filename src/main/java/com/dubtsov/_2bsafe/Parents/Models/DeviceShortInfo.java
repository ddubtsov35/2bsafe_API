package com.dubtsov._2bsafe.Parents.Models;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 16.08.17.
 */
public class DeviceShortInfo {

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;

    private String phone;
    private int age;
    private String update_date;
    private int screen;
    private String op;
    private String os;
    private String login_date;

    public DeviceShortInfo(String jsonObjectString) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;


        if(jsonObj.get("phone") != null) {setPhone(jsonObj.get("phone").toString());} else{setPhone("");}
        if(jsonObj.get("age") != null) {setAge(Integer.parseInt(jsonObj.get("age").toString()));} else{setAge(Integer.parseInt(null));}
        if(jsonObj.get("update_date") != null) {setUpdate_date(jsonObj.get("update_date").toString());} else{setUpdate_date("");}
        if(jsonObj.get("screen") != null) {setScreen(Integer.parseInt(jsonObj.get("screen").toString()));} else{setScreen(Integer.parseInt(null));}
        if(jsonObj.get("op") != null) {setOp(jsonObj.get("op").toString());} else{setOp("");}
        if(jsonObj.get("os") != null) {setOs(jsonObj.get("os").toString());} else{setOs("");}
        if(jsonObj.get("login_date") != null) {setLogin_date(jsonObj.get("login_date").toString());} else{setLogin_date("");}
    }




    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(String update_date) {
        this.update_date = update_date;
    }

    public int getScreen() {
        return screen;
    }

    public void setScreen(int screen) {
        this.screen = screen;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getLogin_date() {
        return login_date;
    }

    public void setLogin_date(String login_date) {
        this.login_date = login_date;
    }
}

package com.dubtsov._2bsafe.Models;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by user on 19.07.17.
 */
public class ChildrenCard {

    Device device;

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;

    private String age;
    private int profile_id;
    private int connected;
    private String name;
    private int unread_notif;
    private String phone;
    private String image;
    private List<Device> deviceConnected;


    public ChildrenCard(){}

    public ChildrenCard(String jsonObjectString) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        device = new Device(jsonObjectString);
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;

        setAge(jsonObj.get("age").toString());
        setProfile_id(Integer.parseInt(jsonObj.get("profile_id").toString()));
        setConnected(Integer.parseInt(jsonObj.get("connected").toString()));
        if(jsonObj.get("name") != null) {setName(jsonObj.get("name").toString());} else{setName("");}
        setUnread_notif(Integer.parseInt(jsonObj.get("unread_notif").toString()));
        if(jsonObj.get("phone") != null) {setPhone(jsonObj.get("phone").toString());} else{setPhone("");}
        if(jsonObj.get("image") != null) {setImage(jsonObj.get("image").toString());} else{setImage("");}

        if(jsonObj.get("device") != null) {setDeviceConnected(device.getDeviceList());} else{setDeviceConnected(new ArrayList<Device>());}
    }


    public static JSONParser getParser() {
        return parser;
    }

    public static void setParser(JSONParser parser) {
        ChildrenCard.parser = parser;
    }

    public static Object getObj() {
        return obj;
    }

    public static void setObj(Object obj) {
        ChildrenCard.obj = obj;
    }

    public static JSONObject getJsonObj() {
        return jsonObj;
    }

    public static void setJsonObj(JSONObject jsonObj) {
        ChildrenCard.jsonObj = jsonObj;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getProfile_id() {
        return profile_id;
    }

    public void setProfile_id(int profile_id) {
        this.profile_id = profile_id;
    }

    public int getConnected() {
        return connected;
    }

    public void setConnected(int connected) {
        this.connected = connected;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnread_notif() {
        return unread_notif;
    }

    public void setUnread_notif(int unread_notif) {
        this.unread_notif = unread_notif;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Device> getDeviceConnected() {
        return deviceConnected;
    }

    public void setDeviceConnected(List<Device> deviceConnected) {
        this.deviceConnected = deviceConnected;
    }
}

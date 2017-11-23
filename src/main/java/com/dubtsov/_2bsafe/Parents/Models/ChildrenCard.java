package com.dubtsov._2bsafe.Parents.Models;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 19.07.17.
 */
public class ChildrenCard {

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;
    private static JSONArray jsonArray;
    private static JSONObject jsonObjDevice;

    private Integer age;
    private Integer profile_id;
    private Integer connected;
    private String name;
    private Integer unread_notif;
    private String phone;
    private String image;
    private List<Device> deviceConnected;


    public ChildrenCard(){}

    public ChildrenCard(String jsonObjectString) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        deviceConnected = new ArrayList<>();
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;
        jsonArray = new JSONArray();

        if(jsonObj.get("age") != null) {setAge(Integer.parseInt(jsonObj.get("age").toString()));} else {setAge(null);}
        if(jsonObj.get("profile_id") != null)setProfile_id(Integer.parseInt(jsonObj.get("profile_id").toString())); else {setProfile_id(null);}
        //if(jsonObj.get("connected") != null)setConnected(Integer.parseInt(jsonObj.get("connected").toString())); else {setConnected(null);}
        if(jsonObj.get("name") != null) {setName(jsonObj.get("name").toString());} else{setName(null);}
        if(jsonObj.get("unread_notif") != null) {setUnread_notif(Integer.parseInt(jsonObj.get("unread_notif").toString()));} else {setUnread_notif(null);}
        if(jsonObj.get("phone") != null) {setPhone(jsonObj.get("phone").toString());} else{setPhone(null);}
        if(jsonObj.get("image") != null) {setImage(jsonObj.get("image").toString());} else{setImage(null);}

        jsonObj = (JSONObject) jsonObj.get("device");
        if(jsonObj != null) {
            deviceConnected.add(new Device(jsonObj.toString()));
            setDeviceConnected(deviceConnected);
        } else{
            setDeviceConnected(new ArrayList<Device>());
        }
    }

    @Override
    public String toString() {
        return "ChildrenCard{" +
                ", age='" + age + '\'' +
                ", profile_id=" + profile_id +
                ", connected=" + connected +
                ", name='" + name + '\'' +
                ", unread_notif=" + unread_notif +
                ", phone='" + phone + '\'' +
                ", image='" + image + '\'' +
                ", deviceConnected=" + deviceConnected +
                '}';
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getProfile_id() {
        return profile_id;
    }

    public void setProfile_id(Integer profile_id) {
        this.profile_id = profile_id;
    }

    public Integer getConnected() {
        return connected;
    }

    public void setConnected(Integer connected) {
        this.connected = connected;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUnread_notif() {
        return unread_notif;
    }

    public void setUnread_notif(Integer unread_notif) {
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

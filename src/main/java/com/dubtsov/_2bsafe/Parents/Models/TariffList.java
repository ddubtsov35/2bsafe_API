package com.dubtsov._2bsafe.Parents.Models;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.List;

/**
 * Created by user on 07.09.17.
 */
public class TariffList {

    private int id;
    private String name;
    private String description;
    private float price;
    private Perms perms;

    private JSONParser parser;
    private Object obj;
    private JSONObject jsonObj;

    private JSONParser parser2;
    private Object obj2;
    private JSONObject jsonObj2;

    public TariffList(String jsonObjectString) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;

        if(jsonObj.get("id") != null) {setId(Integer.parseInt(jsonObj.get("id").toString()));}
        if(jsonObj.get("name") != null) {setName(jsonObj.get("name").toString());}
        if(jsonObj.get("description") != null) {setDescription(jsonObj.get("description").toString());}
        if(jsonObj.get("price") != null) {setPrice(Float.parseFloat(jsonObj.get("price").toString()));}
        perms = new Perms(jsonObj.toJSONString());

    }

    @Override
    public String toString() {
        return "TariffList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", perms=" + perms +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Perms getPerms() {
        return perms;
    }

    public void setPerms(Perms perms) {
        this.perms = perms;
    }



    private class Perms {
        private int remote_controll;
        private int help_me;
        private int phone;
        private int calls_history;
        private int geo;
        private int apps;

        public Perms(String jsonObjectString) throws ParseException, java.text.ParseException {
            setObject(jsonObjectString);
        }

        private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
            parser2 = new JSONParser();
            obj2 = parser2.parse(jsonObjectString);
            jsonObj2 = (JSONObject) obj2;
            jsonObj2 = (JSONObject) jsonObj2.get("perms");

            if (jsonObj2.get("remote_controll") != null) {setRemote_controll(Integer.parseInt(jsonObj2.get("remote_controll").toString()));}
            if (jsonObj2.get("help_me") != null) {setHelp_me(Integer.parseInt(jsonObj2.get("help_me").toString()));}
            if (jsonObj2.get("phone") != null) {setPhone(Integer.parseInt(jsonObj2.get("phone").toString()));}
            if (jsonObj2.get("calls_history") != null) {setCalls_history(Integer.parseInt(jsonObj2.get("calls_history").toString()));}
            if (jsonObj2.get("geo") != null) {setGeo(Integer.parseInt(jsonObj2.get("geo").toString()));}
            if (jsonObj2.get("apps") != null) {setApps(Integer.parseInt(jsonObj2.get("apps").toString()));}

        }

        @Override
        public String toString() {
            return "Perms{" +
                    "remote_controll=" + remote_controll +
                    ", help_me=" + help_me +
                    ", phone=" + phone +
                    ", calls_history=" + calls_history +
                    ", geo=" + geo +
                    ", apps=" + apps +
                    '}';
        }

        public int getRemote_controll() {
            return remote_controll;
        }

        public void setRemote_controll(int remote_controll) {
            this.remote_controll = remote_controll;
        }

        public int getHelp_me() {
            return help_me;
        }

        public void setHelp_me(int help_me) {
            this.help_me = help_me;
        }

        public int getPhone() {
            return phone;
        }

        public void setPhone(int phone) {
            this.phone = phone;
        }

        public int getCalls_history() {
            return calls_history;
        }

        public void setCalls_history(int calls_history) {
            this.calls_history = calls_history;
        }

        public int getGeo() {
            return geo;
        }

        public void setGeo(int geo) {
            this.geo = geo;
        }

        public int getApps() {
            return apps;
        }

        public void setApps(int apps) {
            this.apps = apps;
        }
    }

}

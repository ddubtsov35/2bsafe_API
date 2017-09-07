package com.dubtsov._2bsafe.Parents.Models;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by user on 04.09.17.
 */
public class NotifyList {

    private String scs;

    private List<NotifyList.Warning> warningList;
    private List<NotifyList.Notif> notifList;

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;
    private static JSONArray jsonArray;

    private static JSONParser parser2;
    private static Object obj2;
    private static JSONObject jsonObj2;


    public NotifyList(String jsonObjectString, String scs) throws ParseException, java.text.ParseException {
        setScs(scs);
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        warningList = new LinkedList<>();
        notifList = new LinkedList<>();
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;
        jsonArray = (JSONArray) jsonObj.get("warning");
        System.out.println(jsonArray.toJSONString());


        for (int i = 0; i < jsonArray.size(); i++) {
            warningList.add(new NotifyList.Warning(jsonArray.get(i).toString()));
        }
        for (int i = 0; i < jsonArray.size(); i++) {
            notifList.add(new NotifyList.Notif(jsonArray.get(i).toString()));
        }
    }

    public String getScs() {
        return scs;
    }

    public void setScs(String scs) {
        this.scs = scs;
    }



    private class Warning{
        private int evid;
        private int msg_type;
        private int param;
        private String date;

        public Warning(String jsonObjectString) throws ParseException, java.text.ParseException {
            setObject(jsonObjectString);
        }

        private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
            parser2 = new JSONParser();
            obj2 = parser2.parse(jsonObjectString);
            jsonObj2 = (JSONObject) obj;
            jsonObj2 = (JSONObject) jsonObj2.get("warning");

            if(jsonObj2.get("evid") != null) {setEvid(Integer.parseInt(jsonObj2.get("evid").toString()));}
            if(jsonObj2.get("msg_type") != null) {setMsg_type(Integer.parseInt(jsonObj2.get("msg_type").toString()));}
            if(jsonObj2.get("param") != null) {setParam(Integer.parseInt(jsonObj2.get("param").toString()));}
            if(jsonObj2.get("date") != null) {setDate(jsonObj2.get("date").toString());}
        }

        public int getEvid() {
            return evid;
        }

        public void setEvid(int evid) {
            this.evid = evid;
        }

        public int getMsg_type() {
            return msg_type;
        }

        public void setMsg_type(int msg_type) {
            this.msg_type = msg_type;
        }

        public int getParam() {
            return param;
        }

        public void setParam(int param) {
            this.param = param;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }
    }

    private class Notif{
        private int evid;
        private int msg_type;
        private int param;
        private String date;

        public Notif(String jsonObjectString) throws ParseException, java.text.ParseException {
            setObject(jsonObjectString);
        }

        private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
            parser2 = new JSONParser();
            obj2 = parser2.parse(jsonObjectString);
            jsonObj2 = (JSONObject) obj;
            jsonObj2 = (JSONObject) jsonObj2.get("notif");

            if(jsonObj2.get("evid") != null) {setEvid(Integer.parseInt(jsonObj2.get("evid").toString()));}
            if(jsonObj2.get("msg_type") != null) {setMsg_type(Integer.parseInt(jsonObj2.get("msg_type").toString()));}
            if(jsonObj2.get("param") != null) {setParam(Integer.parseInt(jsonObj2.get("param").toString()));}
            if(jsonObj2.get("date") != null) {setDate(jsonObj2.get("date").toString());}
        }

        public int getEvid() {
            return evid;
        }

        public void setEvid(int evid) {
            this.evid = evid;
        }

        public int getMsg_type() {
            return msg_type;
        }

        public void setMsg_type(int msg_type) {
            this.msg_type = msg_type;
        }

        public int getParam() {
            return param;
        }

        public void setParam(int param) {
            this.param = param;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }
    }

}

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

    private JSONParser parser;
    private Object obj;
    private JSONObject jsonObj;
    private JSONArray jsonArray;

    private JSONParser parser2;
    private Object obj2;
    private JSONObject jsonObj2;


    public NotifyList(String jsonObjectString) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        warningList = new LinkedList<>();
        notifList = new LinkedList<>();
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;


        try {
            if (jsonObj.get("scs") != null)
            { setScs(jsonObj.get("scs").toString()); }
            else { setScs(null); }
        } catch (Exception e){
            setScs(null);
        }

        jsonObj = (JSONObject) jsonObj.get("data");

        try {
            jsonArray = (JSONArray) jsonObj.get("warning");
            System.out.println(jsonArray.toJSONString());
            if (jsonArray != null && !jsonArray.isEmpty()) {
                for (int i = 0; i < jsonArray.size(); i++) {
                    warningList.add(new NotifyList.Warning(jsonArray.get(i).toString()));
                }
            } else {
                warningList = null;
            }
        } catch (Exception e){
            warningList = null;
        }

        try {
            jsonArray = (JSONArray) jsonObj.get("notif");
            System.out.println(jsonArray.toJSONString());
            if (jsonArray != null && !jsonArray.isEmpty()) {
                for (int i = 0; i < jsonArray.size(); i++) {
                    notifList.add(new NotifyList.Notif(jsonArray.get(i).toString()));
                }
            } else {
                notifList = null;
            }
        } catch (Exception e){
            notifList = null;
        }
    }

    @Override
    public String toString() {
        return "NotifyList{" +
                "scs='" + scs + '\'' +
                ", warningList=" + warningList +
                ", notifList=" + notifList +
                '}';
    }

    public String getScs() {
        return scs;
    }

    public void setScs(String scs) {
        this.scs = scs;
    }



    private class Warning{
        private Integer evid;
        private Integer msg_type;
        private Integer param;
        private String date;

        public Warning(String jsonObjectString) throws ParseException, java.text.ParseException {
            setObject(jsonObjectString);
        }

        private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
            parser2 = new JSONParser();
            obj2 = parser2.parse(jsonObjectString);
            jsonObj2 = (JSONObject) obj;
            jsonObj2 = (JSONObject) jsonObj2.get("warning");

            try {
                if (jsonObj2.get("evid") != null) { setEvid(Integer.parseInt(jsonObj2.get("evid").toString())); } else { setEvid(null); }
                if (jsonObj2.get("msg_type") != null) { setMsg_type(Integer.parseInt(jsonObj2.get("msg_type").toString())); } else { setMsg_type(null); }
                if (jsonObj2.get("param") != null) { setParam(Integer.parseInt(jsonObj2.get("param").toString())); } else { setParam(null); }
                if (jsonObj2.get("date") != null) { setDate(jsonObj2.get("date").toString()); } else { setDate(null); }
            } catch (Exception e){
                setEvid(null);
                setMsg_type(null);
                setParam(null);
                setDate(null);
            }
        }

        @Override
        public String toString() {
            return "Warning{" +
                    "evid=" + evid +
                    ", msg_type=" + msg_type +
                    ", param=" + param +
                    ", date='" + date + '\'' +
                    '}';
        }

        public Integer getEvid() {
            return evid;
        }

        public void setEvid(Integer evid) {
            this.evid = evid;
        }

        public Integer getMsg_type() {
            return msg_type;
        }

        public void setMsg_type(Integer msg_type) {
            this.msg_type = msg_type;
        }

        public Integer getParam() {
            return param;
        }

        public void setParam(Integer param) {
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
        private Integer evid;
        private Integer msg_type;
        private Integer param;
        private String date;

        public Notif(String jsonObjectString) throws ParseException, java.text.ParseException {
            setObject(jsonObjectString);
        }

        private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
            parser2 = new JSONParser();
            obj2 = parser2.parse(jsonObjectString);
            jsonObj2 = (JSONObject) obj;
            jsonObj2 = (JSONObject) jsonObj2.get("notif");

            try {
                if (jsonObj2.get("evid") != null) { setEvid(Integer.parseInt(jsonObj2.get("evid").toString())); } else { setEvid(null); }
                if (jsonObj2.get("msg_type") != null) { setMsg_type(Integer.parseInt(jsonObj2.get("msg_type").toString())); } else { setMsg_type(null); }
                if (jsonObj2.get("param") != null) { setParam(Integer.parseInt(jsonObj2.get("param").toString())); } else { setParam(null); }
                if (jsonObj2.get("date") != null) { setDate(jsonObj2.get("date").toString()); } else { setDate(null); }
            } catch (Exception e){
                setEvid(null);
                setMsg_type(null);
                setParam(null);
                setDate(null);
            }
        }

        @Override
        public String toString() {
            return "Notif{" +
                    "evid=" + evid +
                    ", msg_type=" + msg_type +
                    ", param=" + param +
                    ", date='" + date + '\'' +
                    '}';
        }

        public Integer getEvid() {
            return evid;
        }

        public void setEvid(Integer evid) {
            this.evid = evid;
        }

        public Integer getMsg_type() {
            return msg_type;
        }

        public void setMsg_type(Integer msg_type) {
            this.msg_type = msg_type;
        }

        public Integer getParam() {
            return param;
        }

        public void setParam(Integer param) {
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

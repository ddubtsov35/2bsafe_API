package com.dubtsov._2bsafe.Parents.Models;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by user on 04.09.17.
 */
public class Apps {

    private String scs;
    private int emsg;

    private List<Apps.Groups> groups;
    private List<Apps.Unsorted_apps> unsorted_apps;

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;
    private static JSONArray jsonArray;

    private static JSONParser parser2;
    private static Object obj2;
    private static JSONObject jsonObj2;

    public Apps(String jsonObjectString) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        groups = new LinkedList<>();
        unsorted_apps = new LinkedList<>();
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;


        if(jsonObj.get("scs") != null) {setScs(jsonObj.get("scs").toString());}
        if(jsonObj.get("emsg") != null) {setEmsg(Integer.parseInt(jsonObj.get("emsg").toString()));}


        jsonArray = (JSONArray) jsonObj.get("unsorted_apps");
        if (!jsonArray.isEmpty()) {
            for (int i = 0; i < jsonArray.size(); i++) {
                unsorted_apps.add(new Apps.Unsorted_apps(jsonArray.get(i).toString()));
            }
        }

        jsonArray = (JSONArray) jsonObj.get("groups");
        if(!jsonArray.isEmpty()) {
            for (int i = 0; i < jsonArray.size(); i++) {
                groups.add(new Apps.Groups(jsonArray.get(i).toString()));
            }
        }
    }

    @Override
    public String toString() {
        return "Apps{" +
                "scs='" + scs + '\'' +
                ", emsg=" + emsg +
                ", groups=" + groups +
                ", unsorted_apps=" + unsorted_apps +
                '}';
    }

    public String getScs() {
        return scs;
    }

    public void setScs(String scs) {
        this.scs = scs;
    }

    public int getEmsg() {
        return emsg;
    }

    public void setEmsg(int emsg) {
        this.emsg = emsg;
    }

    private class Groups{
        private int id;
        private String name;
        private boolean defaul;
        private int count;

        public Groups(String jsonObjectString) throws ParseException, java.text.ParseException {
            setObject(jsonObjectString);
        }

        private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
            parser2 = new JSONParser();
            obj2 = parser2.parse(jsonObjectString);
            jsonObj2 = (JSONObject) obj2;
            //jsonObj2 = (JSONObject) jsonObj2.get("warning");

            if(jsonObj2.get("id") != null) {setId(Integer.parseInt(jsonObj2.get("id").toString()));}
            if(jsonObj2.get("name") != null) {setName(jsonObj2.get("name").toString());}
            if(jsonObj2.get("defaul") != null) {setDefaul(Boolean.parseBoolean(jsonObj2.get("defaul").toString()));}
            if(jsonObj2.get("count") != null) {setCount(Integer.parseInt(jsonObj2.get("count").toString()));}
        }

        @Override
        public String toString() {
            return "Groups{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", defaul=" + defaul +
                    ", count=" + count +
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

        public boolean isDefaul() {
            return defaul;
        }

        public void setDefaul(boolean defaul) {
            this.defaul = defaul;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }

    private class Unsorted_apps{
        private String alias;
        private String name;
        private boolean blocked;
        private boolean delete_pending;

        public Unsorted_apps(String jsonObjectString) throws ParseException, java.text.ParseException {
            setObject(jsonObjectString);
        }

        private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
            parser2 = new JSONParser();
            obj2 = parser2.parse(jsonObjectString);
            jsonObj2 = (JSONObject) obj2;

            if(jsonObj2.get("alias") != null) {setAlias(jsonObj2.get("alias").toString());}
            if(jsonObj2.get("name") != null) {setName(jsonObj2.get("name").toString());}
            if(jsonObj2.get("blocked") != null) {setBlocked(Boolean.parseBoolean(jsonObj2.get("blocked").toString()));}
            if(jsonObj2.get("delete_pending") != null) {setDelete_pending(Boolean.parseBoolean(jsonObj2.get("delete_pending").toString()));}
        }

        @Override
        public String toString() {
            return "Unsorted_apps{" +
                    "alias='" + alias + '\'' +
                    ", name='" + name + '\'' +
                    ", blocked=" + blocked +
                    ", delete_pending=" + delete_pending +
                    '}';
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isBlocked() {
            return blocked;
        }

        public void setBlocked(boolean blocked) {
            this.blocked = blocked;
        }

        public boolean isDelete_pending() {
            return delete_pending;
        }

        public void setDelete_pending(boolean delete_pending) {
            this.delete_pending = delete_pending;
        }
    }


}

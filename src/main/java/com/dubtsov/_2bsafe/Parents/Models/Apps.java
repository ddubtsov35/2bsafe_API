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
    private Integer emsg;

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

        try {
            if (jsonObj.get("scs") != null) {setScs(jsonObj.get("scs").toString());} else {setScs(null);}
            if (jsonObj.get("emsg") != null) {setEmsg(Integer.parseInt(jsonObj.get("emsg").toString()));} else {setEmsg(null);}
        } catch (Exception e){
            setScs(null);
            setEmsg(null);
        }


        jsonArray = (JSONArray) jsonObj.get("unsorted_apps");
        if (jsonArray != null && !jsonArray.isEmpty()) {
            for (int i = 0; i < jsonArray.size(); i++) {
                unsorted_apps.add(new Apps.Unsorted_apps(jsonArray.get(i).toString()));
            }
        } else{
            jsonArray = null;
        }

        jsonArray = (JSONArray) jsonObj.get("groups");
        if(jsonArray != null && !jsonArray.isEmpty()) {
            for (int i = 0; i < jsonArray.size(); i++) {
                groups.add(new Apps.Groups(jsonArray.get(i).toString()));
            }
        } else{
            jsonArray = null;
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

    public Integer getEmsg() {
        return emsg;
    }

    public void setEmsg(Integer emsg) {
        this.emsg = emsg;
    }

    private class Groups{
        private Integer id;
        private String name;
        private Boolean defaul;
        private Integer count;

        public Groups(String jsonObjectString) throws ParseException, java.text.ParseException {
            setObject(jsonObjectString);
        }

        private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
            parser2 = new JSONParser();
            obj2 = parser2.parse(jsonObjectString);
            jsonObj2 = (JSONObject) obj2;
            //jsonObj2 = (JSONObject) jsonObj2.get("warning");

            try {
                if (jsonObj2.get("id") != null) {setId(Integer.parseInt(jsonObj2.get("id").toString()));} else {setId(null);}
                if (jsonObj2.get("name") != null) {setName(jsonObj2.get("name").toString());} else {setName(null);}
                if (jsonObj2.get("defaul") != null) {setDefaul(Boolean.parseBoolean(jsonObj2.get("defaul").toString()));} else {setDefaul(null);}
                if (jsonObj2.get("count") != null) {setCount(Integer.parseInt(jsonObj2.get("count").toString()));} else {setCount(null);}
            } catch (Exception e){
                setId(null);
                setName(null);
                setDefaul(null);
                setCount(null);
            }
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

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Boolean isDefaul() {
            return defaul;
        }

        public void setDefaul(Boolean defaul) {
            this.defaul = defaul;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }
    }

    private class Unsorted_apps{
        private String alias;
        private String name;
        private Boolean blocked;
        private Boolean delete_pending;

        public Unsorted_apps(String jsonObjectString) throws ParseException, java.text.ParseException {
            setObject(jsonObjectString);
        }

        private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
            parser2 = new JSONParser();
            obj2 = parser2.parse(jsonObjectString);
            jsonObj2 = (JSONObject) obj2;

            try {
                if (jsonObj2.get("alias") != null) {setAlias(jsonObj2.get("alias").toString());} else{setAlias(null);}
                if (jsonObj2.get("name") != null) {setName(jsonObj2.get("name").toString());} else{setName(null);}
                if (jsonObj2.get("blocked") != null) {setBlocked(Boolean.parseBoolean(jsonObj2.get("blocked").toString()));} else{setBlocked(null);}
                if (jsonObj2.get("delete_pending") != null) {setDelete_pending(Boolean.parseBoolean(jsonObj2.get("delete_pending").toString()));} else{setDelete_pending(null);}
            } catch (Exception e){
                setAlias(null);
                setName(null);
                setBlocked(null);
                setDelete_pending(null);
            }
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

        public Boolean isBlocked() {
            return blocked;
        }

        public void setBlocked(Boolean blocked) {
            this.blocked = blocked;
        }

        public Boolean isDelete_pending() {
            return delete_pending;
        }

        public void setDelete_pending(Boolean delete_pending) {
            this.delete_pending = delete_pending;
        }
    }


}

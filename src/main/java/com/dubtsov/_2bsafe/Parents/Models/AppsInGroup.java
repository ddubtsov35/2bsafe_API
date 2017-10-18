package com.dubtsov._2bsafe.Parents.Models;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by user on 06.09.17.
 */
public class AppsInGroup {

    private String scs;
    private String name;
    private Boolean defaul;

    private List<AppsInGroup.Apps> apps;
    private List<AppsInGroup.Intervals> intervals;

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;
    private static JSONArray jsonArray;

    private static JSONParser parser2;
    private static Object obj2;
    private static JSONObject jsonObj2;


    public AppsInGroup(String jsonObjectString) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
    }


    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        apps = new LinkedList<>();
        intervals = new LinkedList<>();
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;

        try {
            if (jsonObj.get("scs") != null) {setScs(jsonObj.get("scs").toString());} else {setScs(null);}
            if (jsonObj.get("name") != null) {setName(jsonObj.get("name").toString());} else {setName(null);}
            if (jsonObj.get("defaul") != null) {setDefaul(Boolean.parseBoolean(jsonObj.get("defaul").toString()));} else {setName(null);}
        } catch (Exception e){
            setScs(null);
            setName(null);
            setDefaul(null);
        }

        jsonArray = (JSONArray) jsonObj.get("intervals");
        if (jsonArray != null && !jsonArray.isEmpty()) {
            for (int i = 0; i < jsonArray.size(); i++) {
                intervals.add(new AppsInGroup.Intervals(jsonArray.get(i).toString()));
            }
        } else {
            intervals = null;
        }

        jsonArray = (JSONArray) jsonObj.get("apps");
        if(jsonArray != null && !jsonArray.isEmpty()) {
            for (int i = 0; i < jsonArray.size(); i++) {
                apps.add(new AppsInGroup.Apps(jsonArray.get(i).toString()));
            }
        } else {
            apps = null;
        }
    }

    @Override
    public String toString() {
        return "AppsInGroup{" +
                "scs='" + scs + '\'' +
                ", name='" + name + '\'' +
                ", defaul=" + defaul +
                ", apps=" + apps +
                ", intervals=" + intervals +
                '}';
    }

    public String getScs() {
        return scs;
    }

    public void setScs(String scs) {
        this.scs = scs;
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


    private class Apps{
        private Integer profile_id;
        private Integer interval_id;
        private List<Integer> repeat;
        private String interval_start;
        private String interval_end;

        public Apps(String jsonObjectString) throws ParseException, java.text.ParseException {
            setObject(jsonObjectString);
        }

        private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
            parser2 = new JSONParser();
            obj2 = parser2.parse(jsonObjectString);
            jsonObj2 = (JSONObject) obj2;

            try {
                if (jsonObj2.get("profile_id") != null) {setProfile_id(Integer.parseInt(jsonObj2.get("profile_id").toString()));} else {setProfile_id(null);}
                if (jsonObj2.get("interval_id") != null) {setInterval_id(Integer.parseInt(jsonObj2.get("interval_id").toString()));} else {setInterval_id(null);}
                if (jsonObj2.get("interval_start") != null) {setInterval_start(jsonObj2.get("interval_start").toString());} else {setInterval_start(null);}
                if (jsonObj2.get("interval_end") != null) {setInterval_end(jsonObj2.get("interval_end").toString());} else {setInterval_end(null);}
            } catch (Exception e){
                setProfile_id(null);
                setInterval_end(null);
                setInterval_start(null);
                setInterval_id(null);
            }

            jsonArray = (JSONArray) jsonObj2.get("repeat");
            if(!jsonArray.isEmpty()) {
                for (int i = 0; i < jsonArray.size(); i++) {
                    repeat.add(Integer.parseInt(jsonArray.get(i).toString()));
                }
            }
        }

        @Override
        public String toString() {
            return "Apps{" +
                    "profile_id=" + profile_id +
                    ", interval_id=" + interval_id +
                    ", repeat=" + repeat +
                    ", interval_start='" + interval_start + '\'' +
                    ", interval_end='" + interval_end + '\'' +
                    '}';
        }

        public Integer getProfile_id() {
            return profile_id;
        }

        public void setProfile_id(Integer profile_id) {
            this.profile_id = profile_id;
        }

        public Integer getInterval_id() {
            return interval_id;
        }

        public void setInterval_id(Integer interval_id) {
            this.interval_id = interval_id;
        }

        public List<Integer> getRepeat() {
            return repeat;
        }

        public void setRepeat(List<Integer> repeat) {
            this.repeat = repeat;
        }

        public String getInterval_start() {
            return interval_start;
        }

        public void setInterval_start(String interval_start) {
            this.interval_start = interval_start;
        }

        public String getInterval_end() {
            return interval_end;
        }

        public void setInterval_end(String interval_end) {
            this.interval_end = interval_end;
        }
    }

    private class Intervals{
        private String alias;
        private String name;
        private Boolean blocked;
        private Boolean delete_pending;

        public Intervals(String jsonObjectString) throws ParseException, java.text.ParseException {
            setObject(jsonObjectString);
        }

        private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
            parser2 = new JSONParser();
            obj2 = parser2.parse(jsonObjectString);
            jsonObj2 = (JSONObject) obj2;

            try {
                if (jsonObj2.get("alias") != null) {setAlias(jsonObj2.get("alias").toString());}
                if (jsonObj2.get("name") != null) {setName(jsonObj2.get("name").toString());}
                if (jsonObj2.get("blocked") != null) {setBlocked(Boolean.parseBoolean(jsonObj2.get("blocked").toString()));}
                if (jsonObj2.get("delete_pending") != null) {setDelete_pending(Boolean.parseBoolean(jsonObj2.get("delete_pending").toString()));}
            } catch (Exception e){
                setAlias(null);
                setName(null);
                setBlocked(null);
                setDelete_pending(null);
            }
        }

        @Override
        public String toString() {
            return "Intervals{" +
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

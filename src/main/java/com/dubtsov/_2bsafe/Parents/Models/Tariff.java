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
public class Tariff {

    private boolean is_blocked;
    private int tariff;
    private List<Tariff.Profiles> profilesList;

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;
    private static JSONArray jsonArray;

    private static JSONParser parser2;
    private static Object obj2;
    private static JSONObject jsonObj2;

    public Tariff(String jsonObjectString) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        profilesList = new LinkedList<>();
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;

        if(jsonObj.get("is_blocked") != null) {setIs_blocked(Boolean.parseBoolean(jsonObj.get("is_blocked").toString()));}
        if(jsonObj.get("tariff") != null) {setTariff(Integer.parseInt(jsonObj.get("tariff").toString()));}

        jsonArray = (JSONArray) jsonObj.get("profiles");
        if(!jsonArray.isEmpty()) {
            for (int i = 0; i < jsonArray.size(); i++) {
                profilesList.add(new Tariff.Profiles(jsonArray.get(i).toString()));
            }
        }
    }

    @Override
    public String toString() {
        return "Tariff{" +
                "is_blocked=" + is_blocked +
                ", tariff=" + tariff +
                ", profilesList=" + profilesList +
                '}';
    }

    public boolean isIs_blocked() {
        return is_blocked;
    }

    public void setIs_blocked(boolean is_blocked) {
        this.is_blocked = is_blocked;
    }

    public int getTariff() {
        return tariff;
    }

    public void setTariff(int tariff) {
        this.tariff = tariff;
    }

    public List<Profiles> getProfilesList() {
        return profilesList;
    }

    public void setProfilesList(List<Profiles> profilesList) {
        this.profilesList = profilesList;
    }


    private class Profiles {
        private int id;
        private int tariff;
        private String name;

        public Profiles(String jsonObjectString) throws ParseException, java.text.ParseException {
            setObject(jsonObjectString);
        }

        private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
            parser2 = new JSONParser();
            obj2 = parser2.parse(jsonObjectString);
            jsonObj2 = (JSONObject) obj2;

            if (jsonObj2.get("id") != null) {setId(Integer.parseInt(jsonObj2.get("id").toString()));}
            if (jsonObj2.get("tariff") != null) {setTariff(Integer.parseInt(jsonObj2.get("tariff").toString()));}
            if (jsonObj2.get("name") != null) {setName(jsonObj2.get("name").toString());}
        }

        @Override
        public String toString() {
            return "Profiles{" +
                    "id=" + id +
                    ", tariff=" + tariff +
                    ", name='" + name + '\'' +
                    '}';
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getTariff() {
            return tariff;
        }

        public void setTariff(int tariff) {
            this.tariff = tariff;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}

package com.dubtsov._2bsafe.Parents.Models;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 06.09.17.
 */
public class AppsDetailInfo {

    private String scs;
    private String install_date;
    private String group_name;
    private int group_id;
    private String name;
    private String alias;
    private boolean blocked;

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;


    public AppsDetailInfo(String jsonObjectString) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;

        if(jsonObj.get("scs") != null) {setScs(jsonObj.get("scs").toString());}
        if(jsonObj.get("install_date") != null) {setInstall_date(jsonObj.get("install_date").toString());}
        if(jsonObj.get("group_name") != null) {setGroup_name(jsonObj.get("group_name").toString());}
        if(jsonObj.get("group_id") != null) {setGroup_id(Integer.parseInt(jsonObj.get("group_id").toString()));}
        if(jsonObj.get("name") != null) {setName(jsonObj.get("name").toString());}
        if(jsonObj.get("alias") != null) {setAlias(jsonObj.get("alias").toString());}
        if(jsonObj.get("blocked") != null) {setBlocked(Boolean.parseBoolean(jsonObj.get("blocked").toString()));}

    }

    @Override
    public String toString() {
        return "AppsDetailInfo{" +
                "scs='" + scs + '\'' +
                ", install_date='" + install_date + '\'' +
                ", group_name='" + group_name + '\'' +
                ", group_id=" + group_id +
                ", name='" + name + '\'' +
                ", alias='" + alias + '\'' +
                ", blocked=" + blocked +
                '}';
    }

    public String getScs() {
        return scs;
    }

    public void setScs(String scs) {
        this.scs = scs;
    }

    public String getInstall_date() {
        return install_date;
    }

    public void setInstall_date(String install_date) {
        this.install_date = install_date;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
}

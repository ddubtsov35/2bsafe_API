package com.dubtsov._2bsafe.Childrens.Models;

import com.dubtsov._2bsafe.Parents.Pool.CidCkeyPool;
import com.dubtsov._2bsafe.Parents.Pool.CidCkeyRegisteredPool;
import com.dubtsov._2bsafe.Parents.Pool.LogPools;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.List;

/**
 * Created by user on 23.08.17.
 */
public class ConditionInformationFromDevice {

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;

    String jsonObjectString;

    private String scs;
    private Integer bto;
    private Integer ito;
    private List<Integer> params;
    private List<Rules> rules;
    private List<Zones> zones;
    private List<Apps> apps;
    private List<Integer> permissions;
    private List<Intervals> intervals;

    public ConditionInformationFromDevice(String jsonObjectString) throws ParseException, java.text.ParseException, IOException {
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;

        this.jsonObjectString = jsonObjectString;

        setObject(jsonObjectString);
    }

    public List<Integer> getListParams(String jsonObjectString){
        JSONArray params = (JSONArray) jsonObj.get("params");
        return params;
    }

    /*public List<Rules> getListRules(String jsonObjectString){
        JSONArray rules = (JSONArray) jsonObj.get("rules");
        return rules;
    }*/

    /*public List<Zones> getListZones(String jsonObjectString){
        JSONArray zones = (JSONArray) jsonObj.get("zones");
        return zones;
    }

    public List<Apps> getListApps(String jsonObjectString){
        JSONArray apps = (JSONArray) jsonObj.get("apps");
        return apps;
    }

    public List<Intervals> getListIntervals(String jsonObjectString){
        JSONArray intervals = (JSONArray) jsonObj.get("intervals");
        return intervals;
    }*/


    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException, IOException {
        if(jsonObj.get("scs") != null) {setScs(jsonObj.get("scs").toString());} else{setScs(null);}
        if(jsonObj.get("bto") != null) {setBto(Integer.parseInt(jsonObj.get("bto").toString()));} else{setBto(null);}
        if(jsonObj.get("ito") != null) {setIto(Integer.parseInt(jsonObj.get("ito").toString()));} else{setIntervals(null);}
        if(jsonObj.get("params") != null) {setParams(getListParams(jsonObjectString));} else{setParams(null);}
        //if(jsonObj.get("rules") != null) {setRules(getListRules(jsonObjectString));} else{setRules(null);}
        //if(jsonObj.get("zones") != null) {setZones(getListZones(jsonObjectString));} else{setZones(null);}
        //if(jsonObj.get("apps") != null) {setApps(getListApps(jsonObjectString));} else{setApps(null);}
        //if(jsonObj.get("intervals") != null) {setIntervals(getListIntervals(jsonObjectString));} else{setIntervals(null);}
        if(CidCkeyRegisteredPool.getCidFromFile() == null) {
            CidCkeyRegisteredPool.setCidCkey(CidCkeyPool.getCidFromFile());
        } else{
            CidCkeyRegisteredPool.clearFile();
            CidCkeyRegisteredPool.setCidCkey(CidCkeyPool.getCidFromFile());
        }
        System.out.println("10");
        LogPools.getLog();
    }

    @Override
    public String toString() {
        return "ConditionInformationFromDevice{" +
                " bto=" + bto +
                ", ito=" + ito +
                ", params=" + params +
                ", rules=" + rules +
                ", zones=" + zones +
                ", apps=" + apps +
                ", permissions=" + permissions +
                ", intervals=" + intervals +
                '}';
    }

    public Integer getBto() {
        return bto;
    }

    public void setBto(Integer bto) {
        this.bto = bto;
    }

    public Integer getIto() {
        return ito;
    }

    public void setIto(Integer ito) {
        this.ito = ito;
    }

    public List<Integer> getParams() {
        return params;
    }

    public void setParams(List<Integer> params) {
        this.params = params;
    }

    public List<Rules> getRules() {
        return rules;
    }

    public void setRules(List<Rules> rules) {
        this.rules = rules;
    }

    public List<Zones> getZones() {
        return zones;
    }

    public void setZones(List<Zones> zones) {
        this.zones = zones;
    }

    public List<Apps> getApps() {
        return apps;
    }

    public void setApps(List<Apps> apps) {
        this.apps = apps;
    }

    public List<Integer> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Integer> permissions) {
        this.permissions = permissions;
    }

    public List<Intervals> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<Intervals> intervals) {
        this.intervals = intervals;
    }

    public String getScs() {
        return scs;
    }

    public void setScs(String scs) {
        this.scs = scs;
    }
}

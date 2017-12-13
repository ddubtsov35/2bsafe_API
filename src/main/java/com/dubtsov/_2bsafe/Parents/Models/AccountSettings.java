package com.dubtsov._2bsafe.Parents.Models;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;

/**
 * Created by user on 30.08.17.
 */
public class AccountSettings {

    private String scs;
    private String name;
    private String em;
    private String ph;
    private int lbat;
    private int nbat;
    private int lsig;
    private int nsig;
    private int lunav;
    private int nunav;
    private int nph;
    private int nsms;
    private int ngps;

    public AccountSettings(String jsonObjectString) throws ParseException, java.text.ParseException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
        JSONParser parser = new JSONParser();
        JSONObject jsonObj = (JSONObject) parser.parse(jsonObjectString);
        if(jsonObj.get("scs") != null) {setScs(jsonObj.get("scs").toString());} else{setScs("");}

        jsonObj = (JSONObject) jsonObj.get("data");
        if(jsonObj.get("name") != null) {setName(jsonObj.get("name").toString());} else{setName("");}
        if(jsonObj.get("em") != null) {setEm(jsonObj.get("em").toString());} else{setEm("");}
        if(jsonObj.get("ph") != null) {setPh(jsonObj.get("ph").toString());} else{setPh("");}
        if(jsonObj.get("lbat") != null) {setLbat(Integer.parseInt(jsonObj.get("lbat").toString()));}
        if(jsonObj.get("nbat") != null) {setNbat(Integer.parseInt(jsonObj.get("nbat").toString()));}
        if(jsonObj.get("lsig") != null) {setLsig(Integer.parseInt(jsonObj.get("lsig").toString()));}
        if(jsonObj.get("nsig") != null) {setNsig(Integer.parseInt(jsonObj.get("nsig").toString()));}
        if(jsonObj.get("lunav") != null) {setLunav(Integer.parseInt(jsonObj.get("lunav").toString()));}
        if(jsonObj.get("nunav") != null) {setNunav(Integer.parseInt(jsonObj.get("nunav").toString()));}
        if(jsonObj.get("nph") != null) {setNph(Integer.parseInt(jsonObj.get("nph").toString()));}
        if(jsonObj.get("nsms") != null) {setNsms(Integer.parseInt(jsonObj.get("nsms").toString()));}
        if(jsonObj.get("ngps") != null) {setNgps(Integer.parseInt(jsonObj.get("ngps").toString()));}

    }


    @Override
    public String toString() {
        return "AccountSettings{" +
                "scs='" + scs + '\'' +
                ", name='" + name + '\'' +
                ", em='" + em + '\'' +
                ", ph='" + ph + '\'' +
                ", lbat=" + lbat +
                ", nbat=" + nbat +
                ", lsig=" + lsig +
                ", nsig=" + nsig +
                ", lunav=" + lunav +
                ", nunav=" + nunav +
                ", nph=" + nph +
                ", nsms=" + nsms +
                ", ngps=" + ngps +
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

    public String getEm() {
        return em;
    }

    public void setEm(String em) {
        this.em = em;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public int getLbat() {
        return lbat;
    }

    public void setLbat(int lbat) {
        this.lbat = lbat;
    }

    public int getNbat() {
        return nbat;
    }

    public void setNbat(int nbat) {
        this.nbat = nbat;
    }

    public int getLsig() {
        return lsig;
    }

    public void setLsig(int lsig) {
        this.lsig = lsig;
    }

    public int getNsig() {
        return nsig;
    }

    public void setNsig(int nsig) {
        this.nsig = nsig;
    }

    public int getLunav() {
        return lunav;
    }

    public void setLunav(int lunav) {
        this.lunav = lunav;
    }

    public int getNunav() {
        return nunav;
    }

    public void setNunav(int nunav) {
        this.nunav = nunav;
    }

    public int getNph() {
        return nph;
    }

    public void setNph(int nph) {
        this.nph = nph;
    }

    public int getNsms() {
        return nsms;
    }

    public void setNsms(int nsms) {
        this.nsms = nsms;
    }

    public int getNgps() {
        return ngps;
    }

    public void setNgps(int ngps) {
        this.ngps = ngps;
    }
}

package com.dubtsov._2bsafe.Parents.Models;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 07.09.17.
 */
public class AndroidRegistrationUserStep2 {

        private String scs;
        private int emsg;
        private String lkid;


        private static JSONParser parser;
        private static Object obj;
        private static JSONObject jsonObj;


        public AndroidRegistrationUserStep2(String jsonObjectString) throws ParseException, java.text.ParseException {
            setObject(jsonObjectString);
        }

        private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException {
            parser = new JSONParser();
            obj = parser.parse(jsonObjectString);
            jsonObj = (JSONObject) obj;

            if(jsonObj.get("scs") != null) {setScs(jsonObj.get("scs").toString());}
            if(jsonObj.get("emsg") != null) {setEmsg(Integer.parseInt(jsonObj.get("emsg").toString()));}
            if(jsonObj.get("lkid") != null) {setLkid(jsonObj.get("lkid").toString());}


        }

        @Override
        public String toString() {
            return "AuthorisationUser{" +
                    "scs='" + scs + '\'' +
                    ", emsg=" + emsg +
                    ", lkid='" + lkid + '\'' +
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

        public String getLkid() {
            return lkid;
        }

        public void setLkid(String lkid) {
            this.lkid = lkid;
        }
}

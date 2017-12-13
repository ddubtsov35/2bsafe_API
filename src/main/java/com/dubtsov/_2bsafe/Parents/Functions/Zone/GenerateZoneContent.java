package com.dubtsov._2bsafe.Parents.Functions.Zone;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Models.AuthorisationUser;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Random;

/**
 * Created by user on 12.09.17.
 */
public class GenerateZoneContent{

    public static JSONObject addZoneContent() throws Exception {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("lat", 0);
        jsonObj.put("long", 0);
        jsonObj.put("rad", 0);
        jsonObj.put("name", "ZONA");
        jsonObj.put("type", 0);
        jsonObj.put("confirm", false);
        return jsonObj;
    }
    public static Object[] provideSetPermission() throws Exception {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("lat", null);
        jsonObj.put("long", null);
        jsonObj.put("rad", null);
        jsonObj.put("name", null);
        jsonObj.put("type", null);
        jsonObj.put("confirm", null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj.put("lat", 1234);
        jsonObj.put("long", 1234);
        jsonObj.put("rad", 1234);
        jsonObj.put("name", 1234);
        jsonObj.put("type", 1234);
        jsonObj.put("confirm", null);

        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj2}
        };
    }




    /*public static JSONObject editZoneContent() throws Exception {
        jsonObj = new JSONObject();
        ZoneClass zoneClass = new ZoneClass();
        jsonObj.put("lat", 0);
        jsonObj.put("rnd", GenerateTokenClass.getGeneratedToken());
        jsonObj.put("long", 0);
        jsonObj.put("rad", 0);
        jsonObj.put("name", "ZONA");
        jsonObj.put("type", 0);
        jsonObj.put("zone_id", zoneClass.addZone().getZone_id());
        jsonObj.put("confirm", false);

        return jsonObj;
    }*/





    public static JSONObject delZoneContent() throws Exception {
        ZoneClass zoneClass = new ZoneClass();
        int zoneId = zoneClass.addZone().getZone_id();
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("zone_id", zoneId);
        jsonObj.put("confirm", true);
        return jsonObj;
    }
    public static Object[] provideNegativeGetSendTicketContent() throws Exception {
        AuthorisationUserClass authorisationUserClass = new AuthorisationUserClass();
        authorisationUserClass.authorisationUser();
        ZoneClass zoneClass = new ZoneClass();
        int zoneId = zoneClass.addZone().getZone_id();
        //Integer zoneId = 0;
        JSONObject jsonObj = new JSONObject();

        JSONObject jsonObj1 = new JSONObject();
        jsonObj1.put("zone_id", null);
        jsonObj1.put("confirm",null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("zone_id", zoneId);
        jsonObj2.put("confirm",null);

        JSONObject jsonObj3 = new JSONObject();
        jsonObj3.put("zone_id", null);
        jsonObj3.put("confirm",true);

        JSONObject jsonObj4 = new JSONObject();
        jsonObj4.put("confirm",null);


        JSONObject jsonObj5 = new JSONObject();
        jsonObj5.put("zone_id", null);

        JSONObject jsonObj6 = new JSONObject();
        jsonObj6.put("zone_id", null);
        jsonObj6.put("confirm",null);


        JSONObject jsonObj7 = new JSONObject();
        jsonObj7.put("zone_id", "fakezone_id");
        jsonObj7.put("confirm",false);


        JSONObject jsonObj8 = new JSONObject();
        jsonObj8.put("zone_id", zoneId);
        jsonObj8.put("confirm","fakeconfirm");


        JSONObject jsonObj9 = new JSONObject();
        jsonObj9.put("zone_id", zoneId);
        jsonObj9.put("confirm",true);


        JSONObject jsonObj11 = new JSONObject();
        jsonObj11.put("confirm",false);

        JSONObject jsonObj12 = new JSONObject();
        jsonObj12.put("zone_id", zoneId);

        JSONObject jsonObj13 = new JSONObject();

        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3},
                new JSONObject[]{jsonObj4},
                new JSONObject[]{jsonObj5},
                new JSONObject[]{jsonObj6},
                new JSONObject[]{jsonObj7},
                new JSONObject[]{jsonObj8},
                new JSONObject[]{jsonObj9},
                new JSONObject[]{jsonObj11},
                new JSONObject[]{jsonObj12},
                new JSONObject[]{jsonObj13},
        };
    }





    public static JSONObject getZoneListContent() throws Exception {
        ZoneClass zoneClass = new ZoneClass();
        int zoneId = zoneClass.addZone().getZone_id();
        JSONObject jsonObj = new JSONObject();
        //jsonObj.put("zone_id", zoneId);
        //jsonObj.put("type", 0);
        //jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        return jsonObj;
    }

}

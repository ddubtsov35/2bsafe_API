package com.dubtsov._2bsafe.Parents.Functions.Zone;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep1Class;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep2Class;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.ForProvideData;
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
        jsonObj2.put("lat", 1234);
        jsonObj2.put("long", 1234);
        jsonObj2.put("rad", 1234);
        jsonObj2.put("name", 1234);
        jsonObj2.put("type", 1234);
        jsonObj2.put("confirm", null);

        return new Object[]{
                jsonObj,
                jsonObj2
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
        ForProvideData.getTestData();

        ZoneClass zoneClass = new ZoneClass();
        int zoneId = zoneClass.addZone().getZone_id();

        JSONObject jsonObj1 = new JSONObject();
        jsonObj1.put("zone_id", null);
        jsonObj1.put("confirm",null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("zone_id", zoneId);
        jsonObj2.put("confirm",null);

        JSONObject jsonObj3 = new JSONObject();
        jsonObj3.put("zone_id", null);
        jsonObj3.put("confirm",true);


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

        JSONObject jsonObj12 = new JSONObject();
        jsonObj12.put("zone_id", zoneId);

        return new Object[]{jsonObj1, jsonObj2, jsonObj3, jsonObj5, jsonObj6, jsonObj7, jsonObj8, jsonObj9, jsonObj12};
    }

}

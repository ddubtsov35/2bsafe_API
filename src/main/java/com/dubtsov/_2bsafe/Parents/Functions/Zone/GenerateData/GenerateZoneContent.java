package com.dubtsov._2bsafe.Parents.Functions.Zone.GenerateData;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep1Class;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep2Class;
import com.dubtsov._2bsafe.Parents.Functions.Zone.ZoneClass;
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

    public static JSONObject delZoneContent() throws Exception {
        ZoneClass zoneClass = new ZoneClass();
        int zoneId = zoneClass.addZone().getZone_id();
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("zone_id", zoneId);
        jsonObj.put("confirm", true);
        return jsonObj;
    }
}

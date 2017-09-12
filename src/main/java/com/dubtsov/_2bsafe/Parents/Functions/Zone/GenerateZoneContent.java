package com.dubtsov._2bsafe.Parents.Functions.Zone;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.BaseContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import org.json.simple.JSONObject;

/**
 * Created by user on 12.09.17.
 */
public class GenerateZoneContent extends BaseContent{

    public static JSONObject addZoneContent() throws Exception {
        jsonObj.put("lat", 0);
        jsonObj.put("rnd", GenerateTokenClass.getGeneratedToken());
        jsonObj.put("long", 0);
        jsonObj.put("rad", 0);
        jsonObj.put("name", "ZONA");
        jsonObj.put("type", 0);
        jsonObj.put("confirm", false);
        return jsonObj;
    }

    public static JSONObject editZoneContent() throws Exception {
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
    }

    public static JSONObject delZoneContent() throws Exception {
        ZoneClass zoneClass = new ZoneClass();
        jsonObj.put("zone_id", zoneClass.addZone().getZone_id());
        jsonObj.put("confirm", true);
        jsonObj.put("rnd", GenerateTokenClass.getGeneratedToken());
        return jsonObj;
    }

    public static JSONObject getZoneListContent() throws Exception {
        ZoneClass zoneClass = new ZoneClass();
        jsonObj.put("zone_id", zoneClass.addZone().getZone_id());
        jsonObj.put("type", 0);
        jsonObj.put("rnd", GenerateTokenClass.getGeneratedToken());
        return jsonObj;
    }

}

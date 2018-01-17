package com.dubtsov._2bsafe.Parents.Functions.Zone.GenerateData;

import com.dubtsov._2bsafe.Parents.Functions.Zone.ZoneClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.ForProvideData;
import org.json.simple.JSONObject;

/**
 * Created by user on 17.01.18.
 */
public class ProvideDeleteZone {

    public static Object[] provideDeleteZone() throws Exception {
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

package com.dubtsov._2bsafe.Parents.Functions.Zone.GenerateData;

import org.json.simple.JSONObject;

/**
 * Created by user on 17.01.18.
 */
public class ProvideAddZone {

    public static Object[] provideAddZone() throws Exception {
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

}

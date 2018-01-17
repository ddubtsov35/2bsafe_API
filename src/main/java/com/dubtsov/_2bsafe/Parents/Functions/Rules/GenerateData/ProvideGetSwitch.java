package com.dubtsov._2bsafe.Parents.Functions.Rules.GenerateData;

import org.json.simple.JSONObject;

import java.util.Random;

/**
 * Created by user on 17.01.18.
 */
public class ProvideGetSwitch {

    public static Object[] provideGetSwitchContent() throws Exception {
        Random random = new Random();
        JSONObject jsonObj = new JSONObject();

        jsonObj.put("rule_id", 1233);
        jsonObj.put("enabled",null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("rule_id", null);
        jsonObj2.put("enabled", 111);

        JSONObject jsonObj3 = new JSONObject();

        JSONObject jsonObj4 = new JSONObject();
        jsonObj4.put("rule_id", random.nextInt(1000000 - 1 + 1)+1);
        jsonObj4.put("enabled", 1);

        JSONObject jsonObj5 = new JSONObject();
        jsonObj5.put("rule_id", null);
        jsonObj5.put("enabled",null);


        return new Object[]{jsonObj, jsonObj2, jsonObj3, jsonObj4, jsonObj5};
    }

}

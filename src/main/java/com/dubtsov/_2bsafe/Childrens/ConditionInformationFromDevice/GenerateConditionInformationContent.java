package com.dubtsov._2bsafe.Childrens.ConditionInformationFromDevice;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.BaseContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateCidCkeyContent;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.HashMap;

/**
 * Created by user on 23.08.17.
 */
public class GenerateConditionInformationContent{

    private static JSONObject jsonObject1;
    private static JSONObject jsonObject2_1;
    private static JSONObject jsonObject2_2;
    private static JSONObject jsonObject2_3;
    private static JSONObject jsonObject2_4;
    private static JSONObject jsonObject2_5;
    private static JSONObject jsonObject2_6;
    private static JSONObject jsonObject2_7;
    private static JSONObject jsonObject2_8;
    private static JSONObject jsonObject3;
    private static JSONArray jsonArray1;
    private static JSONArray jsonArray2;
    private static JSONArray jsonArray3;

    public static JSONObject getConditionInformationContent() throws Exception {
        jsonObject1 = new JSONObject();
        jsonObject2_1 = new JSONObject();
        jsonObject2_2 = new JSONObject();
        jsonObject2_3 = new JSONObject();
        jsonObject2_4 = new JSONObject();
        jsonObject2_5 = new JSONObject();
        jsonObject2_6 = new JSONObject();
        jsonObject2_7 = new JSONObject();
        jsonObject2_8 = new JSONObject();
        jsonObject3 = new JSONObject();
        jsonArray1 = new JSONArray();
        jsonArray2 = new JSONArray();
        jsonArray3 = new JSONArray();

        jsonObject3.put("cid", GenerateCidCkeyContent.jsonObjectCidCkey.get("cid"));
        jsonObject3.put("ckey", GenerateCidCkeyContent.jsonObjectCidCkey.get("ckey"));

        jsonObject1.put("op", "TestOperator");
        jsonObject1.put("sig", 50);
        jsonObject1.put("imsi", "TestSIM");

        jsonArray1.add(jsonObject1);
        jsonObject2_1.put("netw", jsonArray1);
        jsonObject2_1.put("gprs", 0);
        jsonObject2_1.put("traffic_limit", 100);
        jsonObject3.put("gsm", jsonObject2_1);

        jsonObject2_2.put("state", 0);
        jsonObject2_2.put("ssid", "TestNetwork");
        jsonObject3.put("wifi", jsonObject2_2);

        jsonObject2_3.put("state", 0);
        jsonObject2_3.put("clients", "TestBluetooth");
        jsonObject3.put("bt", jsonObject2_3);

        jsonObject2_4.put("call", 50);
        jsonObject2_4.put("notif", 50);
        jsonObject2_4.put("vibr", 0);
        jsonObject3.put("vol", jsonObject2_4);

        jsonObject2_5.put("scr", 0);
        jsonObject2_5.put("bat", 50);
        jsonObject2_5.put("psav", 0);
        jsonObject3.put("device", jsonObject2_5);

        jsonObject3.put("date", "2017-01-30");

        jsonObject2_6.put("lat", 1);
        jsonObject2_6.put("long", 1);
        jsonObject2_6.put("gtype", 1);
        jsonObject3.put("geo", jsonObject2_6);

        jsonObject2_7.put("type", 0);
        jsonObject2_7.put("date", "2017-01-30");
        jsonObject2_7.put("num", "71111231237");
        jsonObject2_7.put("name", "Pezduk");
        jsonObject2_7.put("status", 1);
        jsonObject2_7.put("dur", 1);
        jsonObject2_7.put("imsi", "TestSIM");
        jsonArray2.add(jsonObject2_7);
        jsonObject3.put("ph", jsonArray2);


        jsonObject2_8.put("type", 0);
        jsonObject2_8.put("date", "2017-01-30");
        jsonObject2_8.put("num", "71111231237");
        jsonObject2_8.put("name", "Pezduk");
        jsonObject2_8.put("imsi", "TestSIM");
        jsonArray3.add(jsonObject2_8);
        jsonObject3.put("sms", jsonArray3);

        return jsonObject3;
    }

}

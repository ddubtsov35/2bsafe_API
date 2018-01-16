package com.dubtsov._2bsafe.Childrens.ConditionInformationFromDevice;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateCidCkeyContent;
import com.dubtsov._2bsafe.Parents.Pool.CidCkeyRegisteredPool;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Created by user on 23.08.17.
 */
public class GenerateConditionInformationContent{

    public static JSONObject getConditionInformationContent() throws Exception {
        JSONObject jsonObject1 = new JSONObject();
        JSONObject jsonObject2_1 = new JSONObject();
        JSONObject jsonObject2_2 = new JSONObject();
        JSONObject jsonObject2_3 = new JSONObject();
        JSONObject jsonObject2_4 = new JSONObject();
        JSONObject jsonObject2_5 = new JSONObject();
        JSONObject jsonObject2_6 = new JSONObject();
        JSONObject jsonObject2_7 = new JSONObject();
        JSONObject jsonObject2_8 = new JSONObject();
        JSONObject jsonObject3 = new JSONObject();
        JSONArray jsonArray1 = new JSONArray();
        JSONArray jsonArray2 = new JSONArray();
        JSONArray jsonArray3 = new JSONArray();

        //jsonObject3.put("cid", GenerateCidCkeyContent.jsonObjectCidCkey.get("cid"));
        //jsonObject3.put("ckey", GenerateCidCkeyContent.jsonObjectCidCkey.get("ckey"));

        jsonObject3.put("cid", CidCkeyRegisteredPool.getCidFromFile().get("cid"));
        jsonObject3.put("ckey", CidCkeyRegisteredPool.getCidFromFile().get("ckey"));

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

    public static Object[] provideGetConditionInformationContentEmptyData() throws Exception {
        JSONObject jsonObject1 = new JSONObject();
        JSONObject jsonObject2_1 = new JSONObject();
        JSONObject jsonObject2_2 = new JSONObject();
        JSONObject jsonObject2_3 = new JSONObject();
        JSONObject jsonObject2_4 = new JSONObject();
        JSONObject jsonObject2_5 = new JSONObject();
        JSONObject jsonObject2_6 = new JSONObject();
        JSONObject jsonObject2_7 = new JSONObject();
        JSONObject jsonObject2_8 = new JSONObject();
        JSONObject jsonObject3 = new JSONObject();
        JSONArray jsonArray1 = new JSONArray();
        JSONArray jsonArray2 = new JSONArray();
        JSONArray jsonArray3 = new JSONArray();

        AuthorisationChildClass authorisationChildClass = new AuthorisationChildClass();
        authorisationChildClass.authorisationChildren();

        jsonObject3 = GenerateCidCkeyContent.getJsonObjectCidCkey();

        jsonObject1.put("op", null);
        jsonObject1.put("sig", null);
        jsonObject1.put("imsi", null);

        jsonArray1.add(jsonObject1);
        jsonObject2_1.put("netw", jsonArray1);
        jsonObject2_1.put("gprs", null);
        jsonObject2_1.put("traffic_limit", null);
        jsonObject3.put("gsm", jsonObject2_1);

        jsonObject2_2.put("state", null);
        jsonObject2_2.put("ssid", null);
        jsonObject3.put("wifi", jsonObject2_2);

        jsonObject2_3.put("state", null);
        jsonObject2_3.put("clients", null);
        jsonObject3.put("bt", jsonObject2_3);

        jsonObject2_4.put("call", null);
        jsonObject2_4.put("notif", null);
        jsonObject2_4.put("vibr", null);
        jsonObject3.put("vol", jsonObject2_4);

        jsonObject2_5.put("scr", null);
        jsonObject2_5.put("bat", null);
        jsonObject2_5.put("psav", null);
        jsonObject3.put("device", jsonObject2_5);

        jsonObject3.put("date", null);

        jsonObject2_6.put("lat", null);
        jsonObject2_6.put("long", null);
        jsonObject2_6.put("gtype", null);
        jsonObject3.put("geo", jsonObject2_6);

        jsonObject2_7.put("type", null);
        jsonObject2_7.put("date", null);
        jsonObject2_7.put("num", null);
        jsonObject2_7.put("name", null);
        jsonObject2_7.put("status", null);
        jsonObject2_7.put("dur", null);
        jsonObject2_7.put("imsi", null);
        jsonArray2.add(jsonObject2_7);
        jsonObject3.put("ph", jsonArray2);


        jsonObject2_8.put("type", null);
        jsonObject2_8.put("date", null);
        jsonObject2_8.put("num", null);
        jsonObject2_8.put("name", null);
        jsonObject2_8.put("imsi", null);
        jsonArray3.add(jsonObject2_8);
        jsonObject3.put("sms", jsonArray3);

        return new Object[]{jsonObject3};
    }

    public static Object[] provideGetConditionInformationContentEmptyAll() throws Exception {
        JSONObject jsonObject1 = new JSONObject();
        JSONObject jsonObject2_1 = new JSONObject();
        JSONObject jsonObject2_2 = new JSONObject();
        JSONObject jsonObject2_3 = new JSONObject();
        JSONObject jsonObject2_4 = new JSONObject();
        JSONObject jsonObject2_5 = new JSONObject();
        JSONObject jsonObject2_6 = new JSONObject();
        JSONObject jsonObject2_7 = new JSONObject();
        JSONObject jsonObject2_8 = new JSONObject();
        JSONObject jsonObject3 = new JSONObject();
        JSONArray jsonArray1 = new JSONArray();
        JSONArray jsonArray2 = new JSONArray();
        JSONArray jsonArray3 = new JSONArray();

        jsonObject3.put("ckey", null);
        jsonObject3.put("cid", null);

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

        return new Object[]{jsonObject3};
    }

    public static Object[] provideGetConditionInformationContentEmptyCid() throws Exception {
        JSONObject jsonObject1 = new JSONObject();
        JSONObject jsonObject2_1 = new JSONObject();
        JSONObject jsonObject2_2 = new JSONObject();
        JSONObject jsonObject2_3 = new JSONObject();
        JSONObject jsonObject2_4 = new JSONObject();
        JSONObject jsonObject2_5 = new JSONObject();
        JSONObject jsonObject2_6 = new JSONObject();
        JSONObject jsonObject2_7 = new JSONObject();
        JSONObject jsonObject2_8 = new JSONObject();
        JSONObject jsonObject3 = new JSONObject();
        JSONArray jsonArray1 = new JSONArray();
        JSONArray jsonArray2 = new JSONArray();
        JSONArray jsonArray3 = new JSONArray();

        AuthorisationChildClass authorisationChildClass = new AuthorisationChildClass();
        authorisationChildClass.authorisationChildren();

        jsonObject3 = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObject3.remove("cid");
        jsonObject3.put("cid", null);

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

        return new Object[]{jsonObject3};
    }

    public static Object[] provideGetConditionInformationContentEmptyCkey() throws Exception {
        JSONObject jsonObject1 = new JSONObject();
        JSONObject jsonObject2_1 = new JSONObject();
        JSONObject jsonObject2_2 = new JSONObject();
        JSONObject jsonObject2_3 = new JSONObject();
        JSONObject jsonObject2_4 = new JSONObject();
        JSONObject jsonObject2_5 = new JSONObject();
        JSONObject jsonObject2_6 = new JSONObject();
        JSONObject jsonObject2_7 = new JSONObject();
        JSONObject jsonObject2_8 = new JSONObject();
        JSONObject jsonObject3 = new JSONObject();
        JSONArray jsonArray1 = new JSONArray();
        JSONArray jsonArray2 = new JSONArray();
        JSONArray jsonArray3 = new JSONArray();

        AuthorisationChildClass authorisationChildClass = new AuthorisationChildClass();
        authorisationChildClass.authorisationChildren();

        jsonObject3 = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObject3.remove("ckey");
        jsonObject3.put("ckey", null);

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

        return new Object[]{jsonObject3};
    }

}

package com.dubtsov._2bsafe.Childrens.HelpMe;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateCidCkeyContent;
import com.dubtsov._2bsafe.Parents.Pool.CidCkeyPool;
import com.dubtsov._2bsafe.Parents.Pool.CidCkeyRegisteredPool;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.HashMap;

/**
 * Created by user on 24.08.17.
 */
public class GenerateHelpMeContent {
    private static JSONObject jsonObject;
    private static JSONObject jsonObject2;


    public static JSONObject getHelpMeContent() throws Exception {
        jsonObject = new JSONObject();
        jsonObject2 = new JSONObject();

        //jsonObject = GenerateCidCkeyContent.getJsonObjectCidCkey();

        jsonObject.put("cid", CidCkeyPool.getCidFromFile().get("cid"));
        jsonObject.put("ckey", CidCkeyPool.getCidFromFile().get("ckey"));

        jsonObject2.put("lat", 1);
        jsonObject2.put("long", 1);
        jsonObject2.put("gtype", 1);
        jsonObject2.put("date", "2017-01-30");

        jsonObject.put("geo", jsonObject2);

        return jsonObject;
    }

    public static Object[] provideNegativeGetHelpMeContent1() throws Exception {
        jsonObject = new JSONObject();
        jsonObject2 = new JSONObject();

        jsonObject = GenerateCidCkeyContent.getJsonObjectCidCkey();

        jsonObject2.put("lat", null);
        jsonObject2.put("long", null);
        jsonObject2.put("gtype", null);
        jsonObject2.put("date", null);

        jsonObject.put("geo", jsonObject2);

        return new Object[]{new Object[]{jsonObject}};
    }

    public static Object[] provideNegativeGetHelpMeContent2() throws Exception {
        jsonObject = new JSONObject();
        jsonObject2 = new JSONObject();

        jsonObject = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObject.remove("cid");
        jsonObject.put("cid", null);

        jsonObject2.put("lat", null);
        jsonObject2.put("long", null);
        jsonObject2.put("gtype", null);
        jsonObject2.put("date", null);

        jsonObject.put("geo", jsonObject2);

        return new Object[]{new Object[]{jsonObject}};
    }

    public static Object[] provideNegativeGetHelpMeContent3() throws Exception {
        jsonObject = new JSONObject();
        jsonObject2 = new JSONObject();

        jsonObject = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObject.remove("ckey");
        jsonObject.put("ckey", null);

        jsonObject2.put("lat", null);
        jsonObject2.put("long", null);
        jsonObject2.put("gtype", null);
        jsonObject2.put("date", null);

        jsonObject.put("geo", jsonObject2);

        return new Object[]{new Object[]{jsonObject}};
    }

    public static Object[] provideNegativeGetHelpMeContent4() throws Exception {
        jsonObject = new JSONObject();
        jsonObject2 = new JSONObject();

        jsonObject.put("ckey", null);
        jsonObject.put("cid", null);

        jsonObject2.put("lat", null);
        jsonObject2.put("long", null);
        jsonObject2.put("gtype", null);
        jsonObject2.put("date", null);

        jsonObject.put("geo", jsonObject2);

        return new Object[]{new Object[]{jsonObject}};
    }

    public static Object[] provideNegativeGetHelpMeContent5() throws Exception {
        jsonObject = new JSONObject();
        jsonObject2 = new JSONObject();

        jsonObject.put("ckey", null);
        jsonObject.put("cid", null);

        jsonObject2.put("lat", 1);
        jsonObject2.put("long", 1);
        jsonObject2.put("gtype", 1);
        jsonObject2.put("date", "2017-01-30");

        jsonObject.put("geo", jsonObject2);

        return new Object[]{new Object[]{jsonObject}};
    }

    public static Object[] provideNegativeGetHelpMeContent6() throws Exception {
        jsonObject = new JSONObject();
        jsonObject2 = new JSONObject();

        jsonObject = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObject.remove("ckey");
        jsonObject.put("ckey", null);

        jsonObject2.put("lat", 1);
        jsonObject2.put("long", 1);
        jsonObject2.put("gtype", 1);
        jsonObject2.put("date", "2017-01-30");

        jsonObject.put("geo", jsonObject2);

        return new Object[]{new Object[]{jsonObject}};
    }

    public static Object[] provideNegativeGetHelpMeContent7() throws Exception {
        jsonObject = new JSONObject();
        jsonObject2 = new JSONObject();

        jsonObject = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObject.remove("cid");
        jsonObject.put("cid", null);

        jsonObject2.put("lat", 1);
        jsonObject2.put("long", 1);
        jsonObject2.put("gtype", 1);
        jsonObject2.put("date", "2017-01-30");

        jsonObject.put("geo", jsonObject2);

        return new Object[]{new Object[]{jsonObject}};
    }

    public static Object[] provideNegativeGetHelpMeConten8() throws Exception {
        jsonObject = new JSONObject();
        jsonObject2 = new JSONObject();

        jsonObject = GenerateCidCkeyContent.getJsonObjectCidCkey();

        jsonObject.put("geo", jsonObject2);

        return new Object[]{new Object[]{jsonObject}};
    }


}

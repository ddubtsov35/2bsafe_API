package com.dubtsov._2bsafe.Childrens.NotifyChangeApp;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent.GenerateGetProfileListContent;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep1Class;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep2Class;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.ForProvideData;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Created by user on 24.08.17.
 */
public class GenerateNotifyChangeAppContent{

    public static JSONObject appsNotifyContent() throws Exception {
        JSONObject jsonObj = new JSONObject();
        JSONObject jsonObject2 = new JSONObject();
        JSONObject jsonObject3 = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        JSONArray jsonArray2 = new JSONArray();

        jsonObj = GenerateGetProfileListContent.getProfileListContent();

        jsonObject2.put("name", "TestName");
        jsonObject2.put("alias", "com.google.android.youtube");
        jsonObject2.put("version", "0.0.1");
        jsonObject2.put("flags", jsonArray2);
        jsonArray2.add("new");
        jsonArray.add(jsonObject2);
        jsonObj.put("apps", jsonArray);

        //System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }

    public static Object[] provideNegativeAppsNotifyContent1() throws Exception {
        JSONObject jsonObj = new JSONObject();
        JSONObject jsonObject2 = new JSONObject();
        JSONObject jsonObject3 = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        JSONArray jsonArray2 = new JSONArray();

        jsonObj = new JSONObject();
        jsonObj.put("cid", null);
        jsonObj.put("ckey", null);

        jsonObject2.put("name", "TestName");
        jsonObject2.put("alias", "com.google.android.youtube");
        jsonObject2.put("version", "0.0.1");
        jsonObject2.put("flags", jsonArray2);
        jsonArray2.add("new");
        jsonArray.add(jsonObject2);
        jsonObj.put("apps", jsonArray);

        //System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }

    public static Object[] provideNegativeAppsNotifyContent2() throws Exception {
        ForProvideData.getTestData();

        JSONObject jsonObj = new JSONObject();
        JSONObject jsonObject2 = new JSONObject();
        JSONObject jsonObject3 = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        JSONArray jsonArray2 = new JSONArray();

        jsonObj = GenerateGetProfileListContent.getProfileListContent();
        jsonObj.remove("cid");
        jsonObj.put("cid", null);

        jsonObject2.put("name", "TestName");
        jsonObject2.put("alias", "com.google.android.youtube");
        jsonObject2.put("version", "0.0.1");
        jsonObject2.put("flags", jsonArray2);
        jsonArray2.add("new");
        jsonArray.add(jsonObject2);
        jsonObj.put("apps", jsonArray);

        //System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }

    public static Object[] provideNegativeAppsNotifyContent3() throws Exception {
        ForProvideData.getTestData();

        JSONObject jsonObj = new JSONObject();
        JSONObject jsonObject2 = new JSONObject();
        JSONObject jsonObject3 = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        JSONArray jsonArray2 = new JSONArray();

        jsonObj = GenerateGetProfileListContent.getProfileListContent();
        jsonObj.remove("ckey");
        jsonObj.put("ckey", null);

        jsonObject2.put("name", "TestName");
        jsonObject2.put("alias", "com.google.android.youtube");
        jsonObject2.put("version", "0.0.1");
        jsonObject2.put("flags", jsonArray2);
        jsonArray2.add("new");
        jsonArray.add(jsonObject2);
        jsonObj.put("apps", jsonArray);

        //System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }

    public static Object[] provideNegativeAppsNotifyContent4() throws Exception {
        ForProvideData.getTestData();

        JSONObject jsonObj = new JSONObject();
        JSONObject jsonObject2 = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        JSONArray jsonArray2 = new JSONArray();

        jsonObj = GenerateGetProfileListContent.getProfileListContent();
        jsonObj.remove("cid");
        jsonObj.put("cid", "failCid");

        jsonObject2.put("name", "TestName");
        jsonObject2.put("alias", "com.google.android.youtube");
        jsonObject2.put("version", "0.0.1");
        jsonObject2.put("flags", jsonArray2);
        jsonArray2.add("new");
        jsonArray.add(jsonObject2);
        jsonObj.put("apps", jsonArray);

        //System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }

    public static Object[] provideNegativeAppsNotifyContent5() throws Exception {
        ForProvideData.getTestData();

        JSONObject jsonObj = new JSONObject();
        JSONObject jsonObject2 = new JSONObject();
        JSONObject jsonObject3 = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        JSONArray jsonArray2 = new JSONArray();

        jsonObj = GenerateGetProfileListContent.getProfileListContent();
        jsonObj.remove("ckey");
        jsonObj.put("cky", "failCkey");

        jsonObject2.put("name", "TestName");
        jsonObject2.put("alias", "com.google.android.youtube");
        jsonObject2.put("version", "0.0.1");
        jsonObject2.put("flags", jsonArray2);
        jsonArray2.add("new");
        jsonArray.add(jsonObject2);
        jsonObj.put("apps", jsonArray);

        //System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }

    public static Object[] provideNegativeAppsNotifyContent6() throws Exception {
        ForProvideData.getTestData();

        JSONObject jsonObj = new JSONObject();

        jsonObj = GenerateGetProfileListContent.getProfileListContent();

        //System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }

    public static Object[] provideNegativeAppsNotifyContent7() throws Exception {
        ForProvideData.getTestData();

        JSONObject jsonObj = new JSONObject();
        JSONObject jsonObject2 = new JSONObject();
        JSONObject jsonObject3 = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        JSONArray jsonArray2 = new JSONArray();

        jsonObj = GenerateGetProfileListContent.getProfileListContent();

        jsonObject2.put("name", null);
        jsonObject2.put("alias", null);
        jsonObject2.put("version", null);
        jsonObject2.put("flags", null);
        jsonArray2.add("new");
        jsonArray.add(jsonObject2);
        jsonObj.put("apps", jsonArray);

        //System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }

    public static Object[] provideNegativeAppsNotifyContent8() throws Exception {
        ForProvideData.getTestData();

        JSONObject jsonObj = new JSONObject();
        JSONObject jsonObject2 = new JSONObject();
        JSONObject jsonObject3 = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        JSONArray jsonArray2 = new JSONArray();

        jsonObj = GenerateGetProfileListContent.getProfileListContent();

        jsonObject2.put("name", "TestName");
        jsonObject2.put("alias", "com.google.android.youtube");
        jsonObject2.put("version", "0.0.1");
        jsonObject2.put("flags", jsonArray2);
        jsonArray2.add("testttttt");
        jsonArray.add(jsonObject2);
        jsonObj.put("apps", jsonArray);

        //System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }

}

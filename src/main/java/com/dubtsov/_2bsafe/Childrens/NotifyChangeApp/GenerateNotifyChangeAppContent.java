package com.dubtsov._2bsafe.Childrens.NotifyChangeApp;

import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent.GenerateGetProfileListContent;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Created by user on 24.08.17.
 */
public class GenerateNotifyChangeAppContent{

    private static JSONObject jsonObject2;
    private static JSONObject jsonObject3;
    private static JSONArray jsonArray2;
    private static JSONArray jsonArray;
    private static JSONObject jsonObj;


    public static JSONObject appsNotifyContent() throws Exception {
        jsonObj = new JSONObject();
        jsonObject2 = new JSONObject();
        jsonObject3 = new JSONObject();
        jsonArray = new JSONArray();
        jsonArray2 = new JSONArray();

        jsonObj = GenerateGetProfileListContent.getProfileListContent();

        jsonObject2.put("name", "TestName");
        jsonObject2.put("alias", "com.google.android.youtube");
        jsonObject2.put("version", "0.0.1");
        jsonObject2.put("flags", jsonArray2);
        jsonArray2.add("new");
        jsonArray.add(jsonObject2);
        jsonObj.put("apps", jsonArray);

        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }

}
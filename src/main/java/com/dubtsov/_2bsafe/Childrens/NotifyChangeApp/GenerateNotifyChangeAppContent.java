package com.dubtsov._2bsafe.Childrens.NotifyChangeApp;

import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent.GenerateGetProfileListContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.BaseContent;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.IOException;

/**
 * Created by user on 24.08.17.
 */
public class GenerateNotifyChangeAppContent extends BaseContent{

    private static JSONObject jsonObject2;
    private static JSONObject jsonObject3;
    private static JSONArray jsonArray2;


    public static JSONObject appsNotifyContent() throws IOException {
        jsonObj = new JSONObject();
        jsonObject2 = new JSONObject();
        jsonObject3 = new JSONObject();
        jsonArray = new JSONArray();
        jsonArray2 = new JSONArray();

        jsonObj = GenerateGetProfileListContent.getProfileListContent();

        jsonObject2.put("name", "TestName");
        jsonObject2.put("alias", "alias");
        jsonObject2.put("version", "0.0.1");
        jsonObject2.put("flags", "[new]");
        jsonArray.add(jsonObject2);
        jsonObj.put("apps", jsonArray);

        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }

}

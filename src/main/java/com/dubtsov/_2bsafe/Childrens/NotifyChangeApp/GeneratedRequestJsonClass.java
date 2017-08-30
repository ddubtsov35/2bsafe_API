package com.dubtsov._2bsafe.Childrens.NotifyChangeApp;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.HashMap;

/**
 * Created by user on 24.08.17.
 */
public class GeneratedRequestJsonClass {

    JSONObject jsonObject;
    JSONObject jsonObject2;
    JSONObject jsonObject3;
    JSONArray jsonArray;
    JSONArray jsonArray2;


    public JSONObject generatedJsonNotifyChangeApp(HashMap content){
        jsonObject = new JSONObject();
        jsonObject2 = new JSONObject();
        jsonObject3 = new JSONObject();
        jsonArray = new JSONArray();
        jsonArray2 = new JSONArray();

        jsonObject.put("cid", content.get("cid"));
        jsonObject.put("ckey", content.get("ckey"));

        jsonObject2.put("name", "TestName");
        jsonObject2.put("alias", "alias");
        jsonObject2.put("version", "0.0.1");
        jsonObject2.put("flags", "[new]");
        jsonArray.add(jsonObject2);
        jsonObject.put("apps", jsonArray);

        System.out.println("jsonObject " + jsonObject);
        return jsonObject;
    }

}

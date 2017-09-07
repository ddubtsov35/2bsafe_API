package com.dubtsov._2bsafe.Parents.Functions.HelpMe;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.HashMap;

/**
 * Created by user on 31.08.17.
 */
public class GenerateSetHelpMeJson {

    private static JSONObject jsonObject;
    private static JSONArray jsonArray;

    public static JSONObject generatedAddGroup(HashMap content){
        jsonObject = new JSONObject();
        jsonArray = new JSONArray();
        jsonObject.put("cid", content.get("cid"));
        jsonObject.put("state", content.get("state"));
        jsonObject.put("push", content.get("push"));
        jsonObject.put("phone", content.get("phone"));

        jsonObject.put("sms",jsonArray);
        jsonArray.add(content.get("default"));
        jsonArray.add(content.get("phone"));

        System.out.println("jsonObject " + jsonObject);
        return jsonObject;
    }

}

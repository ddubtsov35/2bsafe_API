package com.dubtsov._2bsafe.Parents.Functions.GroupsApp;

import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.HashMap;

/**
 * Created by user on 31.08.17.
 */
public class GenerateSetGroupJson {

    private static JSONObject jsonObject;
    private static JSONArray jsonArray;

    public static JSONObject generatedJsonRules(HashMap content){
        jsonObject = new JSONObject();
        jsonArray = new JSONArray();
        jsonObject.put("profile_id", content.get("profile_id"));

        jsonObject.put("aliases",jsonArray);
        jsonArray.add(content.get("aliases"));

        jsonObject.put("group_id", content.get("group_id"));

        System.out.println("jsonObject " + jsonObject);
        return jsonObject;
    }

}

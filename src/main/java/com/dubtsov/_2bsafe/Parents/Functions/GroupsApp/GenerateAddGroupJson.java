package com.dubtsov._2bsafe.Parents.Functions.GroupsApp;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.HashMap;

/**
 * Created by user on 31.08.17.
 */
public class GenerateAddGroupJson {

    private static JSONObject jsonObject;
    private static JSONArray jsonArray;

    public static JSONObject generatedAddGroup(HashMap content){
        jsonObject = new JSONObject();
        jsonArray = new JSONArray();
        jsonObject.put("name", content.get("name"));
        jsonObject.put("profile_id", content.get("profile_id"));

        jsonObject.put("aliases",jsonArray);
        jsonArray.add(content.get("aliases"));

        System.out.println("jsonObject " + jsonObject);
        return jsonObject;
    }

}

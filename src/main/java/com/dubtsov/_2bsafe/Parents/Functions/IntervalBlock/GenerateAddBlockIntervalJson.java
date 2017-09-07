package com.dubtsov._2bsafe.Parents.Functions.IntervalBlock;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.HashMap;

/**
 * Created by user on 31.08.17.
 */
public class GenerateAddBlockIntervalJson {

    private static JSONObject jsonObject;
    private static JSONArray jsonArray;

    public static JSONObject generatedAddBlockInterval(HashMap content){
        jsonObject = new JSONObject();
        jsonArray = new JSONArray();
        jsonObject.put("profile_id", content.get("profile_id"));
        jsonObject.put("group_id", content.get("group_id"));
        jsonObject.put("alias", content.get("alias"));

        jsonArray.add(content.get("type"));
        jsonArray.add(content.get("name"));
        jsonArray.add(content.get("repeat"));
        jsonArray.add(content.get("interval_start"));
        jsonArray.add(content.get("interval_end"));
        jsonObject.put("intervals",jsonArray);

        System.out.println("jsonObject " + jsonObject);
        return jsonObject;
    }

}

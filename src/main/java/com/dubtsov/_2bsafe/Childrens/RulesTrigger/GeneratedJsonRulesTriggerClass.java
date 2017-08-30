package com.dubtsov._2bsafe.Childrens.RulesTrigger;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.HashMap;

/**
 * Created by user on 24.08.17.
 */
public class GeneratedJsonRulesTriggerClass {
    JSONObject jsonObject;
    JSONObject jsonObject2;
    JSONArray jsonArray;

    public JSONObject generatedJsonRulesTrigger(HashMap content){
        jsonObject = new JSONObject();
        jsonObject2 = new JSONObject();
        jsonArray = new JSONArray();

        jsonObject.put("cid", content.get("cid"));
        jsonObject.put("ckey", content.get("ckey"));
        jsonArray.add(201);
        jsonObject.put("rules", jsonArray);

        jsonObject2.put("lat", 1);
        jsonObject2.put("long", 1);
        jsonObject2.put("gtype", 1);
        jsonObject.put("geo", jsonObject2);

        System.out.println("jsonObject " + jsonObject);
        return jsonObject;
    }
}

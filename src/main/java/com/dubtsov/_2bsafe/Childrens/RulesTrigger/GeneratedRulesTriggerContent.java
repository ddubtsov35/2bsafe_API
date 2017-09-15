package com.dubtsov._2bsafe.Childrens.RulesTrigger;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.BaseContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateCidCkeyContent;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.HashMap;

/**
 * Created by user on 24.08.17.
 */
public class GeneratedRulesTriggerContent extends BaseContent{
    private static JSONObject jsonObject2;

    public static JSONObject getRulesTriggerContent() throws Exception {
        jsonObject2 = new JSONObject();

        jsonObj.put("cid", GenerateCidCkeyContent.jsonObjectCidCkey.get("cid"));
        jsonObj.put("ckey", GenerateCidCkeyContent.jsonObjectCidCkey.get("ckey"));
        jsonArray.add(201);
        jsonObj.put("rules", jsonArray);

        jsonObject2.put("lat", 1);
        jsonObject2.put("long", 1);
        jsonObject2.put("gtype", 1);
        jsonObj.put("geo", jsonObject2);

        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }
}

package com.dubtsov._2bsafe.Childrens.RulesTrigger;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.BaseContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateCidCkeyContent;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.HashMap;

/**
 * Created by user on 24.08.17.
 */
public class GeneratedRulesTriggerContent{

    public static JSONObject getRulesTriggerContent() throws Exception {
        JSONObject jsonObject = new JSONObject();
        JSONObject jsonObject2 = GenerateCidCkeyContent.getJsonObjectCidCkey();
        JSONArray jsonArray = new JSONArray();

        jsonArray.add(10);
        jsonObject2.put("rules", jsonArray);

        jsonObject.put("lat", 1);
        jsonObject.put("long", 1);
        jsonObject.put("gtype", 1);
        jsonObject2.put("geo", jsonObject);


        System.out.println("jsonObject " + jsonObject2);
        return jsonObject2;
    }
}

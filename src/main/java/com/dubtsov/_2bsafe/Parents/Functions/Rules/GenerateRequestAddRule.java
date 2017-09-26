package com.dubtsov._2bsafe.Parents.Functions.Rules;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.BaseContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 29.08.17.
 */
public class GenerateRequestAddRule{

    private static JSONObject jsonObject;
    private static JSONObject jsonObject3;
    private static JSONObject jsonObject5;
    private static JSONArray jsonArray;
    private static JSONArray jsonArray2;
    private static RulesClass rulesClass;
    private static JSONObject jsonObj = new JSONObject();


    public static JSONObject addRuleContent() throws Exception {
        jsonObject = new JSONObject();
        jsonObject3 = new JSONObject();
        jsonObject5 = new JSONObject();
        jsonArray = new JSONArray();
        jsonArray2 = new JSONArray();

        jsonObject.put("name", "TestName");
        jsonObject.put("profiles",jsonArray);
        jsonArray.add(GenerateProfileIdContent.getProfileId());

        jsonObject3.put(10,"Выключить");
        jsonObject.put("triggers",jsonObject3);

        jsonArray2.add(100);
        jsonObject.put("zones", jsonArray2);

        jsonObject5.put(1,"TEst");
        jsonObject.put("actions",jsonObject5);


        System.out.println("jsonObject " + jsonObject);
        return jsonObject;
    }

    public static JSONObject getDel_Get_Content() throws Exception {
        rulesClass = new RulesClass();
        jsonObj.put("rule_id", rulesClass.addRule().getRule_id());
        return jsonObj;
    }

    public static JSONObject getSwitchContent() throws Exception {
        rulesClass = new RulesClass();
        jsonObj.put("rule_id", rulesClass.addRule().getRule_id());
        jsonObj.put("enabled", 0);
        return jsonObj;
    }

}

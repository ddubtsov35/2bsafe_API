package com.dubtsov._2bsafe.Parents.Functions.Rules.GenerateData;

import com.dubtsov._2bsafe.Childrens.Models.Rules;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep1Class;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep2Class;
import com.dubtsov._2bsafe.Parents.Functions.Rules.RulesClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.ForProvideData;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Random;

/**
 * Created by user on 29.08.17.
 */
public class GenerateRequestAddRule{


    public static JSONObject addRuleContent() throws Exception {
        JSONObject jsonObj = new JSONObject();
        JSONObject jsonObject = new JSONObject();
        JSONObject jsonObject3 = new JSONObject();
        JSONObject jsonObject5 = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        JSONArray jsonArray2 = new JSONArray();

        jsonObject.put("name", "TestName");
        jsonObject.put("profiles",jsonArray);
        jsonArray.add(GenerateProfileIdContent.getProfileId().get("profile_id"));

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
        JSONObject jsonObj = new JSONObject();
        RulesClass rulesClass = new RulesClass();
        int rule_id = rulesClass.addRule().getRule_id();
        jsonObj.put("rule_id", rule_id);
        return jsonObj;
    }

    public static JSONObject getSwitchContent() throws Exception {
        JSONObject jsonObj = new JSONObject();
        RulesClass rulesClass = new RulesClass();
        int rule_id = rulesClass.addRule().getRule_id();
        jsonObj.put("rule_id", rule_id);
        jsonObj.put("enabled", 1);
        return jsonObj;
    }

}

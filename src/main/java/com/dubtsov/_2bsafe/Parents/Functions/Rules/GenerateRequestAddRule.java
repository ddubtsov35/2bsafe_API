package com.dubtsov._2bsafe.Parents.Functions.Rules;

import com.dubtsov._2bsafe.Childrens.Models.Rules;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep1Class;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep2Class;
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
    public static Object[] provideNegativeAddRuleContent() throws Exception {
        JSONObject jsonObj = new JSONObject();
        JSONObject jsonObject = new JSONObject();
        JSONObject jsonObject3 = new JSONObject();
        JSONObject jsonObject5 = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        JSONArray jsonArray2 = new JSONArray();

        RegistrationUserStep1Class registrationUserStep1Class = new RegistrationUserStep1Class();
        registrationUserStep1Class.registrationUserStep1();
        RegistrationUserStep2Class registrationUserStep2Class = new RegistrationUserStep2Class();
        registrationUserStep2Class.registrationUserStep2Web();

        jsonObject.put("name", null);
        jsonObject.put("profiles",null);
        jsonObject3.put(null,null);
        jsonObject.put("triggers",jsonObject3);
        jsonArray2.add(null);
        jsonObject.put("zones", jsonArray2);
        jsonObject5.put(null,null);
        jsonObject.put("actions",jsonObject5);

        JSONObject jsonObj2 = new JSONObject();
        jsonObject.put("name", null);
        jsonObject.put("profiles",null);
        jsonArray.add(GenerateProfileIdContent.getProfileId().get("profile_id"));
        jsonObject3.put(null,null);
        jsonObject.put("triggers",jsonObject3);
        jsonArray2.add(null);
        jsonObject.put("zones", jsonArray2);
        jsonObject5.put(null,null);
        jsonObject.put("actions",jsonObject5);

        JSONObject jsonObj3 = new JSONObject();
        jsonObject.put("name", null);
        jsonObject.put("profiles",null);
        jsonArray.add(null);
        jsonObject3.put(10,"Выключить");
        jsonObject.put("triggers",jsonObject3);
        jsonArray2.add(null);
        jsonObject.put("zones", jsonArray2);
        jsonObject5.put(null,null);
        jsonObject.put("actions",jsonObject5);

        JSONObject jsonObj4 = new JSONObject();
        jsonObject.put("profiles",null);
        jsonObject3.put(10,"Выключить");
        jsonObject.put("triggers",jsonObject3);
        jsonArray2.add(null);
        jsonObject.put("zones", jsonArray2);
        jsonObject5.put(null,null);
        jsonObject.put("actions",jsonObject5);

        JSONObject jsonObj5 = new JSONObject();
        jsonObject.put("name", null);
        jsonObject3.put(10,"Выключить");
        jsonObject.put("triggers",jsonObject3);
        jsonArray2.add(null);
        jsonObject.put("zones", jsonArray2);
        jsonObject5.put(null,null);
        jsonObject.put("actions",jsonObject5);

        JSONObject jsonObj6 = new JSONObject();jsonObject.put("name", null);
        jsonObject.put("profiles",null);
        jsonArray.add(null);
        jsonObject3.put(10,"Выключить");


        JSONObject jsonObj7 = new JSONObject();
        jsonObject.put("name", "fake");
        jsonObject.put("profiles","fake");
        jsonArray.add("fake");
        jsonObject3.put(12222,"Выключить");
        jsonObject.put("triggers",jsonObject3);
        jsonArray2.add("fake");
        jsonObject.put("zones", jsonArray2);
        jsonObject5.put(2342345,"fake");
        jsonObject.put("actions",jsonObject5);

        JSONObject jsonObj8 = new JSONObject();

        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3},
                new JSONObject[]{jsonObj4},
                new JSONObject[]{jsonObj5},
                new JSONObject[]{jsonObj6},
                new JSONObject[]{jsonObj7},
                new JSONObject[]{jsonObj8}
        };
    }







    public static JSONObject getDel_Get_Content() throws Exception {
        JSONObject jsonObj = new JSONObject();
        RulesClass rulesClass = new RulesClass();
        int rule_id = rulesClass.addRule().getRule_id();
        jsonObj.put("rule_id", rule_id);
        return jsonObj;
    }
    public static Object[] provideNegativeGetDel_Get_Content() throws IOException, ParseException {
        Random random = new Random();

        JSONObject jsonObj = new JSONObject();

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("rule_id", null);

        JSONObject jsonObj3 = new JSONObject();
        jsonObj3.put("rule_id", random.nextInt(1000000 - 1 + 1)+1);


        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3}
        };
    }







    public static JSONObject getSwitchContent() throws Exception {
        JSONObject jsonObj = new JSONObject();
        RulesClass rulesClass = new RulesClass();
        int rule_id = rulesClass.addRule().getRule_id();
        jsonObj.put("rule_id", rule_id);
        jsonObj.put("enabled", 1);
        return jsonObj;
    }
    public static Object[] provideNegativeGetSwitchContent() throws Exception {
        Random random = new Random();
        JSONObject jsonObj = new JSONObject();

        jsonObj.put("rule_id", 1233);
        jsonObj.put("enabled",null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("rule_id", null);
        jsonObj2.put("enabled", 111);

        JSONObject jsonObj3 = new JSONObject();

        JSONObject jsonObj4 = new JSONObject();
        jsonObj4.put("rule_id", random.nextInt(1000000 - 1 + 1)+1);
        jsonObj4.put("enabled", 1);

        JSONObject jsonObj5 = new JSONObject();
        jsonObj5.put("rule_id", null);
        jsonObj5.put("enabled",null);


        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3},
                new JSONObject[]{jsonObj4},
                new JSONObject[]{jsonObj5}
        };
    }

}

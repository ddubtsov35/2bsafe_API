package com.dubtsov._2bsafe.Childrens.RulesTrigger;

import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep1Class;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep2Class;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateCidCkeyContent;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

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


        //System.out.println("jsonObject " + jsonObject2);
        return jsonObject2;
    }

    public static Object[] provideNegativeGetRulesTriggerContent1() throws Exception {
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();

        JSONObject jsonObject2 = new JSONObject();
        jsonObject.put("cid", null);
        jsonObject.put("ckey", null);

        jsonArray.add(10);
        jsonObject2.put("rules", jsonArray);

        jsonObject.put("lat", 1);
        jsonObject.put("long", 1);
        jsonObject.put("gtype", 1);
        jsonObject2.put("geo", jsonObject);


        //System.out.println("jsonObject " + jsonObject2);
        return new Object[]{new Object[]{jsonObject}};
    }

    public static Object[] provideNegativeGetRulesTriggerContent2() throws Exception {
        RegistrationUserStep1Class registrationUserStep1Class = new RegistrationUserStep1Class();
        registrationUserStep1Class.registrationUserStep1();
        RegistrationUserStep2Class registrationUserStep2Class = new RegistrationUserStep2Class();
        registrationUserStep2Class.registrationUserStep2Web();

        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();

        JSONObject jsonObject2 = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObject.remove("cid");
        jsonObject.put("cid", null);

        jsonArray.add(10);
        jsonObject2.put("rules", jsonArray);

        jsonObject.put("lat", 1);
        jsonObject.put("long", 1);
        jsonObject.put("gtype", 1);
        jsonObject2.put("geo", jsonObject);

        //System.out.println("jsonObject " + jsonObject2);
        return new Object[]{new Object[]{jsonObject}};
    }

    public static Object[] provideNegativeGetRulesTriggerContent3() throws Exception {
        RegistrationUserStep1Class registrationUserStep1Class = new RegistrationUserStep1Class();
        registrationUserStep1Class.registrationUserStep1();
        RegistrationUserStep2Class registrationUserStep2Class = new RegistrationUserStep2Class();
        registrationUserStep2Class.registrationUserStep2Web();

        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();

        JSONObject jsonObject2 = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObject.remove("ckey");
        jsonObject.put("ckey", null);

        jsonArray.add(10);
        jsonObject2.put("rules", jsonArray);

        jsonObject.put("lat", 1);
        jsonObject.put("long", 1);
        jsonObject.put("gtype", 1);
        jsonObject2.put("geo", jsonObject);


        //System.out.println("jsonObject " + jsonObject2);
        return new Object[]{new Object[]{jsonObject}};
    }

    public static Object[] provideNegativeGetRulesTriggerContent4() throws Exception {
        RegistrationUserStep1Class registrationUserStep1Class = new RegistrationUserStep1Class();
        registrationUserStep1Class.registrationUserStep1();
        RegistrationUserStep2Class registrationUserStep2Class = new RegistrationUserStep2Class();
        registrationUserStep2Class.registrationUserStep2Web();

        JSONObject jsonObject = new JSONObject();
        JSONObject jsonObject2 = GenerateCidCkeyContent.getJsonObjectCidCkey();

        System.out.println("jsonObject " + jsonObject2);
        return new Object[]{new Object[]{jsonObject}};
    }

    public static Object[] provideNegativeGetRulesTriggerContent5() throws Exception {
        RegistrationUserStep1Class registrationUserStep1Class = new RegistrationUserStep1Class();
        registrationUserStep1Class.registrationUserStep1();
        RegistrationUserStep2Class registrationUserStep2Class = new RegistrationUserStep2Class();
        registrationUserStep2Class.registrationUserStep2Web();

        JSONObject jsonObject = new JSONObject();
        JSONObject jsonObject2 = GenerateCidCkeyContent.getJsonObjectCidCkey();
        JSONArray jsonArray = new JSONArray();

        jsonArray.add(10);
        jsonObject2.put("rules", null);

        jsonObject.put("lat", null);
        jsonObject.put("long", null);
        jsonObject.put("gtype", null);
        jsonObject2.put("geo", null);

       //System.out.println("jsonObject " + jsonObject2);
        return new Object[]{new Object[]{jsonObject}};
    }


}

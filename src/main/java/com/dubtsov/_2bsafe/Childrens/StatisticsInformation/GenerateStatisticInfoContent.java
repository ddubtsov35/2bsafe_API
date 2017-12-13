package com.dubtsov._2bsafe.Childrens.StatisticsInformation;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep1Class;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep2Class;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateCidCkeyContent;
import org.json.simple.JSONObject;

/**
 * Created by user on 12.09.17.
 */
public class GenerateStatisticInfoContent{

    public static JSONObject getRulesTriggerContent() throws Exception {
        JSONObject jsonObj = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObj.put("osv", "testVersion");
        //System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }

    public static Object[] provideNegativeGetRulesTriggerContent() throws Exception {
        RegistrationUserStep1Class registrationUserStep1Class = new RegistrationUserStep1Class();
        registrationUserStep1Class.registrationUserStep1();
        RegistrationUserStep2Class registrationUserStep2Class = new RegistrationUserStep2Class();
        registrationUserStep2Class.registrationUserStep2Web();
        AuthorisationChildClass authorisationChildClass = new AuthorisationChildClass();
        authorisationChildClass.authorisationChildren();
        JSONObject jsonObj = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObj.put("osv", null);
        //System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }

    public static Object[] provideNegativeGetRulesTriggerContent2() throws Exception {
        RegistrationUserStep1Class registrationUserStep1Class = new RegistrationUserStep1Class();
        registrationUserStep1Class.registrationUserStep1();
        RegistrationUserStep2Class registrationUserStep2Class = new RegistrationUserStep2Class();
        registrationUserStep2Class.registrationUserStep2Web();
        AuthorisationChildClass authorisationChildClass = new AuthorisationChildClass();
        authorisationChildClass.authorisationChildren();
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("cid", null);
        jsonObj.put("ckey", null);
        jsonObj.put("osv", null);
        //System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }

    public static Object[] provideNegativeGetRulesTriggerContent3() throws Exception {
        RegistrationUserStep1Class registrationUserStep1Class = new RegistrationUserStep1Class();
        registrationUserStep1Class.registrationUserStep1();
        RegistrationUserStep2Class registrationUserStep2Class = new RegistrationUserStep2Class();
        registrationUserStep2Class.registrationUserStep2Web();
        AuthorisationChildClass authorisationChildClass = new AuthorisationChildClass();
        authorisationChildClass.authorisationChildren();
        JSONObject jsonObj = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObj.remove("cid");
        jsonObj.put("cid", null);
        jsonObj.put("osv", null);
        //System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }

    public static Object[] provideNegativeGetRulesTriggerContent4() throws Exception {
        RegistrationUserStep1Class registrationUserStep1Class = new RegistrationUserStep1Class();
        registrationUserStep1Class.registrationUserStep1();
        RegistrationUserStep2Class registrationUserStep2Class = new RegistrationUserStep2Class();
        registrationUserStep2Class.registrationUserStep2Web();
        AuthorisationChildClass authorisationChildClass = new AuthorisationChildClass();
        authorisationChildClass.authorisationChildren();
        JSONObject jsonObj = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObj.remove("ckey");
        jsonObj.put("ckey", null);
        jsonObj.put("osv", null);
        //System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }

    public static Object[] provideNegativeGetRulesTriggerContent5() throws Exception {
        RegistrationUserStep1Class registrationUserStep1Class = new RegistrationUserStep1Class();
        registrationUserStep1Class.registrationUserStep1();
        RegistrationUserStep2Class registrationUserStep2Class = new RegistrationUserStep2Class();
        registrationUserStep2Class.registrationUserStep2Web();
        AuthorisationChildClass authorisationChildClass = new AuthorisationChildClass();
        authorisationChildClass.authorisationChildren();
        JSONObject jsonObj = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObj.remove("ckey");
        jsonObj.put("ckey", "failCkey");
        jsonObj.put("osv", null);
        //System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }

    public static Object[] provideNegativeGetRulesTriggerContent6() throws Exception {
        RegistrationUserStep1Class registrationUserStep1Class = new RegistrationUserStep1Class();
        registrationUserStep1Class.registrationUserStep1();
        RegistrationUserStep2Class registrationUserStep2Class = new RegistrationUserStep2Class();
        registrationUserStep2Class.registrationUserStep2Web();
        AuthorisationChildClass authorisationChildClass = new AuthorisationChildClass();
        authorisationChildClass.authorisationChildren();
        JSONObject jsonObj = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObj.remove("cid");
        jsonObj.put("cid", "failCid");
        jsonObj.put("osv", null);
        //System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }

    public static Object[] provideNegativeGetRulesTriggerContent7() throws Exception {
        RegistrationUserStep1Class registrationUserStep1Class = new RegistrationUserStep1Class();
        registrationUserStep1Class.registrationUserStep1();
        RegistrationUserStep2Class registrationUserStep2Class = new RegistrationUserStep2Class();
        registrationUserStep2Class.registrationUserStep2Web();
        AuthorisationChildClass authorisationChildClass = new AuthorisationChildClass();
        authorisationChildClass.authorisationChildren();

        JSONObject jsonObj = new JSONObject();
        jsonObj.put("cid", "failCid");
        jsonObj.put("ckey", "failCkey");
        jsonObj.put("osv", null);
        //System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }

}

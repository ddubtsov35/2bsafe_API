package com.dubtsov._2bsafe.Childrens.Logout;

import com.dubtsov._2bsafe.Parents.Functions.Registration.GenerateRegistrationContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateCidCkeyContent;
import com.dubtsov._2bsafe.Parents.Pool.UserPool;
import org.json.simple.JSONObject;

/**
 * Created by user on 12.09.17.
 */
public class GenerateLogoutContent{

    public JSONObject getLogoutContent() throws Exception {
        JSONObject jsonObj = GenerateCidCkeyContent.getJsonObjectCidCkeyForLogout();
        if(UserPool.getUserFromFile() == null) {
            jsonObj.put("pwd", GenerateRegistrationContent.getRegistrationStep1Content.get("pwd"));
        } else {
            jsonObj.put("pwd", UserPool.getUserFromFile().get("pwd"));
        }

        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }

    public JSONObject getLogoutWithoutPasswordContent() throws Exception {
        JSONObject jsonObj = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObj.put("reason", "Mne pysos!");

        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }


    public static Object[] provideGetLogoutWithoutPasswordContent1() throws Exception {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("cid", null);
        jsonObj.put("ckey", null);
        jsonObj.put("reason", "Mne pysos!");

        System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }

    public static Object[] provideGetLogoutWithoutPasswordContent2() throws Exception {
        JSONObject jsonObj = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObj.remove("cid");
        jsonObj.put("cid", "failCid");
        jsonObj.put("reason", "Mne pysos!");

        System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }

    public static Object[] provideGetLogoutWithoutPasswordContent3() throws Exception {
        JSONObject jsonObj = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObj.remove("cid");
        jsonObj.put("cid", null);
        jsonObj.put("reason", "Mne pysos!");

        System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }

    public static Object[] provideGetLogoutWithoutPasswordContent4() throws Exception {
        JSONObject jsonObj = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObj.remove("ckey");
        jsonObj.put("ckey", "failCkey");
        jsonObj.put("reason", "Mne pysos!");

        System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }

    public static Object[] provideGetLogoutWithoutPasswordContent5() throws Exception {
        JSONObject jsonObj = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObj.remove("ckey");
        jsonObj.put("ckey", null);
        jsonObj.put("reason", "Mne pysos!");

        System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }

    public static Object[] provideGetLogoutWithoutPasswordContent6() throws Exception {
        JSONObject jsonObj = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObj.put("reason", null);

        System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }

    public static Object[] provideGetLogoutWithoutPasswordContent7() throws Exception {
        JSONObject jsonObj = GenerateCidCkeyContent.getJsonObjectCidCkey();

        System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }








    public static Object[] provideNegativeGetLogoutContent1() throws Exception {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("cid", null);
        jsonObj.put("ckey", null);
        if(UserPool.getUserFromFile() == null) {
            jsonObj.put("pwd", GenerateRegistrationContent.getRegistrationStep1Content.get("pwd"));
        } else {
            jsonObj.put("pwd", UserPool.getUserFromFile().get("pwd"));
        }

        System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }

    public static Object[] provideNegativeGetLogoutContent2() throws Exception {
        JSONObject jsonObj = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObj.remove("ckey");
        jsonObj.put("ckey", null);
        if(UserPool.getUserFromFile() == null) {
            jsonObj.put("pwd", GenerateRegistrationContent.getRegistrationStep1Content.get("pwd"));
        } else {
            jsonObj.put("pwd", UserPool.getUserFromFile().get("pwd"));
        }

        System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }

    public static Object[] provideNegativeGetLogoutContent3() throws Exception {
        JSONObject jsonObj = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObj.remove("cid");
        jsonObj.put("cid", null);
        if(UserPool.getUserFromFile() == null) {
            jsonObj.put("pwd", GenerateRegistrationContent.getRegistrationStep1Content.get("pwd"));
        } else {
            jsonObj.put("pwd", UserPool.getUserFromFile().get("pwd"));
        }

        System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }

    public static Object[] provideNegativeGetLogoutContent4() throws Exception {
        JSONObject jsonObj = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObj.put("pwd", null);
        System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }

    public static Object[] provideNegativeGetLogoutContent5() throws Exception {
        JSONObject jsonObj = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObj.put("pwd", "failPwd");
        System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }

}

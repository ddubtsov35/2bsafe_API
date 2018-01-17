package com.dubtsov._2bsafe.Childrens.Logout.GenerateData;

import com.dubtsov._2bsafe.Parents.Functions.Registration.GenerateRegistrationContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.ForProvideData;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateCidCkeyContent;
import com.dubtsov._2bsafe.Parents.Pool.UserPool;
import org.json.simple.JSONObject;

/**
 * Created by user on 17.01.18.
 */
public class GenerateNegativeLogoutWithoutPasswordContent {

    public static Object[] provideNegativeGetLogoutContent1() throws Exception {
        ForProvideData.getTestData();
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("cid", null);
        jsonObj.put("ckey", null);
        if(UserPool.getUserFromFile() == null) {
            jsonObj.put("pwd", GenerateRegistrationContent.getRegStep1Content().get("pwd"));
        } else {
            jsonObj.put("pwd", UserPool.getUserFromFile().get("pwd"));
        }

        //System.out.println("jsonObject " + jsonObj);
        return new Object[]{jsonObj};
    }

    public static Object[] provideNegativeGetLogoutContent2() throws Exception {
        ForProvideData.getTestData();

        JSONObject jsonObj = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObj.remove("ckey");
        jsonObj.put("ckey", null);
        if(UserPool.getUserFromFile() == null) {
            jsonObj.put("pwd", GenerateRegistrationContent.getRegStep1Content().get("pwd"));
        } else {
            jsonObj.put("pwd", UserPool.getUserFromFile().get("pwd"));
        }

        //System.out.println("jsonObject " + jsonObj);
        return new Object[]{jsonObj};
    }

    public static Object[] provideNegativeGetLogoutContent3() throws Exception {
        ForProvideData.getTestData();
        JSONObject jsonObj = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObj.remove("cid");
        jsonObj.put("cid", null);
        if(UserPool.getUserFromFile() == null) {
            jsonObj.put("pwd", GenerateRegistrationContent.getRegStep1Content().get("pwd"));
        } else {
            jsonObj.put("pwd", UserPool.getUserFromFile().get("pwd"));
        }

        //System.out.println("jsonObject " + jsonObj);
        return new Object[]{jsonObj};
    }

    public static Object[] provideNegativeGetLogoutContent4() throws Exception {
        ForProvideData.getTestData();

        JSONObject jsonObj = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObj.put("pwd", null);
        //System.out.println("jsonObject " + jsonObj);
        return new Object[]{jsonObj};
    }

    public static Object[] provideNegativeGetLogoutContent5() throws Exception {
        ForProvideData.getTestData();
        JSONObject jsonObj = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObj.put("pwd", "failPwd");
        //System.out.println("jsonObject " + jsonObj);
        return new Object[]{jsonObj};
    }

}

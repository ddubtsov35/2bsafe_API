package com.dubtsov._2bsafe.Childrens.Logout;

import com.dubtsov._2bsafe.Parents.Functions.Registration.GenerateRegistrationContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateCidCkeyContent;
import com.dubtsov._2bsafe.Parents.Pool.UserPool;
import org.json.simple.JSONObject;

/**
 * Created by user on 12.09.17.
 */
public class GenerateLogoutContent{

    private GenerateCidCkeyContent generateCidCkeyContent = new GenerateCidCkeyContent();

    public JSONObject getLogoutContent() throws Exception {
        JSONObject jsonObj = generateCidCkeyContent.getJsonObjectCidCkeyForLogout();
        if(UserPool.getUserFromFile() == null) {
            jsonObj.put("pwd", GenerateRegistrationContent.getRegistrationStep1Content.get("pwd"));
        } else {
            jsonObj.put("pwd", UserPool.getUserFromFile().get("pwd"));
        }

        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }

    public JSONObject getLogoutWithoutPasswordContent() throws Exception {
        JSONObject jsonObj = generateCidCkeyContent.getJsonObjectCidCkey();
        jsonObj.put("reason", "Mne pysos!");

        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }


    public Object[] provideGetLogoutWithoutPasswordContent1() throws Exception {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("cid", null);
        jsonObj.put("ckey", null);
        jsonObj.put("reason", "Mne pysos!");

        System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }

    public Object[] provideGetLogoutWithoutPasswordContent2() throws Exception {
        JSONObject jsonObj = generateCidCkeyContent.getJsonObjectCidCkey();
        jsonObj.remove("cid");
        jsonObj.put("cid", "failCid");
        jsonObj.put("reason", "Mne pysos!");

        System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }

    public Object[] provideGetLogoutWithoutPasswordContent3() throws Exception {
        JSONObject jsonObj = generateCidCkeyContent.getJsonObjectCidCkey();
        jsonObj.remove("cid");
        jsonObj.put("cid", null);
        jsonObj.put("reason", "Mne pysos!");

        System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }

    public Object[] provideGetLogoutWithoutPasswordContent4() throws Exception {
        JSONObject jsonObj = generateCidCkeyContent.getJsonObjectCidCkey();
        jsonObj.remove("ckey");
        jsonObj.put("ckey", "failCkey");
        jsonObj.put("reason", "Mne pysos!");

        System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }

    public Object[] provideGetLogoutWithoutPasswordContent5() throws Exception {
        JSONObject jsonObj = generateCidCkeyContent.getJsonObjectCidCkey();
        jsonObj.remove("ckey");
        jsonObj.put("ckey", null);
        jsonObj.put("reason", "Mne pysos!");

        System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }

    public Object[] provideGetLogoutWithoutPasswordContent6() throws Exception {
        JSONObject jsonObj = generateCidCkeyContent.getJsonObjectCidCkey();
        jsonObj.put("reason", null);

        System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }

    public Object[] provideGetLogoutWithoutPasswordContent7() throws Exception {
        JSONObject jsonObj = generateCidCkeyContent.getJsonObjectCidCkey();

        System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }








    public Object[] provideNegativeGetLogoutContent1() throws Exception {
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

    public Object[] provideNegativeGetLogoutContent2() throws Exception {
        JSONObject jsonObj = generateCidCkeyContent.getJsonObjectCidCkey();
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

    public Object[] provideNegativeGetLogoutContent3() throws Exception {
        JSONObject jsonObj = generateCidCkeyContent.getJsonObjectCidCkey();
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

    public Object[] provideNegativeGetLogoutContent4() throws Exception {
        JSONObject jsonObj = generateCidCkeyContent.getJsonObjectCidCkey();
        jsonObj.put("pwd", null);
        System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }

    public Object[] provideNegativeGetLogoutContent5() throws Exception {
        JSONObject jsonObj = generateCidCkeyContent.getJsonObjectCidCkey();
        jsonObj.put("pwd", "failPwd");
        System.out.println("jsonObject " + jsonObj);
        return new Object[]{new Object[]{jsonObj}};
    }

}

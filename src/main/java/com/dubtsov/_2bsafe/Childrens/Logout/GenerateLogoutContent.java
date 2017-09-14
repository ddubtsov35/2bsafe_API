package com.dubtsov._2bsafe.Childrens.Logout;

import com.dubtsov._2bsafe.Parents.Functions.Registration.GenerateRegistrationContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.BaseContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateCidCkeyContent;
import com.dubtsov._2bsafe.Parents.Pool.CidCkeyPool;
import com.dubtsov._2bsafe.Parents.Pool.UserPool;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import org.json.simple.JSONObject;

/**
 * Created by user on 12.09.17.
 */
public class GenerateLogoutContent extends BaseContent{

    public static JSONObject getLogoutContent() throws Exception {
        if(CidCkeyPool.getCidFromFile() == null) {
            jsonObj.put("cid", GenerateCidCkeyContent.jsonObjectCidCkey.get("cid"));
            jsonObj.put("ckey", GenerateCidCkeyContent.jsonObjectCidCkey.get("ckey"));
        } else {
            jsonObj.put("cid", CidCkeyPool.getCidFromFile().get("cid"));
            jsonObj.put("ckey", CidCkeyPool.getCidFromFile().get("ckey"));
        }
        if(UserPool.getUserFromFile() == null) {
            jsonObj.put("pwd", GenerateRegistrationContent.getRegistrationStep1Content.get("pwd"));
        } else {
            jsonObj.put("pwd", UserPool.getUserFromFile().get("pwd"));
        }

        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }

    public static JSONObject getLogoutWithoutPasswordContent() throws Exception {
        jsonObj.put("cid", GenerateCidCkeyContent.jsonObjectCidCkey.get("cid"));
        jsonObj.put("ckey", GenerateCidCkeyContent.jsonObjectCidCkey.get("ckey"));
        jsonObj.put("reason", "Mne pysos!");

        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }

}

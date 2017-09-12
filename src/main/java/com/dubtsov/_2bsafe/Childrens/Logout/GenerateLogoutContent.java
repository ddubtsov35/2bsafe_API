package com.dubtsov._2bsafe.Childrens.Logout;

import com.dubtsov._2bsafe.Parents.Functions.Registration.GenerateRegistrationContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.BaseContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateCidCkeyContent;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import org.json.simple.JSONObject;

/**
 * Created by user on 12.09.17.
 */
public class GenerateLogoutContent extends BaseContent{

    public static JSONObject getLogoutContent() throws Exception {
        jsonObj.put("cid", GenerateCidCkeyContent.getCidCkey().get("cid"));
        jsonObj.put("ckey", GenerateCidCkeyContent.getCidCkey().get("ckey"));
        jsonObj.put("pwd", GenerateRegistrationContent.getRegistrationStep1Content().get("pwd"));

        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }

    public static JSONObject getLogoutWithoutPasswordContent() throws Exception {
        jsonObj.put("cid", GenerateCidCkeyContent.getCidCkey().get("cid"));
        jsonObj.put("ckey", GenerateCidCkeyContent.getCidCkey().get("ckey"));
        jsonObj.put("reason", "Mne pysos!");

        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }

}

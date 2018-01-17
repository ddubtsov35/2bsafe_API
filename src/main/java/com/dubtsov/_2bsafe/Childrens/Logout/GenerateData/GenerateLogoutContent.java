package com.dubtsov._2bsafe.Childrens.Logout.GenerateData;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Parents.Functions.Registration.GenerateRegistrationContent;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep1Class;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep2Class;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.ForProvideData;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateCidCkeyContent;
import com.dubtsov._2bsafe.Parents.Pool.UserPool;
import org.apache.http.auth.AUTH;
import org.json.simple.JSONObject;

/**
 * Created by user on 12.09.17.
 */
public class GenerateLogoutContent{

    public JSONObject getLogoutContent() throws Exception {
        JSONObject jsonObj = GenerateCidCkeyContent.getJsonObjectCidCkeyForLogout();
        if(UserPool.getUserFromFile() == null) {
            jsonObj.put("pwd", GenerateRegistrationContent.getRegStep1Content().get("pwd"));
        } else {
            jsonObj.put("pwd", UserPool.getUserFromFile().get("pwd"));
        }

        //System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }

    public JSONObject getLogoutWithoutPasswordContent() throws Exception {
        JSONObject jsonObj = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObj.put("reason", "Mne pysos!");

        //System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }

}

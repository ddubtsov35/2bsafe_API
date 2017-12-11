package com.dubtsov._2bsafe.Parents.Functions.PasswordChange;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.Pool.UserPool;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 18.07.17.
 */
public class PasswordChangeClass extends BaseClass {

    JSONObject jsonObject;

    public PasswordChangeClass() throws IOException {}

    public Response passwordChange() throws Exception {
        jsonObject = GeneratePasswordChangeContent.getPasswordChangeContent();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/pwd_change", jsonObject);
        response = responseClass.getJsonResponse();
        if(response.code() == 200){
            UserPool.setNewPassword(jsonObject.get("npwd").toString());
            //GenerateProfileIdContent.profileId = null;
        }
        return response;
    }
}

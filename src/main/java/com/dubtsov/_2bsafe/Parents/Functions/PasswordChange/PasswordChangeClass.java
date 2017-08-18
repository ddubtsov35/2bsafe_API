package com.dubtsov._2bsafe.Parents.Functions.PasswordChange;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 18.07.17.
 */
public class PasswordChangeClass extends BaseClass {

    public PasswordChangeClass() throws IOException {}

    public Response passwordChange() throws IOException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/pwd_change", contentToChangePassword(superContent));
        return responseClass.getResponse();
    }

    public HashMap contentToChangePassword(HashMap content){
        HashMap contentToChangePassword = new LinkedHashMap();
        contentToChangePassword.put("pwd", content.get("pwd"));
        contentToChangePassword.put("npwd", new StringBuilder((String) content.get("pwd")).reverse().toString());
        superContent.put("npwd", contentToChangePassword.get("npwd"));
        return contentToChangePassword;
    }
}

package com.dubtsov._2bsafe.Parents.Functions.Logout;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 18.07.17.
 */
public class LogoutClass extends BaseClass {

    private JSONObject jsonObject = new JSONObject();

    public LogoutClass() throws IOException {}

    public Response logout() throws IOException {
        jsonObject.put("rnd", GenerateTokenClass.getGeneratedToken());
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/logout", jsonObject);
        return responseClass.getJsonResponse();
    }

}

package com.dubtsov._2bsafe.Parents.Functions.Logout;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 18.07.17.
 */
public class LogoutClass extends BaseClass {

    HashMap content;

    public LogoutClass() throws IOException {
        content = new LinkedHashMap();
    }

    public Response logout() throws IOException {
        content.put("rnd", rnd);
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/logout", content);
        return responseClass.getResponse();
    }

}

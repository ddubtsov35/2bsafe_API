package com.dubtsov._2bsafe.Admin;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers.GenerateRegisteredUsersContent;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import org.json.simple.JSONObject;

import java.io.IOException;

/**
 * Created by user on 23.11.17.
 */
public class AdminAuthorisation extends BaseClass{

    String headersString;

    public AdminAuthorisation() throws IOException {}

    public String adminAuthorisation() throws Exception {
        JSONObject jsonObject = GenerateRegisteredUsersContent.getHeadersString();
        super.responseClass = new ResponseClass("http://admin.safec.ru/os_api/admin/v1.0/login", jsonObject);
        headersString = responseClass.getJsonResponse().headers().toString();
        return headersString;
    }

}

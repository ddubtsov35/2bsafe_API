package com.dubtsov._2bsafe.Parents.Functions.ChangeEmailPhone;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateChangeEmailContent;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 30.08.17.
 */
public class ChangeEmailClass extends BaseClass{

    JSONObject jsonObject;

    public ChangeEmailClass() throws IOException {}

    public Response changeEmail() throws Exception {
        jsonObject = GenerateChangeEmailContent.getChangeEmailContent();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/set_email", jsonObject);
        return responseClass.getJsonResponse();
    }
}

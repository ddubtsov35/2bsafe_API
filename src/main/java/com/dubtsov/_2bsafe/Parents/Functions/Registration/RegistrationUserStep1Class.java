package com.dubtsov._2bsafe.Parents.Functions.Registration;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateRegistrationContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateEmailClass;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 12.07.17.
 */
public class RegistrationUserStep1Class extends BaseClass {

    JSONObject jsonObject;

    public RegistrationUserStep1Class() throws IOException {}

    public JSONObject registrationUserStep1() throws IOException {
        jsonObject = GenerateRegistrationContent.getRegistrationStep1Content();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/reg/step1", jsonObject);
        responseClass.getJsonResponse();
        return jsonObject;
    }

    public Response sendCodeRegistration() throws IOException {
        registrationUserStep1();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/reg/resend_email");
        return responseClass.getResponse();
    }
}

package com.dubtsov._2bsafe.Parents.Functions.Registration;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Pool.UserPool;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 12.07.17.
 */
public class RegistrationUserStep1Class extends BaseClass {

    JSONObject jsonObject;

    public RegistrationUserStep1Class() throws IOException {}

    public JSONObject registrationUserStep1() throws IOException, ParseException {
        jsonObject = UserPool.getUserFromFile();
        if(jsonObject == null) {
            jsonObject = GenerateRegistrationContent.getRegistrationStep1Content();
            responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/reg/step1", jsonObject);
            responseClass.getJsonResponse();
            return jsonObject;
        } else {
            return jsonObject;
        }
    }

    public JSONObject registrationForCreateNewUser() throws IOException, ParseException {
        jsonObject = GenerateRegistrationContent.getRegistrationStep1Content();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/reg/step1", jsonObject);
        responseClass.getJsonResponse();
        return jsonObject;
    }

    public Response sendCodeRegistration() throws IOException, ParseException {
        registrationUserStep1();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/reg/resend_email");
        return responseClass.getJsonResponse();
    }

    public Response checkEmail() throws IOException, ParseException {
        jsonObject = GenerateRegistrationContent.getCheckEmail();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/reg/check", jsonObject);
        return responseClass.getJsonResponse();
    }

    public Response checkPhone() throws IOException, ParseException {
        jsonObject = GenerateRegistrationContent.getCheckPhone();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/reg/check", jsonObject);
        return responseClass.getJsonResponse();
    }


    public Response checkExistPhone() throws Exception {
        jsonObject = GenerateRegistrationContent.getExistPhone();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/reg/check", jsonObject);
        return responseClass.getJsonResponse();
    }

    public Response checkExistEmail() throws IOException, ParseException {
        jsonObject = GenerateRegistrationContent.getExistEmail();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/reg/check", jsonObject);
        return responseClass.getJsonResponse();
    }

}

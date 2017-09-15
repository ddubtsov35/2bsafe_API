package com.dubtsov._2bsafe.Parents.Functions.Registration;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Pool.UserPool;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 17.07.17.
 */
public class RegistrationUserStep2Class extends BaseClass {

    JSONObject jsonObject;

    public RegistrationUserStep2Class() throws IOException, ParseException, java.text.ParseException {}

    public JSONObject registrationUserStep2Web() throws IOException, ParseException, java.text.ParseException {
        jsonObject = GenerateRegistrationContent.getRegistrationStep2ContentWeb();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/reg/step2", jsonObject);
        responseClass.getJsonResponse();
        return jsonObject;
    }

    public JSONObject registrationUserStep2AndroidPhone() throws IOException, ParseException, java.text.ParseException {
        jsonObject = GenerateRegistrationContent.getRegistrationStep2ContentAndroid();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/reg/step2",  jsonObject);
        String getLkid = responseClass.getJsonResponse().body().string();
        jsonObject.put("lkid", getLkid.substring(getLkid.indexOf("lkid"),getLkid.indexOf("lkid",getLkid.indexOf("\""))));

        //UserPool.setUserFromFile(jsonObject);
        return jsonObject;
    }

}

package com.dubtsov._2bsafe.Parents.Functions.Registration;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers.ListRegisteredUsersClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateRegistrationContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Models.RegisteredUser;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import com.dubtsov._2bsafe.Parents.UserPool.UserPool;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

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
        return jsonObject;
    }

}

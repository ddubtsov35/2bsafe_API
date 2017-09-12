package com.dubtsov._2bsafe.Parents.Functions.Authorisation;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep1Class;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep2Class;
import com.dubtsov._2bsafe.Parents.Models.AuthorisationUser;
import com.dubtsov._2bsafe.Parents.Parse.GetAuthorisationUser;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 14.07.17.
 */
public class AuthorisationUserClass extends BaseClass {

    JSONObject jsonObject;

    public AuthorisationUserClass() throws IOException, ParseException, java.text.ParseException {
        registrationUserStep1Class = new RegistrationUserStep1Class();
        registrationUserStep2Class = new RegistrationUserStep2Class();
    }

    public JSONObject preparationContent(JSONObject jsonObject){
        if(jsonObject.containsKey("em")) {
            Object obj = jsonObject.remove("em");
            jsonObject.remove("em");
            jsonObject.put("login", obj);
        }
        return jsonObject;
    }

    public AuthorisationUser RegistrationAndAuthorisationWeb() throws IOException, ParseException, java.text.ParseException {
        registrationUserStep1Class.registrationUserStep1();
        jsonObject = registrationUserStep2Class.registrationUserStep2Web();
        jsonObject = preparationContent(jsonObject);
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/auth", jsonObject);
        return GetAuthorisationUser.authorisationUser(responseClass.getJsonResponse().body().string());
    }

    public AuthorisationUser RegistrationAndAuthorisationAndroid() throws IOException, ParseException, java.text.ParseException {
        registrationUserStep1Class.registrationUserStep1();
        jsonObject = registrationUserStep2Class.registrationUserStep2AndroidPhone();
        jsonObject = preparationContent(jsonObject);
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/auth", jsonObject);
        return GetAuthorisationUser.authorisationUser(responseClass.getJsonResponse().body().string());
    }

    public AuthorisationUser authorisationUser() throws IOException, ParseException, java.text.ParseException {
        System.out.println("jsonObject " + jsonObject);
        jsonObject = GenerateAuthContent.getAuthContent();
        System.out.println("jsonObject " + jsonObject);
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/auth", jsonObject);
        return GetAuthorisationUser.authorisationUser(responseClass.getJsonResponse().body().string());
    }

}

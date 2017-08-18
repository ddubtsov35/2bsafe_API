package com.dubtsov._2bsafe.Parents.Functions.Authorisation;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep1Class;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep2Class;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 14.07.17.
 */
public class AuthorisationUserClass extends BaseClass {

    HashMap content;

    public AuthorisationUserClass() throws IOException {
        registrationUserStep1Class = new RegistrationUserStep1Class();
        registrationUserStep2Class = new RegistrationUserStep2Class();
    }

    public Response authorisationUser(HashMap content) throws IOException {
        System.out.println(content);
        content = preparationContent(content);
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/auth", content);
        return responseClass.getResponse();
    }

    public HashMap preparationContent(HashMap content){
        if(content.containsKey("em")) {
            Object obj = content.remove("em");
            content.remove("em");
            content.put("login", obj);
        }
        System.out.println("PreparationContent " + content);
        return content;
    }

    public HashMap getContentRegistration() throws IOException {
        //Create test user and remember his password
        content = registrationUserStep1Class.registrationUserStep1();
        superContent.put("em", content.get("em"));
        superContent.put("pwd", content.get("pwd"));
        return content;
    }

    public Response RegistrationAndAuthorisationWeb() throws IOException, ParseException, java.text.ParseException {
        //Verification account
        content = registrationUserStep2Class.registrationUserStep2Web(getContentRegistration());
        //Authorisation
        Response response = authorisationUser(content);
        return response;
    }

    public Response RegistrationAndAuthorisationAndroid() throws IOException, ParseException, java.text.ParseException {
        //Verification account
        content = registrationUserStep2Class.registrationUserStep2AndroidPhone(getContentRegistration());
        //Authorisation
        Response response = authorisationUser(content);
        return response;
    }

}

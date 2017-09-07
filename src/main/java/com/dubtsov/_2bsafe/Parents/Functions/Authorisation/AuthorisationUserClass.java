package com.dubtsov._2bsafe.Parents.Functions.Authorisation;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep1Class;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep2Class;
import com.dubtsov._2bsafe.Parents.Models.AuthorisationUser;
import com.dubtsov._2bsafe.Parents.Parse.GetAuthorisationUser;
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
    AuthorisationUser authorisationUser;

    public AuthorisationUserClass() throws IOException {
        registrationUserStep1Class = new RegistrationUserStep1Class();
        registrationUserStep2Class = new RegistrationUserStep2Class();
    }

    public AuthorisationUser authorisationUser(HashMap content) throws IOException {
        content = preparationContent(content);
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/auth", content);
        return GetAuthorisationUser.authorisationUser(responseClass.getResponse().body().string());
    }

    public HashMap preparationContent(HashMap content){
        if(content.containsKey("em")) {
            Object obj = content.remove("em");
            content.remove("em");
            content.put("login", obj);
        }
        return content;
    }

    /*public HashMap getContentRegistration() throws IOException {
        //Create test user and remember his password
        content = registrationUserStep1Class.registrationUserStep1();
        superContent.put("em", content.get("em"));
        superContent.put("pwd", content.get("pwd"));
        return content;
    }*/

    public AuthorisationUser RegistrationAndAuthorisationWeb() throws IOException, ParseException, java.text.ParseException {
        //Verification account
        content = registrationUserStep2Class.registrationUserStep2Web(registrationUserStep1Class.registrationUserStep1());
        //AuthorisationUser
        authorisationUser = authorisationUser(content);
        return authorisationUser;
    }

    public AuthorisationUser RegistrationAndAuthorisationAndroid() throws IOException, ParseException, java.text.ParseException {
        //Verification account
        content = registrationUserStep2Class.registrationUserStep2AndroidPhone(registrationUserStep1Class.registrationUserStep1());
        //AuthorisationUser
        authorisationUser = authorisationUser(content);
        return authorisationUser;
    }

}

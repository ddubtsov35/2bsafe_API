package com.dubtsov._2bsafe.Functions.Authorisation;

import com.dubtsov._2bsafe.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Functions.Registration.RegistrationUserStep1Class;
import com.dubtsov._2bsafe.Functions.Registration.RegistrationUserStep2Class;
import com.dubtsov._2bsafe.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

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
        content.put("dtype", 0);
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/auth", content);
        return responseClass.getResponse();
    }

    public HashMap preparationContent(HashMap content){
        HashMap cloneContent = new LinkedHashMap<>();
        cloneContent.put("pwd", content.get("pwd").toString());
        if(content.containsKey("em")) {
            Object obj = content.remove("em");
            content.clear();
            content.put("login", obj);
        }
        content.put("pwd", cloneContent.get("pwd"));
        System.out.println("PreparationContent " + content);
        return content;
    }

    public Response RegistrationAndAuthorisation() throws IOException, ParseException, java.text.ParseException {
        //Create test user and remember his password
        HashMap content = registrationUserStep1Class.registrationUserStep1();
        superContent.put("em", content.get("em"));
        superContent.put("pwd", content.get("pwd"));
        //Verification account
        registrationUserStep2Class.registrationUserStep2(content);
        //Authorisation
        Response response = authorisationUser(content);
        return response;
    }

}

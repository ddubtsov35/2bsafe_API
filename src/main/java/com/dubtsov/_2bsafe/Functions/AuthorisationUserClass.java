package com.dubtsov._2bsafe.Functions;

import com.dubtsov._2bsafe.Response.ResponseClass;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 14.07.17.
 */
public class AuthorisationUserClass extends BaseClass {

    public AuthorisationUserClass() throws IOException {}

    public void authorisationUser(HashMap content) throws IOException {
        content = preparationContent(content);
        content.put("dtype", 0);
        response = new ResponseClass("https://lkn.safec.ru/os_api/accounts/v1.0/auth", content);
        response.getResponse();
        //response.setSessionId(listRegisteredUsersClass.getSessionId(response.getResponse().headers().toString()));
    }

    private HashMap preparationContent(HashMap content){
        HashMap cloneContent = new LinkedHashMap<>();
        cloneContent.put("pwd", content.get("pwd").toString());
        Object obj = content.remove("em");
        content.clear();
        content.put("login", obj);
        content.put("pwd", cloneContent.get("pwd"));
        return content;
    }

}

package com.dubtsov._2bsafe.Functions;

import com.dubtsov._2bsafe.Response.ResponseClass;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 14.07.17.
 */
public class AuthorisationUserClass extends BaseClass {

    public AuthorisationUserClass() throws IOException {}

    public void authorisationUser(HashMap content) throws IOException {
        response = new ResponseClass("https://lkn.safec.ru/os_api/accounts/v1.0/auth", content);
        response.getResponse();
    }

}

package com.dubtsov._2bsafe.Functions;

import com.dubtsov._2bsafe.Response.ResponseClass;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 12.07.17.
 */
public class DeleteUserClass extends BaseClass{
    public DeleteUserClass() throws IOException {}

    public void deleteUser(HashMap content) throws IOException {
        authorisationUserClass = new AuthorisationUserClass();
        authorisationUserClass.authorisationUser(content);
        response = new ResponseClass("https://lkn.safec.ru/os_api/accounts/v1.0/delete_account", content);
        response.getResponse();
    }
}

package com.dubtsov._2bsafe.Functions;

import com.dubtsov._2bsafe.Response.ResponseClass;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 12.07.17.
 */
public class DeleteUserClass extends BaseClass{
    public DeleteUserClass() throws IOException {}

    public void deleteUser(HashMap content) throws IOException {
        /*ContentClearFlag.setContentClearFlag(true);
        authorisationUserClass = new AuthorisationUserClass();
        System.out.println("CONTENT " + content);
        authorisationUserClass.authorisationUser(content);*/

        HashMap thisContent = new LinkedHashMap();
        thisContent.put("pwd", content.get("pwd").toString());
        response = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/delete_account", thisContent);
        response.getResponse();
    }
}

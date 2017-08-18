package com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 12.07.17.
 */
public class DeleteUserClass extends BaseClass {

    HashMap content;

    public DeleteUserClass() throws IOException {}

    public void deleteUser() throws IOException {
        content = new LinkedHashMap();
        content.put("pwd", superContent.get("pwd").toString());
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/delete_account", content);
        responseClass.getResponse();
    }
}

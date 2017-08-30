package com.dubtsov._2bsafe.Childrens.Logout;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 24.08.17.
 */
public class ChildrenLogoutClass extends BaseClass{
    public ChildrenLogoutClass() throws IOException {}

    public Response logout(HashMap content) throws IOException {
        responseClass = new ResponseClass("http://api.safec.ru/os_api/clients/v1.0/logout", content);
        return responseClass.getResponse();
    }

    public Response logoutWithoutPassword(HashMap content) throws IOException {
        responseClass = new ResponseClass("http://api.safec.ru/os_api/clients/v1.0/logout_nopassword", content);
        return responseClass.getResponse();
    }
}

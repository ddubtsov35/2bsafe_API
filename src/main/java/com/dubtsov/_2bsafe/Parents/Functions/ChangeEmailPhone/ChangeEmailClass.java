package com.dubtsov._2bsafe.Parents.Functions.ChangeEmailPhone;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 30.08.17.
 */
public class ChangeEmailClass extends BaseClass{

    public ChangeEmailClass() throws IOException {}

    public Response changeEmail(HashMap content) throws Exception {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/set_email", content);
        return responseClass.getResponse();
    }
}

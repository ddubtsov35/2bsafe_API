package com.dubtsov._2bsafe.Functions.RecoveryPassword;

import com.dubtsov._2bsafe.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Response.ResponseClass;
import okhttp3.Response;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 17.07.17.
 */
public class RecoveryPasswordClass extends BaseClass {

    public RecoveryPasswordClass() throws IOException {}

    public Response recoveryPassword(HashMap content) throws IOException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/pwd_recovery", content);
        return responseClass.getResponse();
    }
}

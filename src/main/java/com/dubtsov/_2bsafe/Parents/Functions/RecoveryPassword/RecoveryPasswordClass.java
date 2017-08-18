package com.dubtsov._2bsafe.Parents.Functions.RecoveryPassword;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 17.07.17.
 */
public class RecoveryPasswordClass extends BaseClass {

    public RecoveryPasswordClass() throws IOException {}

    public Response recoveryPasswordStart(HashMap content) throws IOException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/recovery/start", content);
        return responseClass.getResponse();
    }

    public Response recoveryPasswordConfirm(HashMap content) throws IOException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/recovery/confirm", content);
        return responseClass.getResponse();
    }
}

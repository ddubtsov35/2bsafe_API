package com.dubtsov._2bsafe.Parents.Functions.RecoveryPassword;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 17.07.17.
 */
public class RecoveryPasswordClass extends BaseClass {

    JSONObject jsonObject;

    public RecoveryPasswordClass() throws IOException {}

    public Response recoveryPasswordStart() throws Exception {
        jsonObject = GenerateRecoveryPasswordContent.startRecoveryPasswordContent();
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/recovery/start", jsonObject);
        return responseClass.getJsonResponse();
    }

    public Response recoveryPasswordConfirm() throws Exception {
        jsonObject = GenerateRecoveryPasswordContent.confirmRecoveryPasswordContent();
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/recovery/confirm", jsonObject);
        return responseClass.getJsonResponse();
    }
    public Response NegativeRecoveryPasswordConfirm(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/recovery/confirm", jsonObject);
        return responseClass.getJsonResponse();
    }
}

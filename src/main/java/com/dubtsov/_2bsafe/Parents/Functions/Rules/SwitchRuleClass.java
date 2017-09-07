package com.dubtsov._2bsafe.Parents.Functions.Rules;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 30.08.17.
 */
public class SwitchRuleClass extends BaseClass{

    public SwitchRuleClass() throws IOException {}

    public Response switchRules(HashMap content) throws IOException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/rules/switch", content);
        return responseClass.getResponse();
    }

}

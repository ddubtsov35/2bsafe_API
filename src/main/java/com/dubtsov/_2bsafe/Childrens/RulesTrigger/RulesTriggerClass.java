package com.dubtsov._2bsafe.Childrens.RulesTrigger;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 24.08.17.
 */
public class RulesTriggerClass  extends BaseClass{

    JSONObject jsonObject;

    public RulesTriggerClass() throws IOException {}

    public Response rulesTrigger() throws Exception {
        jsonObject = GeneratedRulesTriggerContent.getRulesTriggerContent();
        responseClass = new ResponseClass("http://api.safec.ru/os_api/clients/v1.0/rules_trigger", jsonObject);
        return responseClass.getJsonResponse();
    }
}

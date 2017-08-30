package com.dubtsov._2bsafe.Parents.Functions.Rules;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Parse.GetRules;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 29.08.17.
 */
public class AddRulesClass extends BaseClass{

    public AddRulesClass() throws IOException {}

    public Response addRule(JSONObject jsonObject) throws IOException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/rules/add", jsonObject);
        return responseClass.getJsonResponse();
    }

    public int getRuleId(Response addRuleResponse) throws IOException, ParseException {
        return  GetRules.getRuleId(addRuleResponse);
    }



}

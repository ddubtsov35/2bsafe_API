package com.dubtsov._2bsafe.Parents.Functions.Rules;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Models.GetRulesModel;
import com.dubtsov._2bsafe.Parents.Models.SetRulesModel;
import com.dubtsov._2bsafe.Parents.Parse.GetRules;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.List;

/**
 * Created by user on 29.08.17.
 */
public class RulesClass extends BaseClass{

    JSONObject jsonObject;

    public RulesClass() throws IOException {}

    public SetRulesModel addRule() throws Exception {
        jsonObject = GenerateRequestAddRule.addRuleContent();
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/rules/add", jsonObject);
        return GetRules.getSetRules(responseClass.getJsonResponse().body().string());
    }
    public SetRulesModel NegativeAddRule(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/rules/add", jsonObject);
        return GetRules.getSetRules(responseClass.getJsonResponse().body().string());
    }




    public Response getRulesListResponse() throws IOException, ParseException {
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/rules/list");
        return responseClass.getJsonResponse();
    }

    public List<GetRulesModel> getRulesList() throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/rules/list");
        return GetRules.getRulesList(responseClass.getJsonResponse().body().string());
    }




    public Response getRulesByProfileResponse() throws Exception {
        jsonObject = GenerateRequestAddRule.getDel_Get_Content();
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/rules/get", jsonObject);
        return responseClass.getJsonResponse();
    }
    public Response NegativeGetRulesByProfileResponse(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/rules/get", jsonObject);
        return responseClass.getJsonResponse();
    }





    public Response deleteRules() throws Exception {
        jsonObject = GenerateRequestAddRule.getDel_Get_Content();
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/rules/del", jsonObject);
        return responseClass.getJsonResponse();
    }
    public Response NegativeDeleteRules(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/rules/del", jsonObject);
        return responseClass.getJsonResponse();
    }




    public Response switchRules() throws Exception {
        jsonObject = GenerateRequestAddRule.getSwitchContent();
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/rules/switch", jsonObject);
        return responseClass.getJsonResponse();
    }
    public Response NegativeSwitchRules(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/rules/switch", jsonObject);
        return responseClass.getJsonResponse();
    }
}

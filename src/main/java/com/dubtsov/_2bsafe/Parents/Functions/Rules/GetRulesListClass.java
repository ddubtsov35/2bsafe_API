package com.dubtsov._2bsafe.Parents.Functions.Rules;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Models.GetDataUpdate;
import com.dubtsov._2bsafe.Parents.Models.RulesModel;
import com.dubtsov._2bsafe.Parents.Parse.GetRules;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.parser.ParseException;
import sun.misc.BASE64Decoder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by user on 29.08.17.
 */
public class GetRulesListClass extends BaseClass {
    public GetRulesListClass() throws IOException {}

    public Response getRulesListResponse() throws IOException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/rules/list");
        return responseClass.getResponse();
    }

    public List<RulesModel> getRulesList() throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/rules/list");
        return GetRules.getRulesList(responseClass.getResponse().body().string());
    }


    public Response getRulesByProfileResponse(HashMap content) throws IOException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/rules/get", content);
        return responseClass.getResponse();
    }
}

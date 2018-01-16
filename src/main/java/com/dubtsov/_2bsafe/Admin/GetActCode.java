package com.dubtsov._2bsafe.Admin;

import com.dubtsov._2bsafe.Admin.Model.GenerateGetCodeContent;
import com.dubtsov._2bsafe.Admin.Model.UserModel;
import com.dubtsov._2bsafe.Admin.Parse.GetActCodeParse;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import org.json.simple.JSONObject;

import java.io.IOException;

/**
 * Created by user on 22.11.17.
 */
public class GetActCode extends BaseClass{

    JSONObject jsonObject;

    public GetActCode() throws IOException {}

    public UserModel getCode(String email) throws Exception {
        jsonObject = new GenerateGetCodeContent().getContent(email);
        responseClass = new ResponseClass(adminApi + "/accounts_code", jsonObject);
        return new GetActCodeParse().getActCode(responseClass.getJsonResponse().body().string());
    }

}

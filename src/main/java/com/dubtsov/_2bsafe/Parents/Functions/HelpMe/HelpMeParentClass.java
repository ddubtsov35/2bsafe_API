package com.dubtsov._2bsafe.Parents.Functions.HelpMe;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Models.HelpMe;
import com.dubtsov._2bsafe.Parents.Parse.GetHelpMe;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 31.08.17.
 */
public class HelpMeParentClass extends BaseClass{

    JSONObject jsonObject;

    public HelpMeParentClass() throws IOException {}

    public HelpMe getHelpMe() throws Exception {
        jsonObject = GenerateHelpMeContent.getHelpMe();
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/help_me/get", jsonObject);
        return GetHelpMe.getHelpMe(responseClass.getJsonResponse().body().string());
    }
    public HelpMe NegativeGetHelpMe(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/help_me/get", jsonObject);
        return GetHelpMe.getHelpMe(responseClass.getJsonResponse().body().string());
    }


    public Response setHelpMe() throws Exception {
        jsonObject = GenerateHelpMeContent.setHelpMe();
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/help_me/set", jsonObject);
        return responseClass.getJsonResponse();
    }
    public Response NegatibeSetHelpMe(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/help_me/set", jsonObject);
        return responseClass.getJsonResponse();
    }
}

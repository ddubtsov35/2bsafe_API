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

    public HelpMe getHelpMe() throws IOException, ParseException, java.text.ParseException {
        jsonObject = GenerateHelpMeContent.getHelpMe();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/help_me/get", jsonObject);
        return GetHelpMe.getHelpMe(responseClass.getResponse().body().string());
    }

    public Response setHelpMe() throws IOException, ParseException, java.text.ParseException {
        jsonObject = GenerateHelpMeContent.setHelpMe();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/help_me/set", jsonObject);
        return responseClass.getJsonResponse();
    }
}

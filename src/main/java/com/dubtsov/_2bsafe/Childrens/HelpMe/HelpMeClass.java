package com.dubtsov._2bsafe.Childrens.HelpMe;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;

import java.io.IOException;

/**
 * Created by user on 24.08.17.
 */
public class HelpMeClass extends BaseClass{

    JSONObject jsonObject;

    public HelpMeClass() throws IOException {}

    public Response helpMe() throws IOException {

        responseClass = new ResponseClass("http://api.safec.ru/os_api/clients/v1.0/help_me", jsonObject);
        return responseClass.getJsonResponse();
    }
}

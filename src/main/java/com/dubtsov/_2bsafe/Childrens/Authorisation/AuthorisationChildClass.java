package com.dubtsov._2bsafe.Childrens.Authorisation;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateAuthorisationChildren;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 16.08.17.
 */
public class AuthorisationChildClass extends BaseClass{

    JSONObject jsonObject;

    public AuthorisationChildClass() throws IOException {}

    public Response authorisationChildren() throws IOException, ParseException, java.text.ParseException {
        jsonObject = GenerateAuthorisationChildren.getAuthorisationChildrenContent();
        responseClass = new ResponseClass("http://api.safec.ru/os_api/clients/v1.0/auth", jsonObject);
        return responseClass.getJsonResponse();
    }
}

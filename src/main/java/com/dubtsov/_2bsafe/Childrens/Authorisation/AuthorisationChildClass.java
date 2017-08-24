package com.dubtsov._2bsafe.Childrens.Authorisation;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 16.08.17.
 */
public class AuthorisationChildClass extends BaseClass{

    public AuthorisationChildClass() throws IOException {}

    public Response authorisationChildren(HashMap content) throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass("http://api.safec.ru/os_api/clients/v1.0/auth", content);
        return responseClass.getResponse();
    }
}

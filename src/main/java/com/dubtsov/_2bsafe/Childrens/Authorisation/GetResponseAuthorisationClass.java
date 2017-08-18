package com.dubtsov._2bsafe.Childrens.Authorisation;

import com.dubtsov._2bsafe.Childrens.Models.ResponseAuthorisation;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GetChildrenCardInfoClass;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 16.08.17.
 */
public class GetResponseAuthorisationClass extends BaseClass{
    public GetResponseAuthorisationClass() throws IOException {}

    public ResponseAuthorisation getResponseAuthorisation(HashMap content) throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass("http://api.safec.ru/os_api/accounts/v1.0/login", content);
        String responseString = responseClass.getResponse().body().string();
        return new ResponseAuthorisation(responseString);
    }
}

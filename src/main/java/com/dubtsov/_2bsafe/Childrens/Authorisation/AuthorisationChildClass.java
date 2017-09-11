package com.dubtsov._2bsafe.Childrens.Authorisation;

import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Childrens.Parse.GetChildrenResponseAuthorisation;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.GenerateAuthorisationChildren;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 16.08.17.
 */
public class AuthorisationChildClass extends BaseClass{

    JSONObject jsonObject;

    public AuthorisationChildClass() throws IOException {}

    public ChildrenResponseAuthorisationModel authorisationChildren() throws IOException, ParseException, java.text.ParseException {
        jsonObject = GenerateAuthorisationChildren.getAuthorisationChildrenContent();
        responseClass = new ResponseClass("http://api.safec.ru/os_api/clients/v1.0/auth", jsonObject);
        return GetChildrenResponseAuthorisation.getChildrenResponseAuthorisation(responseClass.getJsonResponse().body().string());
    }
}

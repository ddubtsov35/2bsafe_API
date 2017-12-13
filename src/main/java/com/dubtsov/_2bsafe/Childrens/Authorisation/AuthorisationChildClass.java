package com.dubtsov._2bsafe.Childrens.Authorisation;

import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Childrens.Parse.GetChildrenResponseAuthorisation;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateCidCkeyContent;
import com.dubtsov._2bsafe.Parents.Pool.LogPools;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 16.08.17.
 */
public class AuthorisationChildClass extends BaseClass{

    JSONObject jsonObject;
    ChildrenResponseAuthorisationModel childrenResponseAuthorisationModel;
    GenerateCidCkeyContent generateCidCkeyContent;

    public AuthorisationChildClass() throws IOException {}

    public ChildrenResponseAuthorisationModel authorisationChildren() throws Exception {
        jsonObject = GenerateAuthorisationChildren.PositiveGetAuthorisationChildrenContent();
        responseClass = new ResponseClass("http://api.safec.ru/os_api/clients/v1.0/auth", jsonObject);
        childrenResponseAuthorisationModel = GetChildrenResponseAuthorisation.getChildrenResponseAuthorisation(responseClass.getJsonResponse().body().string());
        generateCidCkeyContent.getCidCkey(childrenResponseAuthorisationModel);

        return childrenResponseAuthorisationModel;
    }

    public ChildrenResponseAuthorisationModel NegativeAuthorisationChildren(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass("http://api.safec.ru/os_api/clients/v1.0/auth", jsonObject);
        childrenResponseAuthorisationModel = GetChildrenResponseAuthorisation.getChildrenResponseAuthorisation(responseClass.getJsonResponse().body().string());
        return childrenResponseAuthorisationModel;
    }

}

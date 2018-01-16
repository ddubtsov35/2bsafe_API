package com.dubtsov._2bsafe.Parents.Functions.FAQ;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 30.08.17.
 */
public class GetFaqByIdClass extends BaseClass{

    JSONObject jsonObject;

    public GetFaqByIdClass() throws IOException {}

    public Response getFaqListLk() throws IOException, ParseException, java.text.ParseException {
        jsonObject = GenerateFaqContent.getChildrenCardListContent();
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/faq/get", jsonObject);
        return responseClass.getJsonResponse();
    }
    public Response NegativeGetFaqListLk(JSONObject jsonObject) throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/faq/get", jsonObject);
        return responseClass.getJsonResponse();
    }




    public Response getFaqListVis() throws IOException, ParseException, java.text.ParseException {
        jsonObject = GenerateFaqContent.getChildrenCardListContent();
        responseClass = new ResponseClass(lkApi + "/land/v1.0/faq/get", jsonObject);
        return responseClass.getJsonResponse();
    }
}

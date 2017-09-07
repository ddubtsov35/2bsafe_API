package com.dubtsov._2bsafe.Parents.Functions.FAQ;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Models.Faq;
import com.dubtsov._2bsafe.Parents.Parse.GetFaq;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 * Created by user on 30.08.17.
 */
public class GetFaqByIdClass extends BaseClass{

    public GetFaqByIdClass() throws IOException {}

    public Response getFaqListLk(HashMap content) throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/faq/get", content);
        return responseClass.getResponse();
    }

    public Response getFaqListVis(HashMap content) throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/land/v1.0/faq/get", content);
        return responseClass.getResponse();
    }
}

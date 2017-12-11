package com.dubtsov._2bsafe.Parents.Functions.Tickets;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Parse.GetTicket;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 30.08.17.
 */
public class SendTicketClass extends BaseClass{

    JSONObject jsonObject;

    public SendTicketClass() throws IOException {}

    public Integer sendTicket() throws Exception {
        jsonObject = GenerateTicketContent.getSendTicketContent();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/ticket/send", jsonObject);
        return GetTicket.getTicketId(responseClass.getJsonResponse().body().string());
    }
    public Integer NegativeSendTicket(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/ticket/send", jsonObject);
        return GetTicket.getTicketId(responseClass.getJsonResponse().body().string());
    }



    public Response sendTicketWithoutAuthorisation() throws Exception {
        jsonObject = GenerateTicketContent.getSendTicketLandingContent();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/land/v1.0/ticket/send", jsonObject);
        return responseClass.getJsonResponse();
    }
    public Response NegativeSendTicketWithoutAuthorisation(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/land/v1.0/ticket/send", jsonObject);
        return responseClass.getJsonResponse();
    }
}

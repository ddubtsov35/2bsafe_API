package com.dubtsov._2bsafe.Parents.Tickets;

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
    public SendTicketClass() throws IOException {}

    public Integer sendTicket(HashMap content) throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/ticket/send", content);
        return GetTicket.getTicketId(responseClass.getResponse().body().string());
    }

    public Response sendTicketWithoutAuthorisation(HashMap content) throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/land/v1.0/ticket/send", content);
        return responseClass.getResponse();
    }
}

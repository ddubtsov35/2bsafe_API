package com.dubtsov._2bsafe.Parents.Functions.Poll;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Models.Poll;
import com.dubtsov._2bsafe.Parents.Models.PollTittle;
import com.dubtsov._2bsafe.Parents.Parse.GetPoll;
import com.dubtsov._2bsafe.Parents.Parse.GetPollTittle;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 30.08.17.
 */
public class PollClass extends BaseClass{
    public PollClass() throws IOException {}

    public PollTittle getPoll(HashMap content) throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/admins/v1.0/poll/check", content);
        return GetPollTittle.getPollTittle(responseClass.getResponse().body().string());
    }

    public Poll getPollById(HashMap content) throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/admins/v1.0/poll/get", content);
        return GetPoll.getPoll(responseClass.getResponse().body().string());
    }

    public Response setPoll(HashMap content) throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/admins/v1.0/poll/set_result", content);
        return responseClass.getResponse();
    }
}

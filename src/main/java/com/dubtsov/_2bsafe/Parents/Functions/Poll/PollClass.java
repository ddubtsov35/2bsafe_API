package com.dubtsov._2bsafe.Parents.Functions.Poll;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Models.Poll;
import com.dubtsov._2bsafe.Parents.Models.PollTittle;
import com.dubtsov._2bsafe.Parents.Parse.GetPoll;
import com.dubtsov._2bsafe.Parents.Parse.GetPollTittle;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 30.08.17.
 */
public class PollClass extends BaseClass{

    JSONObject jsonObject;

    public PollClass() throws IOException {}

    public PollTittle getPoll() throws IOException, ParseException, java.text.ParseException {
        jsonObject = new JSONObject();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/admins/v1.0/poll/check", jsonObject);
        return GetPollTittle.getPollTittle(responseClass.getJsonResponse().body().string());
    }

    public Poll getPollById() throws Exception {
        jsonObject = new JSONObject();
        jsonObject = GeneratePollContent.getPollContent();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/admins/v1.0/poll/get", jsonObject);
        return GetPoll.getPoll(responseClass.getJsonResponse().body().string());
    }

    public Response setPoll() throws Exception {
        jsonObject = new JSONObject();
        jsonObject = GeneratePollContent.setPollContent();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/admins/v1.0/poll/set_result", jsonObject);
        return responseClass.getJsonResponse();
    }
}

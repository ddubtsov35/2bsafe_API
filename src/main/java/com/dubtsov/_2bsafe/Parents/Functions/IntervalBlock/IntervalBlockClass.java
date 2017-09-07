package com.dubtsov._2bsafe.Parents.Functions.IntervalBlock;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Models.AddIntervalBlock;
import com.dubtsov._2bsafe.Parents.Models.GetDataUpdate;
import com.dubtsov._2bsafe.Parents.Models.IntervalBlock;
import com.dubtsov._2bsafe.Parents.Parse.GetAddIntervalBlock;
import com.dubtsov._2bsafe.Parents.Parse.GetIntervalBlock;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 * Created by user on 31.08.17.
 */
public class IntervalBlockClass extends BaseClass{
    public IntervalBlockClass() throws IOException {}

    public List<IntervalBlock> getIntervalBlockList(HashMap content) throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/intervals/list", content);
        return GetIntervalBlock.getIntervalBlock(responseClass.getResponse().body().string());
    }

    public AddIntervalBlock addIntervalBlockList(JSONObject jsonObject) throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/intervals/add", jsonObject);
        return GetAddIntervalBlock.getAccountSettings(responseClass.getJsonResponse().body().string());
    }

    public Response editIntervalBlockList(HashMap content) throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/intervals/edit", content);
        return responseClass.getResponse();
    }

    public Response deleteIntervalBlockList(HashMap content) throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/intervals/del", content);
        return responseClass.getResponse();
    }

}

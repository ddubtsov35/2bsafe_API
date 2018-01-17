package com.dubtsov._2bsafe.Parents.Functions.IntervalBlock;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.IntervalBlock.GenerateData.GenerateAddBlockIntervalContent;
import com.dubtsov._2bsafe.Parents.Models.AddIntervalBlock;
import com.dubtsov._2bsafe.Parents.Models.IntervalBlock;
import com.dubtsov._2bsafe.Parents.Parse.GetAddIntervalBlock;
import com.dubtsov._2bsafe.Parents.Parse.GetIntervalBlock;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.List;

/**
 * Created by user on 31.08.17.
 */
public class IntervalBlockClass extends BaseClass{

    JSONObject jsonObject;

    public IntervalBlockClass() throws IOException {}

    public List<IntervalBlock> getIntervalBlockList() throws Exception {
        jsonObject = GenerateAddBlockIntervalContent.getListInterval();
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/intervals/list", jsonObject);
        return GetIntervalBlock.getIntervalBlock(responseClass.getJsonResponse().body().string());
    }
    public List<IntervalBlock> NegativeGetIntervalBlockList(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/intervals/list", jsonObject);
        return GetIntervalBlock.getIntervalBlock(responseClass.getJsonResponse().body().string());
    }



    public AddIntervalBlock addIntervalBlockList() throws Exception {
        jsonObject = GenerateAddBlockIntervalContent.addInterval();
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/intervals/add", jsonObject);
        return GetAddIntervalBlock.getAccountSettings(responseClass.getJsonResponse().body().string());
    }
    public AddIntervalBlock NegativeAddIntervalBlockList(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/intervals/add", jsonObject);
        return GetAddIntervalBlock.getAccountSettings(responseClass.getJsonResponse().body().string());
    }



    public Response editIntervalBlockList() throws Exception {
        jsonObject = GenerateAddBlockIntervalContent.editInterval();
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/intervals/edit", jsonObject);
        return responseClass.getJsonResponse();
    }
    public Response NegativeEditIntervalBlockList(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/intervals/edit", jsonObject);
        return responseClass.getJsonResponse();
    }



    public Response deleteIntervalBlockList() throws Exception {
        jsonObject = GenerateAddBlockIntervalContent.deleteInterval();
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/intervals/del", jsonObject);
        return responseClass.getJsonResponse();
    }
    public Response NegativeDeleteIntervalBlockList(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/intervals/del", jsonObject);
        return responseClass.getJsonResponse();
    }

}

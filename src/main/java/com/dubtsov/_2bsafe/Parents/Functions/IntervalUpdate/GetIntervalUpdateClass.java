package com.dubtsov._2bsafe.Parents.Functions.IntervalUpdate;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent.GenerateSelectChildrenCardContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.Models.DataUpdate;
import com.dubtsov._2bsafe.Parents.Parse.GetDataUpdate;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import org.json.simple.JSONObject;

import java.io.IOException;

/**
 * Created by user on 28.08.17.
 */
public class GetIntervalUpdateClass extends BaseClass{

    JSONObject jsonObject = new JSONObject();

    public GetIntervalUpdateClass() throws IOException {}

    public DataUpdate getIntervalUpdateResponse() throws Exception {
        //jsonObject.put("profile_id", GenerateProfileIdContent.profileId);
        jsonObject.put("profile_id", GenerateProfileIdContent.getProfileId().get("profileId"));
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/main/get_info_timeout", jsonObject);
        return GetDataUpdate.dataUpdate(responseClass.getJsonResponse().body().string());
    }

    public DataUpdate NegativeGetIntervalUpdateResponse(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/main/get_info_timeout", jsonObject);
        return GetDataUpdate.dataUpdate(responseClass.getJsonResponse().body().string());
    }
}

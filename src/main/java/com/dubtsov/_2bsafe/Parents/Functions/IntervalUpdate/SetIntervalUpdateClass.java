package com.dubtsov._2bsafe.Parents.Functions.IntervalUpdate;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.IntervalUpdate.GenerateData.GenerateIntervalUpdateContent;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;

import java.io.IOException;

/**
 * Created by user on 20.07.17.
 */
public class SetIntervalUpdateClass extends BaseClass{

    JSONObject jsonObject;

    public SetIntervalUpdateClass() throws IOException {}

    public Response setIntervalUpdate() throws Exception {
        jsonObject = GenerateIntervalUpdateContent.setIntervalUpdateContent();
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/main/set_info_timeout", jsonObject);
        return responseClass.getJsonResponse();
    }
    public Response NegativeSetIntervalUpdate(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/main/set_info_timeout", jsonObject);
        return responseClass.getJsonResponse();
    }

}

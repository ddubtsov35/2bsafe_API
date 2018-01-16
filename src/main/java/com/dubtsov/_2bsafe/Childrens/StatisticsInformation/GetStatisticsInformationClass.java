package com.dubtsov._2bsafe.Childrens.StatisticsInformation;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 24.08.17.
 */
public class GetStatisticsInformationClass extends BaseClass{

    JSONObject jsonObject;

    public GetStatisticsInformationClass() throws IOException {}

    public Response getStatisticsInformation() throws Exception {
        jsonObject = GenerateStatisticInfoContent.getRulesTriggerContent();
        responseClass = new ResponseClass(clientApi + "/clients/v1.0/stat_update", jsonObject);
        return responseClass.getJsonResponse();
    }

    public Response NegativeGetStatisticsInformation(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass(clientApi + "/clients/v1.0/stat_update", jsonObject);
        return responseClass.getJsonResponse();
    }
}

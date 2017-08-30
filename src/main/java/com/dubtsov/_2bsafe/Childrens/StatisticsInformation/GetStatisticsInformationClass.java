package com.dubtsov._2bsafe.Childrens.StatisticsInformation;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 24.08.17.
 */
public class GetStatisticsInformationClass extends BaseClass{
    public GetStatisticsInformationClass() throws IOException {}

    public Response getStatisticsInformation(HashMap content) throws IOException {
        responseClass = new ResponseClass("http://api.safec.ru/os_api/clients/v1.0/stat_update", content);
        return responseClass.getResponse();
    }
}

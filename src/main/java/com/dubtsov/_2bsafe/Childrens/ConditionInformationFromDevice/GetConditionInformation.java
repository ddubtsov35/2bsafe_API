package com.dubtsov._2bsafe.Childrens.ConditionInformationFromDevice;

import com.dubtsov._2bsafe.Childrens.Models.ConditionInformationFromDevice;
import com.dubtsov._2bsafe.Childrens.Parse.GetConditionInformationFromDevice;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 23.08.17.
 */
public class GetConditionInformation extends BaseClass{

    JSONObject jsonObject;
    GenerateConditionInformationContent generateConditionInformationContent = new GenerateConditionInformationContent();

    public GetConditionInformation() throws IOException {}

    public ConditionInformationFromDevice getConditionInformation() throws Exception {
        jsonObject = generateConditionInformationContent.getConditionInformationContent();
        responseClass = new ResponseClass("http://api.safec.ru/os_api/clients/v1.0/update", jsonObject);
        return GetConditionInformationFromDevice.getConditionInformationFromDevice(responseClass.getJsonResponse().body().string());
    }

    public ConditionInformationFromDevice NegativeGetConditionInformation(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass("http://api.safec.ru/os_api/clients/v1.0/update", jsonObject);
        return GetConditionInformationFromDevice.getConditionInformationFromDevice(responseClass.getJsonResponse().body().string());
    }
}

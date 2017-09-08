package com.dubtsov._2bsafe.Parents.Functions.ChildrenCard;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.Models.DeviceShortInfo;
import com.dubtsov._2bsafe.Parents.Parse.GetDeviceShortInfo;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 16.08.17.
 */
public class GetChildrenCardInfoClass extends BaseClass{

    JSONObject jsonObject;

    public GetChildrenCardInfoClass() throws IOException {}

    public DeviceShortInfo getShortInfo() throws IOException, ParseException, java.text.ParseException {
        jsonObject = GenerateProfileIdContent.getProfileId();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/profile/short_info", jsonObject);
        String responseString = responseClass.getResponse().body().string();
        return GetDeviceShortInfo.getDeviceShortInfo(responseString);
    }

}

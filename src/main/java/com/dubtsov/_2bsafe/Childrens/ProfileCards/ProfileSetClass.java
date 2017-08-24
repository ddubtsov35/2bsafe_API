package com.dubtsov._2bsafe.Childrens.ProfileCards;

import com.dubtsov._2bsafe.Childrens.Models.ConditionInformationFromDevice;
import com.dubtsov._2bsafe.Childrens.Models.ProfileCard;
import com.dubtsov._2bsafe.Childrens.Parse.GetConditionInformationFromDevice;
import com.dubtsov._2bsafe.Childrens.Parse.GetProfileList;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 * Created by user on 23.08.17.
 */
public class ProfileSetClass  extends BaseClass{

    public ProfileSetClass() throws IOException {}

    public ConditionInformationFromDevice setProfileCard(HashMap content) throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass("http://api.safec.ru/os_api/clients/v1.0/profile_set", content);
        String responseString = responseClass.getResponse().body().string();
        return GetConditionInformationFromDevice.getConditionInformationFromDevice(responseString);
    }

    public Response selectProfileCardResponse(HashMap content) throws IOException {
        responseClass = new ResponseClass("http://api.safec.ru/os_api/clients/v1.0/profile_set", content);
        return responseClass.getResponse();
    }
}

package com.dubtsov._2bsafe.Childrens.ProfileCards;

import com.dubtsov._2bsafe.Childrens.Logout.ChildrenLogoutClass;
import com.dubtsov._2bsafe.Childrens.Models.ConditionInformationFromDevice;
import com.dubtsov._2bsafe.Childrens.Models.ProfileCard;
import com.dubtsov._2bsafe.Childrens.Parse.GetConditionInformationFromDevice;
import com.dubtsov._2bsafe.Childrens.Parse.GetProfileList;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent.GenerateGetProfileListContent;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent.GenerateSelectChildrenCardContent;
import com.dubtsov._2bsafe.Parents.Pool.ChildrenCardPools;
import com.dubtsov._2bsafe.Parents.Pool.CidCkeyPool;
import com.dubtsov._2bsafe.Parents.Pool.CidCkeyRegisteredPool;
import com.dubtsov._2bsafe.Parents.Pool.LogPools;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.List;

/**
 * Created by user on 23.08.17.
 */
public class ProfileClass extends BaseClass{

    JSONObject jsonObject;

    public ProfileClass() throws IOException {}

    public List<ProfileCard> getProfileList() throws Exception {
        jsonObject = GenerateGetProfileListContent.getProfileListContent();
        responseClass = new ResponseClass("http://api.safec.ru/os_api/clients/v1.0/profile_list", jsonObject);

        System.out.println("9");
        LogPools.getLog();

        return GetProfileList.getProfileCard(responseClass.getJsonResponse().body().string());
    }

    public List<ProfileCard> NegativeGetProfileList(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass("http://api.safec.ru/os_api/clients/v1.0/profile_list", jsonObject);
        return GetProfileList.getProfileCard(responseClass.getJsonResponse().body().string());
    }


    public ConditionInformationFromDevice setProfileCard() throws Exception {
        jsonObject  = GenerateSelectChildrenCardContent.getGenerateSelectChildrenCardContent();
        responseClass = new ResponseClass("http://api.safec.ru/os_api/clients/v1.0/profile_set", jsonObject);
        return GetConditionInformationFromDevice.getConditionInformationFromDevice(responseClass.getJsonResponse().body().string());
    }

    /*public Response selectProfileCardResponse() throws Exception {
        jsonObject  = GenerateSelectChildrenCardContent.getGenerateSelectChildrenCardContent();
        responseClass = new ResponseClass("http://api.safec.ru/os_api/clients/v1.0/profile_set", jsonObject);
        return responseClass.getJsonResponse();
    }*/

    public Response NegativeSelectProfileCardResponse(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass("http://api.safec.ru/os_api/clients/v1.0/profile_set", jsonObject);
        return responseClass.getJsonResponse();
    }
}

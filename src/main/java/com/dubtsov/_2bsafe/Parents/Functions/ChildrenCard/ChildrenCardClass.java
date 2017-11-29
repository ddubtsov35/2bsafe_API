package com.dubtsov._2bsafe.Parents.Functions.ChildrenCard;

import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent.GenerateAddChildrenCardContent;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent.GenerateChangeChildrenCardContent;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent.GenerateDeleteChildrenCardContent;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent.GenerateGetChildrenCardListContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.Models.AddChildrenCard;
import com.dubtsov._2bsafe.Parents.Models.ChildrenCard;
import com.dubtsov._2bsafe.Parents.Models.DeviceShortInfo;
import com.dubtsov._2bsafe.Parents.Parse.GetAddChildrenCard;
import com.dubtsov._2bsafe.Parents.Parse.GetChildrenCardList;
import com.dubtsov._2bsafe.Parents.Parse.GetDeviceShortInfo;
import com.dubtsov._2bsafe.Parents.Pool.ChildrenCardPools;
import com.dubtsov._2bsafe.Parents.Pool.CidCkeyPool;
import com.dubtsov._2bsafe.Parents.Pool.CidCkeyRegisteredPool;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 18.07.17.
 */
public class ChildrenCardClass extends BaseClass {

    JSONObject jsonObject;

    public ChildrenCardClass() throws IOException {}

    public AddChildrenCard addChildrenCard() throws Exception {
        if(ChildrenCardPools.getChildrenCardFromFile() == null) {
            jsonObject = GenerateAddChildrenCardContent.getAddChildrenCard();
            responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/profile/add", jsonObject);
            return GetAddChildrenCard.addChildrenCard(responseClass.getRequestAddChildrenCardList().body().string());
        } else {
            return ChildrenCardPools.getChildrenCardFromFile();
        }
    }
    public AddChildrenCard NegativeAddChildrenCard(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/profile/add", jsonObject);
        return GetAddChildrenCard.addChildrenCard(responseClass.getRequestAddChildrenCardList().body().string());
    }




    public void deleteChildrenCard() throws Exception {
        jsonObject = GenerateDeleteChildrenCardContent.getDeleteChildrenCardContent();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/profile/delete", jsonObject);
        response = responseClass.getJsonResponse();
        if(response.code() == 200){
            System.out.println("Before GenerateProfileIdContent.profileId = " + GenerateProfileIdContent.profileId);
            GenerateProfileIdContent.profileId = null;
            System.out.println("After GenerateProfileIdContent.profileId = " + GenerateProfileIdContent.profileId);
            ChildrenCardPools.clearFile();
            CidCkeyPool.clearFile();
            CidCkeyRegisteredPool.clearFile();
        }
    }
    public void NegativeDeleteChildrenCard(JSONObject jsonObject) throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/profile/delete", jsonObject);
        responseClass.getJsonResponse();
    }




    public DeviceShortInfo getShortInfo() throws Exception {
        jsonObject = GenerateProfileIdContent.getProfileId();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/profile/short_info", jsonObject);
        return GetDeviceShortInfo.getDeviceShortInfo(responseClass.getJsonResponse().body().string());
    }





    public List<ChildrenCard> getChildrenCardList() throws IOException, ParseException, java.text.ParseException {
        jsonObject = GenerateGetChildrenCardListContent.getChildrenCardListContent();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/profile/list", jsonObject);
        return GetChildrenCardList.getChildrenCardList(responseClass.getJsonResponse().body().string());
    }
    public List<ChildrenCard> NegativeGetChildrenCardList(JSONObject jsonObject) throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/profile/list", jsonObject);
        return GetChildrenCardList.getChildrenCardList(responseClass.getJsonResponse().body().string());
    }




    public Response changeChildrenCard(String type) throws Exception {
        jsonObject = GenerateChangeChildrenCardContent.getChangeChildrenCardContent(type);
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/profile/change_info", jsonObject);
        return responseClass.getJsonResponse();
    }
    public Response NegativeChangeChildrenCard(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/profile/change_info", jsonObject);
        return responseClass.getJsonResponse();
    }





    public ChildrenCard getChildrenCardByProfileId() throws Exception {

        int profileId = Integer.parseInt(String.valueOf(GenerateProfileIdContent.getProfileId().get("profile_id")));

        List<ChildrenCard> childrenCardList = getChildrenCardList();
        for(int i=0; i<childrenCardList.size(); i++){
            if(childrenCardList.get(i).getProfile_id() == profileId){
                return childrenCardList.get(i);
            }
        }
        return null;
    }
}

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
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.List;

/**
 * Created by user on 18.07.17.
 */
public class ChildrenCardClass extends BaseClass {

    JSONObject jsonObject;
    String responseString;
    AddChildrenCard addChildrenCard;

    public ChildrenCardClass() throws IOException {}

    public AddChildrenCard addChildrenCard() throws Exception {
        jsonObject = GenerateAddChildrenCardContent.getAddChildrenCard();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/profile/add", jsonObject);
        addChildrenCard = GetAddChildrenCard.addChildrenCard(responseClass.getRequestAddChildrenCardList().body().string());
        return addChildrenCard;
    }

    public void deleteChildrenCard() throws IOException, ParseException, java.text.ParseException {
        jsonObject = GenerateDeleteChildrenCardContent.getDeleteChildrenCardContent();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/profile/delete", jsonObject);
        responseClass.getJsonResponse();
    }

    public DeviceShortInfo getShortInfo() throws Exception {
        jsonObject = GenerateProfileIdContent.getProfileId();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/profile/short_info", jsonObject);
        String responseString = responseClass.getJsonResponse().body().string();
        return GetDeviceShortInfo.getDeviceShortInfo(responseString);
    }

    public List<ChildrenCard> getChildrenCardList() throws IOException, ParseException, java.text.ParseException {
        jsonObject = GenerateGetChildrenCardListContent.getChildrenCardListContent();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/profile/list", jsonObject);
        responseString = responseClass.getJsonResponse().body().string();
        return GetChildrenCardList.getChildrenCardList(responseString);
    }

    public Response changeChildrenCard(String type) throws IOException {
        jsonObject = GenerateChangeChildrenCardContent.getChangeChildrenCardContent(type);
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/profile/change_info", jsonObject);
        return responseClass.getJsonResponse();
    }
}

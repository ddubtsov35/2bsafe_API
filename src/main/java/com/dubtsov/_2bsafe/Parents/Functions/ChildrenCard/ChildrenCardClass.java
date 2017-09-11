package com.dubtsov._2bsafe.Parents.Functions.ChildrenCard;

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
import com.dubtsov._2bsafe.Parents.Pool.ChildrenCardPool;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.List;

/**
 * Created by user on 18.07.17.
 */
public class ChildrenCardClass extends BaseClass {

    JSONObject jsonObject;
    String responseString;

    public ChildrenCardClass() throws IOException {}

    public AddChildrenCard addChildrenCard() throws Exception {
        jsonObject = ChildrenCardPool.getChildrenCardFromFile();
        if(jsonObject == null){
            jsonObject = GenerateAddChildrenCardContent.getAddChildrenCard();
            responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/profile/add", jsonObject);
            return GetAddChildrenCard.addChildrenCard(responseClass.getRequestAddChildrenCardList().body().string());
        } else {
            return GetAddChildrenCard.addChildrenCard(jsonObject.toString());
        }
    }

    public void deleteChildrenCard(List<ChildrenCard> getChildrenCardList) throws IOException, ParseException, java.text.ParseException {
        jsonObject = GenerateDeleteChildrenCardContent.getDeleteChildrenCardContent();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/profile/delete", jsonObject);
        responseClass.getResponse();
    }

    public DeviceShortInfo getShortInfo() throws Exception {
        jsonObject = GenerateProfileIdContent.getProfileId();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/profile/short_info", jsonObject);
        String responseString = responseClass.getResponse().body().string();
        return GetDeviceShortInfo.getDeviceShortInfo(responseString);
    }

    public List<ChildrenCard> getChildrenCardList() throws IOException, ParseException, java.text.ParseException {
        jsonObject = GenerateGetChildrenCardListContent.getChildrenCardListContent();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/profile/list", jsonObject);
        responseString = responseClass.getResponse().body().string();
        return GetChildrenCardList.getChildrenCardList(responseString);
    }

    public Response changeChildrenCard(String type) throws IOException {
        jsonObject = GenerateChangeChildrenCardContent.getChangeChildrenCardContent(type);
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/profile/change_info", jsonObject);
        return responseClass.getResponse();
    }
}

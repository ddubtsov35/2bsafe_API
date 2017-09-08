package com.dubtsov._2bsafe.Parents.Functions.ChildrenCard;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateChangeChildrenCardContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GeneratePhoneClass;
import com.dubtsov._2bsafe.Parents.Models.ChildrenCard;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by user on 20.07.17.
 */
public class ChangeChildrenCardClass extends BaseClass{

    JSONObject jsonObject;

    public ChangeChildrenCardClass() throws IOException {}

    public Response changeChildrenCard(String type) throws IOException {
        jsonObject = GenerateChangeChildrenCardContent.getChangeChildrenCardContent(type);
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/profile/change_info", jsonObject);
        return  responseClass.getResponse();
    }

}

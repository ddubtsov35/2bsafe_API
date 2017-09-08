package com.dubtsov._2bsafe.Parents.Functions.ChildrenCard;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateAddChildrenCardContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateNameClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GeneratePhoneClass;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Random;

/**
 * Created by user on 18.07.17.
 */
public class AddChildrenCardClass extends BaseClass {

    JSONObject jsonObject;


    public AddChildrenCardClass() throws IOException {}

    public Response addChildrenCard() throws Exception {
        jsonObject = GenerateAddChildrenCardContent.getAddChildrenCard();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/profile/add", jsonObject);
        return responseClass.getRequestAddChildrenCardList();
    }



}

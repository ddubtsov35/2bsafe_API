package com.dubtsov._2bsafe.Parents.Functions.ChildrenCard;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateNameClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GeneratePhoneClass;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Random;

/**
 * Created by user on 18.07.17.
 */
public class AddChildrenCardClass extends BaseClass {

    HashMap content;
    Random random;

    public AddChildrenCardClass() throws IOException {}

    public Response addChildrenCard() throws Exception {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/profile/add", getContent());
        return responseClass.getRequestAddChildrenCardList();
    }

    private HashMap getContent() throws IOException {
        random = new Random();
        content = new LinkedHashMap();
        content.put("name", GenerateNameClass.getGenerateName());
        content.put("phone", GeneratePhoneClass.getGeneratedPhone());
        content.put("age", String.valueOf(random.nextInt((90 - 0) + 1) + 0));
        content.put("send_sms", String.valueOf(0));
        //content.put("file", "test.png");
        return content;
    }

}

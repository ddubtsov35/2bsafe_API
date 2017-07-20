package com.dubtsov._2bsafe.Functions.ChildrenCard;

import com.dubtsov._2bsafe.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.GenerateTestData.GenerateNameClass;
import com.dubtsov._2bsafe.GenerateTestData.GeneratePhoneClass;
import com.dubtsov._2bsafe.Response.ResponseClass;
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
        content.put("age", String.valueOf(random.nextInt((9 - 0) + 1) + 0));
        content.put("send_sms", String.valueOf(1));
        content.put("file", "test.png");
        setSuperContent(content);
        return content;
    }

    public void setSuperContent(HashMap content){
        superContent.put("name_AddChildrenCard", content.get("name"));
        superContent.put("phone_AddChildrenCard", content.get("phone"));
        superContent.put("age_AddChildrenCard", content.get("age"));
        superContent.put("send_sms_AddChildrenCard", content.get("send_sms"));
    }

}

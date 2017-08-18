package com.dubtsov._2bsafe.Parents.Functions.ChildrenCard;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GeneratePhoneClass;
import com.dubtsov._2bsafe.Parents.Models.ChildrenCard;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by user on 20.07.17.
 */
public class ChangeChildrenCardClass extends BaseClass{

    HashMap content;

    public ChangeChildrenCardClass() throws IOException {}

    private HashMap generateContent(String type){
        switch (type){
            case "phone":
                content.put("phone", GeneratePhoneClass.getStaticPhone());
                break;
            case "age":
                content.put("age", 99);
                break;
            case "all":
                content.put("phone", GeneratePhoneClass.getStaticPhone());
                content.put("age", 99);
                break;
        }
        return content;
    }


    public Response changeChildrenCard(List<ChildrenCard> getChildrenCardList, String type) throws IOException {
        content = new LinkedHashMap();
        content.put("profile_id", getChildrenCardList.get(0).getProfile_id());
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/profile/change_info", generateContent(type));
        return  responseClass.getResponse();
    }

}

package com.dubtsov._2bsafe.Functions.ChildrenCard;

import com.dubtsov._2bsafe.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Models.ChildrenCard;
import com.dubtsov._2bsafe.Response.ResponseClass;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by user on 20.07.17.
 */
public class DeleteChildrenCardClass extends BaseClass {


    HashMap content;

    public DeleteChildrenCardClass() throws IOException {}

    public void deleteChildrenCard(List<ChildrenCard> getChildrenCardList) throws IOException {
        content = new LinkedHashMap();
        content.put("profile_id", getChildrenCardList.get(0).getProfile_id());
        content.put("pwd", superContent.get("pwd"));
        content.put("rnd", "qwe");
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/profile/delete", content);
        responseClass.getResponse();
    }

}

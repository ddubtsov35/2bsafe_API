package com.dubtsov._2bsafe.Parents.Functions.ChildrenCard;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateDeleteChildrenCardContent;
import com.dubtsov._2bsafe.Parents.Models.ChildrenCard;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by user on 20.07.17.
 */
public class DeleteChildrenCardClass extends BaseClass {

    JSONObject jsonObject;

    public DeleteChildrenCardClass() throws IOException {}

    public void deleteChildrenCard(List<ChildrenCard> getChildrenCardList) throws IOException, ParseException, java.text.ParseException {
        jsonObject = GenerateDeleteChildrenCardContent.getDeleteChildrenCardContent();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/profile/delete", jsonObject);
        responseClass.getResponse();
    }

}

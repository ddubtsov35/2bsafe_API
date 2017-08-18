package com.dubtsov._2bsafe.Parents.Functions.ChildrenCard;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Models.ChildrenCard;
import com.dubtsov._2bsafe.Parents.Parse.GetChildrenCardList;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by user on 19.07.17.
 */
public class GetChildrenCardListClass extends BaseClass {
    public GetChildrenCardListClass() throws IOException {}

    String responseString;
    List<ChildrenCard> childrenCardList;
    HashMap content;

    public List<ChildrenCard> getChildrenCardList() throws IOException, ParseException, java.text.ParseException {
        content = new LinkedHashMap();
        content.put("rnd", rnd);
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/profile/list", content);
        responseString = responseClass.getResponse().body().string();
        return GetChildrenCardList.getChildrenCardList(responseString);
    }

    public int getChildrenCardListCount() throws IOException, ParseException, java.text.ParseException {
        content = new LinkedHashMap();
        content.put("rnd", rnd);
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/profile/list", content);
        responseString = responseClass.getResponse().body().string();
        childrenCardList = GetChildrenCardList.getChildrenCardList(responseString);
        System.out.println("childrenCardListCount " + childrenCardList.size());
        return childrenCardList.size();
    }
}

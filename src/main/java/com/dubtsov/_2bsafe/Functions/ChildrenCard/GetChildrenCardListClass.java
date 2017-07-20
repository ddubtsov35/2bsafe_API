package com.dubtsov._2bsafe.Functions.ChildrenCard;

import com.dubtsov._2bsafe.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Models.ChildrenCard;
import com.dubtsov._2bsafe.Parse.GetChildrenCardList;
import com.dubtsov._2bsafe.Response.ResponseClass;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.List;

/**
 * Created by user on 19.07.17.
 */
public class GetChildrenCardListClass extends BaseClass {
    public GetChildrenCardListClass() throws IOException {}

    String responseString;
    List<ChildrenCard> childrenCardList;

    public List<ChildrenCard> getChildrenCardList() throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/profile/list");
        responseString = responseClass.getResponse().body().string();
        return GetChildrenCardList.getChildrenCardList(responseString);
    }

    public int getChildrenCardListCount() throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/profile/list");
        responseString = responseClass.getResponse().body().string();
        childrenCardList = GetChildrenCardList.getChildrenCardList(responseString);
        System.out.println("childrenCardListCount " + childrenCardList.size());
        return childrenCardList.size();
    }
}

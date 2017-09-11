package com.dubtsov._2bsafe.Childrens.ProfileCards;

import com.dubtsov._2bsafe.Childrens.Models.ProfileCard;
import com.dubtsov._2bsafe.Childrens.Parse.GetProfileList;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent.GenerateGetProfileListContent;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.List;

/**
 * Created by user on 23.08.17.
 */
public class ProfileListClass extends BaseClass{

    JSONObject jsonObject;

    public ProfileListClass() throws IOException {}

    public List<ProfileCard> getProfileList() throws IOException, ParseException, java.text.ParseException {
        jsonObject = GenerateGetProfileListContent.getProfileListContent();
        responseClass = new ResponseClass("http://api.safec.ru/os_api/clients/v1.0/profile_list", jsonObject);
        return GetProfileList.getProfileCard(responseClass.getResponse().body().string());
    }
}

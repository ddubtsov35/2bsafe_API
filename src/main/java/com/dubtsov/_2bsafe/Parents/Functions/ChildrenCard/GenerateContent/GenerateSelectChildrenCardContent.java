package com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent;

import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Childrens.Models.ProfileCard;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateCidCkeyContent;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 11.09.17.
 */
public class GenerateSelectChildrenCardContent {

    private static ProfileClass profileListClass;

    public static JSONObject getGenerateSelectChildrenCardContent() throws Exception {
        profileListClass = new ProfileClass();
        List<ProfileCard> profileCardList = profileListClass.getProfileList();
        System.out.println("profileCardList " + profileCardList.toString());
        JSONObject jsonObject = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObject.put("profile_id", profileCardList.get(profileCardList.size()-1).getProfile_id());
        return jsonObject;
    }
}

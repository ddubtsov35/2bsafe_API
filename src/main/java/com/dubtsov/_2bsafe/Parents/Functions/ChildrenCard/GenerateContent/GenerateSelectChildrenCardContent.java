package com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent;

import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Childrens.Models.ProfileCard;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateCidCkeyContent;
import com.dubtsov._2bsafe.Parents.Models.IntervalBlock;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 11.09.17.
 */
public class GenerateSelectChildrenCardContent {

    private static ProfileClass profileListClass;
    public static Integer profileId = null;

    public static JSONObject getGenerateSelectChildrenCardContent() throws Exception {
        profileListClass = new ProfileClass();
        List<ProfileCard> profileCardList = profileListClass.getProfileList();
        JSONObject jsonObject = GenerateCidCkeyContent.getJsonObjectCidCkey();
        int profile_id = profileCardList.get(profileCardList.size()-1).getProfile_id();
        jsonObject.put("profile_id", profile_id);
        System.out.println("profile_id " + jsonObject.get("profile_id"));
        profileId = profile_id;
        return jsonObject;
    }
}

package com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Childrens.Models.ProfileCard;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateCidCkeyContent;
import com.dubtsov._2bsafe.Parents.Models.IntervalBlock;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

    public static Object[] provideFailProfileId() throws Exception {
        JSONObject jsonObject = GenerateCidCkeyContent.getJsonObjectCidCkey();
        Random random = new Random();
        jsonObject.put("profile_id", random.nextInt(10000 - 1 + 1) + 1);
        return new Object[]{new Object[]{jsonObject}};
    }

    public static Object[] provideEmptyProfileId() throws Exception {
        JSONObject jsonObject = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObject.put("profile_id", null);
        return new Object[]{new Object[]{jsonObject}};
    }

    public static Object[] provideEmptyCkey() throws Exception {
        profileListClass = new ProfileClass();
        List<ProfileCard> profileCardList = profileListClass.getProfileList();
        JSONObject jsonObject = GenerateCidCkeyContent.getJsonObjectCidCkey();
        int profile_id = profileCardList.get(profileCardList.size()-1).getProfile_id();
        jsonObject.put("profile_id", profile_id);
        jsonObject.remove("ckey");
        jsonObject.put("ckey", null);
        return new Object[]{new Object[]{jsonObject}};
    }

    public static Object[] provideFailCkey() throws Exception {
        profileListClass = new ProfileClass();
        List<ProfileCard> profileCardList = profileListClass.getProfileList();
        JSONObject jsonObject = GenerateCidCkeyContent.getJsonObjectCidCkey();
        int profile_id = profileCardList.get(profileCardList.size()-1).getProfile_id();
        jsonObject.put("profile_id", profile_id);
        jsonObject.remove("ckey");
        jsonObject.put("ckey", "failCkey");
        return new Object[]{new Object[]{jsonObject}};
    }

    public static Object[] provideFailCid() throws Exception {
        profileListClass = new ProfileClass();
        List<ProfileCard> profileCardList = profileListClass.getProfileList();
        JSONObject jsonObject = GenerateCidCkeyContent.getJsonObjectCidCkey();
        int profile_id = profileCardList.get(profileCardList.size()-1).getProfile_id();
        jsonObject.put("profile_id", profile_id);
        jsonObject.remove("cid");
        jsonObject.put("cid", "failCid");
        return new Object[]{new Object[]{jsonObject}};
    }

    public static Object[] provideEmptyCid() throws Exception {
        profileListClass = new ProfileClass();
        List<ProfileCard> profileCardList = profileListClass.getProfileList();
        JSONObject jsonObject = GenerateCidCkeyContent.getJsonObjectCidCkey();
        int profile_id = profileCardList.get(profileCardList.size()-1).getProfile_id();
        jsonObject.put("profile_id", profile_id);
        jsonObject.remove("cid");
        jsonObject.put("cid", null);
        return new Object[]{new Object[]{jsonObject}};
    }
}

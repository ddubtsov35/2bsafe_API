package com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Childrens.Models.ProfileCard;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileClass;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.AddAndSelectChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep1Class;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep2Class;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.ForProvideData;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateCidCkeyContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.Models.IntervalBlock;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by user on 11.09.17.
 */
public class GenerateSelectChildrenCardContent {
    public static AuthorisationChildClass authorisationChildClass;


    public GenerateSelectChildrenCardContent() throws IOException {
    }

    public static JSONObject getGenerateSelectChildrenCardContent() throws Exception {
        JSONObject jsonObject = GenerateCidCkeyContent.getJsonObjectCidCkey();
        JSONObject jsonObject1 = GenerateProfileIdContent.getProfileId();
        if(jsonObject1.size()>1) {
            jsonObject = jsonObject1;
        } else{
            jsonObject.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        }
        return jsonObject;
    }

    public static Object[] provideFailProfileId() throws Exception {
        ForProvideData.getTestData();

        JSONObject jsonObject = GenerateCidCkeyContent.getJsonObjectCidCkey();
        Random random = new Random();
        jsonObject.put("profile_id", random.nextInt(1000000 - 1 + 1) + 1);
        return new Object[]{new Object[]{jsonObject}};
    }

    public static Object[] provideEmptyProfileId() throws Exception {
        ForProvideData.getTestData();

        JSONObject jsonObject = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObject.put("profile_id", null);
        return new Object[]{new Object[]{jsonObject}};
    }

    public static Object[] provideEmptyCkey() throws Exception {
        ForProvideData.getTestData();

        JSONObject jsonObject = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObject.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        jsonObject.remove("ckey");
        jsonObject.put("ckey", null);
        return new Object[]{new Object[]{jsonObject}};
    }

    public static Object[] provideFailCkey() throws Exception {
        ForProvideData.getTestData();

        JSONObject jsonObject = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObject.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        jsonObject.remove("ckey");
        jsonObject.put("ckey", "failCkey");
        return new Object[]{new Object[]{jsonObject}};
    }

    public static Object[] provideFailCid() throws Exception {
        ForProvideData.getTestData();

        JSONObject jsonObject = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObject.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        jsonObject.remove("cid");
        jsonObject.put("cid", "failCid");
        return new Object[]{new Object[]{jsonObject}};
    }

    public static Object[] provideEmptyCid() throws Exception {
        ForProvideData.getTestData();

        JSONObject jsonObject = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObject.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        jsonObject.remove("cid");
        jsonObject.put("cid", null);
        return new Object[]{new Object[]{jsonObject}};
    }
}

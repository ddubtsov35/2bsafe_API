package com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent;

import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.BaseContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateCidCkeyContent;
import com.dubtsov._2bsafe.Parents.Pool.CidCkeyPool;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 11.09.17.
 */
public class GenerateSelectChildrenCardContent {

    private static ChildrenResponseAuthorisationModel childrenResponseAuthorisationModel;
    private static ProfileClass profileListClass;

    public static JSONObject getGenerateSelectChildrenCardContent() throws Exception {
        profileListClass = new ProfileClass();
        JSONObject jsonObject = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObject.put("profile_id", profileListClass.getProfileList().get(0).getProfile_id());

        return jsonObject;
    }
}

package com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent;

import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.BaseContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateCidCkeyContent;
import com.dubtsov._2bsafe.Parents.Pool.ChildrenCardPool;
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
        JSONObject jsonObject = new JSONObject();
        if(CidCkeyPool.getCidFromFile() == null) {
            jsonObject.put("cid", GenerateCidCkeyContent.jsonObjectCidCkey.get("cid"));
            jsonObject.put("ckey", GenerateCidCkeyContent.jsonObjectCidCkey.get("ckey"));
        } else{
            jsonObject.put("cid", CidCkeyPool.getCidFromFile().get("cid"));
            jsonObject.put("ckey", CidCkeyPool.getCidFromFile().get("ckey"));
        }

        if(profileListClass.getProfileList().size() != 0) {
            jsonObject.put("profile_id", profileListClass.getProfileList().get(0).getProfile_id());
        } else {
            jsonObject = (JSONObject) ChildrenCardPool.getChildrenCardFromFile().get("data");
            jsonObject.put("profile_id", jsonObject.get("profile_id"));
        }
        return jsonObject;
    }
}

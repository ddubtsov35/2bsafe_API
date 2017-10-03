package com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateCidCkeyContent;
import org.json.simple.JSONObject;

/**
 * Created by user on 11.09.17.
 */
public class GenerateGetProfileListContent {
    private static ChildrenResponseAuthorisationModel childrenResponseAuthorisationModel;
    private static ProfileClass profileListClass;
    private static AuthorisationChildClass authorisationChildClass;
    private static JSONObject jsonObj;

    public static JSONObject getProfileListContent() throws Exception {
        profileListClass = new ProfileClass();
        jsonObj = new JSONObject();
        if(GenerateCidCkeyContent.jsonObjectCidCkey != null) {
            //GenerateCidCkeyContent.getJsonObjectCidCkey();
            jsonObj.put("cid", GenerateCidCkeyContent.jsonObjectCidCkey.get("cid"));
            jsonObj.put("ckey", GenerateCidCkeyContent.jsonObjectCidCkey.get("ckey"));
            return jsonObj;
        } else{
            authorisationChildClass.authorisationChildren();
            //GenerateCidCkeyContent.getJsonObjectCidCkey();
            jsonObj.put("cid", GenerateCidCkeyContent.jsonObjectCidCkey.get("cid"));
            jsonObj.put("ckey", GenerateCidCkeyContent.jsonObjectCidCkey.get("ckey"));
            return jsonObj;
        }
    }

}

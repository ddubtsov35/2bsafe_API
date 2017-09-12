package com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent;

import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.BaseContent;
import org.json.simple.JSONObject;

import java.io.IOException;

/**
 * Created by user on 11.09.17.
 */
public class GenerateGetProfileListContent extends BaseContent {
    private static ChildrenResponseAuthorisationModel childrenResponseAuthorisationModel;
    private static ProfileClass profileListClass;

    public static JSONObject getProfileListContent() throws IOException {
        childrenResponseAuthorisationModel = new ChildrenResponseAuthorisationModel();
        profileListClass = new ProfileClass();

        jsonObj.put("cid",childrenResponseAuthorisationModel.getCid());
        jsonObj.put("ckey",childrenResponseAuthorisationModel.getCkey());
        return jsonObj;
    }

}

package com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent;

import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.ChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Models.AddChildrenCard;
import com.dubtsov._2bsafe.Parents.Models.ChildrenCard;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 08.09.17.
 */
public class GenerateProfileIdContent extends BaseContent{

    public GenerateProfileIdContent() throws ParseException {}

    public static JSONObject getProfileId() throws Exception {
        ChildrenCardClass addChildrenCardClass = new ChildrenCardClass();
        jsonObj.put("profile_id", addChildrenCardClass.addChildrenCard().getProfile_id());
        return jsonObj;
    }
}

package com.dubtsov._2bsafe.Parents.Functions.Coordinates;

import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.ChildrenCardClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.BaseContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 11.09.17.
 */
public class GenerateGpsPositionContent {

    private static ChildrenCardClass childrenCardClass;
    private static JSONObject jsonObj = new JSONObject();

    public GenerateGpsPositionContent() throws ParseException {}

    public static JSONObject getGpsPositionContent() throws Exception {
        childrenCardClass = new ChildrenCardClass();
        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        jsonObj.put("rnd", GenerateTokenClass.getGeneratedToken());
        return jsonObj;
    }
}

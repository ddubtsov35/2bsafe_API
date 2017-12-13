package com.dubtsov._2bsafe.Parents.Functions.Coordinates;

import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.ChildrenCardClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 11.09.17.
 */
public class GenerateGpsPositionContent {

    private static ChildrenCardClass childrenCardClass;

    public GenerateGpsPositionContent() throws ParseException {}

    public static JSONObject getGpsPositionContent() throws Exception {
        childrenCardClass = new ChildrenCardClass();
        JSONObject jsonObj = new JSONObject();
        //if(GenerateProfileIdContent.profileId == null){
        jsonObj  = GenerateProfileIdContent.getProfileId();
        jsonObj.put("profile_id", jsonObj.get("profile_id"));
        /*} else{
            jsonObj.put("profile_id", GenerateProfileIdContent.profileId);
        }*/
        return jsonObj;
    }
}

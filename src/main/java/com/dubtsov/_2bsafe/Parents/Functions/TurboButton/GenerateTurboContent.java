package com.dubtsov._2bsafe.Parents.Functions.TurboButton;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.BaseContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import org.json.simple.JSONObject;

/**
 * Created by user on 12.09.17.
 */
public class GenerateTurboContent extends BaseContent{

    public static JSONObject getTurboContent() throws Exception {
        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId());
        return jsonObj;
    }

    public static JSONObject setTurboContent() throws Exception {
        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId());
        jsonObj.put("turbo", 999);
        return jsonObj;
    }

}

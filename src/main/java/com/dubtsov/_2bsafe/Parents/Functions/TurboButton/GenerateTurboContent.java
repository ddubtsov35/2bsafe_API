package com.dubtsov._2bsafe.Parents.Functions.TurboButton;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import org.json.simple.JSONObject;

import java.util.Random;

/**
 * Created by user on 12.09.17.
 */
public class GenerateTurboContent{

    private static JSONObject jsonObj;
    public static int turboStatic;

    public static JSONObject getTurboContent() throws Exception {
        jsonObj = new JSONObject();
        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        return jsonObj;
    }

    public static JSONObject setTurboContent() throws Exception {
        jsonObj = new JSONObject();
        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        jsonObj.put("turbo", setTurboStatic());
        return jsonObj;
    }

    private static int setTurboStatic(){
        Random random = new Random();
        turboStatic = random.nextInt((90 - 0) + 1) + 0;
        return turboStatic;
    }

}

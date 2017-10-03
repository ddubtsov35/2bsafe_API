package com.dubtsov._2bsafe.Parents.Functions.Authorisation;

import com.dubtsov._2bsafe.Parents.Functions.PasswordChange.GeneratePasswordChangeContent;
import com.dubtsov._2bsafe.Parents.Functions.Registration.GenerateRegistrationContent;
import com.dubtsov._2bsafe.Parents.Pool.UserPool;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 12.09.17.
 */
public class GenerateAuthContent{

    private static JSONObject jsonObj;


    public static JSONObject preparationContent(JSONObject jsonObject){
        jsonObj = new JSONObject();
        if(jsonObject.containsKey("em")) {
            Object obj = jsonObject.remove("em");
            jsonObject.remove("em");
            jsonObject.put("login", obj);
        }
        return jsonObject;
    }


    public static JSONObject getAuthContent() throws IOException, ParseException {
        jsonObj = new JSONObject();
        if(UserPool.getUserFromFile() != null) {
            jsonObj = UserPool.getUserFromFile();
            jsonObj = preparationContent(jsonObj);
        } else {
            jsonObj.put("login", GenerateRegistrationContent.getRegistrationStep1Content.get("em"));
            jsonObj.put("pwd", GenerateRegistrationContent.getRegistrationStep1Content.get("pwd"));
        }
        jsonObj.put("dtype", 0);
        return jsonObj;
    }

    public static JSONObject getAuthContentWithNewPassword() throws Exception {
        jsonObj = new JSONObject();
        if(UserPool.getUserFromFile() != null) {
            jsonObj = UserPool.getUserFromFile();
            jsonObj = preparationContent(jsonObj);
        } else {
            jsonObj.put("login", GenerateRegistrationContent.getRegistrationStep1Content.get("em"));
            jsonObj.put("pwd", GeneratePasswordChangeContent.getPasswordChangeContent().get("npwd"));
        }
        jsonObj.put("dtype", 0);
        return jsonObj;
    }

}

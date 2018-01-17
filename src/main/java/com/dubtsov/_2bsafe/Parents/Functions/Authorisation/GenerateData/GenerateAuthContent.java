package com.dubtsov._2bsafe.Parents.Functions.Authorisation.GenerateData;

import com.dubtsov._2bsafe.Parents.Functions.PasswordChange.GeneratePasswordChangeContent;
import com.dubtsov._2bsafe.Parents.Functions.Registration.GenerateRegistrationContent;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep1Class;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep2Class;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.ForProvideData;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Pool.LogPools;
import com.dubtsov._2bsafe.Parents.Pool.UserPool;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Random;

/**
 * Created by user on 12.09.17.
 */
public class GenerateAuthContent{

    public static JSONObject preparationContent(JSONObject jsonObject){
        if(jsonObject.containsKey("em")) {
            Object obj = jsonObject.remove("em");
            jsonObject.remove("em");
            jsonObject.put("login", obj);
        }
        return jsonObject;
    }

    public static JSONObject getAuthContent() throws IOException, ParseException, java.text.ParseException {
        JSONObject jsonObj = new JSONObject();
        if(UserPool.getUserFromFile() != null) {
            jsonObj = UserPool.getUserFromFile();
            jsonObj = preparationContent(jsonObj);
        } else {
            jsonObj.put("login", GenerateRegistrationContent.getRegStep1Content().get("em"));
            jsonObj.put("pwd", GenerateRegistrationContent.getRegStep1Content().get("pwd"));
        }
        jsonObj.put("dtype", 0);
        return jsonObj;
    }

    public static JSONObject getAuthContentWithNewPassword() throws Exception {
        JSONObject jsonObj = new JSONObject();
        if(UserPool.getUserFromFile() != null) {
            jsonObj = UserPool.getUserFromFile();
            jsonObj = preparationContent(jsonObj);
        } else {
            jsonObj.put("login", GenerateRegistrationContent.getRegStep1Content().get("em"));
            jsonObj.put("pwd", GeneratePasswordChangeContent.getPasswordChangeContent().get("npwd"));
        }
        jsonObj.put("dtype", 0);
        return jsonObj;
    }

}

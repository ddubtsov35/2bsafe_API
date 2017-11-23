package com.dubtsov._2bsafe.Parents.Functions.PasswordChange;

import com.dubtsov._2bsafe.Parents.Functions.Registration.GenerateRegistrationContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Pool.UserPool;
import org.json.simple.JSONObject;

/**
 * Created by user on 12.09.17.
 */
public class GeneratePasswordChangeContent{

    private static JSONObject jsonObj = new JSONObject();

    public static JSONObject getPasswordChangeContent() throws Exception {
        if(UserPool.getUserFromFile() == null) {
            jsonObj.put("pwd", GenerateRegistrationContent.getRegistrationStep1Content.get("pwd"));
            jsonObj.put("npwd", new StringBuilder((String) GenerateRegistrationContent.getRegistrationStep1Content.get("pwd")).reverse().toString());
        } else {
            jsonObj.put("pwd", UserPool.getUserFromFile().get("pwd"));
            jsonObj.put("npwd", new StringBuilder((String) UserPool.getUserFromFile().get("pwd")).reverse().toString());
        }
        return jsonObj;
    }
}
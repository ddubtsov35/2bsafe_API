package com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers;

import com.dubtsov._2bsafe.Parents.Functions.Registration.GenerateRegistrationContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Pool.UserPool;
import org.json.simple.JSONObject;

/**
 * Created by user on 12.09.17.
 */
public class GenerateRegisteredUsersContent{

    private static JSONObject jsonObj;

    public static JSONObject deleteAccountContent() throws Exception {
        jsonObj = new JSONObject();
        if(UserPool.getUserFromFile() == null) {
            jsonObj.put("pwd", GenerateRegistrationContent.getRegistrationStep1Content.get("pwd"));
        } else{
            jsonObj.put("pwd", UserPool.getUserFromFile().get("pwd"));
        }
        jsonObj.put("rnd", GenerateTokenClass.getGeneratedToken());
        return jsonObj;
    }

    public static JSONObject getHeadersString() throws Exception {
        jsonObj = new JSONObject();
        jsonObj.put("em", "111@ru.ru");
        jsonObj.put("pwd", "3,14plsvtijr");
        return jsonObj;
    }

    public static JSONObject getListRegisteredContent() throws Exception {
        jsonObj = new JSONObject();
        jsonObj.put("sortt", 0);
        jsonObj.put("sortf", 0);
        return jsonObj;
    }

}
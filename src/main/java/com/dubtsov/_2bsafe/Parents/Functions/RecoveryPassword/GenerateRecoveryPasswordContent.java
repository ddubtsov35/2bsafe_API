package com.dubtsov._2bsafe.Parents.Functions.RecoveryPassword;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.InputClass;
import com.dubtsov._2bsafe.Parents.Functions.Registration.GenerateRegistrationContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.BaseContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.Pool.UserPool;
import org.json.simple.JSONObject;

/**
 * Created by user on 12.09.17.
 */
public class GenerateRecoveryPasswordContent{

    private static JSONObject jsonObj = new JSONObject();

    public static JSONObject startRecoveryPasswordContent() throws Exception {
        if(UserPool.getUserFromFile() == null) {
            jsonObj.put("login", GenerateRegistrationContent.getRegistrationStep1Content.get("em"));
        } else{
            jsonObj.put("login", UserPool.getUserFromFile().get("em"));
        }
        return jsonObj;
    }

    public static JSONObject confirmRecoveryPasswordContent() throws Exception {
        InputClass inputClass = new InputClass();
        if(UserPool.getUserFromFile() == null) {
            jsonObj.put("login", GenerateRegistrationContent.getRegistrationStep1Content.get("em"));
            int code = inputClass.code(GenerateRegistrationContent.getRegistrationStep1Content.get("em").toString());
            jsonObj.put("code", code);
        } else{
            jsonObj.put("login", UserPool.getUserFromFile().get("em"));
            int code = inputClass.code(UserPool.getUserFromFile().get("em").toString());
            jsonObj.put("code", code);
        }

        return jsonObj;
    }

}

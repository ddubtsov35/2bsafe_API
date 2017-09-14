package com.dubtsov._2bsafe.Parents.Functions.RecoveryPassword;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.InputClass;
import com.dubtsov._2bsafe.Parents.Functions.Registration.GenerateRegistrationContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.BaseContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import org.json.simple.JSONObject;

/**
 * Created by user on 12.09.17.
 */
public class GenerateRecoveryPasswordContent extends BaseContent{

    public static JSONObject startRecoveryPasswordContent() throws Exception {
        jsonObj.put("login", GenerateRegistrationContent.getRegistrationStep1Content.get("em"));
        return jsonObj;
    }

    public static JSONObject confirmRecoveryPasswordContent() throws Exception {
        InputClass inputClass = new InputClass();
        jsonObj.put("login", GenerateRegistrationContent.getRegistrationStep1Content.get("em"));
        int code = inputClass.code(GenerateRegistrationContent.getRegistrationStep1Content.get("em").toString());
        jsonObj.put("code", code);
        return jsonObj;
    }

}

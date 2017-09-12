package com.dubtsov._2bsafe.Parents.Functions.PasswordChange;

import com.dubtsov._2bsafe.Parents.Functions.IntervalUpdate.GetIntervalUpdateClass;
import com.dubtsov._2bsafe.Parents.Functions.Registration.GenerateRegistrationContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.BaseContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import org.json.simple.JSONObject;

/**
 * Created by user on 12.09.17.
 */
public class GeneratePasswordChangeContent extends BaseContent{

    public static JSONObject getPasswordChangeContent() throws Exception {
        jsonObj.put("pwd", GenerateRegistrationContent.getRegistrationStep1Content().get("pwd"));
        jsonObj.put("npwd", new StringBuilder((String) GenerateRegistrationContent.getRegistrationStep1Content().get("pwd")).reverse().toString());
        jsonObj.put("rnd", GenerateTokenClass.getGeneratedToken());
        return jsonObj;
    }

}

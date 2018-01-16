package com.dubtsov._2bsafe.Parents.Functions.Registration;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.Pool.*;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 17.07.17.
 */
public class RegistrationUserStep2Class extends BaseClass {

    public RegistrationUserStep2Class() throws IOException, ParseException, java.text.ParseException {}

    public JSONObject registrationUserStep2Web() throws Exception {
        JSONObject jsonObject = UserPool.getUserFromFile();
        if(jsonObject == null) {
            jsonObject = GenerateRegistrationContent.getRegistrationStep2ContentWeb();
            responseClass = new ResponseClass(lkApi + "/accounts/v1.0/reg/step2", jsonObject);
            response = responseClass.getJsonResponse();

            if(response.code() == 200) {
                UserPool.setUserFromFile(GenerateRegistrationContent.getRegStep1Content());
            }
            LogPools.getLog();
            return jsonObject;
        } else {
            LogPools.getLog();
            return jsonObject;
        }
    }

    public JSONObject registrationUserStep2AndroidPhone() throws Exception {
        JSONObject jsonObject = UserPool.getUserFromFile();
        if (jsonObject == null) {
            jsonObject = GenerateRegistrationContent.getRegistrationStep2ContentAndroid();
            responseClass = new ResponseClass(lkApi + "/accounts/v1.0/reg/step2", jsonObject);
            response = responseClass.getJsonResponse();
            String getLkid = response.body().string();
            jsonObject.put("lkid", getLkid.substring(getLkid.indexOf("lkid"), getLkid.indexOf("lkid", getLkid.indexOf("\""))));

            if (response.code() == 200) {
                UserPool.setUserFromFile(GenerateRegistrationContent.getRegStep1Content());
            }

            return jsonObject;
        } else {
            return jsonObject;
        }
    }

}

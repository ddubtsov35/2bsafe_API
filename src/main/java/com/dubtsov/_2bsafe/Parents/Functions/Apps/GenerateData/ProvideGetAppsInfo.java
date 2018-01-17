package com.dubtsov._2bsafe.Parents.Functions.Apps.GenerateData;

import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep1Class;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep2Class;
import org.json.simple.JSONObject;

import java.util.Random;

/**
 * Created by user on 17.01.18.
 */
public class ProvideGetAppsInfo {

    public static Object[] provideNegativeGetAppsInfoContent2() throws Exception {
        RegistrationUserStep1Class registrationUserStep1Class = new RegistrationUserStep1Class();
        registrationUserStep1Class.registrationUserStep1();
        RegistrationUserStep2Class registrationUserStep2Class = new RegistrationUserStep2Class();
        registrationUserStep2Class.registrationUserStep2Web();
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("profile_id", jsonObj.get("profile_id"));
        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("profile_id", null);

        JSONObject jsonObj3 = new JSONObject();

        JSONObject jsonObj4 = new JSONObject();
        Random random = new Random();
        jsonObj4.put("profile_id", random.nextInt(1000000 - 1 + 1)+1);

        JSONObject jsonObj5 = new JSONObject();
        jsonObj5.put("profile_id", null);


        return new Object[]{jsonObj, jsonObj2, jsonObj3, jsonObj4, jsonObj5};
    }

}

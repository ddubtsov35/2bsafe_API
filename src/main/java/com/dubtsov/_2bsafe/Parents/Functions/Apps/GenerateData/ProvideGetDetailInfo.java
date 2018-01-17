package com.dubtsov._2bsafe.Parents.Functions.Apps.GenerateData;

import com.dubtsov._2bsafe.Childrens.NotifyChangeApp.NotifyChangeAppClass;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep1Class;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep2Class;
import org.json.simple.JSONObject;

import java.util.Random;

/**
 * Created by user on 17.01.18.
 */
public class ProvideGetDetailInfo {

    private static String alias;

    private static String getAlias() throws Exception {
        NotifyChangeAppClass notifyChangeAppClass = new NotifyChangeAppClass();
        notifyChangeAppClass.notifyChangeApp();
        alias = "com.google.android.youtube";
        return alias;
    }

    public static Object[] provideNegativeGetDetailInfoContent() throws Exception {
        RegistrationUserStep1Class registrationUserStep1Class = new RegistrationUserStep1Class();
        registrationUserStep1Class.registrationUserStep1();
        RegistrationUserStep2Class registrationUserStep2Class = new RegistrationUserStep2Class();
        registrationUserStep2Class.registrationUserStep2Web();

        JSONObject jsonObj = new JSONObject();
        jsonObj.put("profile_id", jsonObj.get("profile_id"));
        jsonObj.put("alias",null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("profile_id", null);
        jsonObj2.put("alias",getAlias());

        JSONObject jsonObj3 = new JSONObject();

        JSONObject jsonObj4 = new JSONObject();
        Random random = new Random();
        jsonObj4.put("profile_id", random.nextInt(1000000 - 1 + 1)+1);
        jsonObj4.put("alias", getAlias());

        JSONObject jsonObj5 = new JSONObject();
        jsonObj5.put("profile_id", null);
        jsonObj5.put("alias",null);

        JSONObject jsonObj6 = new JSONObject();
        jsonObj6.put("profile_id", jsonObj.get("profile_id"));
        jsonObj6.put("alias", random.nextInt(1000000 - 1 + 1)+1);


        return new Object[]{jsonObj, jsonObj2, jsonObj3, jsonObj4, jsonObj5, jsonObj6};
    }

}

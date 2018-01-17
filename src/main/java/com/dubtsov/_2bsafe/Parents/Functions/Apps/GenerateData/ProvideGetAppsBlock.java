package com.dubtsov._2bsafe.Parents.Functions.Apps.GenerateData;

import com.dubtsov._2bsafe.Childrens.NotifyChangeApp.NotifyChangeAppClass;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep1Class;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep2Class;
import org.json.simple.JSONObject;

import java.util.Random;

/**
 * Created by user on 17.01.18.
 */
public class ProvideGetAppsBlock {

    private static String alias;

    private static String getAlias() throws Exception {
        new NotifyChangeAppClass().notifyChangeApp();
        alias = "com.google.android.youtube";
        return alias;
    }

    public static Object[] provideNegativeGetAppsBlockContent() throws Exception {
        new RegistrationUserStep1Class().registrationUserStep1();
        new RegistrationUserStep2Class().registrationUserStep2Web();

        JSONObject jsonObj = new JSONObject();
        jsonObj.put("profile_id", null);
        jsonObj.put("alias",null);
        jsonObj.put("block", null);

        JSONObject jsonObj2 = new JSONObject();
        Random random = new Random();
        jsonObj2.put("profile_id", jsonObj.get("profile_id"));
        jsonObj2.put("alias",null);
        jsonObj2.put("block", random.nextInt(1000000 - 1 + 1)+1);

        JSONObject jsonObj3 = new JSONObject();
        jsonObj3.put("profile_id", jsonObj.get("profile_id"));
        jsonObj3.put("block", 0);

        JSONObject jsonObj4 = new JSONObject();
        jsonObj4.put("profile_id", random.nextInt(1000000 - 1 + 1)+1);
        jsonObj4.put("alias",getAlias());
        jsonObj4.put("block", random.nextInt(1000000 - 1 + 1)+1);

        JSONObject jsonObj5 = new JSONObject();
        jsonObj5.put("profile_id", random.nextInt(1000000 - 1 + 1)+1);
        jsonObj5.put("alias",null);
        jsonObj5.put("block", random.nextInt(1000000 - 1 + 1)+1);

        JSONObject jsonObj6 = new JSONObject();
        jsonObj6.put("profile_id", random.nextInt(1000000 - 1 + 1)+1);
        jsonObj6.put("block", random.nextInt(1000000 - 1 + 1)+1);

        JSONObject jsonObj7 = new JSONObject();
        jsonObj7.put("profile_id", null);
        jsonObj7.put("alias",getAlias());
        jsonObj7.put("block", 1);

        JSONObject jsonObj8 = new JSONObject();
        jsonObj8.put("profile_id", null);
        jsonObj8.put("alias",null);
        jsonObj8.put("block", random.nextInt(1000000 - 1 + 1)+1);

        JSONObject jsonObj9 = new JSONObject();
        jsonObj9.put("profile_id", null);
        jsonObj9.put("block", 1);

        JSONObject jsonObj10 = new JSONObject();
        jsonObj10.put("alias",getAlias());
        jsonObj10.put("block", random.nextInt(1000000 - 1 + 1)+1);

        JSONObject jsonObj11 = new JSONObject();
        jsonObj11.put("alias",null);
        jsonObj11.put("block", 0);

        JSONObject jsonObj12 = new JSONObject();
        jsonObj12.put("block", random.nextInt(1000000 - 1 + 1)+1);


        return new Object[]{jsonObj, jsonObj2, jsonObj3, jsonObj4, jsonObj5, jsonObj6, jsonObj7, jsonObj8, jsonObj9, jsonObj10, jsonObj11, jsonObj12};
    }

}

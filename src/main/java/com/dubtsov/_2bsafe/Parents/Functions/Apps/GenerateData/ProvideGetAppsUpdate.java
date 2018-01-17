package com.dubtsov._2bsafe.Parents.Functions.Apps.GenerateData;

import com.dubtsov._2bsafe.Childrens.NotifyChangeApp.NotifyChangeAppClass;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep1Class;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep2Class;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.Random;

/**
 * Created by user on 17.01.18.
 */
public class ProvideGetAppsUpdate {

    private static String alias;

    private static String getAlias() throws Exception {
        new NotifyChangeAppClass().notifyChangeApp();
        alias = "com.google.android.youtube";
        return alias;
    }

    public static Object[] provideNegativeGetAppsUpdateContent() throws Exception {
        new RegistrationUserStep1Class().registrationUserStep1();
        new RegistrationUserStep2Class().registrationUserStep2Web();

        JSONObject jsonObj = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        jsonObj.put("profile_id", jsonObj.get("profile_id"));
        jsonArray.add(null);
        jsonObj.put("aliases",jsonArray);

        JSONObject jsonObj2 = new JSONObject();
        JSONArray jsonArray2 = new JSONArray();
        jsonObj2.put("profile_id", null);
        jsonArray.add(null);
        jsonObj2.put("aliases",jsonArray2);

        JSONObject jsonObj3 = new JSONObject();

        JSONObject jsonObj4 = new JSONObject();
        JSONArray jsonArray4 = new JSONArray();
        Random random = new Random();
        jsonObj4.put("profile_id", random.nextInt(1000000 - 1 + 1)+1);
        jsonArray4.add(getAlias());
        jsonObj4.put("aliases",jsonArray4);

        JSONObject jsonObj5 = new JSONObject();
        JSONArray jsonArray5 = new JSONArray();
        jsonObj5.put("profile_id", null);
        jsonArray5.add(null);
        jsonObj5.put("aliases",jsonArray5);


        return new Object[]{jsonObj, jsonObj2, jsonObj3, jsonObj4, jsonObj5};
    }

}

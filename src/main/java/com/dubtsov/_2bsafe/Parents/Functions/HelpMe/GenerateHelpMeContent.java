package com.dubtsov._2bsafe.Parents.Functions.HelpMe;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Created by user on 31.08.17.
 */
public class GenerateHelpMeContent{

    private static JSONObject jsonObj;
    private static JSONObject jsonObj2 = new JSONObject();
    private static JSONArray jsonArray = new JSONArray();

    public static  JSONObject getHelpMe() throws Exception {
        jsonObj = new JSONObject();
        AuthorisationChildClass authorisationChildClass = new AuthorisationChildClass();
        jsonObj.put("cid", authorisationChildClass.authorisationChildren().getCid());
        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        return jsonObj;
    }

    public static JSONObject setHelpMe() throws Exception {
        jsonObj = new JSONObject();
        AuthorisationChildClass authorisationChildClass = new AuthorisationChildClass();
        jsonObj.put("cid", authorisationChildClass.authorisationChildren().getCid());
        jsonObj.put("state", 0);
        jsonObj.put("push", 0);
        jsonObj.put("phone", "+79111111111");
        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));

        jsonObj.put("sms",jsonArray);
        jsonObj2.put("default", true);
        jsonObj2.put("phone", "+792222222222");
        jsonArray.add(jsonObj2);

        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }


}

package com.dubtsov._2bsafe.Parents.Functions.HelpMe;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Random;

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
        if(GenerateProfileIdContent.profileId == null){
            jsonObj  = GenerateProfileIdContent.getProfileId();
            jsonObj.put("profile_id", jsonObj.get("profile_id"));
        } else{
            jsonObj.put("profile_id", GenerateProfileIdContent.profileId);
        }
        return jsonObj;
    }
    public static Object[] provideGetHelpMe() throws Exception {
        Random random = new Random();
        AuthorisationChildClass authorisationChildClass = new AuthorisationChildClass();

        jsonObj = new JSONObject();
        jsonObj.put("cid", null);
        jsonObj.put("profile_id", null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("cid", authorisationChildClass.authorisationChildren().getCid());
        jsonObj2.put("profile_id", null);

        JSONObject jsonObj3 = new JSONObject();
        if(GenerateProfileIdContent.profileId == null){
            jsonObj  = GenerateProfileIdContent.getProfileId();
            jsonObj.put("profile_id", jsonObj.get("profile_id"));
        } else{
            jsonObj.put("profile_id", GenerateProfileIdContent.profileId);
        }

        JSONObject jsonObj4 = new JSONObject();
        jsonObj4.put("cid", authorisationChildClass.authorisationChildren().getCid());

        JSONObject jsonObj5 = new JSONObject();

        JSONObject jsonObj6 = new JSONObject();
        jsonObj6.put("cid", authorisationChildClass.authorisationChildren().getCid());
        jsonObj6.put("profile_id", random.nextInt(1000000 -1 +1) +1);

        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3},
                new JSONObject[]{jsonObj4},
                new JSONObject[]{jsonObj5},
                new JSONObject[]{jsonObj6}
        };
    }





    public static JSONObject setHelpMe() throws Exception {
        jsonObj = new JSONObject();
        AuthorisationChildClass authorisationChildClass = new AuthorisationChildClass();
        if(GenerateProfileIdContent.profileId == null){
            jsonObj  = GenerateProfileIdContent.getProfileId();
            jsonObj.put("profile_id", jsonObj.get("profile_id"));
        } else{
            jsonObj.put("profile_id", GenerateProfileIdContent.profileId);
        }
        jsonObj.put("cid", authorisationChildClass.authorisationChildren().getCid());
        jsonObj.put("state", 0);
        jsonObj.put("push", 0);
        jsonObj.put("phone", "+79111111111");
        jsonObj.put("sms",jsonArray);
        jsonObj2.put("default", true);
        jsonObj2.put("phone", "+792222222222");
        jsonArray.add(jsonObj2);

        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }
    public static Object[] provideSetHelpMe() throws Exception {
        AuthorisationChildClass authorisationChildClass = new AuthorisationChildClass();
        Random random = new Random();

        jsonObj = new JSONObject();
        jsonObj.put("cid", null);
        jsonObj.put("state", null);
        jsonObj.put("push", null);
        jsonObj.put("phone", null);
        jsonObj.put("profile_id", null);
        jsonObj.put("sms",null);
        jsonObj2.put("default", null);
        jsonObj2.put("phone", null);
        jsonArray.add(jsonObj2);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj.put("cid", "fakeCid");
        jsonObj.put("state", "fakeState");
        jsonObj.put("push", "fakePush");
        jsonObj.put("phone", "fakePh");
        jsonObj.put("profile_id", "fakeProfile_id");
        jsonObj.put("sms","fakeSms");
        jsonObj2.put("default", "fakeDefault");
        jsonObj2.put("phone", "fakePrh");
        jsonArray.add(jsonObj2);

        JSONObject jsonObj3 = new JSONObject();

        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3}
        };
    }


}

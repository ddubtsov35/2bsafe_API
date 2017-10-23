package com.dubtsov._2bsafe.Parents.Functions.TurboButton;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Random;

/**
 * Created by user on 12.09.17.
 */
public class GenerateTurboContent{

    private static JSONObject jsonObj;
    public static Integer turboStatic;

    public static JSONObject getTurboContent() throws Exception {
        jsonObj = new JSONObject();
        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        return jsonObj;
    }
    public static Object[] provideNegativeGetTurboContent() throws IOException, ParseException {
        jsonObj = new JSONObject();
        Random random = new Random();
        jsonObj.put("profile_id", null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("profile_id", random.nextInt(1000000 -1 +1 ) + 1);

        JSONObject jsonObj3 = new JSONObject();

        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3}
        };
    }




    public static JSONObject setTurboContent() throws Exception {
        jsonObj = new JSONObject();
        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        jsonObj.put("turbo", setTurboStatic());
        return jsonObj;
    }
    public static Object[] provideSetTurboContent() throws Exception {
        AuthorisationUserClass authorisationUserClass = new AuthorisationUserClass();
        authorisationUserClass.authorisationUser();
        jsonObj = new JSONObject();
        Random random = new Random();
        jsonObj.put("profile_id", null);
        jsonObj.put("turbo", null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        jsonObj2.put("turbo", null);

        JSONObject jsonObj3 = new JSONObject();
        jsonObj3.put("turbo", setTurboStatic());

        JSONObject jsonObj4 = new JSONObject();
        jsonObj4.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));

        JSONObject jsonObj5 = new JSONObject();

        JSONObject jsonObj6 = new JSONObject();
        jsonObj6.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        jsonObj6.put("turbo", random.nextInt(1000000 -1 +1 ) + 1);

        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3},
                new JSONObject[]{jsonObj4},
                new JSONObject[]{jsonObj5},
                new JSONObject[]{jsonObj6}
        };
    }



    private static Integer setTurboStatic(){
        Random random = new Random();
        turboStatic = random.nextInt((90 - 0) + 1) + 0;
        return turboStatic;
    }

}

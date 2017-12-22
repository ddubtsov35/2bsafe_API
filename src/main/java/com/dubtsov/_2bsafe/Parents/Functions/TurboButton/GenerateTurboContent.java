package com.dubtsov._2bsafe.Parents.Functions.TurboButton;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep1Class;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep2Class;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.ForProvideData;
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

    public static Integer turboStatic;

    public static JSONObject getTurboContent() throws Exception {
        JSONObject jsonObj = new JSONObject();
        if(GenerateProfileIdContent.profileId == null){
            jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        } else{
            jsonObj.put("profile_id", GenerateProfileIdContent.profileId);
        }
        return jsonObj;
    }
    public static Object[] provideNegativeGetTurboContent() throws IOException, ParseException {
        JSONObject jsonObj = new JSONObject();
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
        JSONObject jsonObj = new JSONObject();
        if(GenerateProfileIdContent.profileId == null){
            jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        } else{
            jsonObj.put("profile_id", GenerateProfileIdContent.profileId);
        }
        jsonObj.put("turbo", setTurboStatic());
        return jsonObj;
    }
    public static Object[] provideSetTurboContent() throws Exception {
        ForProvideData.getTestData();

        JSONObject jsonObj = new JSONObject();
        Random random = new Random();
        jsonObj.put("profile_id", null);
        jsonObj.put("turbo", null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("turbo", null);

        JSONObject jsonObj3 = new JSONObject();
        jsonObj3.put("turbo", setTurboStatic());

        JSONObject jsonObj4 = new JSONObject();

        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3},
                new JSONObject[]{jsonObj4}
        };
    }



    private static Integer setTurboStatic(){
        Random random = new Random();
        turboStatic = random.nextInt((90 - 0) + 1) + 0;
        return turboStatic;
    }

}

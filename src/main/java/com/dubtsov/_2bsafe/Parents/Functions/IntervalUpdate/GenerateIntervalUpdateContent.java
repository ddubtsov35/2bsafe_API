package com.dubtsov._2bsafe.Parents.Functions.IntervalUpdate;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent.GenerateSelectChildrenCardContent;
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
public class GenerateIntervalUpdateContent {

    public static Integer itoRandom;

    public static JSONObject setIntervalUpdateContent() throws Exception {
        JSONObject jsonObj = new JSONObject();
        Random random = new Random();
        GetIntervalUpdateClass getIntervalUpdateClass = new GetIntervalUpdateClass();
        if(getIntervalUpdateClass.getIntervalUpdateResponse() != null) {
            itoRandom = random.nextInt((90 - 0) + 1) + 0;
            jsonObj.put("ito", itoRandom);
            if(GenerateProfileIdContent.profileId == null){
                jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
            } else{
                jsonObj.put("profile_id", GenerateProfileIdContent.profileId);
            }
        }
        return jsonObj;
    }

    public static Object[] provideNegativeGetAppsInfoContent1() throws Exception {


        Random random = new Random();

        JSONObject jsonObj = new JSONObject();
        if(GenerateProfileIdContent.profileId == null){
            jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        } else{
            jsonObj.put("profile_id", GenerateProfileIdContent.profileId);
        }
        jsonObj.put("ito",null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("profile_id", null);
        jsonObj2.put("ito", random.nextInt((90 - 0) + 1) + 0);

        JSONObject jsonObj3 = new JSONObject();

        JSONObject jsonObj4 = new JSONObject();
        jsonObj4.put("profile_id", random.nextInt(1000000 - 1 + 1)+1);
        jsonObj4.put("ito",GenerateTokenClass.getGeneratedToken());

        JSONObject jsonObj5 = new JSONObject();
        jsonObj5.put("profile_id", null);
        jsonObj5.put("ito",null);


        return new Object[]{jsonObj, jsonObj2, jsonObj3, jsonObj4, jsonObj5};
    }




    public static Object[] provideNegativeGetInterval() throws Exception {
        Random random = new Random();
        ForProvideData.getTestData();


        JSONObject jsonObj = new JSONObject();

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("profile_id", null);

        JSONObject jsonObj3 = new JSONObject();
        jsonObj3.put("profile_id", random.nextInt(1000000 - 1 + 1)+1);


        return new Object[]{jsonObj, jsonObj2, jsonObj3};
    }

}

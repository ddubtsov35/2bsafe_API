package com.dubtsov._2bsafe.Parents.Functions.IntervalBlock.GenerateData;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.ForProvideData;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import org.json.simple.JSONObject;

import java.util.Random;

/**
 * Created by user on 17.01.18.
 */
public class ProvideGetListInterval {

    public static Object[] provideNegativeGetListInterval() throws Exception {
        ForProvideData.getTestData();

        JSONObject jsonObj = new JSONObject();
        if(GenerateProfileIdContent.profileId == null){
            jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        } else{
            jsonObj.put("profile_id", GenerateProfileIdContent.profileId);
        }
        jsonObj.put("group_id",null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("profile_id", null);
        jsonObj2.put("group_id", 186);

        JSONObject jsonObj3 = new JSONObject();

        JSONObject jsonObj4 = new JSONObject();
        Random random = new Random();
        jsonObj4.put("profile_id", random.nextInt(1000000 - 1 + 1)+1);
        jsonObj4.put("group_id",186);

        JSONObject jsonObj5 = new JSONObject();
        jsonObj5.put("profile_id", null);
        jsonObj5.put("group_id",null);

        JSONObject jsonObj6 = new JSONObject();
        if(GenerateProfileIdContent.profileId == null){
            jsonObj6.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        } else{
            jsonObj6.put("profile_id", GenerateProfileIdContent.profileId);
        }
        jsonObj6.put("group_id", random.nextInt(1000000 - 1 + 1)+1);


        return new Object[]{jsonObj, jsonObj2, jsonObj3, jsonObj4, jsonObj5, jsonObj6};
    }

}

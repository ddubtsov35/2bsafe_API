package com.dubtsov._2bsafe.Parents.Functions.IntervalBlock.GenerateData;

import com.dubtsov._2bsafe.Parents.Functions.IntervalBlock.IntervalBlockClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.ForProvideData;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.Models.IntervalBlock;
import org.json.simple.JSONObject;

import java.util.List;
import java.util.Random;

/**
 * Created by user on 17.01.18.
 */
public class ProvideDeleteInterval {

    public static Object[] provideNegativeDeleteInterval() throws Exception {
        ForProvideData.getTestData();

        IntervalBlockClass intervalBlockClass = new IntervalBlockClass();
        List<IntervalBlock> intervalBlockList = intervalBlockClass.getIntervalBlockList();
        JSONObject jsonObj = new JSONObject();
        if(GenerateProfileIdContent.profileId == null){
            jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        } else{
            jsonObj.put("profile_id", GenerateProfileIdContent.profileId);
        }
        jsonObj.put("interval_id",null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("profile_id", null);
        jsonObj2.put("interval_id", 0);

        JSONObject jsonObj3 = new JSONObject();

        JSONObject jsonObj4 = new JSONObject();
        Random random = new Random();
        jsonObj4.put("profile_id", random.nextInt(100000 - 1 + 1)+1);
        jsonObj4.put("interval_id",0);

        JSONObject jsonObj5 = new JSONObject();
        jsonObj5.put("profile_id", null);
        jsonObj5.put("interval_id",null);

        JSONObject jsonObj6 = new JSONObject();
        if(GenerateProfileIdContent.profileId == null){
            jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        } else{
            jsonObj.put("profile_id", GenerateProfileIdContent.profileId);
        }
        jsonObj4.put("interval_id", random.nextInt(1000000 - 1 + 1)+1);


        return new Object[]{jsonObj, jsonObj2, jsonObj3, jsonObj4, jsonObj5, jsonObj6};
    }

}

package com.dubtsov._2bsafe.Parents.Functions.IntervalUpdate;

import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent.GenerateSelectChildrenCardContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import org.json.simple.JSONObject;

import java.util.Random;

/**
 * Created by user on 12.09.17.
 */
public class GenerateIntervalUpdateContent {

    private static JSONObject jsonObj = new JSONObject();
    public static int itoRandom;
    private static Random random;

    public static JSONObject setIntervalUpdateContent() throws Exception {
        random = new Random();
        GetIntervalUpdateClass getIntervalUpdateClass = new GetIntervalUpdateClass();
        if(getIntervalUpdateClass.getIntervalUpdateResponse() != null) {
            //jsonObj.put("ito", getIntervalUpdateClass.getIntervalUpdateResponse().getIto());
            itoRandom = random.nextInt((90 - 0) + 1) + 0;
            jsonObj.put("ito", itoRandom);
            jsonObj.put("profile_id", GenerateSelectChildrenCardContent.profileId);
        }
        return jsonObj;

    }

}

package com.dubtsov._2bsafe.Parents.Functions.IntervalUpdate;

import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent.GenerateSelectChildrenCardContent;
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

    private static JSONObject jsonObj = new JSONObject();
    public static int itoRandom;
    private static Random random;

    public static JSONObject setIntervalUpdateContent() throws Exception {
        random = new Random();
        GetIntervalUpdateClass getIntervalUpdateClass = new GetIntervalUpdateClass();
        if(getIntervalUpdateClass.getIntervalUpdateResponse() != null) {
            itoRandom = random.nextInt((90 - 0) + 1) + 0;
            jsonObj.put("ito", itoRandom);
            jsonObj.put("profile_id", GenerateSelectChildrenCardContent.profileId);
        }
        return jsonObj;
    }

    public static Object[] provideNegativeGetAppsInfoContent1() throws IOException, ParseException {
        Random random = new Random();

        JSONObject jsonObj = new JSONObject();
        jsonObj.put("profile_id", jsonObj.get("profile_id"));
        jsonObj.put("ito",null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("profile_id", null);
        jsonObj2.put("ito", random.nextInt((90 - 0) + 1) + 0);

        JSONObject jsonObj3 = new JSONObject();

        JSONObject jsonObj4 = new JSONObject();
        jsonObj4.put("profile_id", random.nextInt(10000 - 1 + 1)+1);
        jsonObj4.put("ito",GenerateTokenClass.getGeneratedToken());

        JSONObject jsonObj5 = new JSONObject();
        jsonObj5.put("profile_id", null);
        jsonObj5.put("ito",null);


        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3},
                new JSONObject[]{jsonObj4},
                new JSONObject[]{jsonObj5}
        };
    }




    public static Object[] provideNegativeGetInterval() throws IOException, ParseException {
        Random random = new Random();

        JSONObject jsonObj = new JSONObject();

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("profile_id", null);

        JSONObject jsonObj3 = new JSONObject();
        jsonObj3.put("profile_id", random.nextInt(10000 - 1 + 1)+1);


        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3}
        };
    }

}

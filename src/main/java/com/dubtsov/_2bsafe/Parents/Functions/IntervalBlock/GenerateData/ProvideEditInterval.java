package com.dubtsov._2bsafe.Parents.Functions.IntervalBlock.GenerateData;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.ForProvideData;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.Random;

/**
 * Created by user on 17.01.18.
 */
public class ProvideEditInterval {

    public static Object[] provideNegativeEditInterval() throws Exception {
        ForProvideData.getTestData();

        JSONObject jsonObj = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        JSONArray jsonArray3 = new JSONArray();
        JSONObject jsonObj2 = new JSONObject();
        jsonObj.put("profile_id", null);
        //jsonObj.put("group_id", 186);
        jsonObj.put("alias", null);
        jsonObj2.put("type", null);
        jsonObj2.put("name", null);
        jsonObj2.put("repeat", null);
        jsonArray3.add(null);
        jsonObj2.put("interval_start", null);
        jsonObj2.put("interval_end", null);
        jsonArray.add(jsonObj2);
        jsonObj.put("intervals", jsonArray);

        JSONObject jsonObj4 = new JSONObject();
        JSONArray jsonArray4 = new JSONArray();
        JSONArray jsonArray5 = new JSONArray();
        JSONObject jsonObj5 = new JSONObject();
        Random random = new Random();
        jsonObj4.put("profile_id", random.nextInt(1000000 -1 +1 ) +1 );
        //jsonObj.put("group_id", 186);
        jsonObj4.put("alias", "fakeAlias");
        jsonObj5.put("type", random.nextInt(1000000 -1 +1 ) +1 );
        jsonObj5.put("name", "FailTest");
        jsonObj5.put("repeat", jsonArray4);
        jsonArray4.add(0);
        jsonObj5.put("interval_start", "failData");
        jsonObj5.put("interval_end", "failData2");
        jsonArray5.add(jsonObj5);
        jsonObj4.put("intervals", jsonArray5);

        JSONObject jsonObj6 = new JSONObject();


        System.out.println("jsonObject " + jsonObj);
        return new Object[]{jsonObj, jsonObj4, jsonObj6};
    }

}

package com.dubtsov._2bsafe.Parents.Functions.IntervalBlock;

import com.dubtsov._2bsafe.Childrens.NotifyChangeApp.NotifyChangeAppClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent.GenerateSelectChildrenCardContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Models.IntervalBlock;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by user on 31.08.17.
 */
public class GenerateAddBlockIntervalContent {
    private static String alias;

    private static String getAlias() throws Exception {
        NotifyChangeAppClass notifyChangeAppClass = new NotifyChangeAppClass();
        notifyChangeAppClass.notifyChangeApp();
        alias = "com.google.android.youtube";
        return alias;
    }


    public static JSONObject getListInterval() throws Exception {
        JSONObject jsonObj = new JSONObject();

        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        jsonObj.put("group_id", 186);
        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }
    public static Object[] provideNegativeGetListInterval() throws Exception {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        jsonObj.put("group_id",null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("profile_id", null);
        jsonObj2.put("group_id", 186);

        JSONObject jsonObj3 = new JSONObject();

        JSONObject jsonObj4 = new JSONObject();
        Random random = new Random();
        jsonObj4.put("profile_id", random.nextInt(10000 - 1 + 1)+1);
        jsonObj4.put("group_id",186);

        JSONObject jsonObj5 = new JSONObject();
        jsonObj5.put("profile_id", null);
        jsonObj5.put("group_id",null);

        JSONObject jsonObj6 = new JSONObject();
        jsonObj4.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        jsonObj4.put("group_id", random.nextInt(10000 - 1 + 1)+1);


        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3},
                new JSONObject[]{jsonObj4},
                new JSONObject[]{jsonObj5},
                new JSONObject[]{jsonObj6}
        };
    }










    public static JSONObject addInterval() throws Exception {

        JSONObject jsonObj = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        JSONArray jsonArray3 = new JSONArray();
        JSONObject jsonObj2 = new JSONObject();

        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        //jsonObj.put("group_id", 186);
        jsonObj.put("alias", getAlias());
        jsonObj2.put("type", 1);
        jsonObj2.put("name", "TestName");
        jsonObj2.put("repeat", jsonArray3);
        jsonArray3.add(0);
        jsonObj2.put("interval_start", "2017-06-08 11:03:44");
        jsonObj2.put("interval_end", "2017-07-08 11:03:44");
        jsonArray.add(jsonObj2);
        jsonObj.put("intervals", jsonArray);


        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }
    public static Object[] provideNegativeAddInterval() throws Exception {

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
        jsonObj4.put("profile_id", random.nextInt(10000 -1 +1 ) +1 );
        //jsonObj.put("group_id", 186);
        jsonObj4.put("alias", "fakeAlias");
        jsonObj5.put("type", random.nextInt(10000 -1 +1 ) +1 );
        jsonObj5.put("name", "FailTest");
        jsonObj5.put("repeat", jsonArray4);
        jsonArray4.add(0);
        jsonObj5.put("interval_start", "failData");
        jsonObj5.put("interval_end", "failData2");
        jsonArray5.add(jsonObj5);
        jsonObj4.put("intervals", jsonArray5);

        JSONObject jsonObj6 = new JSONObject();


        System.out.println("jsonObject " + jsonObj);
        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj4},
                new JSONObject[]{jsonObj6}
        };
    }








    public static JSONObject editInterval() throws Exception {
        IntervalBlockClass intervalBlockClass = new IntervalBlockClass();
        List<Integer> intervalId = intervalBlockClass.addIntervalBlockList().getIntervals();

        JSONObject jsonObj = new JSONObject();
        JSONArray jsonArray = new JSONArray();

        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        jsonObj.put("interval_id", intervalId.get(0));
        jsonObj.put("type", 1);
        jsonObj.put("name", "TestName");
        jsonArray.add(0);
        jsonObj.put("repeat", jsonArray);
        jsonObj.put("interval_start", "2017-06-08 11:03:44");
        jsonObj.put("interval_end", "2017-07-08 11:03:44");

        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }
    public static Object[] provideNegativeEditInterval() throws Exception {

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
        jsonObj4.put("profile_id", random.nextInt(10000 -1 +1 ) +1 );
        //jsonObj.put("group_id", 186);
        jsonObj4.put("alias", "fakeAlias");
        jsonObj5.put("type", random.nextInt(10000 -1 +1 ) +1 );
        jsonObj5.put("name", "FailTest");
        jsonObj5.put("repeat", jsonArray4);
        jsonArray4.add(0);
        jsonObj5.put("interval_start", "failData");
        jsonObj5.put("interval_end", "failData2");
        jsonArray5.add(jsonObj5);
        jsonObj4.put("intervals", jsonArray5);

        JSONObject jsonObj6 = new JSONObject();


        System.out.println("jsonObject " + jsonObj);
        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj4},
                new JSONObject[]{jsonObj6}
        };
    }








    public static JSONObject deleteInterval() throws Exception {
        IntervalBlockClass intervalBlockClass = new IntervalBlockClass();
        JSONObject jsonObj = new JSONObject();
        List<IntervalBlock> intervalBlockList = intervalBlockClass.getIntervalBlockList();
        jsonObj.put("interval_id", intervalBlockList.get(0).getId());
        jsonObj.put("profile_id", GenerateSelectChildrenCardContent.profileId);
        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }
    public static Object[] provideNegativeDeleteInterval() throws Exception {
        IntervalBlockClass intervalBlockClass = new IntervalBlockClass();
        List<IntervalBlock> intervalBlockList = intervalBlockClass.getIntervalBlockList();
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        jsonObj.put("interval_id",null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("profile_id", null);
        jsonObj2.put("interval_id", 0);

        JSONObject jsonObj3 = new JSONObject();

        JSONObject jsonObj4 = new JSONObject();
        Random random = new Random();
        jsonObj4.put("profile_id", random.nextInt(10000 - 1 + 1)+1);
        jsonObj4.put("interval_id",0);

        JSONObject jsonObj5 = new JSONObject();
        jsonObj5.put("profile_id", null);
        jsonObj5.put("interval_id",null);

        JSONObject jsonObj6 = new JSONObject();
        jsonObj4.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        jsonObj4.put("interval_id", random.nextInt(10000 - 1 + 1)+1);


        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3},
                new JSONObject[]{jsonObj4},
                new JSONObject[]{jsonObj5},
                new JSONObject[]{jsonObj6}
        };
    }

}

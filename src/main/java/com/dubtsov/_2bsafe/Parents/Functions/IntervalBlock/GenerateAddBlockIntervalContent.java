package com.dubtsov._2bsafe.Parents.Functions.IntervalBlock;

import com.dubtsov._2bsafe.Childrens.NotifyChangeApp.NotifyChangeAppClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.Models.IntervalBlock;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.sql.Timestamp;
import java.util.List;

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

    public static JSONObject deleteInterval() throws Exception {
        IntervalBlockClass intervalBlockClass = new IntervalBlockClass();
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("interval_id", intervalBlockClass.getIntervalBlockList().get(0).getId());
        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }

}

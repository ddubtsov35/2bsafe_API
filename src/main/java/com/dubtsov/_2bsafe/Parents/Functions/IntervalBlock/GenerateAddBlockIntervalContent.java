package com.dubtsov._2bsafe.Parents.Functions.IntervalBlock;

import com.dubtsov._2bsafe.Childrens.NotifyChangeApp.NotifyChangeAppClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.sql.Timestamp;

/**
 * Created by user on 31.08.17.
 */
public class GenerateAddBlockIntervalContent {

    private static JSONObject jsonObj;
    private static JSONArray jsonArray;
    private static JSONArray jsonArray2;
    private static JSONArray jsonArray3;
    private static String alias;

    private static String getAlias() throws Exception {
        NotifyChangeAppClass notifyChangeAppClass = new NotifyChangeAppClass();
        notifyChangeAppClass.notifyChangeApp();
        alias = "com.google.android.youtube";
        return alias;
    }


    public static JSONObject getListInterval() throws Exception {
        jsonObj = new JSONObject();
        jsonArray = new JSONArray();
        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        jsonObj.put("group_id", 0);
        jsonObj.put("alias", jsonArray);
        jsonArray.add(getAlias());
        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }

    public static JSONObject addInterval() throws Exception {
        Timestamp timestampEnd = new Timestamp(System.currentTimeMillis());
        Timestamp timestampStart = new Timestamp(System.currentTimeMillis() - 100000);

        jsonObj = new JSONObject();
        jsonArray = new JSONArray();
        jsonArray2 = new JSONArray();
        jsonArray3 = new JSONArray();
        JSONObject jsonObj2 = new JSONObject();
        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        jsonObj.put("group_id", 186);
        jsonObj.put("alias", jsonArray2);
        jsonArray2.add(getAlias());

        jsonObj2.put("type", 1);
        jsonObj2.put("name", "TestName");
        jsonObj2.put("repeat", jsonArray3);
        jsonArray3.add(0);
        jsonObj2.put("interval_start", timestampStart.getTime());
        jsonObj2.put("interval_end", timestampEnd.getTime());
        jsonArray.add(jsonObj2);
        jsonObj.put("intervals", jsonArray);


        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }

    public static JSONObject editInterval() throws Exception {
        Timestamp timestampEnd = new Timestamp(System.currentTimeMillis());
        Timestamp timestampStart = new Timestamp(System.currentTimeMillis() - 100000);
        JSONObject jsonObj2 = new JSONObject();
        jsonObj = new JSONObject();
        jsonArray = new JSONArray();
        jsonArray2 = new JSONArray();
        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        jsonObj.put("group_id", 0);

        jsonObj.put("alias", jsonArray2);
        jsonArray2.add(getAlias());

        jsonObj.put("type", 1);
        jsonObj.put("name", "TestName");
        jsonArray.add(0);
        jsonObj.put("repeat", jsonArray);
        jsonObj2.put("interval_start", timestampStart.getTime());
        jsonObj2.put("interval_end", timestampEnd.getTime());
        jsonObj.put("intervals", jsonArray);

        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }

    public static JSONObject deleteInterval() throws Exception {
        IntervalBlockClass intervalBlockClass = new IntervalBlockClass();
        jsonObj.put("interval_id", intervalBlockClass.getIntervalBlockList().get(0).getId());
        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }

}

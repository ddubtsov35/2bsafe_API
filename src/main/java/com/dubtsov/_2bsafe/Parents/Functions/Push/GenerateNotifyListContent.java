package com.dubtsov._2bsafe.Parents.Functions.Push;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Created by user on 04.09.17.
 */
public class GenerateNotifyListContent{

    private static JSONObject jsonObj;
    private static JSONArray jsonArray = new JSONArray();

    public static JSONObject getNotifyListContent() throws Exception {
        jsonObj = new JSONObject();
        jsonArray = new JSONArray();

        jsonObj.put("start", 0);
        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        jsonObj.put("limit", 100);

        jsonArray.add("geo");
        jsonArray.add("security");
        jsonArray.add("phone");
        jsonArray.add("msg");
        jsonObj.put("type", jsonArray);

        jsonObj.put("from_date", "20-12-2007");
        jsonObj.put("to_date", "20-12-2007");

        jsonObj.put("rnd", GenerateTokenClass.getGeneratedToken());


        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }

    public static JSONObject createSession_alarm_update_updateLong() throws Exception {
        jsonObj = new JSONObject();
        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        return jsonObj;
    }

    public static JSONObject blockScreen() throws Exception {
        jsonObj = new JSONObject();
        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        jsonObj.put("pin", "111111");
        jsonObj.put("text", "TestText");
        return jsonObj;
    }

}

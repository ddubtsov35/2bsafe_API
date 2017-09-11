package com.dubtsov._2bsafe.Parents.Functions.GroupsApp;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.HashMap;

/**
 * Created by user on 31.08.17.
 */
public class GenerateGroupContent {

    private static JSONObject jsonObject;
    private static JSONArray jsonArray;

    public static JSONObject generatedAddGroup() throws Exception {
        jsonObject = new JSONObject();
        jsonArray = new JSONArray();
        jsonObject.put("name", "TestName");
        jsonObject.put("profile_id", GenerateProfileIdContent.getProfileId());
        jsonObject.put("aliases",jsonArray);
        jsonArray.add("aliases");

        System.out.println("jsonObject " + jsonObject);
        return jsonObject;
    }

    public static JSONObject generatedEditGroup() throws Exception {
        jsonObject = new JSONObject();
        jsonObject.put("group_id", 1);
        jsonObject.put("profile_id", GenerateProfileIdContent.getProfileId());
        jsonObject.put("blocked",false);
        jsonObject.put("name", "TestName");

        System.out.println("jsonObject " + jsonObject);
        return jsonObject;
    }

    public static JSONObject generatedSetGroup() throws Exception {
        jsonObject = new JSONObject();
        jsonArray = new JSONArray();
        jsonObject.put("profile_id", GenerateProfileIdContent.getProfileId());
        jsonObject.put("aliases",jsonArray);
        jsonArray.add("aliases");
        jsonObject.put("group_id", 1);

        System.out.println("jsonObject " + jsonObject);
        return jsonObject;
    }

    public static JSONObject generatedDeleteGroup() throws Exception {
        jsonObject = new JSONObject();
        jsonObject.put("group_id", 1);

        System.out.println("jsonObject " + jsonObject);
        return jsonObject;
    }

}

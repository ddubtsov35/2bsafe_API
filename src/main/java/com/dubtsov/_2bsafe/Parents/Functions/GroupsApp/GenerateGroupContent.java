package com.dubtsov._2bsafe.Parents.Functions.GroupsApp;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.BaseContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.HashMap;

/**
 * Created by user on 31.08.17.
 */
public class GenerateGroupContent{

    private static JSONObject jsonObj = new JSONObject();
    private static JSONArray jsonArray = new JSONArray();

    public static JSONObject generatedAddGroup() throws Exception {
        jsonObj.put("name", "TestName");
        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId());
        jsonObj.put("aliases",jsonArray);
        jsonArray.add("aliases");
        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }

    public static JSONObject generatedEditGroup() throws Exception {
        jsonObj.put("group_id", 1);
        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId());
        jsonObj.put("blocked",false);
        jsonObj.put("name", "TestName");
        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }

    public static JSONObject generatedSetGroup() throws Exception {
        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId());
        jsonObj.put("aliases",jsonArray);
        jsonArray.add("aliases");
        jsonObj.put("group_id", 1);
        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }

    public static JSONObject generatedDeleteGroup() throws Exception {
        jsonObj.put("group_id", 1);
        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }

}

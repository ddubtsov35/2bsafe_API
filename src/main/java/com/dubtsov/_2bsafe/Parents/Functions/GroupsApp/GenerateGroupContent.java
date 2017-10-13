package com.dubtsov._2bsafe.Parents.Functions.GroupsApp;

import com.dubtsov._2bsafe.Childrens.NotifyChangeApp.NotifyChangeAppClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.Models.GroupApp;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.IOException;

/**
 * Created by user on 31.08.17.
 */
public class GenerateGroupContent{

    private static JSONObject jsonObj;
    private static JSONArray jsonArray;
    private static String alias = null;

    private static String getAlias() throws Exception {
        NotifyChangeAppClass notifyChangeAppClass = new NotifyChangeAppClass();
        notifyChangeAppClass.notifyChangeApp();
        alias = "com.google.android.youtube";
        return alias;
    }

    public static JSONObject generatedAddGroup() throws Exception {
        jsonObj = new JSONObject();
        jsonArray = new JSONArray();
        jsonObj.put("name", "TestName");
        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        jsonObj.put("aliases", jsonArray);
        jsonArray.add(getAlias());
        return jsonObj;
    }

    public static JSONObject generatedEditGroup() throws Exception {
        jsonObj = new JSONObject();
        jsonArray = new JSONArray();
        jsonObj.put("group_id", 1);
        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        jsonObj.put("blocked",false);
        jsonObj.put("name", "TestName");
        return jsonObj;
    }

    public static JSONObject generatedSetGroup() throws Exception {
        jsonObj = new JSONObject();
        jsonArray = new JSONArray();
        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        jsonObj.put("aliases", jsonArray);
        jsonArray.add(getAlias());
        jsonObj.put("group_id", 0);
        return jsonObj;
    }

    public static JSONObject generatedDeleteGroup(GroupApp groupApp) throws Exception {
        jsonObj = new JSONObject();
        jsonArray = new JSONArray();
        jsonObj.put("group_id", groupApp.getGroup_id());
        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }

}
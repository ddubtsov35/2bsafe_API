package com.dubtsov._2bsafe.Parents.Functions.Apps;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.BaseContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 08.09.17.
 */
public class GenerateAppsContent{
    public GenerateAppsContent() throws ParseException {}

    public static JSONObject getAppsInfoContent() throws Exception {
        JSONObject jsonObj = GenerateProfileIdContent.getProfileId();
        jsonObj.put("profile_id", jsonObj.get("profile_id"));
        jsonObj.put("rnd",GenerateTokenClass.getGeneratedToken());
        return jsonObj;
    }


    public static JSONObject getAppsInGroupContent() throws Exception {
        JSONObject jsonObj = GenerateProfileIdContent.getProfileId();
        jsonObj.put("profile_id", jsonObj.get("profile_id"));
        jsonObj.put("rnd",GenerateTokenClass.getGeneratedToken());
        jsonObj.put("group_id", 0);
        return jsonObj;
    }


    public static JSONObject getDetailInfoContent() throws Exception {
        JSONObject jsonObj = GenerateProfileIdContent.getProfileId();
        jsonObj.put("profile_id", jsonObj.get("profile_id"));
        jsonObj.put("alias",GenerateTokenClass.getGeneratedToken());
        return jsonObj;
    }


    public static JSONObject getAppsBlockContent() throws Exception {
        JSONObject jsonObj = GenerateProfileIdContent.getProfileId();
        jsonObj.put("profile_id", jsonObj.get("profile_id"));
        jsonObj.put("alias",GenerateTokenClass.getGeneratedToken());
        jsonObj.put("block",0);
        return jsonObj;
    }


    public static JSONObject getAppsBlockUpdateContent() throws Exception {
        JSONObject jsonObj = GenerateProfileIdContent.getProfileId();
        jsonObj.put("profile_id", jsonObj.get("profile_id"));
        jsonObj.put("alias",GenerateTokenClass.getGeneratedToken());
        jsonObj.put("block",0);
        return jsonObj;
    }


    public static JSONObject getAppsUpdateContent() throws Exception {
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObj = GenerateProfileIdContent.getProfileId();
        jsonObj.put("profile_id", jsonObj.get("profile_id"));
        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("alias",GenerateTokenClass.getGeneratedToken());
        jsonArray.add(jsonObject2);
        jsonObj.put("aliases",jsonArray);
        return jsonObj;
    }


    public static JSONObject getAppsDeleteContent() throws Exception {
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObj = GenerateProfileIdContent.getProfileId();
        jsonObj.put("profile_id", jsonObj.get("profile_id"));
        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("alias",GenerateTokenClass.getGeneratedToken());
        jsonArray.add(jsonObject2);
        jsonObj.put("aliases",jsonArray);
        return jsonObj;
    }

}

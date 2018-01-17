package com.dubtsov._2bsafe.Parents.Functions.GroupsApp.GenerateData;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.NotifyChangeApp.NotifyChangeAppClass;
import com.dubtsov._2bsafe.Parents.Functions.Registration.GenerateRegistrationContent;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep1Class;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep2Class;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.ForProvideData;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.Models.GroupApp;
import com.dubtsov._2bsafe.Parents.Pool.UserPool;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 31.08.17.
 */
public class GenerateGroupContent{

    private static String getAlias() throws Exception {
        NotifyChangeAppClass notifyChangeAppClass = new NotifyChangeAppClass();
        notifyChangeAppClass.notifyChangeApp();
        String alias = "com.google.android.youtube";
        return alias;
    }

    public static JSONObject generatedAddGroup() throws Exception {
        JSONObject jsonObj = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        jsonObj.put("name", "TestName");
        if(GenerateProfileIdContent.profileId == null){
            jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        } else{
            jsonObj.put("profile_id", GenerateProfileIdContent.profileId);
        }
        jsonObj.put("aliases", jsonArray);
        jsonArray.add(getAlias());
        return jsonObj;
    }

    public static JSONObject generatedEditGroup() throws Exception {
        JSONObject jsonObj = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        jsonObj.put("group_id", 1);
        if(GenerateProfileIdContent.profileId == null){
            jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        } else{
            jsonObj.put("profile_id", GenerateProfileIdContent.profileId);
        }
        jsonObj.put("blocked",false);
        jsonObj.put("name", "TestName");
        return jsonObj;
    }

    public static JSONObject generatedSetGroup() throws Exception {
        JSONObject jsonObj = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        if(GenerateProfileIdContent.profileId == null){
            jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        } else{
            jsonObj.put("profile_id", GenerateProfileIdContent.profileId);
        }
        jsonObj.put("aliases", jsonArray);
        jsonArray.add(getAlias());
        jsonObj.put("group_id", 0);
        return jsonObj;
    }

    public static JSONObject generatedDeleteGroup(GroupApp groupApp) throws Exception {
        JSONObject jsonObj = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        jsonObj.put("group_id", groupApp.getGroup_id());
        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }

}

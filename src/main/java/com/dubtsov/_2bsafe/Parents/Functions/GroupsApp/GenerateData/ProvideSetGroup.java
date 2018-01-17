package com.dubtsov._2bsafe.Parents.Functions.GroupsApp.GenerateData;

import com.dubtsov._2bsafe.Childrens.NotifyChangeApp.NotifyChangeAppClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.ForProvideData;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Created by user on 17.01.18.
 */
public class ProvideSetGroup {

    private static String getAlias() throws Exception {
        NotifyChangeAppClass notifyChangeAppClass = new NotifyChangeAppClass();
        notifyChangeAppClass.notifyChangeApp();
        String alias = "com.google.android.youtube";
        return alias;
    }

    public static Object[] provideNegativeSetGroupContent() throws Exception {
        ForProvideData.getTestData();

        JSONArray jsonArray = new JSONArray();

        JSONObject jsonObj1 = new JSONObject();
        jsonObj1.put("profile_id", null);
        jsonObj1.put("aliases",null);
        jsonObj1.put("group_id", null);

        JSONObject jsonObj2 = new JSONObject();
        if(GenerateProfileIdContent.profileId == null){
            jsonObj2.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        } else{
            jsonObj2.put("profile_id", GenerateProfileIdContent.profileId);
        }
        jsonObj2.put("aliases",null);
        jsonObj2.put("group_id", null);

        JSONObject jsonObj3 = new JSONObject();
        jsonObj3.put("profile_id", null);
        jsonObj3.put("aliases", jsonArray);
        jsonArray.add(getAlias());
        jsonObj3.put("group_id", null);

        JSONObject jsonObj4 = new JSONObject();
        jsonObj4.put("aliases",null);
        jsonObj4.put("group_id", 0);

        JSONObject jsonObj5 = new JSONObject();
        jsonObj5.put("profile_id", null);
        jsonObj5.put("group_id", null);

        JSONObject jsonObj6 = new JSONObject();
        jsonObj6.put("profile_id", null);
        jsonObj6.put("aliases",null);


        JSONObject jsonObj7 = new JSONObject();
        jsonObj7.put("profile_id", "fakeLogin");
        jsonObj7.put("aliases", jsonArray);
        jsonArray.add(getAlias());
        jsonObj7.put("group_id", 0);


        JSONObject jsonObj8 = new JSONObject();
        if(GenerateProfileIdContent.profileId == null){
            jsonObj8.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        } else{
            jsonObj8.put("profile_id", GenerateProfileIdContent.profileId);
        }
        jsonObj8.put("aliases","fakePwd");
        jsonObj8.put("group_id", 0);


        JSONObject jsonObj9 = new JSONObject();
        if(GenerateProfileIdContent.profileId == null){
            jsonObj9.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        } else{
            jsonObj9.put("profile_id", GenerateProfileIdContent.profileId);
        }
        jsonObj9.put("aliases", jsonArray);
        jsonArray.add(getAlias());
        jsonObj9.put("group_id", 456);


        JSONObject jsonObj10 = new JSONObject();
        jsonObj10.put("group_id", 0);

        JSONObject jsonObj11 = new JSONObject();
        jsonObj11.put("aliases", jsonArray);
        jsonArray.add(getAlias());

        JSONObject jsonObj12 = new JSONObject();
        if(GenerateProfileIdContent.profileId == null){
            jsonObj12.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        } else{
            jsonObj12.put("profile_id", GenerateProfileIdContent.profileId);
        }

        JSONObject jsonObj13 = new JSONObject();

        return new Object[]{jsonObj1, jsonObj2, jsonObj3, jsonObj4, jsonObj5, jsonObj6, jsonObj7, jsonObj8, jsonObj9, jsonObj10, jsonObj11, jsonObj12, jsonObj13,};
    }

}

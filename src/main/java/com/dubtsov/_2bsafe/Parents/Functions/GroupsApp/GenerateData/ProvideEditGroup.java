package com.dubtsov._2bsafe.Parents.Functions.GroupsApp.GenerateData;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.ForProvideData;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import org.json.simple.JSONObject;

/**
 * Created by user on 17.01.18.
 */
public class ProvideEditGroup {

    public static Object[] provideNegativeGeneratedEditGroup() throws Exception {

        ForProvideData.getTestData();

        AuthorisationChildClass authorisationChildClass = new AuthorisationChildClass();
        authorisationChildClass.authorisationChildren();


        JSONObject jsonObj1 = new JSONObject();
        jsonObj1.put("profile_id", null);
        jsonObj1.put("blocked",null);
        jsonObj1.put("group_id", null);
        jsonObj1.put("name", null);

        JSONObject jsonObj2 = new JSONObject();
        if(GenerateProfileIdContent.profileId == null){
            jsonObj2.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        } else{
            jsonObj2.put("profile_id", GenerateProfileIdContent.profileId);
        }
        jsonObj2.put("blocked",null);
        jsonObj2.put("group_id", null);
        jsonObj2.put("name", null);

        JSONObject jsonObj3 = new JSONObject();
        jsonObj3.put("profile_id", null);
        jsonObj3.put("blocked", true);
        jsonObj3.put("group_id", null);
        jsonObj3.put("name", null);

        JSONObject jsonObj4 = new JSONObject();
        jsonObj4.put("blocked",false);
        jsonObj4.put("group_id", 0);
        jsonObj4.put("name", "TestName");

        JSONObject jsonObj5 = new JSONObject();
        jsonObj5.put("profile_id", null);
        jsonObj5.put("group_id", null);
        jsonObj5.put("name", "TestName");

        JSONObject jsonObj6 = new JSONObject();
        jsonObj6.put("profile_id", null);
        jsonObj6.put("blocked",true);
        jsonObj6.put("name", "TestName");


        JSONObject jsonObj7 = new JSONObject();
        jsonObj7.put("profile_id", "fakeLogin");
        jsonObj7.put("blocked", false);
        jsonObj7.put("group_id", 0);
        jsonObj7.put("name", "TestName");


        /*JSONObject jsonObj8 = new JSONObject();
        if(GenerateProfileIdContent.profileId == null){
            jsonObj8.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        } else{
            jsonObj8.put("profile_id", GenerateProfileIdContent.profileId);
        }
        jsonObj8.put("blocked","fakeBlocked");
        jsonObj8.put("group_id", 0);
        jsonObj8.put("name", "TestName");*/


        JSONObject jsonObj9 = new JSONObject();
        if(GenerateProfileIdContent.profileId == null){
            jsonObj9.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        } else{
            jsonObj9.put("profile_id", GenerateProfileIdContent.profileId);
        }
        jsonObj9.put("blocked", false);
        jsonObj9.put("group_id", 456);
        jsonObj9.put("name", "TestName");


        JSONObject jsonObj10 = new JSONObject();
        jsonObj10.put("group_id", 0);

        JSONObject jsonObj11 = new JSONObject();
        jsonObj11.put("blocked", true);

        JSONObject jsonObj12 = new JSONObject();
        if(GenerateProfileIdContent.profileId == null){
            jsonObj12.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        } else{
            jsonObj12.put("profile_id", GenerateProfileIdContent.profileId);
        }

        JSONObject jsonObj13 = new JSONObject();
        jsonObj13.put("name", "TestName");

        JSONObject jsonObj14 = new JSONObject();

        return new Object[]{jsonObj1, jsonObj2, jsonObj3, jsonObj4, jsonObj5, jsonObj6, jsonObj7, jsonObj9, jsonObj10, jsonObj11, jsonObj12, jsonObj13, jsonObj14};
    }

}

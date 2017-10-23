package com.dubtsov._2bsafe.Parents.Functions.GroupsApp;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.NotifyChangeApp.NotifyChangeAppClass;
import com.dubtsov._2bsafe.Parents.Functions.Registration.GenerateRegistrationContent;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep1Class;
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
    public static Object[] provideNegativeGeneratedEditGroup() throws Exception {

        RegistrationUserStep1Class registrationUserStep1Class = new RegistrationUserStep1Class();
        registrationUserStep1Class.registrationUserStep1();

        /*AuthorisationChildClass authorisationChildClass = new AuthorisationChildClass();
        authorisationChildClass.authorisationChildren();*/


        JSONObject jsonObj1 = new JSONObject();
        jsonObj1.put("profile_id", null);
        jsonObj1.put("blocked",null);
        jsonObj1.put("group_id", null);
        jsonObj1.put("name", null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
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


        JSONObject jsonObj8 = new JSONObject();
        jsonObj8.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        jsonObj8.put("blocked","fakeBlocked");
        jsonObj8.put("group_id", 0);
        jsonObj8.put("name", "TestName");


        JSONObject jsonObj9 = new JSONObject();
        jsonObj9.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        jsonObj9.put("blocked", false);
        jsonObj9.put("group_id", 456);
        jsonObj9.put("name", "TestName");


        JSONObject jsonObj10 = new JSONObject();
        jsonObj10.put("group_id", 0);

        JSONObject jsonObj11 = new JSONObject();
        jsonObj11.put("blocked", true);

        JSONObject jsonObj12 = new JSONObject();
        jsonObj12.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));

        JSONObject jsonObj13 = new JSONObject();
        jsonObj13.put("name", "TestName");

        JSONObject jsonObj14 = new JSONObject();

        return new Object[]{
                new JSONObject[] {jsonObj1},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3},
                new JSONObject[]{jsonObj4},
                new JSONObject[]{jsonObj5},
                new JSONObject[]{jsonObj6},
                new JSONObject[]{jsonObj7},
                new JSONObject[]{jsonObj8},
                new JSONObject[]{jsonObj9},
                new JSONObject[]{jsonObj10},
                new JSONObject[]{jsonObj11},
                new JSONObject[]{jsonObj12},
                new JSONObject[]{jsonObj13},
                new JSONObject[]{jsonObj14}
        };
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
    public static Object[] provideNegativeGetAuthContent() throws Exception {
        JSONArray jsonArray = new JSONArray();

        JSONObject jsonObj1 = new JSONObject();
        jsonObj1.put("profile_id", null);
        jsonObj1.put("aliases",null);
        jsonObj1.put("group_id", null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
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
        jsonObj8.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        jsonObj8.put("aliases","fakePwd");
        jsonObj8.put("group_id", 0);


        JSONObject jsonObj9 = new JSONObject();
        jsonObj9.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        jsonObj9.put("aliases", jsonArray);
        jsonArray.add(getAlias());
        jsonObj9.put("group_id", 456);


        JSONObject jsonObj10 = new JSONObject();
        jsonObj10.put("group_id", 0);

        JSONObject jsonObj11 = new JSONObject();
        jsonObj11.put("aliases", jsonArray);
        jsonArray.add(getAlias());

        JSONObject jsonObj12 = new JSONObject();
        jsonObj12.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));

        JSONObject jsonObj13 = new JSONObject();

        return new Object[]{
                new JSONObject[] {jsonObj1},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3},
                new JSONObject[]{jsonObj4},
                new JSONObject[]{jsonObj5},
                new JSONObject[]{jsonObj6},
                new JSONObject[]{jsonObj7},
                new JSONObject[]{jsonObj8},
                new JSONObject[]{jsonObj9},
                new JSONObject[]{jsonObj10},
                new JSONObject[]{jsonObj11},
                new JSONObject[]{jsonObj12},
                new JSONObject[]{jsonObj13},
        };
    }






    public static JSONObject generatedDeleteGroup(GroupApp groupApp) throws Exception {
        jsonObj = new JSONObject();
        jsonArray = new JSONArray();
        jsonObj.put("group_id", groupApp.getGroup_id());
        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }
    public static Object[] provideNegativeGetAccountContent1() throws IOException, ParseException {
        jsonObj = new JSONObject();
        jsonObj.put("group_id", null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("group_id", "failRnd");

        JSONObject jsonObj3 = new JSONObject();

        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3}
        };
    }

}

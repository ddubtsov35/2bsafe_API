package com.dubtsov._2bsafe.Parents.Functions.IntervalBlock.GenerateData;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.NotifyChangeApp.NotifyChangeAppClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent.GenerateSelectChildrenCardContent;
import com.dubtsov._2bsafe.Parents.Functions.IntervalBlock.IntervalBlockClass;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep1Class;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep2Class;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.ForProvideData;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Models.IntervalBlock;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by user on 31.08.17.
 */
public class GenerateAddBlockIntervalContent {
    private static String alias;

    private static String getAlias() throws Exception {
        NotifyChangeAppClass notifyChangeAppClass = new NotifyChangeAppClass();
        notifyChangeAppClass.notifyChangeApp();
        alias = "com.google.android.youtube";
        return alias;
    }


    public static JSONObject getListInterval() throws Exception {
        JSONObject jsonObj = new JSONObject();

        if(GenerateProfileIdContent.profileId == null){
            jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        } else{
            jsonObj.put("profile_id", GenerateProfileIdContent.profileId);
        }
        jsonObj.put("group_id", 186);
        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }

    public static JSONObject addInterval() throws Exception {

        JSONObject jsonObj = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        JSONArray jsonArray3 = new JSONArray();
        JSONObject jsonObj2 = new JSONObject();

        if(GenerateProfileIdContent.profileId == null){
            jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        } else{
            jsonObj.put("profile_id", GenerateProfileIdContent.profileId);
        }
        //jsonObj.put("group_id", 186);
        jsonObj.put("alias", getAlias());
        jsonObj2.put("type", 1);
        jsonObj2.put("name", "TestName");
        jsonObj2.put("repeat", jsonArray3);
        jsonArray3.add(0);
        jsonObj2.put("interval_start", "2017-06-08 11:03:44");
        jsonObj2.put("interval_end", "2017-07-08 11:03:44");
        jsonArray.add(jsonObj2);
        jsonObj.put("intervals", jsonArray);


        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }

    public static JSONObject editInterval() throws Exception {
        IntervalBlockClass intervalBlockClass = new IntervalBlockClass();
        List<Integer> intervalId = intervalBlockClass.addIntervalBlockList().getIntervals();

        JSONObject jsonObj = new JSONObject();
        JSONArray jsonArray = new JSONArray();

        if(GenerateProfileIdContent.profileId == null){
            jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        } else{
            jsonObj.put("profile_id", GenerateProfileIdContent.profileId);
        }
        jsonObj.put("interval_id", intervalId.get(0));
        jsonObj.put("type", 1);
        jsonObj.put("name", "TestName");
        jsonArray.add(0);
        jsonObj.put("repeat", jsonArray);
        jsonObj.put("interval_start", "2017-06-08 11:03:44");
        jsonObj.put("interval_end", "2017-07-08 11:03:44");

        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }

    public static JSONObject deleteInterval() throws Exception {
        IntervalBlockClass intervalBlockClass = new IntervalBlockClass();
        JSONObject jsonObj = new JSONObject();
        List<IntervalBlock> intervalBlockList = intervalBlockClass.getIntervalBlockList();
        jsonObj.put("interval_id", intervalBlockList.get(0).getId());
        if(GenerateProfileIdContent.profileId == null){
            jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        } else{
            jsonObj.put("profile_id", GenerateProfileIdContent.profileId);
        }
        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }

}

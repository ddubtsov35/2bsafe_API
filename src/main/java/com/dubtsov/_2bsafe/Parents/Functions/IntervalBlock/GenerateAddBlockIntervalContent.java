package com.dubtsov._2bsafe.Parents.Functions.IntervalBlock;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.BaseContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 31.08.17.
 */
public class GenerateAddBlockIntervalContent {

    private static JSONObject jsonObj = new JSONObject();
    private static JSONArray jsonArray = new JSONArray();

    public static JSONObject getListInterval() throws Exception {
        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId());
        jsonObj.put("group_id", 1);
        jsonObj.put("alias", "alias");

        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }

    public static JSONObject addInterval() throws Exception {
        JSONObject jsonObj2 = new JSONObject();
        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId());
        jsonObj.put("group_id", 1);
        jsonObj.put("alias", "alias");

        jsonObj2.put("type", 1);
        jsonObj2.put("name", "TestName");
        jsonObj2.put("repeat", 0);
        jsonObj2.put("interval_start", "21.12.2017");
        jsonObj2.put("interval_end", "22.12.2017");
        jsonObj.put("intervals", jsonArray);

        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }

    public static JSONObject editInterval() throws Exception {
        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId());
        jsonObj.put("group_id", 1);
        jsonObj.put("alias", "alias");

        jsonObj.put("type", 1);
        jsonObj.put("name", "TestName");
        jsonArray.add(0);
        jsonObj.put("repeat", jsonArray);
        jsonObj.put("interval_start", "21.12.2017");
        jsonObj.put("interval_end", "22.12.2017");
        jsonObj.put("intervals", jsonArray);

        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }

    public static JSONObject deleteInterval() throws Exception {
        IntervalBlockClass intervalBlockClass = new IntervalBlockClass();
        jsonObj.put("interval_id", intervalBlockClass.getIntervalBlockList().get(0).getId());
        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }

}

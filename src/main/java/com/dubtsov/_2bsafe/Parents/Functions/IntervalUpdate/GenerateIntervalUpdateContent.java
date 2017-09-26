package com.dubtsov._2bsafe.Parents.Functions.IntervalUpdate;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.BaseContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 12.09.17.
 */
public class GenerateIntervalUpdateContent {

    private static JSONObject jsonObj = new JSONObject();

    public static JSONObject setIntervalUpdateContent() throws Exception {
        GetIntervalUpdateClass getIntervalUpdateClass = new GetIntervalUpdateClass();
        jsonObj.put("ito", getIntervalUpdateClass.getIntervalUpdateResponse().getIto());
        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        return jsonObj;
    }

}

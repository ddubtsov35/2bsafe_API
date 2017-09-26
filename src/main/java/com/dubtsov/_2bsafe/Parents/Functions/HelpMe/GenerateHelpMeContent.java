package com.dubtsov._2bsafe.Parents.Functions.HelpMe;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.BaseContent;
import com.dubtsov._2bsafe.Parents.Models.AuthorisationUser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 31.08.17.
 */
public class GenerateHelpMeContent{

    private static JSONObject jsonObj = new JSONObject();
    private static JSONArray jsonArray = new JSONArray();

    public static  JSONObject getHelpMe() throws Exception {
        AuthorisationChildClass authorisationChildClass = new AuthorisationChildClass();
        jsonObj.put("cid", authorisationChildClass.authorisationChildren().getCid());
        return jsonObj;
    }

    public static JSONObject setHelpMe() throws Exception {
        AuthorisationChildClass authorisationChildClass = new AuthorisationChildClass();
        jsonObj.put("cid", authorisationChildClass.authorisationChildren().getCid());
        jsonObj.put("state", 0);
        jsonObj.put("push", 0);
        jsonObj.put("phone", "+79111111111");

        jsonObj.put("sms",jsonArray);
        jsonArray.add(true);
        jsonArray.add("+792222222222");

        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }


}

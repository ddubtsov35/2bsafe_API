package com.dubtsov._2bsafe.Parents.Functions.HelpMe;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Parents.Models.AuthorisationUser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 31.08.17.
 */
public class GenerateHelpMeContent {

    private static JSONObject jsonObject;
    private static JSONArray jsonArray;

    public static JSONObject getHelpMe() throws ParseException, java.text.ParseException, IOException {
        AuthorisationChildClass authorisationChildClass = new AuthorisationChildClass();
        jsonObject = new JSONObject();
        jsonObject.put("cid", authorisationChildClass.authorisationChildren().getCid());

        return jsonObject;
    }

    public static JSONObject setHelpMe() throws IOException, ParseException, java.text.ParseException {
        AuthorisationChildClass authorisationChildClass = new AuthorisationChildClass();
        jsonObject = new JSONObject();
        jsonArray = new JSONArray();
        jsonObject.put("cid", authorisationChildClass.authorisationChildren().getCid());
        jsonObject.put("state", 0);
        jsonObject.put("push", 0);
        jsonObject.put("phone", "+79111111111");

        jsonObject.put("sms",jsonArray);
        jsonArray.add(true);
        jsonArray.add("+792222222222");

        System.out.println("jsonObject " + jsonObject);
        return jsonObject;
    }


}

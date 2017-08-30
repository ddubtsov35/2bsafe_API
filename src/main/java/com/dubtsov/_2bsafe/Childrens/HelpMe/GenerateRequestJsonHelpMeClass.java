package com.dubtsov._2bsafe.Childrens.HelpMe;

import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.HashMap;

/**
 * Created by user on 24.08.17.
 */
public class GenerateRequestJsonHelpMeClass {
    private static JSONObject jsonObject;
    private static JSONObject jsonObject2;
    private static ResponseClass responseClass;


    public static JSONObject generatedJsonHelpMe(HashMap content){
        responseClass = new ResponseClass();
        jsonObject = new JSONObject();
        jsonObject2 = new JSONObject();

        jsonObject.put("cid", content.get("cid"));
        jsonObject.put("ckey", content.get("ckey"));

        jsonObject2.put("lat", 1);
        jsonObject2.put("long", 1);
        jsonObject2.put("gtype", 1);
        jsonObject2.put("date", "2017-01-30");

        jsonObject.put("geo", jsonObject2);

        System.out.println("jsonObject " + jsonObject);
        return jsonObject;
    }
}

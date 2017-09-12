package com.dubtsov._2bsafe.Childrens.HelpMe;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateCidCkeyContent;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.HashMap;

/**
 * Created by user on 24.08.17.
 */
public class GenerateHelpMeContent {
    private static JSONObject jsonObject;
    private static JSONObject jsonObject2;
    private static ResponseClass responseClass;


    public static JSONObject getHelpMeContent() throws Exception {
        responseClass = new ResponseClass();
        jsonObject = new JSONObject();
        jsonObject2 = new JSONObject();

        jsonObject.put("cid", GenerateCidCkeyContent.getCidCkey().get("cid"));
        jsonObject.put("ckey", GenerateCidCkeyContent.getCidCkey().get("ckey"));

        jsonObject2.put("lat", 1);
        jsonObject2.put("long", 1);
        jsonObject2.put("gtype", 1);
        jsonObject2.put("date", "2017-01-30");

        jsonObject.put("geo", jsonObject2);

        System.out.println("jsonObject " + jsonObject);
        return jsonObject;
    }
}

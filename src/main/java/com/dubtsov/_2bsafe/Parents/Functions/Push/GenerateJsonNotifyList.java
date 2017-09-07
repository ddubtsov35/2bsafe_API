package com.dubtsov._2bsafe.Parents.Functions.Push;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.HashMap;

/**
 * Created by user on 04.09.17.
 */
public class GenerateJsonNotifyList {

    private static JSONObject jsonObject;
    private static JSONObject jsonObject2;
    private static JSONObject jsonObject3;
    private static JSONObject jsonObject4;
    private static JSONObject jsonObject5;
    private static JSONArray jsonArray;
    private static JSONArray jsonArray2;
    private static ResponseClass responseClass;


    public static JSONObject generatedJsonRules(HashMap content){
        responseClass = new ResponseClass();
        jsonObject = new JSONObject();
        jsonObject2 = new JSONObject();
        jsonObject3 = new JSONObject();
        jsonObject4 = new JSONObject();
        jsonObject5 = new JSONObject();
        jsonArray = new JSONArray();
        jsonArray2 = new JSONArray();

        jsonObject.put("start", 0);
        jsonObject.put("profile_id", content.get("profile_id"));
        jsonObject.put("limit", 100);

        jsonArray.add("geo");
        jsonArray.add("security");
        jsonArray.add("phone");
        jsonArray.add("msg");
        jsonObject.put("type", jsonArray);

        jsonObject.put("from_date", "20-12-2007");
        jsonObject.put("to_date", "20-12-2007");

        jsonObject.put("rnd", GenerateTokenClass.getGeneratedToken());


        System.out.println("jsonObject " + jsonObject);
        return jsonObject;
    }

}

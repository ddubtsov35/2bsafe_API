package com.dubtsov._2bsafe.Parents.Functions.Rules;

import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.HashMap;

/**
 * Created by user on 29.08.17.
 */
public class GenerateRequestAddRule {

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

        jsonObject.put("name", content.get("cid"));
        jsonObject.put("profiles",jsonArray);
        jsonArray.add(content.get("profile_id"));

        jsonObject3.put(10,"Выключить");
        jsonObject.put("triggers",jsonObject3);

        jsonArray2.add(100);
        jsonObject.put("zones", jsonArray2);

        jsonObject5.put(1,"TEst");
        jsonObject.put("actions",jsonObject5);


        System.out.println("jsonObject " + jsonObject);
        return jsonObject;
    }

}

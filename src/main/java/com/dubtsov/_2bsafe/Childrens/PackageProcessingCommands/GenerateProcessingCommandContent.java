package com.dubtsov._2bsafe.Childrens.PackageProcessingCommands;

import com.dubtsov._2bsafe.Childrens.NotifyChangeApp.GenerateNotifyChangeAppContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateCidCkeyContent;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.HashMap;

/**
 * Created by user on 24.08.17.
 */
public class GenerateProcessingCommandContent {
    private static JSONObject jsonObject;
    private static JSONObject jsonObject2;
    private static JSONObject jsonObject3;
    private static JSONObject jsonObject4;
    private static JSONArray jsonArray;
    private static JSONArray jsonArray2;
    private static ResponseClass responseClass;
    private static String lastRequest;
    private static String result;
    private static String result2;
    private static String result3;
    private static GenerateNotifyChangeAppContent generatedRequestJsonClass;


    public static JSONObject getProcessingCommandsContent() throws Exception {
        responseClass = new ResponseClass();
        jsonObject = new JSONObject();
        jsonObject2 = new JSONObject();
        jsonObject3 = new JSONObject();
        jsonObject4 = new JSONObject();
        jsonArray = new JSONArray();
        jsonArray2 = new JSONArray();

        jsonObject3.put("cid", GenerateCidCkeyContent.getCidCkey().get("cid"));
        jsonObject3.put("ckey", GenerateCidCkeyContent.getCidCkey().get("ckey"));

        jsonObject2.put("name", "update");
        jsonObject2.put("body", jsonObject);
        jsonArray.add(jsonObject2);

        jsonObject.put("form_date", "2017-01-30");
        jsonObject.put(null, lastRequest.substring(1, lastRequest.length()-1));

        jsonObject3.put("commands",jsonArray);

        System.out.println("jsonObject " + jsonObject3);
        result = jsonObject3.toJSONString();
        result2 = result.substring(0, result.indexOf("null")-1);
        result3 = result.substring(result.indexOf("null") + 7, result.length());
        result = result2 + result3;
        System.out.println("qweqweqweqweqweqwe qew " + result);
        JSONParser parser = new JSONParser();
        JSONObject json = (JSONObject) parser.parse(result);
        return json;
    }
}

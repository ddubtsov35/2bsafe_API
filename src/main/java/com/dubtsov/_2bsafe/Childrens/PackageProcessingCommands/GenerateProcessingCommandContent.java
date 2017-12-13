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

    private GenerateCidCkeyContent generateCidCkeyContent;


    public JSONObject getProcessingCommandsContent() throws Exception {
        JSONObject jsonObject = new JSONObject();
        JSONObject jsonObject2 = new JSONObject();
        JSONObject jsonObject3 = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        String lastRequest = GenerateNotifyChangeAppContent.appsNotifyContent().toJSONString();
        generateCidCkeyContent = new GenerateCidCkeyContent();
        jsonObject3 = generateCidCkeyContent.getJsonObjectCidCkey();

        jsonObject2.put("name", "update");
        jsonObject2.put("body", jsonObject);
        jsonArray.add(jsonObject2);

        jsonObject.put("form_date", "2017-01-30");
        jsonObject.put("null", lastRequest.substring(1, lastRequest.length()-1));

        jsonObject3.put("commands",jsonArray);

        System.out.println("jsonObject " + jsonObject3);
        String result = jsonObject3.toJSONString();
        String result2 = result.substring(0, result.indexOf("null")-1);
        String result3 = result.substring(result.indexOf("null") + 7, result.length());
        result = result2 + result3;
        System.out.println("qweqweqweqweqweqwe qew " + result);
        JSONParser parser = new JSONParser();
        JSONObject json = (JSONObject) parser.parse(result);
        return json;
    }
}

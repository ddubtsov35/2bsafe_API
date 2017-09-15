package com.dubtsov._2bsafe.Childrens.StatisticsInformation;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.BaseContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateCidCkeyContent;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Created by user on 12.09.17.
 */
public class GenerateStatisticInfoContent{

    public static JSONObject getRulesTriggerContent() throws Exception {
        JSONObject jsonObj = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObj.put("osv", "testVersion");

        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }

}

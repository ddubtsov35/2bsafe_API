package com.dubtsov._2bsafe.Parents.Functions.Rules.GenerateData;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.ForProvideData;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Created by user on 17.01.18.
 */
public class ProvideAddRule {

    public static Object[] provideAddRuleContent() throws Exception {
        JSONObject jsonObj = new JSONObject();
        JSONObject jsonObject = new JSONObject();
        JSONObject jsonObject3 = new JSONObject();
        JSONObject jsonObject5 = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        JSONArray jsonArray2 = new JSONArray();

        ForProvideData.getTestData();

        jsonObject.put("name", null);
        jsonObject.put("profiles",null);
        jsonObject3.put(null,null);
        jsonObject.put("triggers",jsonObject3);
        jsonArray2.add(null);
        jsonObject.put("zones", jsonArray2);
        jsonObject5.put(null,null);
        jsonObject.put("actions",jsonObject5);

        JSONObject jsonObj2 = new JSONObject();
        jsonObject.put("name", null);
        jsonObject.put("profiles",null);
        jsonArray.add(GenerateProfileIdContent.getProfileId().get("profile_id"));
        jsonObject3.put(null,null);
        jsonObject.put("triggers",jsonObject3);
        jsonArray2.add(null);
        jsonObject.put("zones", jsonArray2);
        jsonObject5.put(null,null);
        jsonObject.put("actions",jsonObject5);

        JSONObject jsonObj3 = new JSONObject();
        jsonObject.put("name", null);
        jsonObject.put("profiles",null);
        jsonArray.add(null);
        jsonObject3.put(10,"Выключить");
        jsonObject.put("triggers",jsonObject3);
        jsonArray2.add(null);
        jsonObject.put("zones", jsonArray2);
        jsonObject5.put(null,null);
        jsonObject.put("actions",jsonObject5);

        JSONObject jsonObj4 = new JSONObject();
        jsonObject.put("profiles",null);
        jsonObject3.put(10,"Выключить");
        jsonObject.put("triggers",jsonObject3);
        jsonArray2.add(null);
        jsonObject.put("zones", jsonArray2);
        jsonObject5.put(null,null);
        jsonObject.put("actions",jsonObject5);

        JSONObject jsonObj5 = new JSONObject();
        jsonObject.put("name", null);
        jsonObject3.put(10,"Выключить");
        jsonObject.put("triggers",jsonObject3);
        jsonArray2.add(null);
        jsonObject.put("zones", jsonArray2);
        jsonObject5.put(null,null);
        jsonObject.put("actions",jsonObject5);

        JSONObject jsonObj6 = new JSONObject();jsonObject.put("name", null);
        jsonObject.put("profiles",null);
        jsonArray.add(null);
        jsonObject3.put(10,"Выключить");


        JSONObject jsonObj7 = new JSONObject();
        jsonObject.put("name", "fake");
        jsonObject.put("profiles","fake");
        jsonArray.add("fake");
        jsonObject3.put(12222,"Выключить");
        jsonObject.put("triggers",jsonObject3);
        jsonArray2.add("fake");
        jsonObject.put("zones", jsonArray2);
        jsonObject5.put(2342345,"fake");
        jsonObject.put("actions",jsonObject5);

        JSONObject jsonObj8 = new JSONObject();

        return new Object[]{jsonObj, jsonObj2, jsonObj3, jsonObj4, jsonObj5, jsonObj6, jsonObj7, jsonObj8};
    }

}

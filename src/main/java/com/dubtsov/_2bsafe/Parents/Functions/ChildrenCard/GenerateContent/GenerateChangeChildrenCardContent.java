package com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.BaseContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GeneratePhoneClass;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 08.09.17.
 */
public class GenerateChangeChildrenCardContent{

    private static JSONObject jsonObj = new JSONObject();
    public GenerateChangeChildrenCardContent() throws ParseException {}

    private static JSONObject generateContent(String type){
        switch (type){
            case "phone":
                jsonObj.put("phone", GeneratePhoneClass.getGeneratedPhone());
                break;
            case "age":
                jsonObj.put("age", 99);
                break;
            case "all":
                jsonObj.put("phone", GeneratePhoneClass.getGeneratedPhone());
                jsonObj.put("age", 99);
                break;
        }
        return jsonObj;
    }

    public static JSONObject getChangeChildrenCardContent(String type) throws Exception {
        jsonObj = generateContent(type);
        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        return jsonObj;
    }
}

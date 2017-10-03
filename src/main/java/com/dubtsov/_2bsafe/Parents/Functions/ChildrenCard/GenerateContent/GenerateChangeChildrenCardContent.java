package com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GeneratePhoneClass;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.util.Random;

/**
 * Created by user on 08.09.17.
 */
public class GenerateChangeChildrenCardContent{

    private static JSONObject jsonObj = new JSONObject();
    public GenerateChangeChildrenCardContent() throws ParseException {}
    public static String generatedPhone = GeneratePhoneClass.getGeneratedPhone();
    public static int generatedAge = getGeneratedAge();

    private static JSONObject generateContent(String type){
        switch (type){
            case "phone":
                jsonObj.put("phone", generatedPhone);
                break;
            case "age":
                jsonObj.put("age", generatedAge);
                break;
            case "all":
                jsonObj.put("phone", generatedPhone);
                jsonObj.put("age", generatedAge);
                break;
        }
        return jsonObj;
    }

    public static JSONObject getChangeChildrenCardContent(String type) throws Exception {
        jsonObj = generateContent(type);
        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        return jsonObj;
    }

    private static int getGeneratedAge(){
        Random random = new Random();
        return random.nextInt((99 - 0) + 1) + 0;
    }
}

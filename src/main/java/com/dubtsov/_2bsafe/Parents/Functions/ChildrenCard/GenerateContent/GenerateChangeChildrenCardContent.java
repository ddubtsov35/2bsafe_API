package com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GeneratePhoneClass;
import com.dubtsov._2bsafe.Parents.Pool.ChildrenCardPools;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Random;

/**
 * Created by user on 08.09.17.
 */
public class GenerateChangeChildrenCardContent{
    public GenerateChangeChildrenCardContent() throws ParseException {}
    public static String generatedPhone = GeneratePhoneClass.getGeneratedPhone();
    public static int generatedAge = getGeneratedAge();

    private static JSONObject generateContent(String type){
        JSONObject jsonObj = new JSONObject();

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
        JSONObject jsonObj = new JSONObject();
        jsonObj = generateContent(type);
        if(GenerateProfileIdContent.profileId == null){
            jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        } else{
            jsonObj.put("profile_id", GenerateProfileIdContent.profileId);
        }
        return jsonObj;
    }

    public static Object[] provideNegativeGetAccountContent1() throws IOException, ParseException {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("profile_id", null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("profile_id", "failRnd");

        JSONObject jsonObj3 = new JSONObject();

        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3}
        };
    }





    private static int getGeneratedAge(){
        Random random = new Random();
        return random.nextInt((99 - 0) + 1) + 0;
    }
}

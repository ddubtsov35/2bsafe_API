package com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GeneratePhoneClass;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 08.09.17.
 */
public class GenerateChangeChildrenCardContent extends BaseContent{
    public GenerateChangeChildrenCardContent() throws ParseException {}

    private static JSONObject generateContent(String type){
        switch (type){
            case "phone":
                jsonObj.put("phone", GeneratePhoneClass.getStaticPhone());
                break;
            case "age":
                jsonObj.put("age", 99);
                break;
            case "all":
                jsonObj.put("phone", GeneratePhoneClass.getStaticPhone());
                jsonObj.put("age", 99);
                break;
        }
        return jsonObj;
    }

    public static JSONObject getChangeChildrenCardContent(String type) throws IOException {
        jsonObj = generateContent(type);
        //TODO profileID
        //jsonObj = GenerateRegistrationContent.getRegistrationStep1Content();
        return jsonObj;
    }
}

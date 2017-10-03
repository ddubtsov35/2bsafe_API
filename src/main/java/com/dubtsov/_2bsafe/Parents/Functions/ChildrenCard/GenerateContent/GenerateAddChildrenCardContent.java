package com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateNameClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GeneratePhoneClass;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Random;

/**
 * Created by user on 08.09.17.
 */
public class GenerateAddChildrenCardContent{

    private static JSONObject jsonObj = new JSONObject();
    private static Random random;

    public GenerateAddChildrenCardContent() throws ParseException {}

    public static JSONObject getAddChildrenCard() throws IOException {
        random = new Random();
        jsonObj.put("name", GenerateNameClass.getGenerateName());
        jsonObj.put("phone", GeneratePhoneClass.getGeneratedPhone());
        jsonObj.put("age", String.valueOf(random.nextInt((90 - 0) + 1) + 0));
        jsonObj.put("send_sms", String.valueOf(0));
        //content.put("file", "test.png");
        return jsonObj;
    }
}

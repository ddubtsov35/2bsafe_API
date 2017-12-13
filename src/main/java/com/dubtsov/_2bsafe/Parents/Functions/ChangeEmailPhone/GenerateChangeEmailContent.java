package com.dubtsov._2bsafe.Parents.Functions.ChangeEmailPhone;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateEmailClass;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 08.09.17.
 */
public class GenerateChangeEmailContent {
    public GenerateChangeEmailContent() throws ParseException {}

    public static JSONObject getChangeEmailContent() throws IOException {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("em", GenerateEmailClass.getGeneratedEmail());
        return jsonObj;
    }
}

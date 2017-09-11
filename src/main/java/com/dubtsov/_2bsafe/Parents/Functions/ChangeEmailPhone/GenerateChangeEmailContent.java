package com.dubtsov._2bsafe.Parents.Functions.ChangeEmailPhone;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.BaseContent;
import com.dubtsov._2bsafe.Parents.Functions.Registration.GenerateRegistrationContent;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 08.09.17.
 */
public class GenerateChangeEmailContent extends BaseContent {
    public GenerateChangeEmailContent() throws ParseException {}

    public static JSONObject getChangeEmailContent() throws IOException {
        jsonObj = GenerateRegistrationContent.getRegistrationStep1Content();
        return jsonObj;
    }
}

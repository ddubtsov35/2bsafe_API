package com.dubtsov._2bsafe.Parents.Functions.Account;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.BaseContent;
import com.dubtsov._2bsafe.Parents.Functions.Registration.GenerateRegistrationContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 07.09.17.
 */
public class GenerateAccountContent extends BaseContent {

    public GenerateAccountContent() throws ParseException {}

    public static JSONObject getSetAccountContent() throws IOException {
        jsonObj = GenerateRegistrationContent.getRegistrationStep1Content;
        jsonObj.put("rnd", GenerateTokenClass.getGeneratedToken());
        jsonObj.put("lbat", 2);
        jsonObj.put("nbat", 2);
        jsonObj.put("lsig", 2);
        jsonObj.put("nsig", 2);
        jsonObj.put("lunav", 2);
        jsonObj.put("nunav", 2);
        jsonObj.put("nph", 2);
        jsonObj.put("nsms", 2);
        jsonObj.put("ngps", 2);
        jsonObj.put("name", "Толян");
        jsonObj.put("em", jsonObj.get("em"));
        jsonObj.put("ph", "+71111111111");
        return jsonObj;
    }


    public static JSONObject getSetAllAccountContent() throws IOException {
        jsonObj = GenerateRegistrationContent.getRegistrationStep1Content;
        jsonObj.put("rnd", GenerateTokenClass.getGeneratedToken());
        jsonObj.put("lbat", 2);
        jsonObj.put("nbat", 2);
        jsonObj.put("lsig", 2);
        jsonObj.put("nsig", 2);
        jsonObj.put("lunav", 2);
        jsonObj.put("nunav", 2);
        jsonObj.put("nph", 2);
        jsonObj.put("nsms", 2);
        jsonObj.put("ngps", 2);
        jsonObj.put("name", "Толян");
        return jsonObj;
    }


    public static JSONObject getAccountContent() throws IOException {
        jsonObj = GenerateRegistrationContent.getRegistrationStep1Content;
        jsonObj.put("rnd", GenerateTokenClass.getGeneratedToken());
        return jsonObj;
    }

}

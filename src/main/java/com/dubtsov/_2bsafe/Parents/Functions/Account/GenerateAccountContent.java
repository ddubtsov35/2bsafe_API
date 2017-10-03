package com.dubtsov._2bsafe.Parents.Functions.Account;

import com.dubtsov._2bsafe.Parents.Functions.Registration.GenerateRegistrationContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Pool.UserPool;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 07.09.17.
 */
public class GenerateAccountContent {

    public GenerateAccountContent() throws ParseException {}

    private static JSONObject jsonObj;

    public static JSONObject getSetAccountContent() throws IOException, ParseException {
        jsonObj = new JSONObject();
        jsonObj.put("rnd", GenerateTokenClass.getGeneratedToken());
        jsonObj.put("nbat", 1);
        return jsonObj;
    }


    public static JSONObject getSetAllAccountContent() throws IOException, ParseException {
        jsonObj = new JSONObject();
        if(UserPool.getUserFromFile() == null) {
            jsonObj = GenerateRegistrationContent.getRegistrationStep1Content;
        } else{
            jsonObj = UserPool.getUserFromFile();
        }
        jsonObj.put("rnd", GenerateTokenClass.getGeneratedToken());
        jsonObj.put("lbat", 1);
        jsonObj.put("nbat", 1);
        jsonObj.put("lsig", 1);
        jsonObj.put("nsig", 1);
        jsonObj.put("lunav", 1);
        jsonObj.put("nunav", 1);
        jsonObj.put("nph", 1);
        jsonObj.put("nsms", 1);
        jsonObj.put("ngps", 1);
        jsonObj.put("name", "Толян");
        return jsonObj;
    }


    public static JSONObject getAccountContent() throws IOException {
        jsonObj = new JSONObject();
        jsonObj.put("rnd", GenerateTokenClass.getGeneratedToken());
        return jsonObj;
    }

}

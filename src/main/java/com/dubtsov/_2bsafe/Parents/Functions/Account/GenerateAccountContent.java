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

    public static JSONObject getSetAccountContent() throws IOException, ParseException {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("nbat", 1);
        return jsonObj;
    }

    public static Object[] provideGetSetAccountContent1() throws IOException, ParseException {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("nbat", null);

        JSONObject jsonObj5 = new JSONObject();

        JSONObject jsonObj6 = new JSONObject();
        jsonObj6.put("nbat", 146);

        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj5},
                new JSONObject[]{jsonObj6}
        };
    }




    public static JSONObject getSetAllAccountContent() throws IOException, ParseException {
        JSONObject jsonObj = new JSONObject();
        if(UserPool.getUserFromFile() == null) {
            jsonObj = GenerateRegistrationContent.getRegistrationStep1Content;
        } else{
            jsonObj = UserPool.getUserFromFile();
        }
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
        JSONObject jsonObj = new JSONObject();
        return jsonObj;
    }

}

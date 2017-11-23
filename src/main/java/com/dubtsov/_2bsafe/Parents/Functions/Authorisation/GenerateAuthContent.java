package com.dubtsov._2bsafe.Parents.Functions.Authorisation;

import com.dubtsov._2bsafe.Parents.Functions.PasswordChange.GeneratePasswordChangeContent;
import com.dubtsov._2bsafe.Parents.Functions.Registration.GenerateRegistrationContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Pool.UserPool;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Random;

/**
 * Created by user on 12.09.17.
 */
public class GenerateAuthContent{

    private static JSONObject jsonObj;


    public static JSONObject preparationContent(JSONObject jsonObject){
        jsonObj = new JSONObject();
        if(jsonObject.containsKey("em")) {
            Object obj = jsonObject.remove("em");
            jsonObject.remove("em");
            jsonObject.put("login", obj);
        }
        return jsonObject;
    }


    public static JSONObject getAuthContent() throws IOException, ParseException {
        jsonObj = new JSONObject();
        if(UserPool.getUserFromFile() != null) {
            jsonObj = UserPool.getUserFromFile();
            jsonObj = preparationContent(jsonObj);
        } else {
            jsonObj.put("login", GenerateRegistrationContent.getRegistrationStep1Content.get("em"));
            jsonObj.put("pwd", GenerateRegistrationContent.getRegistrationStep1Content.get("pwd"));
        }
        jsonObj.put("dtype", 0);
        return jsonObj;
    }

    public static Object[] provideNegativeGetAuthContent() throws IOException, ParseException {
        jsonObj = new JSONObject();
        if(UserPool.getUserFromFile() != null) {
            jsonObj = UserPool.getUserFromFile();
            jsonObj = preparationContent(jsonObj);
        } else {
            jsonObj.put("login", GenerateRegistrationContent.getRegistrationStep1Content.get("em"));
            jsonObj.put("pwd", GenerateRegistrationContent.getRegistrationStep1Content.get("pwd"));
        }

        JSONObject jsonObj1 = new JSONObject();
        jsonObj1.put("login", null);
        jsonObj1.put("pwd",null);
        jsonObj1.put("dtype", null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("login", jsonObj.get("login"));
        jsonObj2.put("pwd",null);
        jsonObj2.put("dtype", null);

        JSONObject jsonObj3 = new JSONObject();
        jsonObj3.put("login", null);
        jsonObj3.put("pwd",jsonObj.get("pwd"));
        jsonObj3.put("dtype", null);

        JSONObject jsonObj4 = new JSONObject();
        jsonObj4.put("pwd",null);
        jsonObj4.put("dtype", 0);

        JSONObject jsonObj5 = new JSONObject();
        jsonObj5.put("login", null);
        jsonObj5.put("dtype", null);

        JSONObject jsonObj6 = new JSONObject();
        jsonObj6.put("login", null);
        jsonObj6.put("pwd",null);


        JSONObject jsonObj7 = new JSONObject();
        jsonObj7.put("login", "fakeLogin");
        jsonObj7.put("pwd",jsonObj.get("pwd"));
        jsonObj7.put("dtype", 1);


        JSONObject jsonObj8 = new JSONObject();
        jsonObj8.put("login", jsonObj.get("login"));
        jsonObj8.put("pwd","fakePwd");
        jsonObj8.put("dtype", 0);


        JSONObject jsonObj9 = new JSONObject();
        jsonObj9.put("login", jsonObj.get("login"));
        jsonObj9.put("pwd",jsonObj.get("pwd"));
        jsonObj9.put("dtype", 456);


        JSONObject jsonObj10 = new JSONObject();
        jsonObj10.put("dtype", 0);

        JSONObject jsonObj11 = new JSONObject();
        jsonObj11.put("pwd",jsonObj.get("pwd"));

        JSONObject jsonObj12 = new JSONObject();
        jsonObj12.put("login", jsonObj.get("login"));

        JSONObject jsonObj13 = new JSONObject();

        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3},
                new JSONObject[]{jsonObj4},
                new JSONObject[]{jsonObj5},
                new JSONObject[]{jsonObj6},
                new JSONObject[]{jsonObj7},
                new JSONObject[]{jsonObj8},
                new JSONObject[]{jsonObj9},
                new JSONObject[]{jsonObj10},
                new JSONObject[]{jsonObj11},
                new JSONObject[]{jsonObj12},
                new JSONObject[]{jsonObj13},
        };
    }




    public static JSONObject getAuthContentWithNewPassword() throws Exception {
        jsonObj = new JSONObject();
        if(UserPool.getUserFromFile() != null) {
            jsonObj = UserPool.getUserFromFile();
            jsonObj = preparationContent(jsonObj);
        } else {
            jsonObj.put("login", GenerateRegistrationContent.getRegistrationStep1Content.get("em"));
            jsonObj.put("pwd", GeneratePasswordChangeContent.getPasswordChangeContent().get("npwd"));
        }
        jsonObj.put("dtype", 0);
        return jsonObj;
    }

}
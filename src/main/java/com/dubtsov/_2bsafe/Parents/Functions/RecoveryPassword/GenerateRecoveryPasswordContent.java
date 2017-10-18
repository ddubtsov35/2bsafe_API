package com.dubtsov._2bsafe.Parents.Functions.RecoveryPassword;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.InputClass;
import com.dubtsov._2bsafe.Parents.Functions.Registration.GenerateRegistrationContent;
import com.dubtsov._2bsafe.Parents.Pool.UserPool;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 12.09.17.
 */
public class GenerateRecoveryPasswordContent{

    private static JSONObject jsonObj;

    public static JSONObject startRecoveryPasswordContent() throws Exception {
        jsonObj = new JSONObject();
        if(UserPool.getUserFromFile() == null) {
            jsonObj.put("login", GenerateRegistrationContent.getRegistrationStep1Content.get("em"));
        } else{
            jsonObj.put("login", UserPool.getUserFromFile().get("em"));
        }
        return jsonObj;
    }

    public static JSONObject confirmRecoveryPasswordContent() throws Exception {
        jsonObj = new JSONObject();
        InputClass inputClass = new InputClass();
        if(UserPool.getUserFromFile() == null) {
            jsonObj.put("login", GenerateRegistrationContent.getRegistrationStep1Content.get("em"));
            int code = inputClass.code(GenerateRegistrationContent.getRegistrationStep1Content.get("em").toString());
            jsonObj.put("code", code);
        } else{
            jsonObj.put("login", UserPool.getUserFromFile().get("em"));
            int code = inputClass.code(UserPool.getUserFromFile().get("em").toString());
            jsonObj.put("code", code);
        }

        return jsonObj;
    }



    public static Object[] provideNegativeGetAuthContent() throws IOException, ParseException {
        jsonObj = new JSONObject();
        InputClass inputClass = new InputClass();
        if(UserPool.getUserFromFile() == null) {
            jsonObj.put("login", GenerateRegistrationContent.getRegistrationStep1Content.get("em"));
            int code = inputClass.code(GenerateRegistrationContent.getRegistrationStep1Content.get("em").toString());
            jsonObj.put("code", code);
        } else{
            jsonObj.put("login", UserPool.getUserFromFile().get("em"));
            int code = inputClass.code(UserPool.getUserFromFile().get("em").toString());
            jsonObj.put("code", code);
        }

        JSONObject jsonObj1 = new JSONObject();
        jsonObj1.put("login", null);
        jsonObj1.put("code",null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("login", jsonObj.get("login"));
        jsonObj2.put("code",null);

        JSONObject jsonObj3 = new JSONObject();
        jsonObj3.put("login", null);
        jsonObj3.put("code",jsonObj.get("pwd"));

        JSONObject jsonObj4 = new JSONObject();
        jsonObj4.put("code",null);

        JSONObject jsonObj5 = new JSONObject();
        jsonObj5.put("login", null);

        JSONObject jsonObj7 = new JSONObject();
        jsonObj7.put("login", "fakeLogin");
        jsonObj7.put("code",jsonObj.get("code"));

        JSONObject jsonObj8 = new JSONObject();
        jsonObj8.put("login", jsonObj.get("login"));
        jsonObj8.put("code","fakePwd");

        JSONObject jsonObj9 = new JSONObject();
        jsonObj9.put("login", jsonObj.get("login"));
        jsonObj9.put("code",jsonObj.get("code"));

        JSONObject jsonObj10 = new JSONObject();
        jsonObj10.put("dtype", 0);

        JSONObject jsonObj11 = new JSONObject();
        jsonObj11.put("code",jsonObj.get("code"));

        JSONObject jsonObj12 = new JSONObject();
        jsonObj12.put("login", jsonObj.get("login"));

        JSONObject jsonObj13 = new JSONObject();

        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3},
                new JSONObject[]{jsonObj4},
                new JSONObject[]{jsonObj5},
                new JSONObject[]{jsonObj7},
                new JSONObject[]{jsonObj8},
                new JSONObject[]{jsonObj9},
                new JSONObject[]{jsonObj10},
                new JSONObject[]{jsonObj11},
                new JSONObject[]{jsonObj12},
                new JSONObject[]{jsonObj13},
        };
    }

}

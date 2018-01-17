package com.dubtsov._2bsafe.Parents.Functions.Authorisation.GenerateData;

import com.dubtsov._2bsafe.Parents.Functions.Registration.GenerateRegistrationContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.ForProvideData;
import com.dubtsov._2bsafe.Parents.Pool.UserPool;
import org.json.simple.JSONObject;

import static com.dubtsov._2bsafe.Parents.Functions.Authorisation.GenerateData.GenerateAuthContent.preparationContent;

/**
 * Created by user on 17.01.18.
 */
public class ProvideGetAuth {

    public static Object[] provideNegativeGetAuthContent() throws Exception {
        ForProvideData.getTestData();

        JSONObject jsonObj = new JSONObject();
        if(UserPool.getUserFromFile() != null) {
            jsonObj = UserPool.getUserFromFile();
            jsonObj = preparationContent(jsonObj);
        } else {
            jsonObj.put("login", GenerateRegistrationContent.getRegStep1Content().get("em"));
            jsonObj.put("pwd", GenerateRegistrationContent.getRegStep1Content().get("pwd"));
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

        return new Object[]{jsonObj, jsonObj2, jsonObj3, jsonObj4, jsonObj5, jsonObj6, jsonObj7, jsonObj8, jsonObj9, jsonObj10, jsonObj11, jsonObj12, jsonObj13,};
    }

}

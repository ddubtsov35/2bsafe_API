package com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers;

import com.dubtsov._2bsafe.Parents.Functions.IntervalBlock.IntervalBlockClass;
import com.dubtsov._2bsafe.Parents.Functions.Registration.GenerateRegistrationContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Models.IntervalBlock;
import com.dubtsov._2bsafe.Parents.Pool.UserPool;
import org.json.simple.JSONObject;

import java.util.List;
import java.util.Random;

/**
 * Created by user on 12.09.17.
 */
public class GenerateRegisteredUsersContent{

    public static JSONObject deleteAccountContent() throws Exception {
        JSONObject jsonObj = new JSONObject();
        if(UserPool.getUserFromFile() == null) {
            jsonObj.put("pwd", GenerateRegistrationContent.getRegistrationStep1Content.get("pwd"));
        } else{
            jsonObj.put("pwd", UserPool.getUserFromFile().get("pwd"));
        }
        return jsonObj;
    }
    public static Object[] provideNegativeDeleteAccountContent() throws Exception {
        JSONObject jsonObj = new JSONObject();
        JSONObject jsonObj100 = new JSONObject();
        if(UserPool.getUserFromFile() == null) {
            jsonObj100.put("pwd", GenerateRegistrationContent.getRegistrationStep1Content.get("pwd"));
        } else{
            jsonObj100.put("pwd", UserPool.getUserFromFile().get("pwd"));
        }


        jsonObj.put("pwd", jsonObj100.get("pwd"));

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("pwd", null);

        JSONObject jsonObj3 = new JSONObject();

        JSONObject jsonObj4 = new JSONObject();
        Random random = new Random();
        jsonObj4.put("pwd", random.nextInt(1000000 - 1 + 1) + 1);

        JSONObject jsonObj5 = new JSONObject();
        jsonObj5.put("pwd", null);
        JSONObject jsonObj6 = new JSONObject();
        jsonObj4.put("pwd", jsonObj100.get("pwd"));


        return new Object[]{
                new JSONObject[]{jsonObj},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3},
                new JSONObject[]{jsonObj4},
                new JSONObject[]{jsonObj5},
                new JSONObject[]{jsonObj6}
        };
    }






    public static JSONObject getHeadersString() throws Exception {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("em", "111@ru.ru");
        jsonObj.put("pwd", "3,14plsvtijr");
        return jsonObj;
    }

    public static JSONObject getListRegisteredContent() throws Exception {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("sortt", 0);
        jsonObj.put("sortf", 0);
        return jsonObj;
    }

}

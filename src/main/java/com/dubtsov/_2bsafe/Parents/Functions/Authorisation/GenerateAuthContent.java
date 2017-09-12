package com.dubtsov._2bsafe.Parents.Functions.Authorisation;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.BaseContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Pool.UserPool;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 12.09.17.
 */
public class GenerateAuthContent extends BaseContent{

    public static JSONObject getAuthContent() throws IOException, ParseException {
        System.out.println("1 " + jsonObj);
        if(UserPool.getUserFromFile() != null) {
            jsonObj = UserPool.getUserFromFile();
        }
        System.out.println("2 " + jsonObj);
        jsonObj.put("dtype", 0);
        System.out.println("3 " + jsonObj);
        return jsonObj;
    }

}

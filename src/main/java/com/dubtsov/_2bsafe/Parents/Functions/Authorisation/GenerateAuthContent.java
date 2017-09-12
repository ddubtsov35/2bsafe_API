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
        //if(UserPool.getUserFromFile() != null) {
            jsonObj = UserPool.getUserFromFile();
            jsonObj.put("dtype", 0);
            return jsonObj;
        //} else {

        //}
    }

}

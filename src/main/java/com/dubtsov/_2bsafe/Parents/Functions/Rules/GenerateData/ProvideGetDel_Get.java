package com.dubtsov._2bsafe.Parents.Functions.Rules.GenerateData;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Random;

/**
 * Created by user on 17.01.18.
 */
public class ProvideGetDel_Get {

    public static Object[] provideGetDel_Get_Content() throws IOException, ParseException {
        Random random = new Random();

        JSONObject jsonObj = new JSONObject();

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("rule_id", null);

        JSONObject jsonObj3 = new JSONObject();
        jsonObj3.put("rule_id", random.nextInt(1000000 - 1 + 1)+1);


        return new Object[]{jsonObj, jsonObj2, jsonObj3};
    }

}

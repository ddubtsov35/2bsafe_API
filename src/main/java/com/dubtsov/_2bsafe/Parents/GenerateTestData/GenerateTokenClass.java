package com.dubtsov._2bsafe.Parents.GenerateTestData;

import org.json.simple.JSONObject;

import java.util.Random;

/**
 * Created by user on 20.07.17.
 */
public class GenerateTokenClass {
    public static String getGeneratedToken(){
        Random random = new Random();
        String token = "";
        for(int i = 0; i < 15; i++){
            token = token + (random.nextInt((9 - 0) + 1) + 0);
        }
        return token;
    }

    public static Object[] provideNegativeGetGeneratedToken(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("rnd", null);

        JSONObject jsonObject1 = new JSONObject();

        return new Object[]{
                new JSONObject[] {jsonObject},
                new JSONObject[]{jsonObject1}
        };
    }
}

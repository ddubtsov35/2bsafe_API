package com.dubtsov._2bsafe.Parents.GenerateTestData;

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
}

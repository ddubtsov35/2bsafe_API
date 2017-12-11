package com.dubtsov._2bsafe.Parents.GenerateTestData;

import java.util.Random;

/**
 * Created by user on 12.07.17.
 */
public class GeneratePhoneClass {

    public static String getGeneratedPhone(){
        Random random = new Random();
        String phone = "79";
        for(int i = 0; i < 9; i++){
            phone = phone + (random.nextInt((9 - 0) + 1) + 0);
        }
        return phone;
    }
}

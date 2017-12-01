package com.dubtsov._2bsafe.Parents.GenerateTestData;

import java.io.*;
import java.util.Random;

/**
 * Created by user on 12.07.17.
 */
public class GenerateEmailClass {

    public static String emailStatic;
    private static int count;

    private static int getRandomInt(){
        Random random = new Random();
        int countRnd = random.nextInt(1000000 - 1 + 1)+1;
        count = countRnd;
        return countRnd;
    }

    public static int getCountFromFile() throws IOException {
        return count;
    }

    public static String getGeneratedEmail() throws IOException {
        getRandomInt();
        String generatedEmail = "dev_ci_t" + count + "@p33.org";
        emailStatic = generatedEmail;
        return generatedEmail;
    }

}

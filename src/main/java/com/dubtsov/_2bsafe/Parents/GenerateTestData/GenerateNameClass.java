package com.dubtsov._2bsafe.Parents.GenerateTestData;

import java.io.IOException;

/**
 * Created by user on 18.07.17.
 */
public class GenerateNameClass {

    public static String getGenerateName() throws IOException {
        String name = GenerateEmailClass.getGeneratedEmail();
        name = name.substring(0, name.indexOf("@"));
        return name;
    }
}

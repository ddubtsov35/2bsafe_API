package com.dubtsov._2bsafe.Functions;

import com.dubtsov._2bsafe.GenerateTestData.GenerateEmailClass;
import com.dubtsov._2bsafe.Response.ResponseClass;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 12.07.17.
 */
public class BaseClass {
    HashMap<String, String> content;
    ResponseClass response;
    String constPassword;
    String dynamicPassword;
    DeleteUserClass deleteUserClass;
    AuthorisationUserClass authorisationUserClass;

    public BaseClass() throws IOException {
        content = new LinkedHashMap<String, String>();
        this.constPassword = "qqqqqq";
        this.dynamicPassword = "qqqqqq" + GenerateEmailClass.getCountFromFile();
    }
}

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
    HashMap superContent;
    ResponseClass response;
    String constPassword;
    String dynamicPassword;
    DeleteUserClass deleteUserClass;
    AuthorisationUserClass authorisationUserClass;
    ListRegisteredUsersClass listRegisteredUsersClass;

    public BaseClass() throws IOException {
        superContent = new LinkedHashMap<>();
        this.constPassword = "qqqqqq";
        this.dynamicPassword = "qqqqqq" + GenerateEmailClass.getCountFromFile();
    }
}

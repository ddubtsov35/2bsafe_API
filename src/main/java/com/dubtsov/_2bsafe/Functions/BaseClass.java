package com.dubtsov._2bsafe.Functions;

import com.dubtsov._2bsafe.GenerateTestData.GenerateEmailClass;
import com.dubtsov._2bsafe.Response.ResponseClass;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 12.07.17.
 */
public  class BaseClass {

    protected static HashMap superContent = new LinkedHashMap<>();
    protected ResponseClass response;
    protected String constPassword = "qqqqqq";
    protected String dynamicPassword = "qqqqqq" + GenerateEmailClass.getCountFromFile();
    protected DeleteUserClass deleteUserClass;
    protected AuthorisationUserClass authorisationUserClass;
    protected ListRegisteredUsersClass listRegisteredUsersClass;
    protected PasswordChangeClass passwordChangeClass;
    protected RegistrationUserStep1Class registrationUserStep1Class;
    protected RegistrationUserStep2Class registrationUserStep2Class;
    protected RecoveryPasswordClass recoveryPasswordClass;

    public BaseClass() throws IOException {}
}

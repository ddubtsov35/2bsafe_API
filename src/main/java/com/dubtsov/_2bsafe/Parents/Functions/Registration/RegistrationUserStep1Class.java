package com.dubtsov._2bsafe.Parents.Functions.Registration;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateEmailClass;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 12.07.17.
 */
public class RegistrationUserStep1Class extends BaseClass {

    public RegistrationUserStep1Class() throws IOException {}

    public HashMap registrationUserStep1() throws IOException {
        superContent.put("em", GenerateEmailClass.getGeneratedEmail());
        superContent.put("pwd", dynamicPassword);
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/reg/step1", superContent);
        return superContent;
    }

    public Response sendCodeRegistration() throws IOException {
        registrationUserStep1();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/reg/resend_email");
        return responseClass.getResponse();
    }
}

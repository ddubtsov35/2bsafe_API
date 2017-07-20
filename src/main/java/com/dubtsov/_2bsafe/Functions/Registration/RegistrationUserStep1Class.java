package com.dubtsov._2bsafe.Functions.Registration;

import com.dubtsov._2bsafe.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.GenerateTestData.GenerateEmailClass;
import com.dubtsov._2bsafe.Response.ResponseClass;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 12.07.17.
 */
public class RegistrationUserStep1Class extends BaseClass {

    HashMap emptyContent;

    public RegistrationUserStep1Class() throws IOException {}


    public HashMap registrationUserStep1() throws IOException {

        superContent.put("em", GenerateEmailClass.getGeneratedEmail());
        superContent.put("pwd", dynamicPassword);

        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/reg/step1", superContent);

        if(responseClass.getResponse().code() == 200){
            return superContent;
        } else {
            return null;
        }
    }

    public String sendCodeRegistration() throws IOException {
        registrationUserStep1();
        emptyContent = new LinkedHashMap<>();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/reg/resend_email", emptyContent);
        String result = responseClass.getResponse().body().string();
        return result;
    }

    /*public String sendCodeRegistrationDuring3Minutes() throws IOException {
        HashMap emptyContent = new LinkedHashMap<>();
        Timer timer = new Timer();
        timer.
        registrationUserStep1();
        responseClass = new ResponseClass("https://lkn.safec.ru/os_api/accounts/v1.0/reg/resend_email", emptyContent);
        String result = responseClass.getResponse().body().string();
        return result;
    }*/

}

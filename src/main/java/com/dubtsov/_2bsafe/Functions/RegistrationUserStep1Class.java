package com.dubtsov._2bsafe.Functions;

import com.dubtsov._2bsafe.GenerateTestData.GenerateEmailClass;
import com.dubtsov._2bsafe.Response.ResponseClass;

import javax.management.timer.Timer;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TimerTask;

/**
 * Created by user on 12.07.17.
 */
public class RegistrationUserStep1Class extends BaseClass {

    public RegistrationUserStep1Class() throws IOException {}


    public HashMap registrationUserStep1() throws IOException {
        String email = GenerateEmailClass.getGeneratedEmail();

        superContent.put("em", email);
        superContent.put("pwd", dynamicPassword);

        response = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/reg/step1", superContent);

        if(response.getResponse().code() == 200){
            return superContent;
        } else {
            return null;
        }
    }

    public String sendCodeRegistration() throws IOException {
        registrationUserStep1();
        HashMap emptyContent = new LinkedHashMap<>();
        response = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/reg/resend_email", emptyContent);
        String result = response.getResponse().body().string();
        return result;
    }

    /*public String sendCodeRegistrationDuring3Minutes() throws IOException {
        HashMap emptyContent = new LinkedHashMap<>();
        Timer timer = new Timer();
        timer.
        registrationUserStep1();
        response = new ResponseClass("https://lkn.safec.ru/os_api/accounts/v1.0/reg/resend_email", emptyContent);
        String result = response.getResponse().body().string();
        return result;
    }*/

}

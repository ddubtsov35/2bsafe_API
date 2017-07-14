package com.dubtsov._2bsafe.Functions;

import com.dubtsov._2bsafe.GenerateTestData.GenerateEmailClass;
import com.dubtsov._2bsafe.Response.ResponseClass;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 12.07.17.
 */
public class RegistrationUserStep1Class extends BaseClass {

    public RegistrationUserStep1Class() throws IOException {}


    public HashMap registrationUserStep1() throws IOException {

        String email = GenerateEmailClass.getGeneratedEmail();

        content.put("em", email);
        content.put("pwd", dynamicPassword);

        response = new ResponseClass("https://lkn.safec.ru/os_api/accounts/v1.0/reg/step1", content);

        if(response.getResponse().code() == 200){
            return content;
        } else {
            return null;
        }
    }

}

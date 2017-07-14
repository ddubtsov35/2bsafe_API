package com.dubtsov._2bsafe;

import com.dubtsov._2bsafe.GenerateTestData.GenerateEmailClass;

import java.io.IOException;

/**
 * Created by user on 12.07.17.
 */
public class RegistrationUserStep1Class extends BaseClass {

    public RegistrationUserStep1Class() throws IOException {}


    public String registrationUserStep1() throws IOException {

        String email = GenerateEmailClass.getGeneratedEmail();

        super.content.put("em", email);
        super.content.put("pwd", super.dynamicPassword);

        super.response = new ResponseClass("/os_api/accounts/v1.0/reg/step1", super.content);

        if(super.response.getResponse().code() == 200){
            return email;
        } else {
            return "";
        }
    }

}

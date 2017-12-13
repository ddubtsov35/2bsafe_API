package com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep1Class;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep2Class;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 13.12.17.
 */
public class ForProvideData {
    public static void getTestData() throws Exception {
        RegistrationUserStep1Class registrationUserStep1Class = new RegistrationUserStep1Class();
        registrationUserStep1Class.registrationUserStep1();
        RegistrationUserStep2Class registrationUserStep2Class = new RegistrationUserStep2Class();
        registrationUserStep2Class.registrationUserStep2Web();
        AuthorisationChildClass authorisationChildClass = new AuthorisationChildClass();
        authorisationChildClass.authorisationChildren();
    }
}

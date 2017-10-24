package com.dubtsov._2bsafe.Parents.Functions.ChangeEmailPhone;

import com.dubtsov._2bsafe.Parents.Functions.Registration.GenerateRegistrationContent;
import com.dubtsov._2bsafe.Parents.Pool.UserPool;
import org.json.simple.parser.ParseException;

import javax.jws.soap.SOAPBinding;
import javax.swing.*;
import java.io.IOException;

/**
 * Created by user on 30.08.17.
 */
public class Timeout {

    public static void waitEmailVerification(String newEmail) throws IOException, ParseException {
        /*if(UserPool.getUserFromFile() == null) {
            JOptionPane.showInputDialog("Нажмите на кнопку подтверждения после перехода по ссылке для смены пароля " + GenerateRegistrationContent.getRegistrationStep1Content.get("em"));
        } else{
            JOptionPane.showInputDialog("Нажмите на кнопку подтверждения после перехода по ссылке для смены пароля " + UserPool.getUserFromFile().get("em"));
        }*/
        JOptionPane.showInputDialog("Нажмите на кнопку подтверждения после перехода по ссылке для смены пароля " + newEmail);
    }

}

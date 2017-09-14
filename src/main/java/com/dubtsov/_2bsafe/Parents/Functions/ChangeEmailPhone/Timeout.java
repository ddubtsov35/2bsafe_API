package com.dubtsov._2bsafe.Parents.Functions.ChangeEmailPhone;

import com.dubtsov._2bsafe.Parents.Functions.Registration.GenerateRegistrationContent;

import javax.swing.*;
import java.io.IOException;

/**
 * Created by user on 30.08.17.
 */
public class Timeout {

    public static void waitEmailVerification() throws IOException {
        JOptionPane.showInputDialog("Нажмите на кнопку подтверждения после перехода по ссылке для смены пароля " + GenerateRegistrationContent.getRegistrationStep1Content.get("em"));
    }

}

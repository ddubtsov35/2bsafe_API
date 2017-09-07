package com.dubtsov._2bsafe.Parents.Functions.ChangeEmailPhone;

import javax.swing.*;

/**
 * Created by user on 30.08.17.
 */
public class Timeout {

    public static void waitEmailVerification(String email) {
        JOptionPane.showInputDialog("Нажмите на кнопку подтверждения после перехода по ссылке для смены пароля " + email);
    }

}

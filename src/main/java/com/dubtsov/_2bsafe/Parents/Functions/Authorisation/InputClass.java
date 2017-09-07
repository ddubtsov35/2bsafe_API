package com.dubtsov._2bsafe.Parents.Functions.Authorisation;

import javax.swing.*;

/**
 * Created by user on 15.08.17.
 */
public class InputClass {

    public int code(String email) {
        String code = JOptionPane.showInputDialog("Введите код подтверждения из email " + email);
        return Integer.parseInt(code);
    }
}

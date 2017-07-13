package com.dubtsov._2bsafe;

import java.io.IOException;

/**
 * Created by user on 12.07.17.
 */
public class DeleteUserClass extends BaseClass{
    public DeleteUserClass() throws IOException {}

    public void deleteUser(String password) throws IOException {
        super.content.put("pwd", password);
        super.response = new ResponseClass("/os_api/accounts/v1.0/delete_account", content);
        super.response.getResponse();
    }
}

package com.dubtsov._2bsafe.Functions;

import com.dubtsov._2bsafe.GenerateTestData.GenerateEmailClass;
import com.dubtsov._2bsafe.Models.RegisteredUser;
import com.dubtsov._2bsafe.Response.ResponseClass;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by user on 17.07.17.
 */
public class RegistrationUserStep2Class extends BaseClass{

    public RegistrationUserStep2Class() throws IOException {
    }

    private HashMap content = new LinkedHashMap();

    public void registrationUserStep2(HashMap content) throws IOException, ParseException, java.text.ParseException {
        listRegisteredUsersClass = new ListRegisteredUsersClass();
        List<RegisteredUser> registeredUserList = listRegisteredUsersClass.getListRegisteredUsers();
        RegisteredUser targetUser = new RegisteredUser();
        for(int i=0; i<registeredUserList.size();i++){
            if(registeredUserList.get(i).getEm().equals(content.get("em"))){
                targetUser = registeredUserList.get(i);
            }
        }
        this.content.put("dtype", 0);
        this.content.put("taid", targetUser.getAcc_id());
        this.content.put("code", targetUser.getAct_code());

        System.out.println( this.content);

        response = new ResponseClass("https://lkn.safec.ru/os_api/accounts/v1.0/reg/step2",  this.content);
        response.getResponse();
    }

}

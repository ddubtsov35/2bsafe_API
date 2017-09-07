package com.dubtsov._2bsafe.Parents.Functions.Registration;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers.ListRegisteredUsersClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Models.RegisteredUser;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by user on 17.07.17.
 */
public class RegistrationUserStep2Class extends BaseClass {

    List<RegisteredUser> registeredUserList;

    public RegistrationUserStep2Class() throws IOException, ParseException, java.text.ParseException {
        listRegisteredUsersClass = new ListRegisteredUsersClass();
        registeredUserList = listRegisteredUsersClass.getListRegisteredUsers();
    }

    private HashMap content = new LinkedHashMap();

    public HashMap registrationUserStep2Web(HashMap content) throws IOException, ParseException, java.text.ParseException {
        RegisteredUser targetUser = new RegisteredUser();
        for(int i=0; i<registeredUserList.size();i++){
            if(registeredUserList.get(i).getEm().equals(content.get("em"))){
                targetUser = registeredUserList.get(i);
                break;
            }
        }
        content.put("dtype", 0);
        content.put("em", targetUser.getEm());
        content.put("code", targetUser.getAct_code());

        System.out.println( this.content);

        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/reg/step2",  content);
        responseClass.getResponse();
        return content;
    }

    public HashMap registrationUserStep2AndroidPhone(HashMap content) throws IOException, ParseException, java.text.ParseException {
        RegisteredUser targetUser = new RegisteredUser();
        for(int i=0; i<registeredUserList.size();i++){
            if(registeredUserList.get(i).getEm().equals(content.get("em"))){
                targetUser = registeredUserList.get(i);
                break;
            }
        }
        String generatedToken = GenerateTokenClass.getGeneratedToken();

        content.put("em", targetUser.getEm());
        content.put("dtype", 1);
        content.put("was_restored", false);
        content.put("code", targetUser.getAct_code());
        content.put("token", generatedToken);
        content.put("os", "testOS");
        content.put("osv", "testVersion");
        content.put("scr", "DoxyaNaDoxya");
        content.put("man", "testMan");
        content.put("mod", "testMod");
        content.put("type", 1);

        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/reg/step2",  content);
        String getLkid = responseClass.getResponse().body().string();
        content.put("lkid", getLkid.substring(getLkid.indexOf("lkid"),getLkid.indexOf("lkid",getLkid.indexOf("\""))));
        return content;
    }

}

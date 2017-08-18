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

    public RegistrationUserStep2Class() throws IOException {
    }

    private HashMap content = new LinkedHashMap();

    public HashMap registrationUserStep2Web(HashMap content) throws IOException, ParseException, java.text.ParseException {
        listRegisteredUsersClass = new ListRegisteredUsersClass();
        List<RegisteredUser> registeredUserList = listRegisteredUsersClass.getListRegisteredUsers();
        RegisteredUser targetUser = new RegisteredUser();
        for(int i=0; i<registeredUserList.size();i++){
            if(registeredUserList.get(i).getEm().equals(content.get("em"))){
                targetUser = registeredUserList.get(i);
                break;
            }
        }
        this.content.put("dtype", 0);
        this.content.put("em", targetUser.getEm());
        this.content.put("code", targetUser.getAct_code());

        content.put("dtype", 0);

        System.out.println( this.content);

        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/reg/step2",  this.content);
        responseClass.getResponse();
        return content;
    }

    public HashMap registrationUserStep2AndroidPhone(HashMap content) throws IOException, ParseException, java.text.ParseException {
        listRegisteredUsersClass = new ListRegisteredUsersClass();
        List<RegisteredUser> registeredUserList = listRegisteredUsersClass.getListRegisteredUsers();
        RegisteredUser targetUser = new RegisteredUser();
        for(int i=0; i<registeredUserList.size();i++){
            if(registeredUserList.get(i).getEm().equals(content.get("em"))){
                targetUser = registeredUserList.get(i);
                break;
            }
        }
        String generatedToken = GenerateTokenClass.getGeneratedToken();

        this.content.put("em", targetUser.getEm());
        this.content.put("dtype", 1);
        this.content.put("was_restored", false);
        this.content.put("code", targetUser.getAct_code());
        this.content.put("token", generatedToken);
        this.content.put("os", "testOS");
        this.content.put("osv", "testVersion");
        this.content.put("scr", "DoxyaNaDoxya");
        this.content.put("man", "testMan");
        this.content.put("mod", "testMod");
        this.content.put("type", 1);
        this.content.put("rnd", rnd);

        content.putAll(this.content);
        content.remove("lkid");

        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/reg/step2",  this.content);
        String getLkid = responseClass.getResponse().body().string();
        System.out.println("getLKID1 " + getLkid);
        System.out.println("getLKID2 " + getLkid.substring(getLkid.indexOf("lkid"),getLkid.indexOf("lkid",getLkid.indexOf("\""))));
        content.put("lkid", getLkid.substring(getLkid.indexOf("lkid"),getLkid.indexOf("lkid",getLkid.indexOf("\""))));
        return content;
    }

}

package com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers.ListRegisteredUsersClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateEmailClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Models.RegisteredUser;
import com.dubtsov._2bsafe.Parents.UserPool.UserPool;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by user on 07.09.17.
 */
public class GenerateRegistrationContent extends BaseContent{

    private static ListRegisteredUsersClass listRegisteredUsersClass;
    private static List<RegisteredUser> registeredUserList;

    public GenerateRegistrationContent() throws ParseException, IOException, java.text.ParseException {
        listRegisteredUsersClass = new ListRegisteredUsersClass();
        registeredUserList = listRegisteredUsersClass.getListRegisteredUsers();
    }

    public static JSONObject getRegistrationStep1Content() throws IOException {
        jsonObj.put("em", GenerateEmailClass.getGeneratedEmail());
        jsonObj.put("pwd", "wwwwww" + GenerateEmailClass.getCountFromFile());
        return jsonObj;
    }


    /*------------------------------------------------------------------------------*/


    public static JSONObject getRegistrationStep2ContentWeb() throws IOException {
        jsonObj = getRegistrationStep1Content();
        jsonObj.put("dtype", 0);
        return jsonObj;
    }

    public static JSONObject getRegistrationStep2ContentAndroid() throws IOException {
        jsonObj = getRegistrationStep1Content();

        RegisteredUser targetUser = new RegisteredUser();
        for(int i=0; i<registeredUserList.size();i++){
            if(registeredUserList.get(i).getEm().equals(jsonObj.get("em"))){
                targetUser = registeredUserList.get(i);
                break;
            }
        }
        String generatedToken = GenerateTokenClass.getGeneratedToken();

        jsonObj.put("dtype", 1);
        jsonObj.put("was_restored", false);
        jsonObj.put("code", targetUser.getAct_code());
        jsonObj.put("token", generatedToken);
        jsonObj.put("os", "testOS");
        jsonObj.put("osv", "testVersion");
        jsonObj.put("scr", "DoxyaNaDoxya");
        jsonObj.put("man", "testMan");
        jsonObj.put("mod", "testMod");
        jsonObj.put("type", 1);
        return jsonObj;
    }

}

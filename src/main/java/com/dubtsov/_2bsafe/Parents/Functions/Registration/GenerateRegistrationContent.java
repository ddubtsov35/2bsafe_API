package com.dubtsov._2bsafe.Parents.Functions.Registration;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.InputClass;
import com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers.ListRegisteredUsersClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.BaseContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateEmailClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Models.RegisteredUser;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.List;

/**
 * Created by user on 07.09.17.
 */
public class GenerateRegistrationContent extends BaseContent {

    private static ListRegisteredUsersClass listRegisteredUsersClass;
    private static List<RegisteredUser> registeredUserList;
    public static JSONObject jsonObjectRegStep1Content;

    public GenerateRegistrationContent() throws Exception {
        listRegisteredUsersClass = new ListRegisteredUsersClass();
        registeredUserList = listRegisteredUsersClass.getListRegisteredUsers();
    }

    public static JSONObject getRegistrationStep1Content() throws IOException {
        jsonObj.put("em", GenerateEmailClass.getGeneratedEmail());
        jsonObj.put("pwd", "wwwwww" + GenerateEmailClass.getCountFromFile());
        jsonObjectRegStep1Content = jsonObj;
        return jsonObj;
    }

    public static JSONObject getRegistrationStep2ContentWeb() throws IOException {
        InputClass inputClass = new InputClass();
        jsonObj.put("em", jsonObjectRegStep1Content.get("em"));
        jsonObj.put("dtype", 0);
        jsonObj.put("code", inputClass.code(jsonObjectRegStep1Content.get("em").toString()));
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

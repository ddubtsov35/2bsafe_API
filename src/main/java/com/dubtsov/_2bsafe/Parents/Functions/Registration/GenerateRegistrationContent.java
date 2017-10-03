package com.dubtsov._2bsafe.Parents.Functions.Registration;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.InputClass;
import com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers.ListRegisteredUsersClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateEmailClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GeneratePhoneClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Models.RegisteredUser;
import com.dubtsov._2bsafe.Parents.Pool.UserPool;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import javax.jws.soap.SOAPBinding;
import java.io.IOException;
import java.util.List;

/**
 * Created by user on 07.09.17.
 */
public class GenerateRegistrationContent {

    private static ListRegisteredUsersClass listRegisteredUsersClass;
    private static List<RegisteredUser> registeredUserList;
    public static JSONObject getRegistrationStep1Content = new JSONObject();
    public static JSONObject getRegistrationStep2ContentWeb = new JSONObject();
    public static JSONObject getRegistrationStep2ContentAndroid = new JSONObject();

    public GenerateRegistrationContent() throws Exception {}

    public static JSONObject getRegistrationStep1Content() throws IOException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("em", GenerateEmailClass.getGeneratedEmail());
        jsonObject.put("pwd", "wwwwww" + GenerateEmailClass.getCountFromFile());
        getRegistrationStep1Content = jsonObject;
        return jsonObject;
    }

    public static JSONObject getRegistrationStep2ContentWeb() throws IOException, ParseException {
        JSONObject jsonObject = new JSONObject();
        InputClass inputClass = new InputClass();
        if(UserPool.getUserFromFile() == null) {
            jsonObject.put("em", getRegistrationStep1Content.get("em"));
            jsonObject.put("dtype", 0);
            jsonObject.put("code", inputClass.code(getRegistrationStep1Content.get("em").toString()));
            jsonObject.put("pwd", getRegistrationStep1Content.get("pwd"));
        } else{
            jsonObject.put("em", UserPool.getUserFromFile().get("em"));
            jsonObject.put("dtype", 0);
            //jsonObject.put("code", inputClass.code(UserPool.getUserFromFile().get("em")));
            jsonObject.put("pwd", UserPool.getUserFromFile().get("pwd"));
        }
        getRegistrationStep2ContentWeb = jsonObject;
        return jsonObject;
    }

    public static JSONObject getRegistrationStep2ContentAndroid() throws Exception {
        listRegisteredUsersClass = new ListRegisteredUsersClass();
        registeredUserList = listRegisteredUsersClass.getListRegisteredUsers();

        JSONObject jsonObject = getRegistrationStep1Content;

        RegisteredUser targetUser = new RegisteredUser();
        for(int i=0; i<registeredUserList.size();i++){
            if(registeredUserList.get(i).getEm().equals(jsonObject.get("em"))){
                targetUser = registeredUserList.get(i);
                break;
            }
        }
        String generatedToken = GenerateTokenClass.getGeneratedToken();

        jsonObject.put("dtype", 1);
        jsonObject.put("was_restored", false);
        jsonObject.put("code", targetUser.getAct_code());
        jsonObject.put("token", generatedToken);
        jsonObject.put("os", "testOS");
        jsonObject.put("osv", "testVersion");
        jsonObject.put("scr", "DoxyaNaDoxya");
        jsonObject.put("man", "testMan");
        jsonObject.put("mod", "testMod");
        jsonObject.put("type", 1);

        getRegistrationStep2ContentAndroid = jsonObject;
        return jsonObject;
    }

    public static JSONObject getCheckEmail() throws IOException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("em", GenerateEmailClass.getGeneratedEmail());
        return jsonObject;
    }

    public static JSONObject getCheckPhone() throws IOException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("phone", GeneratePhoneClass.getGeneratedPhone());
        return jsonObject;
    }

    public static JSONObject getExistEmail() throws IOException, ParseException {
        JSONObject jsonObject = new JSONObject();
        if(UserPool.getUserFromFile() == null) {
            RegistrationUserStep1Class registrationUserStep1Class = new RegistrationUserStep1Class();
            registrationUserStep1Class.registrationUserStep1();
            jsonObject.put("em", getRegistrationStep1Content.get("em"));
        } else{
            jsonObject.put("em", UserPool.getUserFromFile().get("em"));
        }
        return jsonObject;
    }

    public static JSONObject getExistPhone() throws Exception {
        JSONObject jsonObject = new JSONObject();
        if(UserPool.getUserFromFile() == null){
            listRegisteredUsersClass = new ListRegisteredUsersClass();
            registeredUserList = listRegisteredUsersClass.getListRegisteredUsers();
            for (int i = 0; i < registeredUserList.size(); i++){
                if(!registeredUserList.get(i).getPh().isEmpty()){
                    jsonObject.put("phone", registeredUserList.get(i).getPh());
                    break;
                }
            }
        } else{
            for (int i = 0; i < registeredUserList.size(); i++){
                if(registeredUserList.get(i).getEm().equals(UserPool.getUserFromFile().get("em"))){
                    jsonObject.put("phone", registeredUserList.get(i).getPh());
                    break;
                }
            }
        }

        return jsonObject;
    }
}

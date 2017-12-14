package com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent.GenerateDeleteChildrenCardContent;
import com.dubtsov._2bsafe.Parents.Functions.Registration.GenerateRegistrationContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.Pool.*;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 12.07.17.
 */
public class DeleteUserClass extends BaseClass {

    JSONObject jsonObject;

    public DeleteUserClass() throws IOException {}

    public void deleteUser() throws Exception {
        jsonObject = GenerateRegisteredUsersContent.deleteAccountContent();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/delete_account", jsonObject);
        response = responseClass.getJsonResponse();
        if(response.code() == 200){
            ChildrenCardPools.clearFile();
            GenerateProfileIdContent.profileId = null;
            CidCkeyPool.clearFile();
            CidCkeyRegisteredPool.clearFile();
            UserPool.clearFile();
        }
        LogPools.getLog();
    }
    public void NegativeDeleteUser(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/delete_account", jsonObject);
        responseClass.getJsonResponse();
        //UserPool.clearFile();
    }


    //To recoveryPassword test
    public void deleteUserWithoutClearPool() throws Exception {
        jsonObject = GenerateRegisteredUsersContent.deleteAccountContent();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/delete_account", jsonObject);
        responseClass.getJsonResponse();
    }
}

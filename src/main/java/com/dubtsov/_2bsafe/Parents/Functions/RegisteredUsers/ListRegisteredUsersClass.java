package com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers;

import com.dubtsov._2bsafe.Admin.AdminAuthorisation;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Models.RegisteredUser;
import com.dubtsov._2bsafe.Parents.Parse.GetRegisteredUsers;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by user on 13.07.17.
 */
public class ListRegisteredUsersClass extends BaseClass {
    public ListRegisteredUsersClass() throws IOException {}

    String sessionId;
    String responseString;

    public String getSessionId(String headersString){
        int sessionIdPositionStart = headersString.indexOf("session_id=");
        int sessionIdPositionFinish = headersString.indexOf(";", sessionIdPositionStart);
        sessionId = headersString.substring(sessionIdPositionStart, sessionIdPositionFinish);
        return sessionId;
    }

    public List<RegisteredUser> getListRegisteredUsers() throws Exception {
        JSONObject jsonObject = GenerateRegisteredUsersContent.getListRegisteredContent();
        String getSessionId = getSessionId(new AdminAuthorisation().adminAuthorisation());
        responseClass = new ResponseClass("http://admin.safec.ru/os_api/admin/v1.0/accounts_list", jsonObject);
        responseClass.setSessionId(getSessionId);
        responseString = responseClass.getJsonResponse().body().string();

        return GetRegisteredUsers.getRegisteredUsersList(responseString);
    }
}

package com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers;

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
    public ListRegisteredUsersClass() throws IOException {
    }

    String headersString;
    String sessionId;
    String responseString;

    private String getHeadersString() throws Exception {
        JSONObject jsonObject = GenerateRegisteredUsersContent.getHeadersString();
        super.responseClass = new ResponseClass("http://admin.safec.ru/os_api/admin/v1.0/login", jsonObject);
        headersString = responseClass.getJsonResponse().headers().toString();
        return headersString;
    }

    public String getSessionId(String headersString){
        int sessionIdPositionStart = headersString.indexOf("session_id=");
        int sessionIdPositionFinish = headersString.indexOf(";", sessionIdPositionStart);
        sessionId = headersString.substring(sessionIdPositionStart, sessionIdPositionFinish);
        return sessionId;
    }

    public List<RegisteredUser> getListRegisteredUsers() throws Exception {
        JSONObject jsonObject = GenerateRegisteredUsersContent.getListRegisteredContent();
        String getSessionId = getSessionId(getHeadersString());
        responseClass = new ResponseClass("http://admin.safec.ru/os_api/admin/v1.0/accounts_list", jsonObject);
        responseClass.setSessionId(getSessionId);
        responseString = responseClass.getJsonResponse().body().string();

        return GetRegisteredUsers.getRegisteredUsersList(responseString);
    }
}

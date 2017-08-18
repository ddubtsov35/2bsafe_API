package com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Models.RegisteredUser;
import com.dubtsov._2bsafe.Parents.Parse.GetRegisteredUsers;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
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
    HashMap content = new LinkedHashMap();

    private String getHeadersString() throws IOException {
        this.content.put("em", "111@ru.ru");
        this.content.put("pwd", "3,14plsvtijr");
        super.responseClass = new ResponseClass("http://admin.safec.ru/os_api/admin/v1.0/login", this.content);
        headersString = responseClass.getResponse().headers().toString();
        this.content.clear();
        return headersString;
    }

    public String getSessionId(String headersString){
        int sessionIdPositionStart = headersString.indexOf("session_id=");
        int sessionIdPositionFinish = headersString.indexOf(";", sessionIdPositionStart);
        sessionId = headersString.substring(sessionIdPositionStart, sessionIdPositionFinish);
        return sessionId;
    }

    public List<RegisteredUser> getListRegisteredUsers() throws IOException, ParseException, java.text.ParseException {
        String getSessionId = getSessionId(getHeadersString());

        this.content.put("sortf", 0);
        this.content.put("sortt", 0);

        responseClass = new ResponseClass("http://admin.safec.ru/os_api/admin/v1.0/accounts_list", this.content);
        responseClass.setSessionId(getSessionId);
        responseString = responseClass.getResponse().body().string();
        System.out.println("Response: " + responseString);
        this.content.clear();

        return GetRegisteredUsers.getRegisteredUsersList(responseString);
    }
}

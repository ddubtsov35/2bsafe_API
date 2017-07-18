package com.dubtsov._2bsafe.Functions;

import com.dubtsov._2bsafe.Models.RegisteredUser;
import com.dubtsov._2bsafe.Response.ResponseClass;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by user on 13.07.17.
 */
public class ListRegisteredUsersClass extends BaseClass{
    public ListRegisteredUsersClass() throws IOException {
    }

    String headersString;
    String sessionId;
    String responseString;
    HashMap content = new LinkedHashMap();

    private String getHeadersString() throws IOException {
        this.content.put("em", "111@ru.ru");
        this.content.put("pwd", "111");
        super.response = new ResponseClass("http://admin.safec.ru/os_api/admin/v1.0/login", this.content);
        headersString = response.getResponse().headers().toString();
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

        response = new ResponseClass("http://admin.safec.ru/os_api/admin/v1.0/accounts_list", this.content);
        response.setSessionId(getSessionId);
        responseString = response.getResponse().body().string();
        System.out.println("Response: " + responseString);
        this.content.clear();

        return GetRegisteredUsersClass.getRegisteredUsersList(responseString);
    }

    /*public int getRegisteredUsersCount() throws IOException, ParseException {
        String getSessionId = getSessionId(getHeadersString());
        //System.out.println(getSessionId);
        content.put("sortf", 0);
        content.put("sortt", 0);

        response = new ResponseClass("https://admin.safec.ru/os_api/admin/v1.0/accounts_list", content);
        response.setSessionId(getSessionId);
        responseString = response.getResponse().body().string();
        //responseString = "{\"result\": {\"num\": 40, \"items\": [{\"reg_date\": \"2017-02-09 10:19:46\", \"cnum\": 37, \"ph\": null, \"act_date\": \"2017-02-09 10:20:15\", \"em\": \"d.zherlitsyn@safe.com.ru\", \"tnum\": 11, \"acc_id\": 564498, \"name\": \"diman\"}, {\"reg_date\": \"2017-01-30 20:48:17\", \"cnum\": 11, \"ph\": \"79280373736\", \"act_date\": \"2017-01-30 20:55:29\", \"em\": \"pust.leo@gmail.com\", \"tnum\": 5, \"acc_id\": 554008, \"name\": \"Leo\"}, {\"reg_date\": \"2017-06-08 18:05:44\", \"cnum\": 0, \"ph\": null, \"act_date\": \"2017-06-08 18:06:56\", \"em\": \"slowkazak+123@gmail.com\", \"tnum\": 0, \"acc_id\": 599595, \"name\": null}, {\"reg_date\": \"2017-06-06 20:37:20\", \"cnum\": 107, \"ph\": \"79284227713\", \"act_date\": \"2017-06-06 20:38:25\", \"em\": \"throyandify@gmail.com\", \"tnum\": 3, \"acc_id\": 599548, \"name\": null}, {\"reg_date\": \"2017-06-30 17:15:18\", \"cnum\": 0, \"ph\": null, \"act_date\": \"2017-06-30 17:15:18\", \"em\": \"aa@ya1.ru\", \"tnum\": 0, \"acc_id\": 599636, \"name\": null}, {\"reg_date\": \"2017-07-03 18:55:31\", \"cnum\": 0, \"ph\": null, \"act_date\": \"2017-07-03 18:58:11\", \"em\": \"94demon+work20@gmail.com\", \"tnum\": 1, \"acc_id\": 599649, \"name\": null}, {\"reg_date\": \"2017-06-09 17:22:46\", \"cnum\": 0, \"ph\": null, \"act_date\": \"2017-06-09 17:23:50\", \"em\": \"slowkazak+10@gmail.com\", \"tnum\": 0, \"acc_id\": 599597, \"name\": null}, {\"reg_date\": \"2017-06-08 17:04:16\", \"cnum\": 0, \"ph\": null, \"act_date\": \"2017-06-08 17:05:51\", \"em\": \"slowkazak+1234@gmail.com\", \"tnum\": 0, \"acc_id\": 599589, \"name\": null}, {\"reg_date\": \"2017-07-04 10:05:09\", \"cnum\": 0, \"ph\": null, \"act_date\": \"2017-07-04 10:06:13\", \"em\": \"pust.leo+1@gmail.com\", \"tnum\": 0, \"acc_id\": 599650, \"name\": null}, {\"reg_date\": \"2017-07-04 10:10:20\", \"cnum\": 0, \"ph\": null, \"act_date\": \"2017-07-04 10:11:24\", \"em\": \"pust.leo+2@gmail.com\", \"tnum\": 0, \"acc_id\": 599651, \"name\": null}, {\"reg_date\": \"2017-06-09 17:34:55\", \"cnum\": 0, \"ph\": null, \"act_date\": \"2017-06-09 17:35:54\", \"em\": \"slowkazak+9@gmail.com\", \"tnum\": 0, \"acc_id\": 599598, \"name\": null}, {\"reg_date\": \"2017-06-09 20:42:04\", \"cnum\": 0, \"ph\": \"79182712036\", \"act_date\": \"2017-06-09 20:43:25\", \"em\": \"slowkazak+q1@gmail.com\", \"tnum\": 0, \"acc_id\": 599599, \"name\": null}, {\"reg_date\": \"2017-06-11 22:36:52\", \"cnum\": 0, \"ph\": null, \"act_date\": \"2017-06-11 22:38:20\", \"em\": \"slowkazak+123456@gmail.com\", \"tnum\": 0, \"acc_id\": 599600, \"name\": null}, {\"reg_date\": \"2017-06-06 09:23:34\", \"cnum\": 7, \"ph\": null, \"act_date\": \"2017-06-06 09:25:08\", \"em\": \"safectest11@gmail.com\", \"tnum\": 0, \"acc_id\": 599522, \"name\": null}, {\"reg_date\": \"2017-06-07 16:36:37\", \"cnum\": 0, \"ph\": null, \"act_date\": \"2017-06-07 16:52:01\", \"em\": \"staskuban@ya.ru\", \"tnum\": 0, \"acc_id\": 599568, \"name\": null}, {\"reg_date\": \"2017-06-07 16:54:40\", \"cnum\": 0, \"ph\": null, \"act_date\": \"2017-06-07 16:55:55\", \"em\": \"staskuban@yandex.kz\", \"tnum\": 0, \"acc_id\": 599573, \"name\": null}, {\"reg_date\": \"2017-06-07 17:04:23\", \"cnum\": 0, \"ph\": null, \"act_date\": \"2017-06-07 17:05:17\", \"em\": \"staskuban@yandex.ru\", \"tnum\": 0, \"acc_id\": 599576, \"name\": null}, {\"reg_date\": \"2017-06-07 17:25:35\", \"cnum\": 0, \"ph\": null, \"act_date\": \"2017-06-07 17:26:11\", \"em\": \"d2085455@mvrht.net\", \"tnum\": 0, \"acc_id\": 599578, \"name\": null}, {\"reg_date\": \"2017-06-07 18:21:07\", \"cnum\": 0, \"ph\": null, \"act_date\": \"2017-06-07 18:22:05\", \"em\": \"slowkazak+12@gmail.com\", \"tnum\": 0, \"acc_id\": 599583, \"name\": null}, {\"reg_date\": \"2017-06-07 18:23:21\", \"cnum\": 0, \"ph\": null, \"act_date\": \"2017-06-07 18:24:32\", \"em\": \"slowkazak+1@gmail.com\", \"tnum\": 0, \"acc_id\": 599584, \"name\": null}, {\"reg_date\": \"2017-06-07 18:26:32\", \"cnum\": 0, \"ph\": null, \"act_date\": \"2017-06-07 18:27:08\", \"em\": \"slowkazak+test@gmail.com\", \"tnum\": 0, \"acc_id\": 599585, \"name\": null}, {\"reg_date\": \"2017-06-07 23:15:26\", \"cnum\": 3, \"ph\": null, \"act_date\": \"2017-06-07 23:16:49\", \"em\": \"a.baygushov@safe.com.ru\", \"tnum\": 0, \"acc_id\": 599586, \"name\": null}, {\"reg_date\": \"2017-06-26 13:17:33\", \"cnum\": 0, \"ph\": null, \"act_date\": \"2017-06-26 13:17:33\", \"em\": \"aa@aa.aa\", \"tnum\": 0, \"acc_id\": 599625, \"name\": null}, {\"reg_date\": \"2017-06-26 15:20:17\", \"cnum\": 0, \"ph\": null, \"act_date\": \"2017-06-26 15:20:17\", \"em\": \"aa@bb.cc\", \"tnum\": 0, \"acc_id\": 599627, \"name\": null}, {\"reg_date\": \"2017-06-26 15:31:37\", \"cnum\": 0, \"ph\": null, \"act_date\": \"2017-06-26 15:31:37\", \"em\": \"aa@bb.bb\", \"tnum\": 0, \"acc_id\": 599628, \"name\": null}, {\"reg_date\": \"2017-06-26 15:34:10\", \"cnum\": 0, \"ph\": null, \"act_date\": \"2017-06-26 15:34:10\", \"em\": \"aa@bb.dd\", \"tnum\": 0, \"acc_id\": 599629, \"name\": null}, {\"reg_date\": \"2017-06-29 22:30:56\", \"cnum\": 0, \"ph\": null, \"act_date\": \"2017-06-29 22:30:56\", \"em\": \"aa@ya.ru\", \"tnum\": 0, \"acc_id\": 599635, \"name\": null}, {\"reg_date\": \"2017-06-30 17:18:09\", \"cnum\": 0, \"ph\": null, \"act_date\": \"2017-06-30 17:18:09\", \"em\": \"aa@ya11.ru\", \"tnum\": 0, \"acc_id\": 599637, \"name\": null}, {\"reg_date\": \"2017-07-06 14:18:24\", \"cnum\": 0, \"ph\": null, \"act_date\": \"2017-07-06 14:18:24\", \"em\": \"qqq2@binka.me\", \"tnum\": 0, \"acc_id\": 599666, \"name\": null}, {\"reg_date\": \"2017-07-06 15:18:24\", \"cnum\": 0, \"ph\": null, \"act_date\": \"2017-07-06 15:19:22\", \"em\": \"slowkazak+ss@gmail.com\", \"tnum\": 0, \"acc_id\": 599667, \"name\": null}, {\"reg_date\": \"2017-07-07 12:51:09\", \"cnum\": 0, \"ph\": null, \"act_date\": \"2017-07-07 12:53:21\", \"em\": \"slowkazak+4@gmail.com\", \"tnum\": 0, \"acc_id\": 599668, \"name\": null}, {\"reg_date\": \"2017-07-10 13:05:38\", \"cnum\": 0, \"ph\": null, \"act_date\": \"2017-07-10 13:43:07\", \"em\": \"qqq31@binka.me\", \"tnum\": 0, \"acc_id\": 599674, \"name\": null}, {\"reg_date\": \"2017-07-10 11:08:10\", \"cnum\": 0, \"ph\": null, \"act_date\": \"2017-07-10 11:44:20\", \"em\": \"qqq30@binka.me\", \"tnum\": 0, \"acc_id\": 599673, \"name\": null}, {\"reg_date\": \"2017-07-10 13:45:28\", \"cnum\": 0, \"ph\": null, \"act_date\": \"2017-07-10 14:30:24\", \"em\": \"qqq32@binka.me\", \"tnum\": 0, \"acc_id\": 599675, \"name\": null}, {\"reg_date\": \"2017-07-11 18:39:45\", \"cnum\": 0, \"ph\": null, \"act_date\": \"2017-07-11 18:40:23\", \"em\": \"qqq37@binka.me\", \"tnum\": 0, \"acc_id\": 599716, \"name\": null}, {\"reg_date\": \"2017-07-12 08:38:22\", \"cnum\": 0, \"ph\": null, \"act_date\": \"2017-07-12 08:41:25\", \"em\": \"pust.leo+1234@gmail.com\", \"tnum\": 0, \"acc_id\": 599718, \"name\": null}, {\"reg_date\": \"2017-07-12 08:44:31\", \"cnum\": 0, \"ph\": null, \"act_date\": \"2017-07-12 08:50:33\", \"em\": \"94demon+work31@gmail.com\", \"tnum\": 0, \"acc_id\": 599719, \"name\": null}, {\"reg_date\": \"2017-06-08 17:44:14\", \"cnum\": 0, \"ph\": null, \"act_date\": \"2017-06-08 17:44:45\", \"em\": \"slowkazak+12345@gmail.com\", \"tnum\": 0, \"acc_id\": 599594, \"name\": null}, {\"reg_date\": \"2017-07-11 18:42:09\", \"cnum\": 3, \"ph\": null, \"act_date\": \"2017-07-11 18:42:26\", \"em\": \"qqq38@binka.me\", \"tnum\": 0, \"acc_id\": 599717, \"name\": null}, {\"reg_date\": \"2017-07-06 14:15:43\", \"cnum\": 8, \"ph\": null, \"act_date\": \"2017-07-06 14:15:43\", \"em\": \"qqq@binka.me\", \"tnum\": 3, \"acc_id\": 599653, \"name\": null}]}, \"scs\": true}\n";
        //System.out.println("Response: " + responseString);
        System.out.println("getRegisteredUsersCount " + GetRegisteredUsersClass.getRegisteredUsersCount(responseString));
        int getRegisteredUsersCount = GetRegisteredUsersClass.getRegisteredUsersCount(responseString);
        content.clear();
        //response.getResponse().body().close();

        return getRegisteredUsersCount;
    }*/
}

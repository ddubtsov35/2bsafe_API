package com.dubtsov._2bsafe;

import com.dubtsov._2bsafe.Models.RegisteredUser;
import netscape.javascript.JSObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by user on 14.07.17.
 */
public class ParseResponse {

    private static List<RegisteredUser> registeredUsersList;
    private static String resultJsonStringGlobal;
    private static String itemsJsonString;
    private static int num;

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;
    private static JSONArray jsonArray;


    private static String getResultJsonString(String registeredUserListString) throws ParseException {
        parser = new JSONParser();
        obj = parser.parse(registeredUserListString);
        jsonObj = (JSONObject) obj;
        resultJsonStringGlobal = jsonObj.get("result").toString();
        return resultJsonStringGlobal;
    }

    public static int getRegisteredUsersCount(String registeredUserListString) throws ParseException {
        String resultJsonString = getResultJsonString(registeredUserListString);
        obj = parser.parse(resultJsonString);
        jsonObj = (JSONObject) obj;
        itemsJsonString = jsonObj.get("num").toString();
        return Integer.parseInt(itemsJsonString);
    }

    public static void getRegisteredUsersList(String registeredUserListString) throws ParseException, java.text.ParseException {
        registeredUsersList = new ArrayList<>();
        String resultJsonString = getResultJsonString(registeredUserListString);
        obj = parser.parse(resultJsonString);
        jsonObj = (JSONObject) obj;
        jsonArray = (JSONArray) jsonObj.get("items");
        for(int i=0; i<jsonArray.size(); i++){
            registeredUsersList.add(new RegisteredUser(jsonArray.get(i).toString()));
        }
        System.out.println(registeredUsersList.get(0).toString());

    }

}

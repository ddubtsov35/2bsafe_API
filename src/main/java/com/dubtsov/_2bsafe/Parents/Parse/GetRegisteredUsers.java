package com.dubtsov._2bsafe.Parents.Parse;

import com.dubtsov._2bsafe.Parents.Models.RegisteredUser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 14.07.17.
 */
public class GetRegisteredUsers {

    private static List<RegisteredUser> registeredUsersList;
    private static String resultJsonStringGlobal;
    private static String itemsJsonString;
    private static int num;

    private static JSONParser parser;
    private static Object obj;


    private static String getResultJsonString(String registeredUserListString) throws ParseException {
        parser = new JSONParser();
        obj = parser.parse(registeredUserListString);
        JSONObject jsonObj = (JSONObject) obj;
        resultJsonStringGlobal = jsonObj.get("result").toString();
        return resultJsonStringGlobal;
    }

    public static List<RegisteredUser> getRegisteredUsersList(String registeredUserListString) throws ParseException, java.text.ParseException {
        JSONObject jsonObj = new JSONObject();
        registeredUsersList = new ArrayList();
        String resultJsonString = getResultJsonString(registeredUserListString);
        System.out.println("resultJsonString " + resultJsonString);
        obj = parser.parse(resultJsonString);
        JSONArray jsonArray = (JSONArray) obj;
        itemsJsonString = jsonObj.get("num").toString();
        for(int i=0; i<jsonArray.size(); i++){
            registeredUsersList.add(new RegisteredUser(jsonArray.get(i).toString()));
            registeredUsersList.get(i).setCount(Integer.parseInt(itemsJsonString = jsonObj.get("num").toString()));
        }
        return registeredUsersList;
    }

}

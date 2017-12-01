package com.dubtsov._2bsafe.Parents.Pool;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

/**
 * Created by user on 08.09.17.
 */
public class UserPool {

    private static JSONObject resultJsonObject;

    public static JSONObject getUserFromFile() throws IOException, ParseException {
        System.out.println("resultJsonObject " + resultJsonObject);
        if(!(resultJsonObject == null)){
            return resultJsonObject;
        } else {
            return null;
        }
    }

    public static void setNewPassword(String npwd) throws IOException, ParseException {
        JSONObject jsonObject = resultJsonObject;
        jsonObject.remove("pwd");
        jsonObject.put("pwd", npwd);
        resultJsonObject = jsonObject;
    }

    public static void setUserFromFile(JSONObject jsonObject) throws IOException {
        resultJsonObject = jsonObject;
    }

    public static void clearFile() throws IOException {
        resultJsonObject = null;
    }
}

package com.dubtsov._2bsafe.Parents.Pool;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

/**
 * Created by user on 27.11.17.
 */
public class CidCkeyRegisteredPool {

    private static JSONObject resultJsonObject;

    public static JSONObject getCidFromFile() throws IOException, ParseException {
        //System.out.println("resultJsonObject " + resultJsonObject);
        if(!(resultJsonObject == null)){
            return resultJsonObject;
        } else {
            return null;
        }
    }

    public static void setCidCkey(JSONObject jsonObject) throws IOException {
        resultJsonObject = jsonObject;
    }

    public static void clearFile() throws IOException {
        resultJsonObject = null;
    }

}

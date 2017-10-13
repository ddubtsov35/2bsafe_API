package com.dubtsov._2bsafe.Parents.Pool;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

/**
 * Created by user on 08.09.17.
 */
public class UserPool {

    private static String pathToFile = "./src/main/resources/UserPool";

    public static JSONObject getUserFromFile() throws IOException, ParseException {
        try {
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(new FileReader(pathToFile));
            return jsonObject;
        }catch (ParseException e){
            return null;
        }
    }

    public static void setNewPassword(String npwd) throws IOException, ParseException {

        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(new FileReader(pathToFile));
        jsonObject.remove("pwd");
        jsonObject.put("pwd", npwd);

        FileWriter fstream1 = new FileWriter(pathToFile);
        BufferedWriter out1 = new BufferedWriter(fstream1);
        out1.write("");
        out1.close();

        File file = new File(pathToFile);
        PrintWriter out = new PrintWriter(file.getAbsoluteFile());
        out.println(jsonObject);
        out.close();
    }

    public static void setUserFromFile(JSONObject jsonObject) throws IOException {
        FileWriter fstream1 = new FileWriter(pathToFile);
        BufferedWriter out1 = new BufferedWriter(fstream1);
        out1.write("");
        out1.close();

        File file = new File(pathToFile);
        PrintWriter out = new PrintWriter(file.getAbsoluteFile());
        out.println(jsonObject);
        out.close();
    }

    public static void clearFile() throws IOException {
        FileWriter fstream1 = new FileWriter(pathToFile);
        BufferedWriter out1 = new BufferedWriter(fstream1);
        out1.write("");
        out1.close();
    }
}
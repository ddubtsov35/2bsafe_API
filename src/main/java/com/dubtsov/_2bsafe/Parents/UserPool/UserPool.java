package com.dubtsov._2bsafe.Parents.UserPool;

import org.json.simple.JSONObject;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by user on 08.09.17.
 */
public class UserPool {

    private static String pathToFile = "./src/main/resources/UserPool";

    public static JSONObject getUserFromFile() throws IOException {
        JSONObject jsonObject = new JSONObject();
        BufferedReader reader = new BufferedReader(new FileReader(pathToFile));
        List<String> list = new LinkedList<>();
        String line;
        if(reader.readLine() != null) {
            reader = new BufferedReader(new FileReader(pathToFile));
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }
            System.out.println(list);
            jsonObject.put("em", list.get(0));
            jsonObject.put("pwd", list.get(1));
            reader.close();
            return jsonObject;
        } else{
            return null;
        }
    }

    public static void setUserFromFile(JSONObject jsonObject) throws IOException {
        FileWriter fstream1 = new FileWriter(pathToFile);
        BufferedWriter out1 = new BufferedWriter(fstream1);
        out1.write("");
        out1.close();

        File file = new File(pathToFile);
        PrintWriter out = new PrintWriter(file.getAbsoluteFile());
        out.println(jsonObject.get("em"));
        out.println(jsonObject.get("pwd"));
        out.close();
    }

    public static void clearFile() throws IOException {
        FileWriter fstream1 = new FileWriter(pathToFile);
        BufferedWriter out1 = new BufferedWriter(fstream1);
        out1.write("");
        out1.close();
    }
}

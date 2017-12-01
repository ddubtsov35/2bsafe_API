package com.dubtsov._2bsafe.Parents.Pool;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by user on 14.09.17.
 */
public class CidCkeyPool {

    private static String pathToFile = "2bsafe_API/src/main/resources/CidCkeyPool";

    public static JSONObject getCidFromFile() throws IOException, ParseException {
        try {
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(new FileReader(pathToFile));
            return jsonObject;
        }catch (ParseException e){
            return null;
        }
    }

    public static void setCidCkey(JSONObject jsonObject) throws IOException {
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

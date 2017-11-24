package com.dubtsov._2bsafe.Parents.Pool;

import com.dubtsov._2bsafe.Parents.Models.AddChildrenCard;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

/**
 * Created by user on 24.11.17.
 */
public class ChildrenCardPool {

    private static String pathToFile = "./src/main/resources/ChildrenCardPool";

    public static AddChildrenCard getChildrenCardFromFile() throws IOException, ParseException, java.text.ParseException {
        try {
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(new FileReader(pathToFile));
            AddChildrenCard childrenCard = new AddChildrenCard(jsonObject.toString());
            return childrenCard;
        }catch (ParseException e){
            return null;
        }
    }

    public static void setChildrenCard(JSONObject jsonObject) throws IOException {
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

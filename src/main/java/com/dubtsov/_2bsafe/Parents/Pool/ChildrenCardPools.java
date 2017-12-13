package com.dubtsov._2bsafe.Parents.Pool;

import com.dubtsov._2bsafe.Parents.Models.AddChildrenCard;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

/**
 * Created by user on 24.11.17.
 */
public class ChildrenCardPools {

    private static JSONObject childrenCardJson;

    public static AddChildrenCard getChildrenCardFromFile() throws IOException, ParseException, java.text.ParseException {
        try {
            return new AddChildrenCard(childrenCardJson.toString());
        }catch (NullPointerException e){
            return null;
        }
    }

    public static void setChildrenCard(JSONObject jsonObject) throws IOException {
        childrenCardJson = jsonObject;
    }

    public static void clearFile() throws IOException {
        childrenCardJson = null;
    }

}

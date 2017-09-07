package com.dubtsov._2bsafe.Parents.Parse;

import com.dubtsov._2bsafe.Parents.Models.HelpMe;
import com.dubtsov._2bsafe.Parents.Models.IntervalBlock;
import com.dubtsov._2bsafe.Parents.Models.Poll;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 31.08.17.
 */
public class GetHelpMe {

    private static HelpMe helpMe;

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;
    private static JSONArray jsonArray;

    public static HelpMe getHelpMe(String helpMeString){
        parser = new JSONParser();
        try {
            obj = parser.parse(helpMeString);
            jsonObj = (JSONObject) obj;
            String scs = jsonObj.get("scs").toString();
            jsonObj = (JSONObject) jsonObj.get("data");
            helpMe = new HelpMe(jsonObj.toJSONString(), scs);
        } catch (ParseException e){}
        finally {
            return helpMe;
        }
    }

}

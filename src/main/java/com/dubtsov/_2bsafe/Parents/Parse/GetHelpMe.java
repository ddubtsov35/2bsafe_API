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

    public static HelpMe getHelpMe(String helpMeString){
        JSONParser parser = new JSONParser();
        try {
            JSONObject jsonObj = (JSONObject) parser.parse(helpMeString);
            String scs = jsonObj.get("scs").toString();
            jsonObj = (JSONObject) jsonObj.get("data");
            helpMe = new HelpMe(jsonObj.toJSONString(), scs);
        } catch (ParseException e){}
        finally {
            return helpMe;
        }
    }

}

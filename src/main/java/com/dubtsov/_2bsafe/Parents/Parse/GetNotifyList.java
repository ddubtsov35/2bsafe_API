package com.dubtsov._2bsafe.Parents.Parse;

import com.dubtsov._2bsafe.Parents.Models.NotifyList;
import com.dubtsov._2bsafe.Parents.Models.Permission;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 04.09.17.
 */
public class GetNotifyList {

    private static NotifyList notifyList;

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;

    public static NotifyList getNotifyList(String getNotifyListString){
        parser = new JSONParser();
        try {
            obj = parser.parse(getNotifyListString);
            jsonObj = (JSONObject) obj;
            String scs = jsonObj.get("scs").toString();
            jsonObj = (JSONObject) jsonObj.get("data");
            notifyList = new NotifyList(jsonObj.toJSONString(), scs);
        } catch (ParseException e){}
        finally {
            return notifyList;
        }
    }

}

package com.dubtsov._2bsafe.Parents.Parse;

import com.dubtsov._2bsafe.Parents.Models.IntervalBlock;
import com.dubtsov._2bsafe.Parents.Models.Poll;
import com.dubtsov._2bsafe.Parents.Models.Zone;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 30.08.17.
 */
public class GetZoneList {

    private static List<Zone> zoneList;

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;
    private static JSONArray jsonArray;

    public static List<Zone> getZoneList(String getZoneString){
        parser = new JSONParser();
        zoneList = new ArrayList();
        try {
            obj = parser.parse(getZoneString);
            jsonObj = (JSONObject) obj;
            jsonArray = (JSONArray) jsonObj.get("data");
            for (int i = 0; i < jsonArray.size(); i++) {
                zoneList.add(new Zone(jsonArray.get(i).toString(), jsonObj.get("scs").toString()));
            }
        } catch (ParseException e){}
        finally {
            return zoneList;
        }
    }

}

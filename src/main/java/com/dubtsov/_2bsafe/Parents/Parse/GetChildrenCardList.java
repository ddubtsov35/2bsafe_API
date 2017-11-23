package com.dubtsov._2bsafe.Parents.Parse;

import com.dubtsov._2bsafe.Parents.Models.ChildrenCard;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 19.07.17.
 */
public class GetChildrenCardList {

    private static List<ChildrenCard> childrenCardList;

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;
    private static JSONArray jsonArray;

    public static List<ChildrenCard> getChildrenCardList(String childrenCardListString) throws ParseException, java.text.ParseException {
        parser = new JSONParser();
        childrenCardList = new ArrayList();
        System.out.println("childrenCardListString " + childrenCardListString);
        try {
            obj = parser.parse(childrenCardListString);
            jsonObj = (JSONObject) obj;
            jsonArray = (JSONArray) jsonObj.get("data");
            for (int i = 0; i < jsonArray.size(); i++) {
                childrenCardList.add(new ChildrenCard(jsonArray.get(i).toString()));
                //System.out.println(i + " " + childrenCardList.get(i).getProfile_id());
            }
        } catch (ParseException e){}
        finally {
            return childrenCardList;
        }
    }
}

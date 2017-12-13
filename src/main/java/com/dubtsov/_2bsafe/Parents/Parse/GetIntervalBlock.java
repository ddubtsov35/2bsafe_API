package com.dubtsov._2bsafe.Parents.Parse;

import com.dubtsov._2bsafe.Parents.Functions.IntervalBlock.IntervalBlockClass;
import com.dubtsov._2bsafe.Parents.Models.AddSession;
import com.dubtsov._2bsafe.Parents.Models.ChildrenCard;
import com.dubtsov._2bsafe.Parents.Models.IntervalBlock;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 31.08.17.
 */
public class GetIntervalBlock {

    private static List<IntervalBlock> intervalBlockList;

    public static List<IntervalBlock> getIntervalBlock(String intervalBlockString){
        JSONParser parser = new JSONParser();
        intervalBlockList = new ArrayList();
        try {
            JSONObject jsonObj = (JSONObject) parser.parse(intervalBlockString);
            String scs = jsonObj.get("scs").toString();
            JSONArray jsonArray = (JSONArray) jsonObj.get("data");
            for (int i = 0; i < jsonArray.size(); i++) {
                intervalBlockList.add(new IntervalBlock(jsonArray.get(i).toString(), scs));
            }
        } catch (ParseException e){}
        finally {
            return intervalBlockList;
        }
    }

}

package com.dubtsov._2bsafe.Parents.Functions.Coordinates;

import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.ChildrenCardClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 11.09.17.
 */
public class GenerateGpsTrackContent {

    public GenerateGpsTrackContent() throws ParseException {}

    public static JSONObject getGpsTrackContent() throws Exception {
        JSONObject jsonObj = new JSONObject();
        ChildrenCardClass addChildrenCardClass = new ChildrenCardClass();
        jsonObj.put("profile_id", addChildrenCardClass.addChildrenCard().getProfile_id());
        jsonObj.put("start_date", "20.10.2017");
        jsonObj.put("end_date", "22.10.2017");
        jsonObj.put("limit", 100);
        return jsonObj;
    }

}

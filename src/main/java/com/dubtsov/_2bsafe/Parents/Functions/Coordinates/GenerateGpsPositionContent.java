package com.dubtsov._2bsafe.Parents.Functions.Coordinates;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.BaseContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 11.09.17.
 */
public class GenerateGpsPositionContent extends BaseContent {

    private static GetChildrenCardListClass getChildrenCardListClass;

    public GenerateGpsPositionContent() throws ParseException {}

    public static JSONObject getGpsPositionContent() throws IOException, ParseException, java.text.ParseException {
        getChildrenCardListClass = new GetChildrenCardListClass();
        jsonObj.put("profile_id", getChildrenCardListClass.getChildrenCardList().get(0).getProfile_id());
        jsonObj.put("rnd", GenerateTokenClass.getGeneratedToken());
        return jsonObj;
    }
}

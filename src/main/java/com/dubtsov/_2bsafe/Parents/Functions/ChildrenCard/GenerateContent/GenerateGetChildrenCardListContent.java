package com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 08.09.17.
 */
public class GenerateGetChildrenCardListContent {
    public GenerateGetChildrenCardListContent() throws ParseException {}
    private static JSONObject jsonObj;

    public static JSONObject getChildrenCardListContent() throws IOException {
        jsonObj = new JSONObject();
        jsonObj.put("rnd", GenerateTokenClass.getGeneratedToken());
        return jsonObj;
    }
}

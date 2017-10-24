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
        return jsonObj;
    }

    public static Object[] provideNegativeGetAccountContent1() throws IOException, ParseException {
        jsonObj = new JSONObject();
        jsonObj.put("rnd", null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("rnd", "failRnd");

        JSONObject jsonObj3 = new JSONObject();

        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3}
        };
    }
}

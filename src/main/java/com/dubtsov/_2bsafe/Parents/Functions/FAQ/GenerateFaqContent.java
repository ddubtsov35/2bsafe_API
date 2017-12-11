package com.dubtsov._2bsafe.Parents.Functions.FAQ;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 11.09.17.
 */
public class GenerateFaqContent {

    private static JSONObject jsonObj = new JSONObject();

    public static JSONObject getChildrenCardListContent() throws IOException, ParseException, java.text.ParseException {
        GetFaqListClass getFaqListClass = new GetFaqListClass();
        jsonObj.put("fid", getFaqListClass.getFaqListLk().get(0).getFid());
        return jsonObj;
    }

    public static Object[] provideNegativeGetAccountContent1() throws IOException, ParseException {
        jsonObj = new JSONObject();
        jsonObj.put("fid", null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("fid", "failFid");

        JSONObject jsonObj3 = new JSONObject();

        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3}
        };
    }

}

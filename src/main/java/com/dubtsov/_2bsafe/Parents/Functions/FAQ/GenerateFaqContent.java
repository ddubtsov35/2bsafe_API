package com.dubtsov._2bsafe.Parents.Functions.FAQ;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 11.09.17.
 */
public class GenerateFaqContent {

    public static JSONObject getChildrenCardListContent() throws IOException, ParseException, java.text.ParseException {
        GetFaqListClass getFaqListClass = new GetFaqListClass();
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("fid", getFaqListClass.getFaqListLk().get(0).getFid());
        return jsonObj;
    }

    public static Object[] provideNegativeGetAccountContent1() throws IOException, ParseException {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("fid", null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("fid", "failFid");

        JSONObject jsonObj3 = new JSONObject();

        return new Object[]{jsonObj, jsonObj2, jsonObj3};
    }

}

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

}

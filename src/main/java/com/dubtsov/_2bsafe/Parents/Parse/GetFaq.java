package com.dubtsov._2bsafe.Parents.Parse;

import com.dubtsov._2bsafe.Parents.Models.Faq;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 30.08.17.
 */
public class GetFaq {

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;
    private static JSONArray jsonArray;

    private static List<Faq> faqList;
    private static String resultJsonStringGlobal;

    public static List<Faq> getFaqList(String getFaqListResponse) throws ParseException, java.text.ParseException {
        faqList = new ArrayList();
        parser = new JSONParser();
        System.out.println("getFaqListResponse " + getFaqListResponse);
        obj = parser.parse(getFaqListResponse);
        jsonObj = (JSONObject) obj;
        jsonArray = (JSONArray) jsonObj.get("data");
        if(jsonArray.size() > 0) {
            for (int i = 0; i < jsonArray.size(); i++) {
                faqList.add(new Faq(jsonArray.get(i).toString()));
            }
            return faqList;
        } else {
            return faqList;
        }
    }
}

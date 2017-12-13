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

    private static List<Faq> faqList;

    public static List<Faq> getFaqList(String getFaqListResponse) throws ParseException, java.text.ParseException {
        faqList = new ArrayList();
        JSONParser parser = new JSONParser();
        System.out.println("getFaqListResponse " + getFaqListResponse);
        JSONObject jsonObj = (JSONObject) parser.parse(getFaqListResponse);
        JSONArray jsonArray = (JSONArray) jsonObj.get("data");
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

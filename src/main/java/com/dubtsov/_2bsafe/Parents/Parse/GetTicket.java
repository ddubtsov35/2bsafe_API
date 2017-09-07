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
public class GetTicket {

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;

    public static int getTicketId(String getFaqListResponse) throws ParseException, java.text.ParseException {
        parser = new JSONParser();
        System.out.println("getFaqListResponse " + getFaqListResponse);
        obj = parser.parse(getFaqListResponse);
        jsonObj = (JSONObject) obj;

        return Integer.parseInt(jsonObj.get("tid").toString());
    }
}

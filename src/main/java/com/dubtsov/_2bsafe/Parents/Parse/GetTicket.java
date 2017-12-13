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

    public static Integer getTicketId(String getFaqListResponse) throws ParseException, java.text.ParseException {
        JSONParser parser = new JSONParser();
        System.out.println("getFaqListResponse " + getFaqListResponse);
        JSONObject jsonObj = (JSONObject) parser.parse(getFaqListResponse);
        Integer tid;

        try {
            tid = Integer.parseInt(jsonObj.get("tid").toString());
        } catch (Exception e){
            return tid = null;
        }

        return tid;
    }
}

package com.dubtsov._2bsafe.Parents.Functions.Tickets;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateEmailClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import org.json.simple.JSONObject;

/**
 * Created by user on 12.09.17.
 */
public class GenerateTicketContent{

    private static JSONObject jsonObj;

    public static JSONObject getSendTicketContent() throws Exception {
        jsonObj = new JSONObject();
        jsonObj.put("subj", "TestSubject");
        jsonObj.put("msg", "TestMessage");
        jsonObj.put("rnd", GenerateTokenClass.getGeneratedToken());
        return jsonObj;
    }

    public static JSONObject getSendTicketLandingContent() throws Exception {
        jsonObj = new JSONObject();
        jsonObj.put("subj", "TestSubject");
        jsonObj.put("msg", "TestMessage");
        jsonObj.put("em", GenerateEmailClass.getGeneratedEmail());
        jsonObj.put("rnd", GenerateTokenClass.getGeneratedToken());
        return jsonObj;
    }

}

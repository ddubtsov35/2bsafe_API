package com.dubtsov._2bsafe.Parents.Functions.Tickets;

import com.dubtsov._2bsafe.Parents.Functions.Rules.RulesClass;
import com.dubtsov._2bsafe.Parents.Functions.Tariffs.GenerateTariffContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.BaseContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateEmailClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import org.json.simple.JSONObject;

/**
 * Created by user on 12.09.17.
 */
public class GenerateTicketContent{

    private static JSONObject jsonObj = new JSONObject();

    public static JSONObject getSendTicketContent() throws Exception {
        jsonObj.put("subj", "TestSubject");
        jsonObj.put("msg", "TestMessage");
        jsonObj.put("rnd", GenerateTokenClass.getGeneratedToken());
        return jsonObj;
    }

    public static JSONObject getSendTicketLandingContent() throws Exception {
        jsonObj.put("subj", "TestSubject");
        jsonObj.put("msg", "TestMessage");
        jsonObj.put("em", GenerateEmailClass.getGeneratedEmail());
        jsonObj.put("rnd", GenerateTokenClass.getGeneratedToken());
        return jsonObj;
    }

}

package com.dubtsov._2bsafe.Parents.Functions.Tickets;

import com.dubtsov._2bsafe.Parents.Functions.Registration.GenerateRegistrationContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateEmailClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateNameClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Pool.UserPool;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 12.09.17.
 */
public class GenerateTicketContent{

    public static JSONObject getSendTicketContent() throws Exception {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("subj", "TestSubject");
        jsonObj.put("msg", "TestMessage");
        return jsonObj;
    }
    public static Object[] provideNegativeGetSendTicketContent() throws IOException, ParseException {
        JSONObject jsonObj = new JSONObject();

        JSONObject jsonObj1 = new JSONObject();
        jsonObj1.put("subj", null);
        jsonObj1.put("msg",null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("subj", "TestSubject");
        jsonObj2.put("msg",null);

        JSONObject jsonObj3 = new JSONObject();
        jsonObj3.put("subj", null);
        jsonObj3.put("msg","TestMessage");

        JSONObject jsonObj4 = new JSONObject();
        jsonObj4.put("msg",null);

        JSONObject jsonObj5 = new JSONObject();
        jsonObj5.put("subj", null);

        JSONObject jsonObj6 = new JSONObject();
        jsonObj6.put("subj", null);
        jsonObj6.put("msg",null);


        JSONObject jsonObj11 = new JSONObject();
        jsonObj11.put("msg","TestMessage");

        JSONObject jsonObj12 = new JSONObject();
        jsonObj12.put("subj", "TestSubject");

        JSONObject jsonObj13 = new JSONObject();

        return new Object[]{jsonObj, jsonObj2, jsonObj3, jsonObj4, jsonObj5, jsonObj6, jsonObj11, jsonObj12, jsonObj13};
    }
    
    
    
    
    
    

    public static JSONObject getSendTicketLandingContent() throws Exception {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("subj", "TestSubject");
        jsonObj.put("msg", "TestMessage");
        jsonObj.put("em", GenerateEmailClass.getGeneratedEmail());
        return jsonObj;
    }
    public static Object[] provideGetSendTicketLandingContent() throws IOException, ParseException {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("subj", null);
        jsonObj.put("msg", null);
        jsonObj.put("em", null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("subj", "fakesubj");
        jsonObj2.put("msg", "fakemsg");
        jsonObj2.put("em", "23213");

        JSONObject jsonObj3 = new JSONObject();
        jsonObj3.put("subj", null);
        jsonObj3.put("msg", "TestMessage");
        jsonObj3.put("em",GenerateEmailClass.getGeneratedEmail());

        JSONObject jsonObj4 = new JSONObject();
        jsonObj4.put("subj", "TestSubject");
        jsonObj4.put("msg", null);
        jsonObj4.put("em", GenerateEmailClass.getGeneratedEmail());

        JSONObject jsonObj5 = new JSONObject();
        jsonObj5.put("subj","TestSubject");
        jsonObj5.put("msg", "TestMessage");
        jsonObj5.put("em", null);

        JSONObject jsonObj6 = new JSONObject();
        jsonObj6.put("subj", "TestSubject");
        jsonObj6.put("msg", "TestMessage");
        jsonObj6.put("em", GenerateEmailClass.getGeneratedEmail());

        JSONObject jsonObj7 = new JSONObject();
        jsonObj7.put("subj", "TestSubject");

        JSONObject jsonObj8 = new JSONObject();
        jsonObj8.put("msg", "TestMessage");

        JSONObject jsonObj9 = new JSONObject();
        jsonObj9.put("em", GenerateEmailClass.getGeneratedEmail());

        JSONObject jsonObj11 = new JSONObject();

        JSONObject jsonObj12 = new JSONObject();
        jsonObj12.put("subj", "TestSubject");
        jsonObj12.put("msg", "TestMessage");
        jsonObj12.put("em", GenerateEmailClass.getGeneratedEmail());

        JSONObject jsonObj13 = new JSONObject();
        jsonObj13.put("subj", "TestSubject");
        jsonObj13.put("msg", "TestMessage");
        jsonObj13.put("em", "54234234");

        JSONObject jsonObj14 = new JSONObject();
        jsonObj14.put("subj", "TestSubject");
        jsonObj14.put("msg", "fakemsg");
        jsonObj14.put("em", GenerateEmailClass.getGeneratedEmail());

        JSONObject jsonObj15 = new JSONObject();
        jsonObj15.put("subj", "fakesubj");
        jsonObj15.put("msg", "TestMessage");
        jsonObj15.put("em", GenerateEmailClass.getGeneratedEmail());


        return new Object[]{jsonObj, jsonObj2, jsonObj3, jsonObj4, jsonObj5, jsonObj6, jsonObj7, jsonObj8, jsonObj9, jsonObj11, jsonObj12, jsonObj13, jsonObj14, jsonObj15};
    }

}

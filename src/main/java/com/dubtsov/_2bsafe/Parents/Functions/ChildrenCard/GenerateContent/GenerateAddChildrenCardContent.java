package com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateNameClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GeneratePhoneClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Random;

/**
 * Created by user on 08.09.17.
 */
public class GenerateAddChildrenCardContent{

    private static Random random;

    public GenerateAddChildrenCardContent() throws ParseException {}

    public static JSONObject getAddChildrenCard() throws IOException {
        random = new Random();
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("name", GenerateNameClass.getGenerateName());
        jsonObj.put("phone", GeneratePhoneClass.getGeneratedPhone());
        jsonObj.put("age", String.valueOf(random.nextInt((18 - 0) + 1) + 0));
        jsonObj.put("send_sms", String.valueOf(0));
        //content.put("file", "test.png");
        return jsonObj;
    }

    public static Object[] provideGetSetAccountContent1() throws IOException, ParseException {
        JSONObject jsonObj = new JSONObject();
        random = new Random();
        jsonObj.put("name", null);
        jsonObj.put("phone", null);
        jsonObj.put("age", null);
        jsonObj.put("send_sms", null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("name", "fakeName");
        jsonObj2.put("phone", "fakePhone");
        jsonObj2.put("age", "23213");
        jsonObj2.put("send_sms", "123");

        JSONObject jsonObj3 = new JSONObject();
        jsonObj3.put("name", "");
        jsonObj3.put("phone", GeneratePhoneClass.getGeneratedPhone());
        jsonObj3.put("age", String.valueOf(random.nextInt((90 - 0 + 1) + 0)));
        jsonObj3.put("send_sms", String.valueOf(0));

        JSONObject jsonObj4 = new JSONObject();
        jsonObj4.put("name", GenerateNameClass.getGenerateName());
        jsonObj4.put("phone", null);
        jsonObj4.put("age", String.valueOf(random.nextInt((90 - 0 + 1) + 0)));
        jsonObj4.put("send_sms", String.valueOf(0));

        JSONObject jsonObj5 = new JSONObject();
        jsonObj5.put("name", GenerateNameClass.getGenerateName());
        jsonObj5.put("phone", GeneratePhoneClass.getGeneratedPhone());
        jsonObj5.put("age", null);
        jsonObj5.put("send_sms", String.valueOf(0));

        JSONObject jsonObj6 = new JSONObject();
        jsonObj6.put("name", GenerateNameClass.getGenerateName());
        jsonObj6.put("phone", GeneratePhoneClass.getGeneratedPhone());
        jsonObj6.put("age", String.valueOf(random.nextInt((90 - 0) + 1) + 0));
        jsonObj6.put("send_sms", "");

        JSONObject jsonObj7 = new JSONObject();
        jsonObj7.put("name", GenerateNameClass.getGenerateName());

        JSONObject jsonObj8 = new JSONObject();
        jsonObj8.put("phone", GeneratePhoneClass.getGeneratedPhone());

        JSONObject jsonObj9 = new JSONObject();
        jsonObj9.put("age", String.valueOf(random.nextInt((90 - 0) + 1) + 0));

        JSONObject jsonObj10 = new JSONObject();
        jsonObj10.put("send_sms", String.valueOf(0));

        JSONObject jsonObj11 = new JSONObject();

        JSONObject jsonObj14 = new JSONObject();
        jsonObj14.put("name", GenerateNameClass.getGenerateName());
        jsonObj14.put("phone", "fakePhone");
        jsonObj14.put("age", String.valueOf(random.nextInt((90 - 0) + 1) + 0));
        jsonObj14.put("send_sms", String.valueOf(0));


        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3},
                new JSONObject[]{jsonObj4},
                new JSONObject[]{jsonObj5},
                //new JSONObject[]{jsonObj6},
                new JSONObject[]{jsonObj7},
                new JSONObject[]{jsonObj8},
                new JSONObject[]{jsonObj9},
                new JSONObject[]{jsonObj10},
                new JSONObject[]{jsonObj11},
                /*new JSONObject[]{jsonObj12},
                new JSONObject[]{jsonObj13},*/
                new JSONObject[]{jsonObj14}
        };
    }
}

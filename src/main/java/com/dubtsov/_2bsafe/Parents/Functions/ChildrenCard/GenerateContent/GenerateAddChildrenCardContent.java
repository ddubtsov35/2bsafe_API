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

    private static JSONObject jsonObj = new JSONObject();
    private static Random random;

    public GenerateAddChildrenCardContent() throws ParseException {}

    public static JSONObject getAddChildrenCard() throws IOException {
        random = new Random();
        jsonObj.put("name", GenerateNameClass.getGenerateName());
        jsonObj.put("phone", GeneratePhoneClass.getGeneratedPhone());
        jsonObj.put("age", String.valueOf(random.nextInt((90 - 0) + 1) + 0));
        jsonObj.put("send_sms", String.valueOf(0));
        //content.put("file", "test.png");
        return jsonObj;
    }

    public static Object[] provideGetSetAccountContent1() throws IOException, ParseException {
        jsonObj = new JSONObject();
        jsonObj.put("name", null);
        jsonObj.put("phone", null);
        jsonObj.put("age", null);
        jsonObj.put("send_sms", null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj.put("name", "fakeName");
        jsonObj.put("phone", "fakePhone");
        jsonObj.put("age", "23213");
        jsonObj.put("send_sms", "123");

        JSONObject jsonObj3 = new JSONObject();
        jsonObj.put("name", null);
        jsonObj.put("phone", GeneratePhoneClass.getGeneratedPhone());
        jsonObj.put("age", String.valueOf(random.nextInt((90 - 0) + 1) + 0));
        jsonObj.put("send_sms", String.valueOf(0));

        JSONObject jsonObj4 = new JSONObject();
        jsonObj.put("name", GenerateNameClass.getGenerateName());
        jsonObj.put("phone", null);
        jsonObj.put("age", String.valueOf(random.nextInt((90 - 0) + 1) + 0));
        jsonObj.put("send_sms", String.valueOf(0));

        JSONObject jsonObj5 = new JSONObject();
        jsonObj.put("name", GenerateNameClass.getGenerateName());
        jsonObj.put("phone", GeneratePhoneClass.getGeneratedPhone());
        jsonObj.put("age", null);
        jsonObj.put("send_sms", String.valueOf(0));

        JSONObject jsonObj6 = new JSONObject();
        jsonObj.put("name", GenerateNameClass.getGenerateName());
        jsonObj.put("phone", GeneratePhoneClass.getGeneratedPhone());
        jsonObj.put("age", String.valueOf(random.nextInt((90 - 0) + 1) + 0));
        jsonObj.put("send_sms", null);

        JSONObject jsonObj7 = new JSONObject();
        jsonObj.put("name", GenerateNameClass.getGenerateName());

        JSONObject jsonObj8 = new JSONObject();
        jsonObj.put("phone", GeneratePhoneClass.getGeneratedPhone());

        JSONObject jsonObj9 = new JSONObject();
        jsonObj.put("age", String.valueOf(random.nextInt((90 - 0) + 1) + 0));

        JSONObject jsonObj10 = new JSONObject();
        jsonObj.put("send_sms", String.valueOf(0));

        JSONObject jsonObj11 = new JSONObject();

        JSONObject jsonObj12 = new JSONObject();
        jsonObj.put("name", GenerateNameClass.getGenerateName());
        jsonObj.put("phone", GeneratePhoneClass.getGeneratedPhone());
        jsonObj.put("age", String.valueOf(random.nextInt((90 - 0) + 1) + 0));
        jsonObj.put("send_sms", "214234");

        JSONObject jsonObj13 = new JSONObject();
        jsonObj.put("name", GenerateNameClass.getGenerateName());
        jsonObj.put("phone", GeneratePhoneClass.getGeneratedPhone());
        jsonObj.put("age", "54234234");
        jsonObj.put("send_sms", String.valueOf(0));

        JSONObject jsonObj14 = new JSONObject();
        jsonObj.put("name", GenerateNameClass.getGenerateName());
        jsonObj.put("phone", "fakePhone");
        jsonObj.put("age", String.valueOf(random.nextInt((90 - 0) + 1) + 0));
        jsonObj.put("send_sms", String.valueOf(0));

        JSONObject jsonObj15 = new JSONObject();
        jsonObj.put("name", "fakeName");
        jsonObj.put("phone", GeneratePhoneClass.getGeneratedPhone());
        jsonObj.put("age", String.valueOf(random.nextInt((90 - 0) + 1) + 0));
        jsonObj.put("send_sms", String.valueOf(0));


        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3},
                new JSONObject[]{jsonObj4},
                new JSONObject[]{jsonObj5},
                new JSONObject[]{jsonObj6}
        };
    }
}

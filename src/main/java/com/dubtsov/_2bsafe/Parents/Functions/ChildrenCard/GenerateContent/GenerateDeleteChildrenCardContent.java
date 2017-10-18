package com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent;

import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.ChildrenCardClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Pool.UserPool;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Random;

/**
 * Created by user on 08.09.17.
 */
public class GenerateDeleteChildrenCardContent {

    private static ChildrenCardClass childrenCardClass;
    private static JSONObject jsonObj = new JSONObject();

    public GenerateDeleteChildrenCardContent() throws ParseException {}

    public static JSONObject getDeleteChildrenCardContent() throws IOException, ParseException, java.text.ParseException {
        childrenCardClass = new ChildrenCardClass();
        jsonObj.put("profile_id", childrenCardClass.getChildrenCardList().get(0).getProfile_id());
        jsonObj.put("pwd", UserPool.getUserFromFile().get("pwd"));
        jsonObj.put("rnd", GenerateTokenClass.getGeneratedToken());
        return jsonObj;
    }

    public static Object[] provideNegativeGetAppsInGroupContent() throws IOException, ParseException, java.text.ParseException {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("profile_id", null);
        jsonObj.put("rnd",null);
        jsonObj.put("pwd", null);

        JSONObject jsonObj2 = new JSONObject();
        Random random = new Random();
        jsonObj2.put("profile_id", childrenCardClass.getChildrenCardList().get(0).getProfile_id());
        jsonObj2.put("rnd",null);
        jsonObj2.put("pwd", random.nextInt(10000 - 1 + 1)+1);

        JSONObject jsonObj3 = new JSONObject();
        jsonObj3.put("profile_id", childrenCardClass.getChildrenCardList().get(0).getProfile_id());
        jsonObj3.put("pwd", UserPool.getUserFromFile().get("pwd"));

        JSONObject jsonObj4 = new JSONObject();
        jsonObj4.put("profile_id", random.nextInt(10000 - 1 + 1)+1);
        jsonObj4.put("rnd",GenerateTokenClass.getGeneratedToken());
        jsonObj4.put("pwd", random.nextInt(10000 - 1 + 1)+1);

        JSONObject jsonObj5 = new JSONObject();
        jsonObj5.put("profile_id", random.nextInt(10000 - 1 + 1)+1);
        jsonObj5.put("rnd",null);
        jsonObj5.put("pwd", random.nextInt(10000 - 1 + 1)+1);

        JSONObject jsonObj6 = new JSONObject();
        jsonObj6.put("profile_id", random.nextInt(10000 - 1 + 1)+1);
        jsonObj6.put("pwd", random.nextInt(10000 - 1 + 1)+1);

        JSONObject jsonObj7 = new JSONObject();
        jsonObj7.put("profile_id", null);
        jsonObj7.put("rnd",GenerateTokenClass.getGeneratedToken());
        jsonObj7.put("pwd", UserPool.getUserFromFile().get("pwd"));

        JSONObject jsonObj8 = new JSONObject();
        jsonObj8.put("profile_id", null);
        jsonObj8.put("rnd",null);
        jsonObj8.put("pwd", random.nextInt(10000 - 1 + 1)+1);

        JSONObject jsonObj9 = new JSONObject();
        jsonObj9.put("profile_id", null);
        jsonObj9.put("pwd", UserPool.getUserFromFile().get("pwd"));

        JSONObject jsonObj10 = new JSONObject();
        jsonObj10.put("rnd",GenerateTokenClass.getGeneratedToken());
        jsonObj10.put("pwd", random.nextInt(10000 - 1 + 1)+1);

        JSONObject jsonObj11 = new JSONObject();
        jsonObj11.put("rnd",null);
        jsonObj11.put("pwd", UserPool.getUserFromFile().get("pwd"));

        JSONObject jsonObj12 = new JSONObject();
        jsonObj12.put("pwd", random.nextInt(10000 - 1 + 1)+1);


        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3},
                new JSONObject[]{jsonObj4},
                new JSONObject[]{jsonObj5},
                new JSONObject[]{jsonObj6},
                new JSONObject[]{jsonObj7},
                new JSONObject[]{jsonObj8},
                new JSONObject[]{jsonObj9},
                new JSONObject[]{jsonObj10},
                new JSONObject[]{jsonObj11},
                new JSONObject[]{jsonObj12}
        };
    }

}

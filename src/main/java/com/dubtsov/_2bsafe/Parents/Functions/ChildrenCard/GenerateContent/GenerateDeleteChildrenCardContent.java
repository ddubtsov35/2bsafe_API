package com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent;

import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.ChildrenCardClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Pool.ChildrenCardPools;
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

    public static JSONObject getDeleteChildrenCardContent() throws Exception {
        /*childrenCardClass = new ChildrenCardClass();
        if(childrenCardClass.getChildrenCardList().size() > 0) {
            if (GenerateProfileIdContent.profileId == null) {
                jsonObj = GenerateProfileIdContent.getProfileId();
                jsonObj.put("profile_id", jsonObj.get("profile_id"));
            } else {
                jsonObj.put("profile_id", GenerateProfileIdContent.profileId);
            }
        } else{
            childrenCardClass.addChildrenCard();
            if (GenerateProfileIdContent.profileId == null) {
                jsonObj = GenerateProfileIdContent.getProfileId();
                jsonObj.put("profile_id", jsonObj.get("profile_id"));
            } else {
                jsonObj.put("profile_id", GenerateProfileIdContent.profileId);
            }
        }
        jsonObj.put("pwd", UserPool.getUserFromFile().get("pwd"));
        return jsonObj;*/

        childrenCardClass = new ChildrenCardClass();
        if(ChildrenCardPools.getChildrenCardFromFile() == null) {
            childrenCardClass.addChildrenCard();
        }
        int profileId = ChildrenCardPools.getChildrenCardFromFile().getProfile_id();
        jsonObj.put("profile_id", profileId);
        jsonObj.put("pwd", UserPool.getUserFromFile().get("pwd"));
        return jsonObj;
    }

    public static Object[] provideNegativeGetAppsInGroupContent() throws Exception {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("profile_id", null);
        jsonObj.put("pwd", null);

        JSONObject jsonObj2 = new JSONObject();
        Random random = new Random();
        //if(GenerateProfileIdContent.profileId == null){
        jsonObj2  = GenerateProfileIdContent.getProfileId();
        jsonObj2.put("profile_id", jsonObj.get("profile_id"));
        /*} else{
            jsonObj.put("profile_id", GenerateProfileIdContent.profileId);
        }*/
        jsonObj2.put("pwd", random.nextInt(1000000 - 1 + 1)+1);

        JSONObject jsonObj3 = new JSONObject();
        //if(GenerateProfileIdContent.profileId == null){
        jsonObj3  = GenerateProfileIdContent.getProfileId();
        jsonObj3.put("profile_id", jsonObj.get("profile_id"));
        /*} else{
            jsonObj.put("profile_id", GenerateProfileIdContent.profileId);
        }*/
        jsonObj3.put("pwd", UserPool.getUserFromFile().get("pwd"));

        JSONObject jsonObj4 = new JSONObject();
        jsonObj4.put("profile_id", random.nextInt(1000000 - 1 + 1)+1);
        jsonObj4.put("pwd", random.nextInt(1000000 - 1 + 1)+1);

        JSONObject jsonObj5 = new JSONObject();
        jsonObj5.put("profile_id", random.nextInt(1000000 - 1 + 1)+1);
        jsonObj5.put("pwd", random.nextInt(1000000 - 1 + 1)+1);

        JSONObject jsonObj6 = new JSONObject();
        jsonObj6.put("profile_id", random.nextInt(1000000 - 1 + 1)+1);
        jsonObj6.put("pwd", random.nextInt(1000000 - 1 + 1)+1);

        JSONObject jsonObj7 = new JSONObject();
        jsonObj7.put("profile_id", null);
        jsonObj7.put("pwd", UserPool.getUserFromFile().get("pwd"));

        JSONObject jsonObj8 = new JSONObject();
        jsonObj8.put("profile_id", null);
        jsonObj8.put("pwd", random.nextInt(1000000 - 1 + 1)+1);

        JSONObject jsonObj9 = new JSONObject();
        jsonObj9.put("profile_id", null);
        jsonObj9.put("pwd", UserPool.getUserFromFile().get("pwd"));

        JSONObject jsonObj10 = new JSONObject();
        jsonObj10.put("pwd", random.nextInt(1000000 - 1 + 1)+1);

        JSONObject jsonObj11 = new JSONObject();
        jsonObj11.put("pwd", UserPool.getUserFromFile().get("pwd"));

        JSONObject jsonObj12 = new JSONObject();
        jsonObj12.put("pwd", random.nextInt(1000000 - 1 + 1)+1);


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

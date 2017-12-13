package com.dubtsov._2bsafe.Parents.Functions.Push;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.Models.ProfileCard;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.ChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent.GenerateSelectChildrenCardContent;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep1Class;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep2Class;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.ForProvideData;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Random;

/**
 * Created by user on 04.09.17.
 */
public class GenerateNotifyListContent{

    public static JSONObject getNotifyListContent() throws Exception {
        JSONObject jsonObj = new JSONObject();
        JSONArray jsonArray = new JSONArray();

        jsonObj.put("start", 0);

        if(GenerateProfileIdContent.profileId == null){
            jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        } else{
            jsonObj.put("profile_id", GenerateProfileIdContent.profileId);
        }

        jsonObj.put("limit", 100);

        jsonArray.add("geo");
        jsonArray.add("security");
        jsonArray.add("phone");
        jsonArray.add("msg");
        jsonObj.put("type", jsonArray);

        jsonObj.put("from_date", "20-12-2007");
        jsonObj.put("to_date", "20-12-2007");



        System.out.println("jsonObject " + jsonObj);
        return jsonObj;
    }
    public static Object[] provideNegativeGetNotifyListContent() throws IOException, ParseException {
        JSONObject jsonObj = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        jsonObj.put("start", null);
        jsonObj.put("profile_id", null);
        jsonObj.put("limit", null);
        jsonArray.add(null);
        jsonArray.add(null);
        jsonArray.add(null);
        jsonArray.add(null);
        jsonObj.put("type", jsonArray);
        jsonObj.put("from_date", null);
        jsonObj.put("to_date", null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj = new JSONObject();
        jsonArray = new JSONArray();
        Random random = new Random();
        jsonObj.put("start", 0);
        jsonObj.put("profile_id", random.nextInt(1000000 -1 +1 ) + 1);
        jsonObj.put("limit", 1001111);
        jsonArray.add("fail");
        jsonArray.add("fail");
        jsonArray.add("fail");
        jsonArray.add("fail");
        jsonObj.put("type", jsonArray);
        jsonObj.put("from_date", "201-121-20071111");
        jsonObj.put("to_date", "201-121-2007111");

        JSONObject jsonObj3 = new JSONObject();

        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3}
        };
    }







    public static JSONObject createSession_alarm_update_updateLong() throws Exception {
        JSONObject jsonObj = new JSONObject();
        if(GenerateProfileIdContent.profileId == null){
            jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        } else{
            jsonObj.put("profile_id", GenerateProfileIdContent.profileId);
        }
        return jsonObj;
    }
    public static Object[] provideNegativeCreateSession_alarm_update_updateLong() throws IOException, ParseException {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("profile_id", null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("profile_id", "failProfileId");

        JSONObject jsonObj3 = new JSONObject();

        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3}
        };
    }






    public static JSONObject blockScreen() throws Exception {
        JSONObject jsonObj = new JSONObject();
        if(GenerateProfileIdContent.profileId == null){
            jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        } else{
            jsonObj.put("profile_id", GenerateProfileIdContent.profileId);
        }
        jsonObj.put("pin", "111111");
        jsonObj.put("text", "TestText");
        return jsonObj;
    }
    public static Object[] provideBlockScreen() throws Exception {
        Random random = new Random();
        ForProvideData.getTestData();

        JSONObject jsonObj = new JSONObject();
        jsonObj.put("pin", null);
        jsonObj.put("profile_id", null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("pin", "111111");
        jsonObj2.put("profile_id", null);

        JSONObject jsonObj3 = new JSONObject();
        if(GenerateProfileIdContent.profileId == null){
            jsonObj3.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        } else{
            jsonObj3.put("profile_id", GenerateProfileIdContent.profileId);
        }

        JSONObject jsonObj4 = new JSONObject();
        jsonObj4.put("pin", "111111");

        JSONObject jsonObj5 = new JSONObject();

        JSONObject jsonObj6 = new JSONObject();
        jsonObj6.put("pin", "1");
        jsonObj6.put("profile_id", random.nextInt(10000000 -1 +1) +1);

        JSONObject jsonObj7 = new JSONObject();
        jsonObj6.put("pin", "11111111111");
        jsonObj6.put("profile_id", random.nextInt(10000000 -1 +1) +1);

        JSONObject jsonObj8 = new JSONObject();
        jsonObj6.put("pin", null);
        jsonObj6.put("profile_id", random.nextInt(10000000 -1 +1) +1);

        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3},
                new JSONObject[]{jsonObj4},
                new JSONObject[]{jsonObj5},
                new JSONObject[]{jsonObj6},
                new JSONObject[]{jsonObj7},
                new JSONObject[]{jsonObj8}
        };
    }

}

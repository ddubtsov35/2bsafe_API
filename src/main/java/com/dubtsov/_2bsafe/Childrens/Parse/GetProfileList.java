package com.dubtsov._2bsafe.Childrens.Parse;

import com.dubtsov._2bsafe.Childrens.Models.ConditionInformationFromDevice;
import com.dubtsov._2bsafe.Childrens.Models.ProfileCard;
import com.dubtsov._2bsafe.Parents.Models.ChildrenCard;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 23.08.17.
 */
public class GetProfileList {

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;
    private static JSONArray jsonArray;

    private static List<ProfileCard> profileCard;

    public static List<ProfileCard> getProfileCard(String profileCardString) throws ParseException, java.text.ParseException, IOException {
        parser = new JSONParser();
        jsonObj = (JSONObject) obj;
        profileCard = new ArrayList<>();
        try {
            obj = parser.parse(profileCardString);
            jsonObj = (JSONObject) obj;

            System.out.println("jsonObj " + jsonObj);
            String scs = jsonObj.get("scs").toString();
            jsonArray = (JSONArray) jsonObj.get("data");
            try {
                for (int i = 0; i < jsonArray.size(); i++) {

                    profileCard.add(new ProfileCard(jsonArray.get(i).toString(), scs));
                }
            } catch (Exception e){
                return null;
            }
            return profileCard;
        } catch (ParseException e) {
            return null;
        }
    }

}

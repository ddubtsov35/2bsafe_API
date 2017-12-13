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

    public static List<ProfileCard> getProfileCard(String profileCardString) throws ParseException, java.text.ParseException, IOException {
        JSONParser parser = new JSONParser();
        List<ProfileCard> profileCard = new ArrayList<>();
        try {
            JSONObject jsonObj = (JSONObject) parser.parse(profileCardString);

            System.out.println("jsonObj " + jsonObj);
            String scs = jsonObj.get("scs").toString();
            JSONArray jsonArray = (JSONArray) jsonObj.get("data");
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

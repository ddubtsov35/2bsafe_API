package com.dubtsov._2bsafe.Parents.Parse;

import com.dubtsov._2bsafe.Parents.Models.GetRulesModel;
import com.dubtsov._2bsafe.Parents.Models.SetRulesModel;
import okhttp3.Response;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 30.08.17.
 */
public class GetRules {

    private static List<GetRulesModel> rulesList;

    public static List<GetRulesModel> getRulesList(String getRulesListResponse) throws ParseException, java.text.ParseException {
        rulesList = new ArrayList();
        JSONParser parser = new JSONParser();
        System.out.println("getRulesListResponse " + getRulesListResponse);
        JSONObject jsonObj = (JSONObject) parser.parse(getRulesListResponse);
        JSONArray jsonArray = (JSONArray) jsonObj.get("data");
        if(jsonArray.size() > 0) {
            for (int i = 0; i < jsonArray.size(); i++) {
                rulesList.add(new GetRulesModel(jsonArray.get(i).toString()));
            }
            return rulesList;
        } else {
            return rulesList;
        }
    }

    private static SetRulesModel getSetRules;

    public static SetRulesModel getSetRules(String getSetRulesString){
        try {
            getSetRules = new SetRulesModel(getSetRulesString);
        } catch (ParseException e){}
        finally {
            return getSetRules;
        }
    }

}

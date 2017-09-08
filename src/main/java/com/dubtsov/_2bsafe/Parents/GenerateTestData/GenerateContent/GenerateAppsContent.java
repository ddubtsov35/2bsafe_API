package com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 08.09.17.
 */
public class GenerateAppsContent extends BaseContent{
    public GenerateAppsContent() throws ParseException {}

    public static JSONObject getAppsInfoContent() throws IOException {
        //TODO get profileID
        //jsonObj = GenerateRegistrationContent.getRegistrationStep1Content();
        jsonObj.put("rnd",GenerateTokenClass.getGeneratedToken());
        return jsonObj;
    }


    public static JSONObject getAppsInGroupContent() throws IOException {
        //TODO get profileID
        //TODO get groupID
        //jsonObj = GenerateRegistrationContent.getRegistrationStep1Content();
        jsonObj.put("rnd",GenerateTokenClass.getGeneratedToken());
        return jsonObj;
    }


    public static JSONObject getDetailInfoContent() throws IOException {
        //TODO get profileID
        //jsonObj = GenerateRegistrationContent.getRegistrationStep1Content();
        jsonObj.put("alias",GenerateTokenClass.getGeneratedToken());
        return jsonObj;
    }


    public static JSONObject getAppsBlockContent() throws IOException {
        //TODO get profileID
        //jsonObj = GenerateRegistrationContent.getRegistrationStep1Content();
        jsonObj.put("alias",GenerateTokenClass.getGeneratedToken());
        jsonObj.put("block",0);
        return jsonObj;
    }


    public static JSONObject getAppsBlockUpdateContent() throws IOException {
        //TODO get profileID
        //jsonObj = GenerateRegistrationContent.getRegistrationStep1Content();
        jsonObj.put("alias",GenerateTokenClass.getGeneratedToken());
        jsonObj.put("block",0);
        return jsonObj;
    }


    public static JSONObject getAppsUpdateContent() throws IOException {
        //TODO get profileID
        //jsonObj = GenerateRegistrationContent.getRegistrationStep1Content();
        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("alias",GenerateTokenClass.getGeneratedToken());
        jsonArray.add(jsonObject2);
        jsonObj.put("aliases",jsonArray);
        return jsonObj;
    }


    public static JSONObject getAppsDeleteContent() throws IOException {
        //TODO get profileID
        //jsonObj = GenerateRegistrationContent.getRegistrationStep1Content();
        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("alias",GenerateTokenClass.getGeneratedToken());
        jsonArray.add(jsonObject2);
        jsonObj.put("aliases",jsonArray);
        return jsonObj;
    }

}

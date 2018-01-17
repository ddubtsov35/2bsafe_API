package com.dubtsov._2bsafe.Parents.Functions.GroupsApp.GenerateData;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 17.01.18.
 */
public class ProvideDeleteGroup {

    public static Object[] provideDeleteGroupContent() throws IOException, ParseException {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("group_id", null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("group_id", "failRnd");

        JSONObject jsonObj3 = new JSONObject();

        return new Object[]{jsonObj, jsonObj2, jsonObj3};
    }

}

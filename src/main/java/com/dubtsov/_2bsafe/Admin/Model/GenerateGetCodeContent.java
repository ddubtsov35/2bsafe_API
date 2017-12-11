package com.dubtsov._2bsafe.Admin.Model;

import org.json.simple.JSONObject;

/**
 * Created by user on 22.11.17.
 */
public class GenerateGetCodeContent {

    private JSONObject jsonObject;

    public JSONObject getContent(String email){
        jsonObject = new JSONObject();

        jsonObject.put("email", email);

        return jsonObject;
    }

}

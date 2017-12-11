package com.dubtsov._2bsafe.Admin.Model;

import com.dubtsov._2bsafe.Parents.Pool.CidCkeyPool;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 21.11.17.
 */
public class UserModel {

    private JSONParser parser;
    private Object obj;
    private JSONObject jsonObj;

    private String success;
    private Integer emsg;
    private Integer act_code;

    public UserModel(){};

    public UserModel(String jsonObjectString) throws ParseException, java.text.ParseException, IOException {
        setObject(jsonObjectString);
    }

    private void setObject(String jsonObjectString) throws ParseException, java.text.ParseException, IOException {
        parser = new JSONParser();
        obj = parser.parse(jsonObjectString);
        jsonObj = (JSONObject) obj;
        if(jsonObj.get("success") != null) {setSuccess(jsonObj.get("success").toString());} else{setSuccess(null);}
        if(jsonObj.get("emsg") != null) {setEmsg(Integer.parseInt(jsonObj.get("emsg").toString()));} else{setEmsg(null);}
        if (jsonObj.get("act_code") != null) {setAct_code(Integer.parseInt(jsonObj.get("act_code").toString()));} else {setAct_code(null);}
    }

    public Integer getAct_code() {
        return act_code;
    }

    public void setAct_code(Integer act_code) {
        this.act_code = act_code;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public Integer getEmsg() {
        return emsg;
    }

    public void setEmsg(Integer emsg) {
        this.emsg = emsg;
    }
}

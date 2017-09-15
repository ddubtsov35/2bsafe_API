package com.dubtsov._2bsafe.Childrens.Authorisation;

import com.dubtsov._2bsafe.Parents.Functions.Registration.GenerateRegistrationContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.BaseContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Pool.UserPool;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import javax.jws.soap.SOAPBinding;
import java.io.IOException;

/**
 * Created by user on 08.09.17.
 */
public class GenerateAuthorisationChildren extends BaseContent {

    public GenerateAuthorisationChildren() throws ParseException {}

    public static JSONObject getAuthorisationChildrenContent() throws IOException, ParseException {
        if(UserPool.getUserFromFile() == null) {
            jsonObj = GenerateRegistrationContent.jsonObjectRegStep1Content;
            jsonObj.put("em", jsonObj.get("login"));
            jsonObj.put("pwd", jsonObj.get("pwd"));
        } else{
            jsonObj = UserPool.getUserFromFile();
            jsonObj.put("em", jsonObj.get("em"));
            jsonObj.put("pwd", jsonObj.get("pwd"));
        }
        jsonObj.put("cid","");
        jsonObj.put("token", GenerateTokenClass.getGeneratedToken());
        jsonObj.put("sname","TestDevice");
        jsonObj.put("os","Android");
        jsonObj.put("osv","10");
        jsonObj.put("scr","Doxya");
        jsonObj.put("man","TestMan");
        jsonObj.put("mod","TestMod");
        jsonObj.put("type",1);
        return jsonObj;
    }
}

package com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 08.09.17.
 */
public class GenerateAuthorisationChildren extends BaseContent{

    public GenerateAuthorisationChildren() throws ParseException {}

    public static JSONObject getAuthorisationChildrenContent() throws IOException {
        jsonObj = GenerateRegistrationContent.getRegistrationStep1Content();
        jsonObj.put("cid","");
        jsonObj.put("em", jsonObj.get("em"));
        jsonObj.put("pwd", jsonObj.get("pwd"));
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

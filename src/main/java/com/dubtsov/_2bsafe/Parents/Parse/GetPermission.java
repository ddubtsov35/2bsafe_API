package com.dubtsov._2bsafe.Parents.Parse;

import com.dubtsov._2bsafe.Parents.Models.HelpMe;
import com.dubtsov._2bsafe.Parents.Models.Permission;
import com.dubtsov._2bsafe.Parents.Models.Poll;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 01.09.17.
 */
public class GetPermission {

    private static Permission permission;

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;

    public static Permission getPermission(String getPermissionString){
        parser = new JSONParser();
        try {
            obj = parser.parse(getPermissionString);
            jsonObj = (JSONObject) obj;
            String scs = jsonObj.get("scs").toString();
            jsonObj = (JSONObject) jsonObj.get("data");
            permission = new Permission(jsonObj.toJSONString(), scs);
        } catch (ParseException e){}
        finally {
            return permission;
        }
    }

}

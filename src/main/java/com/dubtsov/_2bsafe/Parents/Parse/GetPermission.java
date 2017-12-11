package com.dubtsov._2bsafe.Parents.Parse;

import com.dubtsov._2bsafe.Parents.Models.Apps;
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

    public static Permission getPermission(String getPermissionString) throws java.text.ParseException {
        try {
            permission = new Permission(getPermissionString);
        } catch (ParseException e){}
        finally {
            return permission;
        }
    }
}

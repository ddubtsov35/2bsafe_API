package com.dubtsov._2bsafe.Parents.Functions.Permissions;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateCidCkeyContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import org.json.simple.JSONObject;

/**
 * Created by user on 12.09.17.
 */
public class GenerateSetPermissionContent{

    private static JSONObject jsonObj;
    public static JSONObject setPermissionObject;

    private static PermissionsClass permissionsClass;

        public static JSONObject setPermission() throws Exception {
            jsonObj = new JSONObject();
            permissionsClass = new PermissionsClass();
            if (permissionsClass.getPermission().getGeo() == 0){
                jsonObj.put("geo", 1);
                jsonObj.put("wifi", 1);
                jsonObj.put("datetime", 1);
                jsonObj.put("bt", 1);
                jsonObj.put("tether", 1);
                jsonObj.put("gsm", 1);
            } else{
                jsonObj.put("geo", 0);
                jsonObj.put("wifi", 0);
                jsonObj.put("datetime", 0);
                jsonObj.put("bt", 0);
                jsonObj.put("tether", 0);
                jsonObj.put("gsm", 0);
            }
            jsonObj.put("cid", GenerateCidCkeyContent.jsonObjectCidCkey.get("cid"));
            jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
            setPermissionObject = jsonObj;
            return jsonObj;
        }

    public static JSONObject getPermission() throws Exception {
        jsonObj = new JSONObject();
        jsonObj.put("cid", GenerateCidCkeyContent.jsonObjectCidCkey.get("cid"));
        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        return jsonObj;
    }
}

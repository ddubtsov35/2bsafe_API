package com.dubtsov._2bsafe.Parents.Functions.Permissions;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateCidCkeyContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import org.json.simple.JSONObject;

import java.util.Random;

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
    public static Object[] provideSetPermission() throws Exception {
        jsonObj = new JSONObject();
        jsonObj.put("geo", null);
        jsonObj.put("wifi", null);
        jsonObj.put("datetime", null);
        jsonObj.put("bt", null);
        jsonObj.put("tether", null);
        jsonObj.put("gsm", null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj.put("geo", 234);
        jsonObj.put("wifi", 234);
        jsonObj.put("datetime", 234);
        jsonObj.put("bt", 234);
        jsonObj.put("tether", 234);
        jsonObj.put("gsm", 234);

        JSONObject jsonObj3 = new JSONObject();

        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3}
        };
    }




    public static JSONObject getPermission() throws Exception {
        jsonObj = new JSONObject();
        jsonObj.put("cid", GenerateCidCkeyContent.jsonObjectCidCkey.get("cid"));
        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        return jsonObj;
    }
    public static Object[] provideGetPermission() throws Exception {
        Random random = new Random();
        AuthorisationChildClass authorisationChildClass = new AuthorisationChildClass();

        jsonObj = new JSONObject();
        jsonObj.put("cid", null);
        jsonObj.put("profile_id", null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("cid", authorisationChildClass.authorisationChildren().getCid());
        jsonObj2.put("profile_id", null);

        JSONObject jsonObj3 = new JSONObject();
        jsonObj3.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));

        JSONObject jsonObj4 = new JSONObject();
        jsonObj4.put("cid", authorisationChildClass.authorisationChildren().getCid());

        JSONObject jsonObj5 = new JSONObject();

        JSONObject jsonObj6 = new JSONObject();
        jsonObj6.put("cid", authorisationChildClass.authorisationChildren().getCid());
        jsonObj6.put("profile_id", random.nextInt(10000 -1 +1) +1);

        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3},
                new JSONObject[]{jsonObj4},
                new JSONObject[]{jsonObj5},
                new JSONObject[]{jsonObj6}
        };
    }
}

package com.dubtsov._2bsafe.Parents.Functions.Permissions;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.BaseContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateCidCkeyContent;
import org.json.simple.JSONObject;

/**
 * Created by user on 12.09.17.
 */
public class GenerateSetPermissionContent extends BaseContent{

        public static JSONObject setPermission() throws Exception {
            jsonObj.put("geo", 0);
            jsonObj.put("wifi", 0);
            jsonObj.put("datetime", 0);
            jsonObj.put("bt", 0);
            jsonObj.put("tether", 0);
            jsonObj.put("gsm", 0);
            jsonObj.put("cid", GenerateCidCkeyContent.getCidCkey().get("cid"));
            return jsonObj;
        }
}

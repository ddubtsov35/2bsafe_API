package com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent;

import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Parents.Pool.CidCkeyPool;
import org.json.simple.JSONObject;

/**
 * Created by user on 12.09.17.
 */
public class GenerateCidCkeyContent{
    public static JSONObject jsonObjectCidCkey = null;
    private static JSONObject jsonObj;

    public static JSONObject getCidCkey(ChildrenResponseAuthorisationModel childrenResponseAuthorisationModel) throws Exception {
        jsonObj = new JSONObject();
        if(CidCkeyPool.getCidFromFile() == null) {
            jsonObj.put("cid", childrenResponseAuthorisationModel.getCid());
            jsonObj.put("ckey", childrenResponseAuthorisationModel.getCkey());
        } else{
            jsonObj.put("cid", CidCkeyPool.getCidFromFile().get("cid"));
            jsonObj.put("ckey", CidCkeyPool.getCidFromFile().get("ckey"));
        }
        jsonObjectCidCkey = jsonObj;
        return jsonObj;
    }
}

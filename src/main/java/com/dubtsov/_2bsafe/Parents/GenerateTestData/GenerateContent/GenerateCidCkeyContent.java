package com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent;

import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Parents.Pool.CidCkeyPool;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

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
            if(!childrenResponseAuthorisationModel.getCid().equals(CidCkeyPool.getCidFromFile().get("cid")) ||
                    !childrenResponseAuthorisationModel.getCkey().equals(CidCkeyPool.getCidFromFile().get("ckey"))) {
                CidCkeyPool.getCidFromFile().clear();
                jsonObj.put("cid", childrenResponseAuthorisationModel.getCid());
                jsonObj.put("ckey", childrenResponseAuthorisationModel.getCkey());
                CidCkeyPool.setCidCkey(jsonObj);

            }
        }
        jsonObjectCidCkey = jsonObj;
        return jsonObj;
    }

    public static JSONObject getJsonObjectCidCkey() throws IOException, ParseException {
        JSONObject jsonObj = new JSONObject();
        if(CidCkeyPool.getCidFromFile() == null) {
            jsonObj.put("cid", GenerateCidCkeyContent.jsonObjectCidCkey.get("cid"));
            jsonObj.put("ckey", GenerateCidCkeyContent.jsonObjectCidCkey.get("ckey"));
        } else {
            jsonObj.put("cid", CidCkeyPool.getCidFromFile().get("cid"));
            jsonObj.put("ckey", CidCkeyPool.getCidFromFile().get("ckey"));
        }
        return jsonObj;
    }
}

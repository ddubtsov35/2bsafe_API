package com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent;

import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Parents.Pool.CidCkeyPool;
import com.dubtsov._2bsafe.Parents.Pool.CidCkeyRegisteredPool;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 12.09.17.
 */
public class GenerateCidCkeyContent{
    public JSONObject jsonObjectCidCkey = null;
    private JSONObject jsonObj;

    public JSONObject getCidCkey(ChildrenResponseAuthorisationModel childrenResponseAuthorisationModel) throws Exception {
        jsonObj = new JSONObject();
        if(CidCkeyPool.getCidFromFile() == null) {
            jsonObj.put("cid", childrenResponseAuthorisationModel.getCid());
            jsonObj.put("ckey", childrenResponseAuthorisationModel.getCkey());
        } else{
            if(!childrenResponseAuthorisationModel.getCid().equals(CidCkeyPool.getCidFromFile().get("cid")) ||
                    !childrenResponseAuthorisationModel.getCkey().equals(CidCkeyPool.getCidFromFile().get("ckey"))) {
                System.out.println("Замена CID CKEY после авторизации пиздюка!!!");
                CidCkeyPool.clearFile();
                jsonObj.put("cid", childrenResponseAuthorisationModel.getCid());
                jsonObj.put("ckey", childrenResponseAuthorisationModel.getCkey());
                CidCkeyPool.setCidCkey(jsonObj);
            }
        }
        System.out.println("jsonObj " + jsonObj);
        if(jsonObj.size() != 0) {
            jsonObjectCidCkey = jsonObj;
        } else{
            jsonObjectCidCkey = CidCkeyPool.getCidFromFile();
        }

        return jsonObj;
    }

    public JSONObject getJsonObjectCidCkey() throws IOException, ParseException {
        JSONObject jsonObj = new JSONObject();
        if(CidCkeyPool.getCidFromFile() == null) {
            jsonObj.put("cid", jsonObjectCidCkey.get("cid"));
            jsonObj.put("ckey", jsonObjectCidCkey.get("ckey"));
        } else {
            jsonObj.put("cid", CidCkeyPool.getCidFromFile().get("cid"));
            jsonObj.put("ckey", CidCkeyPool.getCidFromFile().get("ckey"));
        }
        return jsonObj;
    }

    public JSONObject getJsonObjectCidCkeyForLogout() throws IOException, ParseException {
        JSONObject jsonObj = new JSONObject();
        /*if(CidCkeyRegisteredPool.getCidFromFile() == null) {
            jsonObj.put("cid", CidCkeyPool.getCidFromFile().get("cid"));
            jsonObj.put("ckey", CidCkeyPool.getCidFromFile().get("ckey"));
        } else {*/
            jsonObj.put("cid", CidCkeyRegisteredPool.getCidFromFile().get("cid"));
            jsonObj.put("ckey", CidCkeyRegisteredPool.getCidFromFile().get("ckey"));
        //}
        return jsonObj;
    }
}

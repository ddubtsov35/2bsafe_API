package com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent;

import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Parents.Pool.ChildrenCardPools;
import com.dubtsov._2bsafe.Parents.Pool.CidCkeyPool;
import com.dubtsov._2bsafe.Parents.Pool.CidCkeyRegisteredPool;
import com.dubtsov._2bsafe.Parents.Pool.UserPool;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 12.09.17.
 */
public class GenerateCidCkeyContent{
    private static JSONObject jsonObjectCidCkey = null;

    public static JSONObject jsonObjectCidCkey(){
        return new JSONObject(jsonObjectCidCkey);
    }

    public static JSONObject getCidCkey(ChildrenResponseAuthorisationModel childrenResponseAuthorisationModel) throws Exception {
        JSONObject jsonObj = new JSONObject();
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

    public static JSONObject getJsonObjectCidCkey() throws IOException, ParseException {
        JSONObject jsonObj = new JSONObject();
        if(CidCkeyPool.getCidFromFile() == null) {
            jsonObj.put("cid", GenerateCidCkeyContent.jsonObjectCidCkey().get("cid"));
            jsonObj.put("ckey", GenerateCidCkeyContent.jsonObjectCidCkey().get("ckey"));
        } else {
            jsonObj.put("cid", CidCkeyPool.getCidFromFile().get("cid"));
            jsonObj.put("ckey", CidCkeyPool.getCidFromFile().get("ckey"));
        }
        return jsonObj;
    }

    public static JSONObject getJsonObjectCidCkeyForLogout() throws IOException, ParseException, java.text.ParseException {
        JSONObject jsonObj = new JSONObject();
        if(!(CidCkeyRegisteredPool.getCidFromFile() == null)) {
            jsonObj.put("cid", CidCkeyRegisteredPool.getCidFromFile().get("cid"));
            jsonObj.put("ckey", CidCkeyRegisteredPool.getCidFromFile().get("ckey"));
        } else{
            jsonObj.put("cid", CidCkeyPool.getCidFromFile().get("cid"));
            jsonObj.put("ckey", CidCkeyPool.getCidFromFile().get("ckey"));
        }
        return jsonObj;
    }

}

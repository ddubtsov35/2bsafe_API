package com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent;

import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.ChildrenCardClass;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import org.json.simple.JSONObject;

/**
 * Created by user on 12.09.17.
 */
public class GenerateCidCkeyContent extends BaseContent{

    public static JSONObject getCidCkey() throws Exception {
        ChildrenResponseAuthorisationModel childrenResponseAuthorisationModel = new ChildrenResponseAuthorisationModel();
        jsonObj.put("cid", childrenResponseAuthorisationModel.getCid());
        jsonObj.put("ckey", childrenResponseAuthorisationModel.getCkey());
        return jsonObj;
    }

}

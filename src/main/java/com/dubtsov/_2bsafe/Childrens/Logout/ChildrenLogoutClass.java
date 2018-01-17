package com.dubtsov._2bsafe.Childrens.Logout;

import com.dubtsov._2bsafe.Childrens.Logout.GenerateData.GenerateLogoutContent;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Pool.CidCkeyPool;
import com.dubtsov._2bsafe.Parents.Pool.CidCkeyRegisteredPool;
import com.dubtsov._2bsafe.Parents.Pool.LogPools;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;

import java.io.IOException;

/**
 * Created by user on 24.08.17.
 */
public class ChildrenLogoutClass extends BaseClass{

    JSONObject jsonObject;
    GenerateLogoutContent generateLogoutContent = new GenerateLogoutContent();

    public ChildrenLogoutClass() throws IOException {}

    public Response logout() throws Exception {
        jsonObject = generateLogoutContent.getLogoutContent();
        responseClass = new ResponseClass(clientApi + "/clients/v1.0/logout", jsonObject);
        response = responseClass.getJsonResponse();
        if(response.code() == 200){
            CidCkeyRegisteredPool.clearFile();
            CidCkeyPool.clearFile();
        }
        LogPools.getLog();
        return response;
    }

    public Response NegativeLogout(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass(clientApi + "/clients/v1.0/logout", jsonObject);
        return responseClass.getJsonResponse();
    }


    public Response logoutWithoutPassword() throws Exception {
        jsonObject = generateLogoutContent.getLogoutWithoutPasswordContent();
        responseClass = new ResponseClass(clientApi + "/clients/v1.0/logout_nopassword", jsonObject);
        return responseClass.getJsonResponse();
    }

    public Response NegativeLogoutWithoutPassword(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass(clientApi + "/clients/v1.0/logout_nopassword", jsonObject);
        return responseClass.getJsonResponse();
    }
}

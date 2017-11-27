package com.dubtsov._2bsafe.Childrens.Logout;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Pool.CidCkeyRegisteredPool;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;

import javax.xml.bind.util.JAXBSource;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 24.08.17.
 */
public class ChildrenLogoutClass extends BaseClass{

    JSONObject jsonObject;

    public ChildrenLogoutClass() throws IOException {}

    public Response logout() throws Exception {
        jsonObject = GenerateLogoutContent.getLogoutContent();
        responseClass = new ResponseClass("http://api.safec.ru/os_api/clients/v1.0/logout", jsonObject);
        response = responseClass.getJsonResponse();
        if(response.code() == 200){
            CidCkeyRegisteredPool.clearFile();
        }
        return response;
    }

    public Response NegativeLogout(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass("http://api.safec.ru/os_api/clients/v1.0/logout", jsonObject);
        return responseClass.getJsonResponse();
    }


    public Response logoutWithoutPassword() throws Exception {
        jsonObject = GenerateLogoutContent.getLogoutWithoutPasswordContent();
        responseClass = new ResponseClass("http://api.safec.ru/os_api/clients/v1.0/logout_nopassword", jsonObject);
        return responseClass.getJsonResponse();
    }

    public Response NegativeLogoutWithoutPassword(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass("http://api.safec.ru/os_api/clients/v1.0/logout_nopassword", jsonObject);
        return responseClass.getJsonResponse();
    }
}

package com.dubtsov._2bsafe.Parents.Functions.Permissions;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateCidCkeyContent;
import com.dubtsov._2bsafe.Parents.Models.Permission;
import com.dubtsov._2bsafe.Parents.Parse.GetPermission;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;

import java.io.IOException;

/**
 * Created by user on 01.09.17.
 */
public class PermissionsClass extends BaseClass{

    JSONObject jsonObject;

    public PermissionsClass() throws IOException {}

    public Permission getPermission() throws Exception {
        jsonObject = GenerateSetPermissionContent.getPermission();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/permissions/get", jsonObject);
        return GetPermission.getPermission(responseClass.getJsonResponse().body().string());
    }
    public Permission NegativeGetPermission(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/permissions/get", jsonObject);
        return GetPermission.getPermission(responseClass.getJsonResponse().body().string());
    }



    public Response setPermission() throws Exception {
        jsonObject = GenerateSetPermissionContent.setPermission();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/permissions/set", jsonObject);
        return responseClass.getJsonResponse();
    }
    public Response NegativeSetPermission(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/permissions/set", jsonObject);
        return responseClass.getJsonResponse();
    }
}

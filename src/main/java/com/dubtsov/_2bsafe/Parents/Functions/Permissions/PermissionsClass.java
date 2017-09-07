package com.dubtsov._2bsafe.Parents.Functions.Permissions;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Models.Permission;
import com.dubtsov._2bsafe.Parents.Parse.GetPermission;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 01.09.17.
 */
public class PermissionsClass extends BaseClass{
    public PermissionsClass() throws IOException {}

    public Permission getPermission(HashMap content) throws IOException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/permissions/get", content);
        return GetPermission.getPermission(responseClass.getResponse().body().string());
    }

    public Response setPermission(HashMap content) throws IOException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/permissions/set", content);
        return responseClass.getResponse();
    }
}

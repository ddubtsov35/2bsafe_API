package com.dubtsov._2bsafe.Parents.Functions.GroupsApp;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Models.GroupApp;
import com.dubtsov._2bsafe.Parents.Parse.GetGroupApp;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;

import java.io.IOException;

/**
 * Created by user on 31.08.17.
 */
public class GroupsAppClass extends BaseClass{

    JSONObject jsonObject;

    public GroupsAppClass() throws IOException {}

    public Response setGroupApp() throws Exception {
        jsonObject = GenerateGroupContent.generatedSetGroup();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/groups/set_app", jsonObject);
        return responseClass.getJsonResponse();
    }

    public GroupApp addGroupApp() throws Exception {
        jsonObject = GenerateGroupContent.generatedAddGroup();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/groups/add", jsonObject);
        return GetGroupApp.getGroup(responseClass.getJsonResponse().body().string());
    }

    public Response editGroupApp() throws Exception {
        jsonObject = GenerateGroupContent.generatedEditGroup();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/groups/edit", jsonObject);
        return responseClass.getResponse();
    }

    public Response deleteGroupApp() throws Exception {
        jsonObject = GenerateGroupContent.generatedDeleteGroup();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/groups/del", jsonObject);
        return responseClass.getResponse();
    }
}

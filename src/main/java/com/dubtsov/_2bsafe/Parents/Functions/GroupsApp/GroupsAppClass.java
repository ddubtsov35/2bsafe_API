package com.dubtsov._2bsafe.Parents.Functions.GroupsApp;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Models.AddZone;
import com.dubtsov._2bsafe.Parents.Models.GroupApp;
import com.dubtsov._2bsafe.Parents.Parse.GetAddZone;
import com.dubtsov._2bsafe.Parents.Parse.GetGroupApp;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 31.08.17.
 */
public class GroupsAppClass extends BaseClass{
    public GroupsAppClass() throws IOException {}

    public Response setGroupApp(JSONObject jsonObject) throws IOException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/groups/set_app", jsonObject);
        return responseClass.getJsonResponse();
    }

    public GroupApp addGroupApp(JSONObject jsonObject) throws IOException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/groups/add", jsonObject);
        return GetGroupApp.getGroup(responseClass.getJsonResponse().body().string());
    }

    public Response editGroupApp(HashMap content) throws IOException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/groups/edit", content);
        return responseClass.getResponse();
    }

    public Response deleteGroupApp(HashMap content) throws IOException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/groups/del", content);
        return responseClass.getResponse();
    }
}

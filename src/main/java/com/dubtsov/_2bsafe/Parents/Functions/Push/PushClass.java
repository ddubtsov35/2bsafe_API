package com.dubtsov._2bsafe.Parents.Functions.Push;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Models.AddSession;
import com.dubtsov._2bsafe.Parents.Models.NotifyList;
import com.dubtsov._2bsafe.Parents.Parse.GetNotifyList;
import com.dubtsov._2bsafe.Parents.Parse.GetSession;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 31.08.17.
 */
public class PushClass extends BaseClass{
    public PushClass() throws IOException {}

    public AddSession InitSession(HashMap content) throws IOException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/ses/create", content);
        return GetSession.addSession(responseClass.getResponse().body().string());
    }

    public Response lockScreen(HashMap content) throws IOException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/devs/block", content);
        return responseClass.getResponse();
    }

    public Response onSound(HashMap content) throws IOException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/devs/alarm", content);
        return responseClass.getResponse();
    }

    public Response update(HashMap content) throws IOException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/devs/update", content);
        return responseClass.getResponse();
    }

    public Response updateLong(HashMap content) throws IOException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/devs/update_long", content);
        return responseClass.getResponse();
    }

    public NotifyList getNotifyList(JSONObject jsonObject) throws IOException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/devs/get_notify_list", jsonObject);
        return GetNotifyList.getNotifyList(responseClass.getJsonResponse().body().string());
    }
}

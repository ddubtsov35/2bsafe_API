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

/**
 * Created by user on 31.08.17.
 */
public class PushClass extends BaseClass{

    JSONObject jsonObject;

    public PushClass() throws IOException {}

    public AddSession InitSession() throws Exception {
        jsonObject = GenerateNotifyListContent.createSession_alarm_update_updateLong();
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/ses/create", jsonObject);
        return GetSession.addSession(responseClass.getJsonResponse().body().string());
    }

    public Response lockScreen() throws Exception {
        jsonObject = GenerateNotifyListContent.blockScreen();
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/devs/block", jsonObject);
        return responseClass.getJsonResponse();
    }
    public Response NegativeLockScreen(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/devs/block", jsonObject);
        return responseClass.getJsonResponse();
    }



    public Response onSound() throws Exception {
        jsonObject = GenerateNotifyListContent.createSession_alarm_update_updateLong();
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/devs/alarm", jsonObject);
        return responseClass.getJsonResponse();
    }
    public Response NegativeOnSound(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/devs/alarm", jsonObject);
        return responseClass.getJsonResponse();
    }




    public Response update() throws Exception {
        jsonObject = GenerateNotifyListContent.createSession_alarm_update_updateLong();
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/devs/update", jsonObject);
        return responseClass.getJsonResponse();
    }
    public Response NegativeUpdate(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/devs/update", jsonObject);
        return responseClass.getJsonResponse();
    }





    public Response updateLong() throws Exception {
        jsonObject = GenerateNotifyListContent.createSession_alarm_update_updateLong();
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/devs/update_long", jsonObject);
        return responseClass.getJsonResponse();
    }
    public Response NegativeUpdateLong(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/devs/update_long", jsonObject);
        return responseClass.getJsonResponse();
    }





    public NotifyList getNotifyList() throws Exception {
        jsonObject = GenerateNotifyListContent.getNotifyListContent();
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/devs/get_notify_list", jsonObject);
        return GetNotifyList.getNotifyList(responseClass.getJsonResponse().body().string());
    }
    public NotifyList NegativeGetNotifyList(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/devs/get_notify_list", jsonObject);
        return GetNotifyList.getNotifyList(responseClass.getJsonResponse().body().string());
    }
}

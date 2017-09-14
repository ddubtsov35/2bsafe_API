package com.dubtsov._2bsafe.Childrens.NotifyChangeApp;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.Push.GenerateNotifyListContent;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 24.08.17.
 */
public class NotifyChangeAppClass extends BaseClass{

    JSONObject jsonObject;

    public NotifyChangeAppClass() throws IOException {}

    public Response notifyChangeApp() throws Exception {
        jsonObject = GenerateNotifyChangeAppContent.appsNotifyContent();
        responseClass = new ResponseClass("http://api.safec.ru/os_api/clients/v1.0/apps_modified", jsonObject);
        return responseClass.getJsonResponse();
    }
}

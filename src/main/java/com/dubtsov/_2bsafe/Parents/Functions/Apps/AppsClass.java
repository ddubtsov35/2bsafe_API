package com.dubtsov._2bsafe.Parents.Functions.Apps;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Models.Apps;
import com.dubtsov._2bsafe.Parents.Models.AppsDetailInfo;
import com.dubtsov._2bsafe.Parents.Models.AppsInGroup;
import com.dubtsov._2bsafe.Parents.Parse.GetApps;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 04.09.17.
 */
public class AppsClass extends BaseClass{
    public AppsClass() throws IOException {}

    public Apps getAppsInfo(HashMap content) throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/apps/main", content);
        return GetApps.getAccountSettings(responseClass.getResponse().body().string());
    }

    public AppsInGroup getAppsInGroup(HashMap content) throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/apps/group", content);
        return GetApps.getAppInGroup(responseClass.getResponse().body().string());
    }

    public AppsDetailInfo getDetailInfo(HashMap content) throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/apps/detail", content);
        return GetApps.getDetailInfo(responseClass.getResponse().body().string());
    }

    public Response getAppsBlock(HashMap content) throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/apps/block", content);
        return responseClass.getResponse();
    }

    public Response getAppsBlockUpdate(HashMap content) throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/apps/block_update", content);
        return responseClass.getResponse();
    }

    public Response getAppsUpdate(HashMap content) throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/apps/update", content);
        return responseClass.getResponse();
    }

    public Response getAppsDelete(HashMap content) throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/apps/delete", content);
        return responseClass.getResponse();
    }
}

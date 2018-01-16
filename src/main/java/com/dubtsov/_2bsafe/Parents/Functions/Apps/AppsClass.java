package com.dubtsov._2bsafe.Parents.Functions.Apps;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Models.Apps;
import com.dubtsov._2bsafe.Parents.Models.AppsDetailInfo;
import com.dubtsov._2bsafe.Parents.Models.AppsInGroup;
import com.dubtsov._2bsafe.Parents.Parse.GetApps;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 04.09.17.
 */
public class AppsClass extends BaseClass{

    JSONObject jsonObject;

    public AppsClass() throws IOException {}

    public Apps getAppsInfo() throws Exception {
        jsonObject = GenerateAppsContent.getAppsInfoContent();
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/apps/main", jsonObject);
        return GetApps.getAccountSettings(responseClass.getJsonResponse().body().string());
    }

    public Apps NegativeGetAppsInfo(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/apps/main", jsonObject);
        return GetApps.getAccountSettings(responseClass.getJsonResponse().body().string());
    }



    public AppsInGroup getAppsInGroup() throws Exception {
        jsonObject = GenerateAppsContent.getAppsInGroupContent();
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/apps/group", jsonObject);
        return GetApps.getAppInGroup(responseClass.getJsonResponse().body().string());
    }

    public AppsInGroup NegativeGetAppsInGroup(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/apps/group", jsonObject);
        return GetApps.getAppInGroup(responseClass.getJsonResponse().body().string());
    }




    public AppsDetailInfo getDetailInfo() throws Exception {
        jsonObject = GenerateAppsContent.getDetailInfoContent();
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/apps/detail", jsonObject);
        return GetApps.getDetailInfo(responseClass.getJsonResponse().body().string());
    }

    public AppsDetailInfo NegativeGetDetailInfo(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/apps/detail", jsonObject);
        return GetApps.getDetailInfo(responseClass.getJsonResponse().body().string());
    }




    public Response getAppsBlock() throws Exception {
        jsonObject = GenerateAppsContent.getAppsBlockContent();
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/apps/block", jsonObject);
        return responseClass.getJsonResponse();
    }
    public Response NegativeGetAppsBlock(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/apps/block", jsonObject);
        return responseClass.getJsonResponse();
    }




    public Response getAppsBlockUpdate() throws Exception {
        jsonObject = GenerateAppsContent.getAppsBlockUpdateContent();
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/apps/block_update", jsonObject);
        return responseClass.getJsonResponse();
    }
    public Response NegativeGetAppsBlockUpdate(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/apps/block_update", jsonObject);
        return responseClass.getJsonResponse();
    }



    public Response getAppsUpdate() throws Exception {
        jsonObject = GenerateAppsContent.getAppsUpdateContent();
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/apps/update", jsonObject);
        return responseClass.getJsonResponse();
    }
    public Response NegativeGetAppsUpdate(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/apps/update", jsonObject);
        return responseClass.getJsonResponse();
    }


    public Response getAppsDelete() throws Exception {
        jsonObject = GenerateAppsContent.getAppsDeleteContent();
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/apps/delete", jsonObject);
        return responseClass.getJsonResponse();
    }
    public Response NegativeGetAppsDelete(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/apps/delete", jsonObject);
        return responseClass.getJsonResponse();
    }
}

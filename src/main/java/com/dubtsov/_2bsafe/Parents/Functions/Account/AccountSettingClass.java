package com.dubtsov._2bsafe.Parents.Functions.Account;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Models.AccountSettings;
import com.dubtsov._2bsafe.Parents.Parse.GetAccountSetting;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 30.08.17.
 */
public class AccountSettingClass extends BaseClass{

    private static JSONObject jsonObject;

    public AccountSettingClass() throws IOException {}

    public Response setAccountSetting() throws IOException, ParseException, java.text.ParseException {
        jsonObject = GenerateAccountContent.getSetAccountContent();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/set_settings", jsonObject);
        return responseClass.getJsonResponse();
    }

    public Response setAllAccountSetting() throws IOException, ParseException, java.text.ParseException {
        jsonObject = GenerateAccountContent.getSetAllAccountContent();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/set_all_settings", jsonObject);
        return responseClass.getJsonResponse();
    }

    public AccountSettings getAccountSetting() throws IOException, ParseException, java.text.ParseException {
        jsonObject = GenerateAccountContent.getAccountContent();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/get_settings", jsonObject);
        return GetAccountSetting.getAccountSettings(responseClass.getResponse().body().string());
    }

}

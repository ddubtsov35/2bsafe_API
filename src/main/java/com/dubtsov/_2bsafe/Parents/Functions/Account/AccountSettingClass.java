package com.dubtsov._2bsafe.Parents.Functions.Account;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Models.AccountSettings;
import com.dubtsov._2bsafe.Parents.Parse.GetAccountSetting;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 30.08.17.
 */
public class AccountSettingClass extends BaseClass{

    public AccountSettingClass() throws IOException {}

    public Response setAccountSetting(HashMap content) throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/set_settings", content);
        return responseClass.getResponse();
    }

    public Response setAllAccountSetting(HashMap content) throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/set_all_settings", content);
        return responseClass.getResponse();
    }

    public AccountSettings getAccountSetting(HashMap content) throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/get_settings", content);
        return GetAccountSetting.getAccountSettings(responseClass.getResponse().body().string());
    }

}

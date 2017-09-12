package com.dubtsov._2bsafe.Parents.Functions.TurboButton;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Models.DataUpdate;
import com.dubtsov._2bsafe.Parents.Models.TurboButton;
import com.dubtsov._2bsafe.Parents.Parse.GetTurboButton;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 29.08.17.
 */
public class TurboButtonClass extends BaseClass{

    JSONObject jsonObject;

    public TurboButtonClass() throws IOException {}

    public TurboButton getTurboButton() throws Exception {
        jsonObject = GenerateTurboContent.getTurboContent();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/main/get_turbo", jsonObject);
        return GetTurboButton.getTurboButton(responseClass.getJsonResponse().body().string());
    }

    public Response setTurbo() throws Exception {
        jsonObject = GenerateTurboContent.setTurboContent();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/main/set_turbo", jsonObject);
        return responseClass.getJsonResponse();
    }

}

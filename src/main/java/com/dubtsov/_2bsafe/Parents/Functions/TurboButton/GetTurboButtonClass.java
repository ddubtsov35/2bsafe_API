package com.dubtsov._2bsafe.Parents.Functions.TurboButton;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Models.GetDataUpdate;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 29.08.17.
 */
public class GetTurboButtonClass extends BaseClass{

    public GetTurboButtonClass() throws IOException {}

    public Response getTurboButtonResponse(HashMap content) throws IOException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/main/get_turbo", content);
        return responseClass.getResponse();
    }

    public Integer getDataTurboButton(String getTurboButtonResponseString) throws IOException, ParseException, java.text.ParseException {
        GetDataUpdate getDataUpdate = new GetDataUpdate(getTurboButtonResponseString);
        return getDataUpdate.getIto();
    }

}

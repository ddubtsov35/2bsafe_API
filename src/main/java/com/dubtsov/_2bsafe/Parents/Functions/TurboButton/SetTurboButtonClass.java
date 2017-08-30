package com.dubtsov._2bsafe.Parents.Functions.TurboButton;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 29.08.17.
 */
public class SetTurboButtonClass extends BaseClass{
    public SetTurboButtonClass() throws IOException {}

    public Response setTurbo(HashMap content) throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/main/set_turbo", content);
        return responseClass.getResponse();
    }
}

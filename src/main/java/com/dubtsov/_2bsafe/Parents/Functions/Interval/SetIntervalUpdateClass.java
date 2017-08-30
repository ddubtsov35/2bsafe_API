package com.dubtsov._2bsafe.Parents.Functions.Interval;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GetChildrenCardListClass;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 20.07.17.
 */
public class SetIntervalUpdateClass extends BaseClass{

    public SetIntervalUpdateClass() throws IOException {}

    public Response setIntervalUpdate(HashMap content) throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/main/set_info_timeout", content);
        return responseClass.getResponse();
    }
}

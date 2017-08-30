package com.dubtsov._2bsafe.Parents.Functions.Interval;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Models.GetDataUpdate;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 28.08.17.
 */
public class GetIntervalUpdateClass extends BaseClass{
    public GetIntervalUpdateClass() throws IOException {}

    public Response getIntervalUpdateResponse(HashMap content) throws IOException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/main/get_info_timeout", content);
        return responseClass.getResponse();
    }

    public Integer getDataIntervalUpdate(String getIntervalUpdateString) throws IOException, ParseException, java.text.ParseException {
        GetDataUpdate getIntervalUpdate = new GetDataUpdate(getIntervalUpdateString);
        return getIntervalUpdate.getIto();
    }
}

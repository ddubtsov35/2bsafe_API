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
    HashMap content;
    public SetIntervalUpdateClass() throws IOException {
        content = new LinkedHashMap();
        getChildrenCardListClass = new GetChildrenCardListClass();
    }

    public Response setIntervalUpdate() throws IOException, ParseException, java.text.ParseException {
        content.put("profile_id",  getChildrenCardListClass.getChildrenCardList().get(0).getProfile_id());
        content.put("ito", 999);
        content.put("rnd", rnd);
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/main/set_info_timeout", content);
        return responseClass.getResponse();
    }
}

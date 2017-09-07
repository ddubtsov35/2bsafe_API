package com.dubtsov._2bsafe.Parents.Functions.Zone;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Models.Zone;
import com.dubtsov._2bsafe.Parents.Parse.GetZoneList;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 * Created by user on 30.08.17.
 */
public class GetZoneClass extends BaseClass{
    public GetZoneClass() throws IOException {}

    public List<Zone> getZoneList(HashMap content) throws IOException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/main/get_zone_list", content);
        return GetZoneList.getZoneList(responseClass.getResponse().body().string());
    }
}

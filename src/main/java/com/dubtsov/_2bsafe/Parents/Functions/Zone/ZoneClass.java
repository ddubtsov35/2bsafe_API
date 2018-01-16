package com.dubtsov._2bsafe.Parents.Functions.Zone;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Models.AddZone;
import com.dubtsov._2bsafe.Parents.Models.Zone;
import com.dubtsov._2bsafe.Parents.Parse.GetAddZone;
import com.dubtsov._2bsafe.Parents.Parse.GetZoneList;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;

import javax.xml.bind.util.JAXBSource;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 * Created by user on 31.08.17.
 */
public class ZoneClass extends BaseClass{

    JSONObject jsonObject;

    public ZoneClass() throws IOException {}

    public AddZone addZone() throws Exception {
        jsonObject = GenerateZoneContent.addZoneContent();
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/main/add_zone", jsonObject);
        return GetAddZone.addZone(responseClass.getJsonResponse().body().string());
    }
    public AddZone NegativeAddZone(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/main/add_zone", jsonObject);
        return GetAddZone.addZone(responseClass.getJsonResponse().body().string());
    }



    public Response deleteZone() throws Exception {
        jsonObject = GenerateZoneContent.delZoneContent();
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/main/del_zone", jsonObject);
        return responseClass.getJsonResponse();
    }
    public Response NegativeDeleteZone(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/main/del_zone", jsonObject);
        return responseClass.getJsonResponse();
    }



    public List<Zone> getZoneList() throws Exception {
        JSONObject jsonObject = new JSONObject();
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/main/get_zone_list", jsonObject);
        return GetZoneList.getZoneList(responseClass.getJsonResponse().body().string());
    }
    public List<Zone> NegativeGetZoneList(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass(lkApi + "/accounts/v1.0/main/get_zone_list", jsonObject);
        return GetZoneList.getZoneList(responseClass.getJsonResponse().body().string());
    }

}

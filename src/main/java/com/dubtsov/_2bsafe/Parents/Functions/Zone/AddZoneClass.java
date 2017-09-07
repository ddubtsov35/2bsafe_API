package com.dubtsov._2bsafe.Parents.Functions.Zone;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Models.AddZone;
import com.dubtsov._2bsafe.Parents.Parse.GetAddZone;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 31.08.17.
 */
public class AddZoneClass extends BaseClass{

    public AddZoneClass() throws IOException {}

    public AddZone addZone(HashMap content) throws IOException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/main/add_zone", content);
        return GetAddZone.addZone(responseClass.getResponse().body().string());
    }

}

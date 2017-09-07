package com.dubtsov._2bsafe.Parents.Functions.Zone;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Models.AddZone;
import com.dubtsov._2bsafe.Parents.Parse.GetAddZone;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 31.08.17.
 */
public class DeleteZoneClass extends BaseClass{
    public DeleteZoneClass() throws IOException {}

    public Response deleteZone(HashMap content) throws IOException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/main/del_zone", content);
        return responseClass.getResponse();
    }
}

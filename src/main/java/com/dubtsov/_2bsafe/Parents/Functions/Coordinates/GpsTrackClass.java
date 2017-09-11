package com.dubtsov._2bsafe.Parents.Functions.Coordinates;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Models.GpsTrackModel;
import com.dubtsov._2bsafe.Parents.Parse.GetGpsTrack;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 28.08.17.
 */
public class GpsTrackClass extends BaseClass{

    JSONObject jsonObject;

    public GpsTrackClass() throws IOException {}

    public GpsTrackModel getGpsTrack() throws Exception {
        jsonObject = GenerateGpsTrackContent.getGpsTrackContent();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/main/get_gps_track", jsonObject);
        return GetGpsTrack.getGpsTrackModel(responseClass.getJsonResponse().body().string());
    }
}

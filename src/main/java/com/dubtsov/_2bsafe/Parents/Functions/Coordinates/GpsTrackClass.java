package com.dubtsov._2bsafe.Parents.Functions.Coordinates;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Models.GpsTrackModel;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 28.08.17.
 */
public class GpsTrackClass extends BaseClass{
    public GpsTrackClass() throws IOException {}

    public Response getGpsTrackResponse(HashMap content) throws IOException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/main/get_gps_track", content);
        return responseClass.getResponse();
    }

    public GpsTrackModel getGpsTrack(String gpsTrackString) throws ParseException, java.text.ParseException {
        GpsTrackModel gpsTrackModel = new GpsTrackModel(gpsTrackString);
        System.out.println("gpsTrackModel " + gpsTrackModel.toString());
        return gpsTrackModel;
    }
}

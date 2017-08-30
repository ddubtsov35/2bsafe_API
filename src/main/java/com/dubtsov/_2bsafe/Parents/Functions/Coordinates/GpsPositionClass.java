package com.dubtsov._2bsafe.Parents.Functions.Coordinates;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Models.GpsPositionModel;
import com.dubtsov._2bsafe.Parents.Models.GpsTrackModel;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 16.08.17.
 */
public class GpsPositionClass extends BaseClass{
    public GpsPositionClass() throws IOException {}

    public Response getGpsPositionResponse(HashMap content) throws IOException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/main/get_gps_position", content);
        return responseClass.getResponse();
    }

    public GpsPositionModel getGpsPosition(String gpsTrackString) throws ParseException, java.text.ParseException {
        GpsPositionModel gpsPositionModel = new GpsPositionModel(gpsTrackString);
        System.out.println("gpsPositionModel " + gpsPositionModel.toString());
        return gpsPositionModel;
    }
}

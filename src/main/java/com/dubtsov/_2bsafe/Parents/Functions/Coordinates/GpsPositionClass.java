package com.dubtsov._2bsafe.Parents.Functions.Coordinates;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Models.GpsPositionModel;
import com.dubtsov._2bsafe.Parents.Parse.GetGpsPosition;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 16.08.17.
 */
public class GpsPositionClass extends BaseClass{

    JSONObject jsonObject;

    public GpsPositionClass() throws IOException {}

    public GpsPositionModel getGpsPositionResponse(HashMap content) throws IOException, ParseException, java.text.ParseException {
        jsonObject = GenerateGpsPositionContent.getGpsPositionContent();
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/main/get_gps_position", jsonObject);
        return GetGpsPosition.getGpsPositionModel(responseClass.getJsonResponse().body().string());
    }
}

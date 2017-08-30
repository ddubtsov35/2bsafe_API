package com.dubtsov._2bsafe.Parents.Parse;

import com.dubtsov._2bsafe.Parents.Models.DeviceShortInfo;
import com.dubtsov._2bsafe.Parents.Models.GpsPositionModel;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 28.08.17.
 */
public class GetGpsPosition {

    private static GpsPositionModel gpsPositionModel;

    public GpsPositionModel gpsPositionModel(String gpsPositionString){
        try {
            gpsPositionModel = new GpsPositionModel(gpsPositionString);
        } catch (ParseException e){}
        finally {
            return gpsPositionModel;
        }
    }
}

package com.dubtsov._2bsafe.Parents.Parse;

import com.dubtsov._2bsafe.Parents.Models.GpsPositionModel;
import com.dubtsov._2bsafe.Parents.Models.GpsTrackModel;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 11.09.17.
 */
public class GetGpsTrack {

    private static GpsTrackModel gpsTrackModel;

    public static GpsTrackModel getGpsTrackModel(String gpsTrackString){
        try {
            gpsTrackModel = new GpsTrackModel(gpsTrackString);
        } catch (ParseException e){}
        finally {
            return gpsTrackModel;
        }
    }
}

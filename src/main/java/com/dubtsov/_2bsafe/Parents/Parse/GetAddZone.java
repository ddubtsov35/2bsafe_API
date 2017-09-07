package com.dubtsov._2bsafe.Parents.Parse;

import com.dubtsov._2bsafe.Parents.Models.AddZone;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 31.08.17.
 */
public class GetAddZone {

    private static AddZone addZone;

    public static AddZone addZone(String addZoneString){
        try {
            addZone = new AddZone(addZoneString);
        } catch (ParseException e){}
        finally {
            return addZone;
        }
    }

}

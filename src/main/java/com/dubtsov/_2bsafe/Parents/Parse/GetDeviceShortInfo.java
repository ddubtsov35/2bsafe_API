package com.dubtsov._2bsafe.Parents.Parse;

import com.dubtsov._2bsafe.Parents.Models.DeviceShortInfo;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 16.08.17.
 */
public class GetDeviceShortInfo {

    private static DeviceShortInfo deviceShortInfo;

    public static DeviceShortInfo getDeviceShortInfo(String deviceShortInfoString) throws ParseException, java.text.ParseException {
        System.out.println("deviceShortInfoString " + deviceShortInfoString);
        try {
            deviceShortInfo = new DeviceShortInfo(deviceShortInfoString);
        } catch (ParseException e){}
        finally {
            return deviceShortInfo;
        }
    }

}

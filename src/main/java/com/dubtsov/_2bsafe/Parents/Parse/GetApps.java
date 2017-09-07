package com.dubtsov._2bsafe.Parents.Parse;

import com.dubtsov._2bsafe.Parents.Models.*;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 04.09.17.
 */
public class GetApps {

    private static Apps apps;
    private static AppsInGroup appsInGroup;
    private static AppsDetailInfo appsDetailInfo;

    public static Apps getAccountSettings(String appsString) throws ParseException, java.text.ParseException {
        try {
            apps = new Apps(appsString);
        } catch (ParseException e){}
        finally {
            return apps;
        }
    }

    public static AppsInGroup getAppInGroup(String appsString) throws ParseException, java.text.ParseException {
        try {
            appsInGroup = new AppsInGroup(appsString);
        } catch (ParseException e){}
        finally {
            return appsInGroup;
        }
    }

    public static AppsDetailInfo getDetailInfo(String detailInfoString) throws ParseException, java.text.ParseException {
        try {
            appsDetailInfo = new AppsDetailInfo(detailInfoString);
        } catch (ParseException e){}
        finally {
            return appsDetailInfo;
        }
    }


}

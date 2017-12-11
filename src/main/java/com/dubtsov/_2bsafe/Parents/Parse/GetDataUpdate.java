package com.dubtsov._2bsafe.Parents.Parse;

import com.dubtsov._2bsafe.Parents.Models.AuthorisationUser;
import com.dubtsov._2bsafe.Parents.Models.DataUpdate;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 12.09.17.
 */
public class GetDataUpdate {

    private static DataUpdate dataUpdate = null;

    public static DataUpdate dataUpdate(String dataUpdateString){
        try {
            dataUpdate = new DataUpdate(dataUpdateString);
        } catch (ParseException e){}
        finally {
            return dataUpdate;
        }
    }

}

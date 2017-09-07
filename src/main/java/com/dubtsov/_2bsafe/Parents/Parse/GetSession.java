package com.dubtsov._2bsafe.Parents.Parse;

import com.dubtsov._2bsafe.Parents.Models.AddSession;
import com.dubtsov._2bsafe.Parents.Models.Zone;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 31.08.17.
 */
public class GetSession {

    private static AddSession addSession;

    public static AddSession addSession(String addSessionString){
        try {
            addSession = new AddSession(addSessionString);
        } catch (ParseException e){}
        finally {
            return addSession;
        }
    }
}

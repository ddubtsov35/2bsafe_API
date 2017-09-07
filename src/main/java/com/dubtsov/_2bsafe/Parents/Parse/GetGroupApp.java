package com.dubtsov._2bsafe.Parents.Parse;

import com.dubtsov._2bsafe.Parents.Models.GroupApp;
import com.dubtsov._2bsafe.Parents.Models.Poll;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 31.08.17.
 */
public class GetGroupApp {

    private static GroupApp groupApp;

    public static GroupApp getGroup(String getGroupString){
        try {
            groupApp = new GroupApp(getGroupString);
        } catch (ParseException e){}
        finally {
            return groupApp;
        }
    }

}

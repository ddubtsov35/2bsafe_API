package com.dubtsov._2bsafe.Parents.Parse;

import com.dubtsov._2bsafe.Parents.Models.PollTittle;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 30.08.17.
 */
public class GetPollTittle {

    private static PollTittle pollTittle;

    public static PollTittle getPollTittle(String gpsPollString){
        try {
            pollTittle = new PollTittle(gpsPollString);
        } catch (ParseException e){}
        finally {
            return pollTittle;
        }
    }

}

package com.dubtsov._2bsafe.Parents.Parse;

import com.dubtsov._2bsafe.Parents.Models.Poll;
import com.dubtsov._2bsafe.Parents.Models.PollTittle;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 30.08.17.
 */
public class GetPoll {

    private static Poll poll;

    public static Poll getPoll(String getPollString){
        try {
            poll = new Poll(getPollString);
        } catch (ParseException e){}
        finally {
            return poll;
        }
    }

}

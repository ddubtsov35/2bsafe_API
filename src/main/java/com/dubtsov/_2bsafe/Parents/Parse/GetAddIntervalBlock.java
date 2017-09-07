package com.dubtsov._2bsafe.Parents.Parse;

import com.dubtsov._2bsafe.Parents.Models.AccountSettings;
import com.dubtsov._2bsafe.Parents.Models.AddIntervalBlock;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 31.08.17.
 */
public class GetAddIntervalBlock {

    private static AddIntervalBlock addIntervalBlock;

    public static AddIntervalBlock getAccountSettings(String addIntervalBlockString) throws ParseException, java.text.ParseException {
        try {
            addIntervalBlock = new AddIntervalBlock(addIntervalBlockString);
        } catch (ParseException e){}
        finally {
            return addIntervalBlock;
        }
    }

}

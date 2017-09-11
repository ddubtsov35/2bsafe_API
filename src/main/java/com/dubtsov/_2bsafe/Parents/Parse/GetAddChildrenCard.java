package com.dubtsov._2bsafe.Parents.Parse;

import com.dubtsov._2bsafe.Parents.Models.AccountSettings;
import com.dubtsov._2bsafe.Parents.Models.AddChildrenCard;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 11.09.17.
 */
public class GetAddChildrenCard {

    private static AddChildrenCard addChildrenCard;

    public static AddChildrenCard addChildrenCard(String addChildrenCardString) throws ParseException, java.text.ParseException {
        try {
            addChildrenCard = new AddChildrenCard(addChildrenCardString);
        } catch (ParseException e){}
        finally {
            return addChildrenCard;
        }
    }

}

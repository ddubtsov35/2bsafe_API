package com.dubtsov._2bsafe.Admin.Parse;

import com.dubtsov._2bsafe.Admin.Model.UserModel;
import com.dubtsov._2bsafe.Parents.Models.AddChildrenCard;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 21.11.17.
 */
public class GetActCodeParse {

    private UserModel userModel;

    public UserModel getActCode(String userModelString) throws ParseException, java.text.ParseException {
        try {
            userModel = new UserModel(userModelString);
        } catch (ParseException e){}
        finally {
            return userModel;
        }
    }

}

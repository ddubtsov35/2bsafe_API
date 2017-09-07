package com.dubtsov._2bsafe.Parents.Parse;

import com.dubtsov._2bsafe.Parents.Models.AddZone;
import com.dubtsov._2bsafe.Parents.Models.AuthorisationUser;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 07.09.17.
 */
public class GetAuthorisationUser {

    private static AuthorisationUser authorisationUser;

    public static AuthorisationUser authorisationUser(String authorisationUserString){
        try {
            authorisationUser = new AuthorisationUser(authorisationUserString);
        } catch (ParseException e){}
        finally {
            return authorisationUser;
        }
    }

}

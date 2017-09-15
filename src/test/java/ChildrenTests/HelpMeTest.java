package ChildrenTests;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.HelpMe.HelpMeClass;
import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileClass;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.ChildrenCardClass;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by user on 24.08.17.
 */
public class HelpMeTest extends BaseClass{

    public HelpMeTest() throws IOException, ParseException, java.text.ParseException {
        authorisationUserClass = new AuthorisationUserClass();
        childrenCardClass = new ChildrenCardClass();
        authorisationChildClass = new AuthorisationChildClass();
        profileClass = new ProfileClass();
        helpMeClass = new HelpMeClass();
    }

    @Test
    public void helpMe() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        childrenCardClass.addChildrenCard();
        authorisationChildClass.authorisationChildren();
        response = helpMeClass.helpMe();
        String result = response.body().string();
        System.out.println("RESULT " + result);
        Assert.assertTrue(result.contains("\"scs\": true") && response.code() == 200);
    }
}

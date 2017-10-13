package ChildrenTests;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileClass;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.ChildrenCardClass;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by user on 23.08.17.
 */
public class ChildrenCardTest extends BaseClass{

    public ChildrenCardTest() throws IOException, ParseException, java.text.ParseException {
        authorisationUserClass = new AuthorisationUserClass();
        authorisationChildClass = new AuthorisationChildClass();
        childrenResponseAuthorisationModel = new ChildrenResponseAuthorisationModel();
        profileClass = new ProfileClass();
        childrenCardClass = new ChildrenCardClass();
    }

    @Before
    public void before() throws ParseException, java.text.ParseException, IOException {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
    }


    @Test
    public void getChildrenCardList() throws Exception {
        authorisationChildClass.authorisationChildren();
        int before = profileClass.getProfileList().size();
        childrenCardClass.addChildrenCard();
        int after = profileClass.getProfileList().size();
        Assert.assertTrue(after - before == 1);
    }

    @Test
    public void selectChildrenCard() throws Exception {
        childrenCardClass.addChildrenCard();
        childrenResponseAuthorisationModel = authorisationChildClass.authorisationChildren();
        String result = profileClass.selectProfileCardResponse().body().string();
        System.out.println("selectChildrenCard " + result);
        Assert.assertTrue(result.contains("\"scs\": true"));
    }

}

package ChildrenTests;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by user on 16.08.17.
 */
public class AuthorisationTest extends BaseClass{

    public AuthorisationTest() throws IOException, ParseException, java.text.ParseException {
        authorisationUserClass = new AuthorisationUserClass();
        authorisationChildClass = new AuthorisationChildClass();
        childrenResponseAuthorisationModel = new ChildrenResponseAuthorisationModel();
    }

    @Test
    public void authorisation() throws IOException, ParseException, java.text.ParseException {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        childrenResponseAuthorisationModel = authorisationChildClass.authorisationChildren();
        Assert.assertTrue(childrenResponseAuthorisationModel.getScs().equals("true"));
    }







}

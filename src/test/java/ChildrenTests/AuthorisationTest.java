package ChildrenTests;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.Authorisation.GenerateAuthorisationChildren;
import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.ChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Pool.LogPools;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import junitparams.naming.TestCaseName;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;

/**
 * Created by user on 16.08.17.
 */
@RunWith(JUnitParamsRunner.class)
public class AuthorisationTest extends BaseClass{

    public AuthorisationTest() throws IOException, ParseException, java.text.ParseException {}

    @Before
    public void before() throws ParseException, java.text.ParseException, IOException {
        authorisationUserClass = new AuthorisationUserClass();
        authorisationChildClass = new AuthorisationChildClass();
        childrenResponseAuthorisationModel = new ChildrenResponseAuthorisationModel();
        childrenCardClass = new ChildrenCardClass();
    }

    //Need code
    //@Ignore
    @Test
    public void PositiveAuthorisation() throws Exception {
        System.out.println("xxxxxxxxxxxxxxxxxx222222222222");
        LogPools.getLog();
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        childrenCardClass.addChildrenCard();
        System.out.println("7");
        LogPools.getLog();
        childrenResponseAuthorisationModel = authorisationChildClass.authorisationChildren();
        System.out.println(childrenResponseAuthorisationModel.toString());
        Assert.assertTrue(childrenResponseAuthorisationModel.getScs().equals("true"));
    }

    //@Ignore
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateAuthorisationChildren.class)
    public void NegativeAuthorisation(JSONObject jsonObj) throws Exception {
        System.out.println("xxxxxxxxxxxxxxxxxx");
        LogPools.getLog();

        authorisationUserClass.RegistrationAndAuthorisationWeb();
        childrenCardClass.addChildrenCard();
        childrenResponseAuthorisationModel = authorisationChildClass.NegativeAuthorisationChildren(jsonObj);
        System.out.println(childrenResponseAuthorisationModel.getScs().toString());
        Assert.assertTrue(childrenResponseAuthorisationModel.getScs().equals("false"));
    }
}

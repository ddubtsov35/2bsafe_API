package ChildrenTests;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.HelpMe.GenerateHelpMeContent;
import com.dubtsov._2bsafe.Childrens.Logout.ChildrenLogoutClass;
import com.dubtsov._2bsafe.Childrens.Logout.GenerateLogoutContent;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.ChildrenCardClass;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import junitparams.naming.TestCaseName;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 24.08.17.
 */
@RunWith(JUnitParamsRunner.class)
public class LogoutTest extends BaseClass{

    public LogoutTest() throws IOException, ParseException, java.text.ParseException {
        authorisationUserClass = new AuthorisationUserClass();
        authorisationChildClass = new AuthorisationChildClass();
        childrenCardClass = new ChildrenCardClass();
        childrenLogoutClass = new ChildrenLogoutClass();
    }

    @Before
    public void before() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        childrenCardClass.addChildrenCard();
        authorisationChildClass.authorisationChildren();
    }

    @Test
    public void logout() throws Exception {
        response = childrenLogoutClass.logout();
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("\"scs\": true") && response.code() == 200);
    }

    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateLogoutContent.class)
    public void NegativeLogout(JSONObject jsonObject) throws Exception {
        response = childrenLogoutClass.NegativeLogout(jsonObject);
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("\"scs\": false"));
    }

    @Test
    public void logoutWithoutPassword() throws Exception {
        response = childrenLogoutClass.logoutWithoutPassword();
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("\"scs\": true") && response.code() == 200);
    }

    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateLogoutContent.class)
    public void NegativeLogoutWithoutPassword(JSONObject jsonObject) throws Exception {
        response = childrenLogoutClass.NegativeLogoutWithoutPassword(jsonObject);
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("\"scs\": false"));
    }


}

package ChildrenTests;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.Logout.GenerateLogoutContent;
import com.dubtsov._2bsafe.Childrens.NotifyChangeApp.GenerateNotifyChangeAppContent;
import com.dubtsov._2bsafe.Childrens.NotifyChangeApp.NotifyChangeAppClass;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileClass;
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
public class NotifyChangeAppTest extends BaseClass{

    public NotifyChangeAppTest() throws IOException, ParseException, java.text.ParseException {}

    @Before
    public void before() throws ParseException, java.text.ParseException, IOException {
        generatedRequestJsonClass = new GenerateNotifyChangeAppContent();
        authorisationUserClass = new AuthorisationUserClass();
        childrenCardClass = new ChildrenCardClass();
        authorisationChildClass = new AuthorisationChildClass();
        notifyChangeAppClass = new NotifyChangeAppClass();
        profileClass = new ProfileClass();
    }

    @Test
    public void notifyChangeApp() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        childrenCardClass.addChildrenCard();
        authorisationChildClass.authorisationChildren();
        profileClass.setProfileCard();
        response = notifyChangeAppClass.notifyChangeApp();
        String result = response.body().string();
        System.out.println("RESULT " + result);
        Assert.assertTrue(result.contains("\"scs\": true") && response.code() == 200);
    }

    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateNotifyChangeAppContent.class)
    public void NegativeNotifyChangeApp(JSONObject jsonObject) throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        childrenCardClass.addChildrenCard();
        authorisationChildClass.authorisationChildren();
        profileClass.setProfileCard();
        response = notifyChangeAppClass.NegativeNotifyChangeApp(jsonObject);
        String result = response.body().string();
        System.out.println("RESULT " + result);
        Assert.assertTrue(result.contains("\"scs\": false"));
    }
}

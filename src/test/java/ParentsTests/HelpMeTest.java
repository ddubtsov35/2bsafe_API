package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.AddAndSelectChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.HelpMe.GenerateHelpMeContent;
import com.dubtsov._2bsafe.Parents.Functions.HelpMe.HelpMeParentClass;
import com.dubtsov._2bsafe.Parents.Models.HelpMe;
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
 * Created by user on 31.08.17.
 */
@RunWith(JUnitParamsRunner.class)
public class HelpMeTest extends BaseClass {

    HelpMe helpMe;

    public HelpMeTest() throws IOException, ParseException, java.text.ParseException {}

    @Before
    public void before() throws Exception {
        helpMeParentClass = new HelpMeParentClass();
        authorisationUserClass = new AuthorisationUserClass();
        addAndSelectChildrenCardClass = new AddAndSelectChildrenCardClass();
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
    }

    @Ignore
    @Test
    public void getHelpMe() throws Exception {
        helpMe = helpMeParentClass.getHelpMe();
        System.out.println(helpMe.toString());
        Assert.assertTrue(helpMe.getScs().equals("true"));
    }
    @Ignore
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateHelpMeContent.class)
    public void NegativeGetHelpMe(JSONObject jsonObject) throws Exception {
        helpMe = helpMeParentClass.NegativeGetHelpMe(jsonObject);
        System.out.println(helpMe.toString());
        Assert.assertTrue(helpMe.getScs().equals("false"));
    }


    @Ignore
    @Test
    public void setHelpMe() throws Exception {
        response = helpMeParentClass.setHelpMe();
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("\"scs\": true") &&  response.code() == 200);
    }
    @Ignore
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateHelpMeContent.class)
    public void NegativeSetHelpMe(JSONObject jsonObject) throws Exception {
        response = helpMeParentClass.NegatibeSetHelpMe(jsonObject);
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("\"scs\": false"));
    }
}

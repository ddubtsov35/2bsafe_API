package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.AddAndSelectChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.HelpMe.GenerateHelpMeContent;
import com.dubtsov._2bsafe.Parents.Functions.HelpMe.HelpMeParentClass;
import com.dubtsov._2bsafe.Parents.Models.HelpMe;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 31.08.17.
 */
public class HelpMeTest extends BaseClass {

    HelpMe helpMe;

    public HelpMeTest() throws IOException, ParseException, java.text.ParseException {
        helpMeParentClass = new HelpMeParentClass();
        authorisationUserClass = new AuthorisationUserClass();
        addAndSelectChildrenCardClass = new AddAndSelectChildrenCardClass();
    }

    @Before
    public void before() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
    }

    @Test
    public void getHelpMe() throws Exception {
        helpMe = helpMeParentClass.getHelpMe();
        System.out.println(helpMe.toString());
        Assert.assertTrue(helpMe.getScs().equals("true"));
    }

    @Test
    public void setHelpMe() throws Exception {
        response = helpMeParentClass.setHelpMe();
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("\"scs\": true") &&  response.code() == 200);
    }
}

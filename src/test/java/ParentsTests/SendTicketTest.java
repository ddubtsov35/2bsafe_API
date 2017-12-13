package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.Rules.GenerateRequestAddRule;
import com.dubtsov._2bsafe.Parents.Functions.Tickets.GenerateTicketContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateEmailClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Functions.Tickets.SendTicketClass;
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
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 30.08.17.
 */
@RunWith(JUnitParamsRunner.class)
public class SendTicketTest extends BaseClass{

    public SendTicketTest() throws IOException, ParseException, java.text.ParseException { }

    @Before
    public void before() throws IOException, ParseException, java.text.ParseException {
        sendTicketClass = new SendTicketClass();
        authorisationUserClass = new AuthorisationUserClass();
    }

    @Test
    public void sendTicketWithAuthorisation() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        Assert.assertTrue(sendTicketClass.sendTicket()!= 0);
    }

    //@Ignore
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateTicketContent.class)
    public void NegativeSendTicketWithAuthorisation(JSONObject jsonObject) throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        Assert.assertTrue(sendTicketClass.NegativeSendTicket(jsonObject)== null);
    }




    @Ignore
    @Test
    public void sendTicketWithoutAuthorisation() throws Exception {
        response = sendTicketClass.sendTicketWithoutAuthorisation();
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("\"scs\": true") &&  response.code() == 200);
    }

    //@Ignore
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateTicketContent.class)
    public void NegativeGetRulesByProfile(JSONObject jsonObject) throws Exception {
        response = sendTicketClass.NegativeSendTicketWithoutAuthorisation(jsonObject);
        String result = response.body().string();
        System.out.println("Result: " + result);
        Assert.assertTrue(result.contains("\"scs\": false") || result.isEmpty());
    }

}

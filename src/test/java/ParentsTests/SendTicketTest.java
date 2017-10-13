package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateEmailClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Functions.Tickets.SendTicketClass;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 30.08.17.
 */
public class SendTicketTest extends BaseClass{

    public SendTicketTest() throws IOException, ParseException, java.text.ParseException {
        sendTicketClass = new SendTicketClass();
        authorisationUserClass = new AuthorisationUserClass();
    }

    @Test
    public void sendTicketWithAuthorisation() throws Exception {

        authorisationUserClass.RegistrationAndAuthorisationWeb();
        Assert.assertTrue(sendTicketClass.sendTicket()!= 0);
    }

    @Ignore
    @Test
    public void sendTicketWithoutAuthorisation() throws Exception {
        response = sendTicketClass.sendTicketWithoutAuthorisation();
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": true") &&  response.code() == 200);
    }


}

package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateEmailClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Functions.Tickets.SendTicketClass;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 30.08.17.
 */
public class SendTicketTest extends BaseClass{

    HashMap content = new LinkedHashMap();

    public SendTicketTest() throws IOException, ParseException, java.text.ParseException {
        sendTicketClass = new SendTicketClass();
        authorisationUserClass = new AuthorisationUserClass();
    }

    @Test
    public void sendTicketWithAuthorisation() throws ParseException, java.text.ParseException, IOException {

        authorisationUserClass.RegistrationAndAuthorisationWeb();

        content.put("subj", "TestSubject");
        content.put("msg", "TestMessage");
        content.put("rnd", GenerateTokenClass.getGeneratedToken());

        Assert.assertTrue(sendTicketClass.sendTicket(content)!= 0);
    }

    @Test
    public void sendTicketWithoutAuthorisation() throws ParseException, java.text.ParseException, IOException {

        content.put("subj", "TestSubject");
        content.put("msg", "TestMessage");
        content.put("em", GenerateEmailClass.getGeneratedEmail());
        content.put("name", "TestName");

        response = sendTicketClass.sendTicketWithoutAuthorisation(content);
        String result = response.body().string();

        Assert.assertTrue(result.contains("\"scs\": true") &&  response.code() == 200);
    }


}

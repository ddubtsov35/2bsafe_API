package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.Poll.PollClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Models.Poll;
import com.dubtsov._2bsafe.Parents.Models.PollTittle;
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
public class PollTittleTest extends BaseClass{

    Poll poll;

    public PollTittleTest() throws IOException, ParseException, java.text.ParseException {
        pollClass = new PollClass();
        authorisationUserClass = new AuthorisationUserClass();
    }

    @Ignore
    @Test
    public void getPollTittle() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        PollTittle pollTittle = pollClass.getPoll();
        System.out.println(pollTittle.toString());
        Assert.assertTrue(pollTittle.getScs().equals("true"));
    }

    @Ignore
    @Test
    public void getPoll() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        PollTittle pollTittle = pollClass.getPoll();
        System.out.println(pollTittle.toString());
        poll = pollClass.getPollById();
        System.out.println(poll.toString());
        Assert.assertTrue(poll.getScs().equals("true"));
    }

    @Ignore
    @Test
    public void setPoll() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        PollTittle pollTittle = pollClass.getPoll();
        System.out.println(pollTittle.toString());
        poll = pollClass.getPollById();
        response = pollClass.setPoll();
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": true")&&  response.code() == 200);
    }

}
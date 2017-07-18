package ParentsTests;

import com.dubtsov._2bsafe.Functions.*;
import com.dubtsov._2bsafe.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 17.07.17.
 */
public class AuthorisationTests extends BaseClass{

    public AuthorisationTests() throws IOException {
        registrationUserStep1Class = new RegistrationUserStep1Class();
        recoveryPasswordClass = new RecoveryPasswordClass();
    }

    Response response;
    HashMap content = new LinkedHashMap();
    AuthorisationUserClass authorisationUserClass = new AuthorisationUserClass();
    PasswordChangeClass passwordChangeClass = new PasswordChangeClass();

    @Test
    public void authorisation() throws IOException, ParseException, java.text.ParseException {
        response = authorisationUserClass.RegistrationAndAuthorisation();
        String result = response.body().string();
        System.out.println("Result " + result);
        Assert.assertTrue(result.contains("\"scs\": true") &&  response.code() == 200);
    }

    @Test
    public void recoveryPassword() throws IOException {
        superContent = registrationUserStep1Class.registrationUserStep1();
        content.put("login", superContent.get("em"));
        response = recoveryPasswordClass.recoveryPassword(content);
        Assert.assertTrue(response.body().string().contains("\"scs\": true") &&  response.code() == 200);
    }

    @Test
    public void successPasswordChange() throws IOException, ParseException, java.text.ParseException {
        response = authorisationUserClass.RegistrationAndAuthorisation();
        response = passwordChangeClass.passwordChange();
        content.put("login", superContent.get("login"));
        content.put("pwd", superContent.get("npwd"));
        response = authorisationUserClass.authorisationUser(content);
        Assert.assertTrue(response.body().string().contains("\"scs\": true") &&  response.code() == 200);
    }


}

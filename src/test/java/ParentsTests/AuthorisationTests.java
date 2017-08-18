package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.InputClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.Logout.LogoutClass;
import com.dubtsov._2bsafe.Parents.Functions.PasswordChange.PasswordChangeClass;
import com.dubtsov._2bsafe.Parents.Functions.RecoveryPassword.RecoveryPasswordClass;
import com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers.DeleteUserClass;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep1Class;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 17.07.17.
 */
public class AuthorisationTests extends BaseClass {

    HashMap content = new LinkedHashMap();

    public AuthorisationTests() throws IOException {
        registrationUserStep1Class = new RegistrationUserStep1Class();
        recoveryPasswordClass = new RecoveryPasswordClass();
        logoutClass = new LogoutClass();
        deleteUserClass = new DeleteUserClass();
        authorisationUserClass = new AuthorisationUserClass();
        passwordChangeClass = new PasswordChangeClass();
    }

    @Test
    public void authorisationWeb() throws IOException, ParseException, java.text.ParseException {
        response = authorisationUserClass.RegistrationAndAuthorisationWeb();
        String result = response.body().string();
        System.out.println("Result " + result);
        Assert.assertTrue(result.contains("\"scs\": true") &&  response.code() == 200);
    }

    @Test
    public void authorisationAndroid() throws IOException, ParseException, java.text.ParseException {
        response = authorisationUserClass.RegistrationAndAuthorisationAndroid();
        String result = response.body().string();
        System.out.println("Result " + result);
        Assert.assertTrue(result.contains("\"scs\": true") &&  response.code() == 200);
    }

    @Test
    public void recoveryPassword() throws IOException {
        registrationUserStep1Class.registrationUserStep1();
        content.put("login", superContent.get("em"));
        response = recoveryPasswordClass.recoveryPasswordStart(content);
        //deleteUserClass.deleteUser();
        InputClass inputClass = new InputClass();
        content.put("code", inputClass.code());
        response = recoveryPasswordClass.recoveryPasswordConfirm(content);
        Assert.assertTrue(response.body().string().contains("\"scs\": true") &&  response.code() == 200);
    }

    @Test
    public void successPasswordChange() throws IOException, ParseException, java.text.ParseException {
        response = authorisationUserClass.RegistrationAndAuthorisationWeb();
        response = passwordChangeClass.passwordChange();
        content.put("login", superContent.get("login"));
        content.put("pwd", superContent.get("npwd"));
        content.put("dtype", 0);
        response = authorisationUserClass.authorisationUser(content);
        //deleteUserClass.deleteUser();
        String resp = response.body().string();
        Assert.assertTrue(resp.contains("\"scs\": true")&&  response.code() == 200);
    }

    @Test
    public void logout() throws ParseException, java.text.ParseException, IOException {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        response = logoutClass.logout();
        Assert.assertTrue(response.body().string().contains("\"scs\": true") &&  response.code() == 200 );

    }
}

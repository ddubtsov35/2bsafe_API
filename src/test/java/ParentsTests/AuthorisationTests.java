package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.InputClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.Logout.LogoutClass;
import com.dubtsov._2bsafe.Parents.Functions.PasswordChange.PasswordChangeClass;
import com.dubtsov._2bsafe.Parents.Functions.RecoveryPassword.RecoveryPasswordClass;
import com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers.DeleteUserClass;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep1Class;
import com.dubtsov._2bsafe.Parents.Models.AuthorisationUser;
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

    AuthorisationUser authorisationUser;

    public AuthorisationTests() throws IOException, ParseException, java.text.ParseException {
        registrationUserStep1Class = new RegistrationUserStep1Class();
        recoveryPasswordClass = new RecoveryPasswordClass();
        logoutClass = new LogoutClass();
        deleteUserClass = new DeleteUserClass();
        authorisationUserClass = new AuthorisationUserClass();
        passwordChangeClass = new PasswordChangeClass();
    }

    @Test
    public void authorisationWeb() throws IOException, ParseException, java.text.ParseException {
        authorisationUser = authorisationUserClass.RegistrationAndAuthorisationWeb();
        Assert.assertTrue(authorisationUser.getScs().contains("true"));
    }

    @Test
    public void authorisationAndroid() throws Exception {
        authorisationUser = authorisationUserClass.RegistrationAndAuthorisationAndroid();
        Assert.assertTrue(authorisationUser.getScs().contains("true"));
    }

    @Test
    public void recoveryPassword() throws Exception {
        registrationUserStep1Class.registrationUserStep1();
        response = recoveryPasswordClass.recoveryPasswordStart();
        response = recoveryPasswordClass.recoveryPasswordConfirm();
        Assert.assertTrue(response.body().string().contains("\"scs\": true") &&  response.code() == 200);
    }

    @Test
    public void successPasswordChange() throws Exception {
        authorisationUser = authorisationUserClass.RegistrationAndAuthorisationWeb();
        response = passwordChangeClass.passwordChange();
        logoutClass.logout();
        authorisationUser = authorisationUserClass.authorisationUserWithNewPassword();
        Assert.assertTrue(authorisationUser.getScs().contains("true"));
    }

    @Test
    public void logout() throws ParseException, java.text.ParseException, IOException {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        response = logoutClass.logout();
        Assert.assertTrue(response.body().string().contains("\"scs\": true") &&  response.code() == 200 );

    }
}

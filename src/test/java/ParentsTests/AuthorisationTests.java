package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.GenerateData.GenerateAuthContent;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.GenerateData.ProvideGetAuth;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.Logout.LogoutClass;
import com.dubtsov._2bsafe.Parents.Functions.PasswordChange.PasswordChangeClass;
import com.dubtsov._2bsafe.Parents.Functions.RecoveryPassword.GenerateRecoveryPasswordContent;
import com.dubtsov._2bsafe.Parents.Functions.RecoveryPassword.RecoveryPasswordClass;
import com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers.DeleteUserClass;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep1Class;
import com.dubtsov._2bsafe.Parents.Models.AuthorisationUser;
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
 * Created by user on 17.07.17.
 */
@RunWith(JUnitParamsRunner.class)
public class AuthorisationTests extends BaseClass {

    AuthorisationUser authorisationUser;

    public AuthorisationTests() throws IOException, ParseException, java.text.ParseException {}

    @Before
    public void before() throws IOException, ParseException, java.text.ParseException {
        registrationUserStep1Class = new RegistrationUserStep1Class();
        recoveryPasswordClass = new RecoveryPasswordClass();
        logoutClass = new LogoutClass();
        deleteUserClass = new DeleteUserClass();
        authorisationUserClass = new AuthorisationUserClass();
        passwordChangeClass = new PasswordChangeClass();
    }

    @Test
    public void authorisationWeb() throws Exception {
        authorisationUser = authorisationUserClass.RegistrationAndAuthorisationWeb();
        Assert.assertTrue(authorisationUser.getScs().contains("true"));
    }

    @Test
    @TestCaseName("{0}")
    @Parameters(source = ProvideGetAuth.class)
    public void NegativeAuthorisationWeb(JSONObject jsonObject) throws Exception {
        authorisationUser = authorisationUserClass.NegativeRegistrationAndAuthorisationWeb(jsonObject);
        Assert.assertTrue(authorisationUser.getScs() == null || authorisationUser.getScs().equals("false"));
    }



    @Test
    public void authorisationAndroid() throws Exception {
        authorisationUser = authorisationUserClass.RegistrationAndAuthorisationAndroid();
        Assert.assertTrue(authorisationUser.getScs().contains("true"));
    }


    @Ignore
    @Test
    public void recoveryPassword() throws Exception {
        registrationUserStep1Class.registrationUserStep1();
        response = recoveryPasswordClass.recoveryPasswordStart();
        response = recoveryPasswordClass.recoveryPasswordConfirm();
        Assert.assertTrue(response.body().string().contains("\"scs\": true") &&  response.code() == 200);
    }
    @Ignore
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateRecoveryPasswordContent.class)
    public void NegativeRecoveryPassword(JSONObject jsonObject) throws Exception {
        registrationUserStep1Class.registrationUserStep1();
        response = recoveryPasswordClass.recoveryPasswordStart();
        response = recoveryPasswordClass.NegativeRecoveryPasswordConfirm(jsonObject);
        Assert.assertTrue(response.body().string().contains("\"scs\": false"));
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
    @TestCaseName("{0}")
    @Parameters(source = ProvideGetAuth.class)
    public void NegativeSuccessPasswordChange(JSONObject jsonObject) throws Exception {
        authorisationUser = authorisationUserClass.RegistrationAndAuthorisationWeb();
        response = passwordChangeClass.passwordChange();
        logoutClass.logout();
        authorisationUser = authorisationUserClass.NegativeAuthorisationUserWithNewPassword(jsonObject);
        System.out.println("authorisationUser " + authorisationUser.toString());
        System.out.println("authorisationUser " + authorisationUser.getScs());
        Assert.assertTrue(authorisationUser.getScs() == null || authorisationUser.getScs().equals("false"));
    }




    @Test
    public void logout() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        response = logoutClass.logout();
        Assert.assertTrue(response.body().string().contains("\"scs\": true") &&  response.code() == 200 );
    }
    @Ignore
    @Test
    public void NegativeLogout() throws Exception {
        response = logoutClass.logout();
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("\"scs\": false"));
    }
}

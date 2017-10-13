package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChangeEmailPhone.ChangeEmailClass;
import com.dubtsov._2bsafe.Parents.Functions.ChangeEmailPhone.Timeout;
import com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers.ListRegisteredUsersClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateEmailClass;
import com.dubtsov._2bsafe.Parents.Models.RegisteredUser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by user on 30.08.17.
 */
public class ChangeEmailPhoneTest extends BaseClass{

    public ChangeEmailPhoneTest() throws IOException, ParseException, java.text.ParseException {
        changeEmailClass = new ChangeEmailClass();
        authorisationUserClass = new AuthorisationUserClass();
        listRegisteredUsersClass = new ListRegisteredUsersClass();
    }

    @Ignore
    @Test
    public void changeEmail() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        List<RegisteredUser> listRegisteredUserBefore = listRegisteredUsersClass.getListRegisteredUsers();
        String beforeEmail = listRegisteredUserBefore.get(listRegisteredUserBefore.size()-10).getEm();
        String newEmail = GenerateEmailClass.getGeneratedEmail();
        authorisationUserClass.authorisationUser();
        response = changeEmailClass.changeEmail();
        Timeout.waitEmailVerification(GenerateEmailClass.emailStatic);
        List<RegisteredUser> listRegisteredUserAfter = listRegisteredUsersClass.getListRegisteredUsers();
        String afterEmail = listRegisteredUserAfter.get(listRegisteredUserAfter.size()-10).getEm();
        System.out.println("beforeEmail " + beforeEmail);
        System.out.println("afterEmail " + afterEmail);
        Assert.assertTrue(afterEmail.equals(newEmail) && !beforeEmail.equals(newEmail));
    }

    @Ignore
    @Test
    public void changeEmailError() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        List<RegisteredUser> listRegisteredUserBefore = listRegisteredUsersClass.getListRegisteredUsers();
        String beforeEmail = listRegisteredUserBefore.get(listRegisteredUserBefore.size()-1).getEm();
        authorisationUserClass.authorisationUser();
        response = changeEmailClass.changeEmail();
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": false") && response.code() == 409);
    }

}

package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChangeEmailPhone.ChangeEmailClass;
import com.dubtsov._2bsafe.Parents.Functions.ChangeEmailPhone.Timeout;
import com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers.ListRegisteredUsersClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateEmailClass;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 30.08.17.
 */
public class ChangeEmailPhoneTest extends BaseClass{

    HashMap content = new LinkedHashMap();

    public ChangeEmailPhoneTest() throws IOException, ParseException, java.text.ParseException {
        changeEmailClass = new ChangeEmailClass();
        authorisationUserClass = new AuthorisationUserClass();
        listRegisteredUsersClass = new ListRegisteredUsersClass();
    }

    @Test
    public void changeEmail() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        String beforeEmail = listRegisteredUsersClass.getListRegisteredUsers().get(listRegisteredUsersClass.getListRegisteredUsers().size()-1).getEm();
        String newEmail = GenerateEmailClass.getGeneratedEmail();
        content.put("em", newEmail);
        authorisationUserClass.authorisationUser(superContent);
        response = changeEmailClass.changeEmail(content);
        Timeout.waitEmailVerification();
        String afterEmail = listRegisteredUsersClass.getListRegisteredUsers().get(listRegisteredUsersClass.getListRegisteredUsers().size()-1).getEm();
        System.out.println("beforeEmail " + beforeEmail);
        System.out.println("afterEmail " + afterEmail);
        Assert.assertTrue(afterEmail.equals(newEmail) && !beforeEmail.equals(newEmail));
    }

    @Test
    public void changeEmailError() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        String beforeEmail = listRegisteredUsersClass.getListRegisteredUsers().get(listRegisteredUsersClass.getListRegisteredUsers().size()-1).getEm();
        content.put("em", beforeEmail);
        authorisationUserClass.authorisationUser(superContent);
        response = changeEmailClass.changeEmail(content);
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": false") && response.code() == 409);
    }

}

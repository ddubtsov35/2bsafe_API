package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers.DeleteUserClass;
import com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers.ListRegisteredUsersClass;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep1Class;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep2Class;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateEmailClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GeneratePhoneClass;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 12.07.17.
 */
public class RegistrationTests extends BaseClass {

    public RegistrationTests() throws IOException, ParseException, java.text.ParseException {
        registrationUserStep1Class = new RegistrationUserStep1Class();
        registrationUserStep2Class = new RegistrationUserStep2Class();
        listRegisteredUsersClass = new ListRegisteredUsersClass();
        authorisationUserClass = new AuthorisationUserClass();
        deleteUserClass = new DeleteUserClass();
    }

    ResponseClass response;

    @Test
    public void checkEmailPhoneExist() throws IOException, ParseException {
        //ContentClearFlag.setContentClearFlag(false);
        HashMap email = registrationUserStep1Class.registrationUserStep1();
        superContent.put("em", (String) email.get("em"));
        superContent.put("ph", GeneratePhoneClass.getGeneratedPhone());
        response = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/reg/check", superContent);
        Assert.assertEquals(response.getJsonResponse().code(), 409);
    }

    @Test
    public void checkEmailPhoneNewEmail() throws IOException {
        superContent.put("em", GenerateEmailClass.getGeneratedEmail());
        superContent.put("ph", GeneratePhoneClass.getGeneratedPhone());
        response = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/reg/check", superContent);
        Assert.assertEquals(response.getJsonResponse().code(), 200);
    }

    @Test
    public void deleteUser() throws Exception {
        registrationUserStep1Class.registrationUserStep1();
        registrationUserStep2Class.registrationUserStep2Web();
        authorisationUserClass.authorisationUser();
        deleteUserClass.deleteUser();
        String success = authorisationUserClass.authorisationUser().getScs();

        Assert.assertTrue(success.equals("false"));
    }

    @Test
    public void createNewUser() throws Exception {
        int countUsersBefore = listRegisteredUsersClass.getListRegisteredUsers().size();
        registrationUserStep1Class.registrationUserStep1();
        int countUsersAfter = listRegisteredUsersClass.getListRegisteredUsers().size();
        Assert.assertTrue(countUsersAfter - countUsersBefore == 1);
    }

    @Test
    public void sendCodeActivation() throws IOException, ParseException {
        String result = registrationUserStep1Class.sendCodeRegistration().body().string();
        System.out.println(result);
        Assert.assertTrue(result.contains("\"scs\": true"));
    }

   /* @Test
    public void sendCodeActivationDuring3Minutes() throws IOException {
        String result = registrationUserStep1Class.sendCodeRegistrationDuring3Minutes();
        System.out.println(result);
        Assert.assertTrue(result.contains("\"scs\": true"));
    }*/

}

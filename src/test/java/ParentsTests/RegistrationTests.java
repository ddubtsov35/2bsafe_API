package ParentsTests;

import com.dubtsov._2bsafe.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Functions.RegisteredUsers.DeleteUserClass;
import com.dubtsov._2bsafe.Functions.RegisteredUsers.ListRegisteredUsersClass;
import com.dubtsov._2bsafe.Functions.Registration.RegistrationUserStep1Class;
import com.dubtsov._2bsafe.Functions.Registration.RegistrationUserStep2Class;
import com.dubtsov._2bsafe.GenerateTestData.GenerateEmailClass;
import com.dubtsov._2bsafe.GenerateTestData.GeneratePhoneClass;
import com.dubtsov._2bsafe.Response.ResponseClass;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 12.07.17.
 */
public class RegistrationTests extends BaseClass {

    public RegistrationTests() throws IOException {
        registrationUserStep1Class = new RegistrationUserStep1Class();
        registrationUserStep2Class = new RegistrationUserStep2Class();
        listRegisteredUsersClass = new ListRegisteredUsersClass();
        authorisationUserClass = new AuthorisationUserClass();
        deleteUserClass = new DeleteUserClass();
    }

    ResponseClass response;

    @Test
    public void checkEmailPhoneExist() throws IOException {
        //ContentClearFlag.setContentClearFlag(false);
        HashMap email = registrationUserStep1Class.registrationUserStep1();
        superContent.put("em", (String) email.get("em"));
        superContent.put("ph", GeneratePhoneClass.getGeneratedPhone());
        response = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/reg/check", superContent);
        Assert.assertEquals(response.getResponse().code(), 409);
    }

    @Test
    public void checkEmailPhoneNewEmail() throws IOException {
        superContent.put("em", GenerateEmailClass.getGeneratedEmail());
        superContent.put("ph", GeneratePhoneClass.getGeneratedPhone());
        response = new ResponseClass("http://lkn.safec.ru/os_api/accounts/v1.0/reg/check", superContent);
        Assert.assertEquals(response.getResponse().code(), 200);
    }

    @Test
    public void deleteUser() throws IOException, ParseException, java.text.ParseException {
        //Create test user and remember his password
        HashMap content = registrationUserStep1Class.registrationUserStep1();
        //Verification account
        registrationUserStep2Class.registrationUserStep2(content);
        //Authorisation
        authorisationUserClass.authorisationUser(content);
        //Delete user
        deleteUserClass.deleteUser(content);
        //Authorisation
        int codeRepeatAuthorisation = authorisationUserClass.authorisationUser(content).code();

        Assert.assertTrue(codeRepeatAuthorisation == 401);
    }

    @Test
    public void createNewUser() throws IOException, ParseException, java.text.ParseException {
        int countUsersBefore = listRegisteredUsersClass.getListRegisteredUsers().size();
        registrationUserStep1Class.registrationUserStep1();
        int countUsersAfter = listRegisteredUsersClass.getListRegisteredUsers().size();
        Assert.assertTrue(countUsersAfter - countUsersBefore == 1);
    }

    @Test
    public void sendCodeActivation() throws IOException {
        String result = registrationUserStep1Class.sendCodeRegistration();
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

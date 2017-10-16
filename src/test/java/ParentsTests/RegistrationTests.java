package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers.DeleteUserClass;
import com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers.ListRegisteredUsersClass;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep1Class;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep2Class;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateEmailClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GeneratePhoneClass;
import com.dubtsov._2bsafe.Parents.Pool.UserPool;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Ignore;
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

    @Test
    public void checkEmailExist() throws IOException, ParseException {
        response = registrationUserStep1Class.checkExistEmail();
        Assert.assertEquals(response.code(), 409);
    }

    @Test
    public void checkPhoneExist() throws Exception {
        response = registrationUserStep1Class.checkExistPhone();
        Assert.assertEquals(response.code(), 409);
    }

    @Test
    public void checkEmail() throws IOException, ParseException {
        response = registrationUserStep1Class.checkEmail();
        Assert.assertEquals(response.code(), 200);
    }

    @Test
    public void checkPhone() throws IOException, ParseException {
        response = registrationUserStep1Class.checkPhone();
        Assert.assertEquals(response.code(), 200);
    }

    @Ignore
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
        //UserPool.clearFile();
        int countUsersBefore = listRegisteredUsersClass.getListRegisteredUsers().size();
        registrationUserStep1Class.registrationForCreateNewUser();
        int countUsersAfter = listRegisteredUsersClass.getListRegisteredUsers().size();
        Assert.assertTrue(countUsersAfter - countUsersBefore == 1);
    }

    //Need code
    //@Ignore
    @Test
    public void sendCodeActivation() throws IOException, ParseException {
        String result = registrationUserStep1Class.sendCodeRegistration().body().string();
        System.out.println(result);
        Assert.assertTrue(result.contains("\"scs\": true"));
    }
}

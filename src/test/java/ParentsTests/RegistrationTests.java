package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.Push.GenerateNotifyListContent;
import com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers.DeleteUserClass;
import com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers.GenerateRegisteredUsersContent;
import com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers.ListRegisteredUsersClass;
import com.dubtsov._2bsafe.Parents.Functions.Registration.GenerateRegistrationContent;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep1Class;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep2Class;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateEmailClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GeneratePhoneClass;
import com.dubtsov._2bsafe.Parents.Pool.ChildrenCardPools;
import com.dubtsov._2bsafe.Parents.Pool.CidCkeyPool;
import com.dubtsov._2bsafe.Parents.Pool.CidCkeyRegisteredPool;
import com.dubtsov._2bsafe.Parents.Pool.UserPool;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
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
import java.util.HashMap;

/**
 * Created by user on 12.07.17.
 */
@RunWith(JUnitParamsRunner.class)
public class RegistrationTests extends BaseClass {

    public RegistrationTests() throws IOException, ParseException, java.text.ParseException {

    }

    @Before
    public void before() throws IOException, ParseException, java.text.ParseException {
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

    @Ignore
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateRegistrationContent.class)
    public void NegativeCheckEmail(JSONObject jsonObject) throws Exception {
        response = registrationUserStep1Class.NegativeCheckEmail(jsonObject);
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": false"));
    }




    @Test
    public void checkPhone() throws IOException, ParseException {
        response = registrationUserStep1Class.checkPhone();
        Assert.assertEquals(response.code(), 200);
    }

    @Ignore
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateRegistrationContent.class)
    public void NegativeCheckPhone(JSONObject jsonObject) throws Exception {
        response = registrationUserStep1Class.NegativeCheckPhone(jsonObject);
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": false"));
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
    @Ignore
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateRegisteredUsersContent.class)
    public void NegativeDeleteUser(JSONObject jsonObject) throws Exception {
        registrationUserStep1Class.registrationUserStep1();
        registrationUserStep2Class.registrationUserStep2Web();
        authorisationUserClass.authorisationUser();
        deleteUserClass.NegativeDeleteUser(jsonObject);
        String success = authorisationUserClass.authorisationUser().getScs();
        Assert.assertTrue(success.equals("true"));
    }




    @Test
    public void createNewUser() throws Exception {
        UserPool.clearFile();
        CidCkeyRegisteredPool.clearFile();
        CidCkeyPool.clearFile();
        ChildrenCardPools.clearFile();
        GenerateProfileIdContent.profileId = null;

        int countUsersBefore = listRegisteredUsersClass.getListRegisteredUsers().size();
        registrationUserStep1Class.registrationUserStep1();
        registrationUserStep2Class.registrationUserStep2Web();
        int countUsersAfter = listRegisteredUsersClass.getListRegisteredUsers().size();
        Assert.assertTrue(countUsersAfter - countUsersBefore == 1);
    }


    //Need code
    @Ignore
    @Test
    public void sendCodeActivation() throws IOException, ParseException {
        //UserPool.clearFile();
        String result = registrationUserStep1Class.sendCodeRegistration().body().string();
        System.out.println(result);
        Assert.assertTrue(result.contains("\"scs\": true"));
    }
    //Need code
    @Ignore
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateRegistrationContent.class)
    public void NegativeSendCodeActivation(JSONObject jsonObject) throws Exception {
        //UserPool.clearFile();
        String result = registrationUserStep1Class.NegativeSendCodeRegistration().body().string();
        System.out.println(result);
        Assert.assertTrue(result.contains("\"scs\": false"));
    }
}

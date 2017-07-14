package ParentsTests;

import com.dubtsov._2bsafe.Functions.ListRegisteredUsersClass;
import com.dubtsov._2bsafe.GenerateTestData.GenerateEmailClass;
import com.dubtsov._2bsafe.GenerateTestData.GeneratePhoneClass;
import com.dubtsov._2bsafe.Response.ResponseClass;
import org.json.simple.parser.ParseException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by user on 12.07.17.
 */
public class ParentsTests extends BaseTestClass{

    public ParentsTests() throws IOException {}

    ResponseClass response;

    @After
    public void after(){

    }

    @Test
    public void checkEmailPhoneExist() throws IOException {
        HashMap<String, String> email = registrationUserStep1Class.registrationUserStep1();
        System.out.println("qqq " + email);
        content.put("em", (String) email.get("em"));
        content.put("ph", GeneratePhoneClass.getGeneratedPhone());
        response = new ResponseClass("https://lkn.safec.ru/os_api/accounts/v1.0/reg/check", content);
        Assert.assertEquals(response.getResponse().code(), 409);
    }

    @Test
    public void checkEmailPhoneNewEmail() throws IOException {
        content.put("em", GenerateEmailClass.getGeneratedEmail());
        content.put("ph", GeneratePhoneClass.getGeneratedPhone());
        response = new ResponseClass("https://lkn.safec.ru/os_api/accounts/v1.0/reg/check", content);
        Assert.assertEquals(response.getResponse().code(), 200);
    }

    @Test
    public void successRegisrtation() throws IOException {
        super.registrationUserStep1Class.registrationUserStep1();
    }

    @Test
    public void deleteUser() throws IOException, ParseException, java.text.ParseException {
        //Create test user and remember his password
        HashMap content = registrationUserStep1Class.registrationUserStep1();
        //Check registered counts
        int regCountBefore = listRegisteredUsersClass.getRegisteredUsersCount();
        //Delete user
        deleteUserClass.deleteUser(content);
        //Check registered counts
        int regCountAfter= listRegisteredUsersClass.getRegisteredUsersCount();
        Assert.assertTrue(regCountBefore - regCountAfter == 0);
    }




}

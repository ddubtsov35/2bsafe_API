package ParentsTests;

import com.dubtsov._2bsafe.Functions.DeleteUserClass;
import com.dubtsov._2bsafe.Functions.ListRegisteredUsersClass;
import com.dubtsov._2bsafe.Functions.RegistrationUserStep1Class;
import com.dubtsov._2bsafe.Response.ResponseClass;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;


/**
 * Created by user on 12.07.17.
 */
public class BaseTestClass {

    HashMap<String, String> content;
    ResponseClass response;
    RegistrationUserStep1Class registrationUserStep1Class;
    DeleteUserClass deleteUserClass = new DeleteUserClass();
    ListRegisteredUsersClass listRegisteredUsersClass;

    public BaseTestClass() throws IOException {
       content = new LinkedHashMap<>();
       response = new ResponseClass();
       registrationUserStep1Class = new RegistrationUserStep1Class();

       listRegisteredUsersClass = new ListRegisteredUsersClass();
    }

}

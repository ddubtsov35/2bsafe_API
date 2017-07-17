package ParentsTests;

import com.dubtsov._2bsafe.Functions.*;
import com.dubtsov._2bsafe.Response.ResponseClass;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;


/**
 * Created by user on 12.07.17.
 */
public class BaseTestClass {

    HashMap content;
    ResponseClass response;
    RegistrationUserStep1Class registrationUserStep1Class;
    RegistrationUserStep2Class registrationUserStep2Class;
    DeleteUserClass deleteUserClass = new DeleteUserClass();
    ListRegisteredUsersClass listRegisteredUsersClass;
    AuthorisationUserClass authorisationUserClass;

    public BaseTestClass() throws IOException {
       this.content = new LinkedHashMap<>();
       this.response = new ResponseClass();
       this.registrationUserStep1Class = new RegistrationUserStep1Class();
       this.registrationUserStep2Class = new RegistrationUserStep2Class();
       this.listRegisteredUsersClass = new ListRegisteredUsersClass();
       this.authorisationUserClass = new AuthorisationUserClass();
    }

}

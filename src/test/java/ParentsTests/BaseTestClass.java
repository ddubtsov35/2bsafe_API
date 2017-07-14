package ParentsTests;

import com.dubtsov._2bsafe.DeleteUserClass;
import com.dubtsov._2bsafe.RegistrationUserStep1Class;
import com.dubtsov._2bsafe.ResponseClass;

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
    DeleteUserClass deleteUserClass;

    public BaseTestClass() throws IOException {
       content = new LinkedHashMap<String, String>();
       response = new ResponseClass();
       registrationUserStep1Class = new RegistrationUserStep1Class();
       deleteUserClass = new DeleteUserClass();
    }

}

package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Pool.UserPool;
import org.json.simple.parser.ParseException;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by user on 07.09.17.
 */
public class test extends BaseClass{

    public test() throws IOException, ParseException, java.text.ParseException {
        authorisationUserClass = new AuthorisationUserClass();
    }

    @Test
    public void test() throws Exception {
        //JSONObject jsonObject = new JSONObject();
        //jsonObject.put("qwre", "qwe");
        System.out.println(UserPool.getUserFromFile().toString());
    }
}

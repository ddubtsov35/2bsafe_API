package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.Registration.GenerateRegistrationContent;
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
        System.out.println("1 " + GenerateRegistrationContent.getRegistrationStep1Content());
        //System.out.println("2 " + GenerateRegistrationContent.test3());
        System.out.println("3 " + GenerateRegistrationContent.getRegistrationStep2ContentWeb());

    }
}

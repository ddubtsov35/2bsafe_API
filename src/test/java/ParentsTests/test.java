package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.AddAndSelectChildrenCardClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.BaseContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateRegistrationContent;
import com.dubtsov._2bsafe.Parents.UserPool.UserPool;
import com.sun.jna.platform.win32.Netapi32Util;
import org.json.simple.JSONObject;
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
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        AddAndSelectChildrenCardClass addAndSelectChildrenCardClass = new AddAndSelectChildrenCardClass();
        addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
    }
}

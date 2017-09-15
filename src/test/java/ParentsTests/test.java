package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Apps.AppsClass;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.GroupsApp.GroupsAppClass;
import com.dubtsov._2bsafe.Parents.Functions.Registration.GenerateRegistrationContent;
import com.dubtsov._2bsafe.Parents.Models.GroupApp;
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
        AppsClass appsClass = new AppsClass();
        authorisationUserClass = new AuthorisationUserClass();
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        GroupsAppClass groupsAppClass = new GroupsAppClass();
        GroupApp groupApp = groupsAppClass.addGroupApp();
        System.out.println("List group " + groupsAppClass.getListGroupApp());

    }
}

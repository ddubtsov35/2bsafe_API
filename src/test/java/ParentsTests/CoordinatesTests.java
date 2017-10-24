package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.*;
import com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers.DeleteUserClass;
import com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers.ListRegisteredUsersClass;
import com.dubtsov._2bsafe.Parents.Models.ChildrenCard;
import org.json.simple.parser.ParseException;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * Created by user on 16.08.17.
 */
public class CoordinatesTests extends BaseClass {
    public CoordinatesTests() throws IOException, ParseException, java.text.ParseException {
        childrenCardClass = new ChildrenCardClass();
        authorisationUserClass = new AuthorisationUserClass();
        listRegisteredUsersClass = new ListRegisteredUsersClass();
        deleteUserClass = new DeleteUserClass();
    }

    @Ignore
    @Test
    public void qwer() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        childrenCardClass.addChildrenCard();
        List<ChildrenCard> childrenCardList = childrenCardClass.getChildrenCardList();
        System.out.println(childrenCardList.size());
        //Assert.assertTrue(countCardAfter - countCardBefore == 1 && response.code() == 200);
    }
}

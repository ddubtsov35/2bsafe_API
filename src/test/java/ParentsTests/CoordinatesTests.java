package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.*;
import com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers.DeleteUserClass;
import com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers.ListRegisteredUsersClass;
import com.dubtsov._2bsafe.Parents.Models.ChildrenCard;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by user on 16.08.17.
 */
public class CoordinatesTests extends BaseClass {
    public CoordinatesTests() throws IOException, ParseException, java.text.ParseException {

        addChildrenCardClass = new AddChildrenCardClass();
        authorisationUserClass = new AuthorisationUserClass();
        getChildrenCardListClass = new GetChildrenCardListClass();
        listRegisteredUsersClass = new ListRegisteredUsersClass();
        deleteUserClass = new DeleteUserClass();
        deleteChildrenCardClass = new DeleteChildrenCardClass();
        changeChildrenCardClass = new ChangeChildrenCardClass();
        getChildrenCardInfoClass = new GetChildrenCardInfoClass();
    }

    @Test
    public void qwer() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addChildrenCardClass.addChildrenCard();
        List<ChildrenCard> childrenCardList = getChildrenCardListClass.getChildrenCardList();
        System.out.println(childrenCardList.size());
        //Assert.assertTrue(countCardAfter - countCardBefore == 1 && response.code() == 200);
    }
}

package Test;

import com.dubtsov._2bsafe.Admin.GetActCode;
import com.dubtsov._2bsafe.Admin.Model.UserModel;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.ChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers.ListRegisteredUsersClass;
import com.dubtsov._2bsafe.Parents.Models.AuthorisationUser;
import com.dubtsov._2bsafe.Parents.Models.ChildrenCard;
import org.junit.Assert;

import java.io.IOException;
import java.util.List;

/**
 * Created by user on 23.11.17.
 */
public class Test {

    @org.junit.Test
    public void test() throws Exception {
        AuthorisationUserClass authorisationUserClass = new AuthorisationUserClass();
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        ChildrenCardClass childrenCardClass = new ChildrenCardClass();
        List<ChildrenCard> childrenCardList = childrenCardClass.getChildrenCardList();
        System.out.println(childrenCardList.size());
    }

}

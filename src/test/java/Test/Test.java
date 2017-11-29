package Test;

import com.dubtsov._2bsafe.Admin.GetActCode;
import com.dubtsov._2bsafe.Admin.Model.UserModel;
import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.Models.ProfileCard;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileClass;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.AddAndSelectChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.ChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers.ListRegisteredUsersClass;
import com.dubtsov._2bsafe.Parents.Models.AddChildrenCard;
import com.dubtsov._2bsafe.Parents.Models.AuthorisationUser;
import com.dubtsov._2bsafe.Parents.Models.ChildrenCard;
import com.dubtsov._2bsafe.Parents.Models.RegisteredUser;
import org.json.simple.JSONObject;
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

    @org.junit.Test
    public void test2() throws Exception {
        AuthorisationUserClass authorisationUserClass = new AuthorisationUserClass();
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        ListRegisteredUsersClass listRegisteredUsersClass = new ListRegisteredUsersClass();
        System.out.println("Число зарегистрированных родителей: " + listRegisteredUsersClass.getListRegisteredUsers().size());
        System.out.println();

        authorisationUserClass.authorisationUser();
        ChildrenCardClass childrenCardClass = new ChildrenCardClass();
        childrenCardClass.addChildrenCard();
        System.out.println("Число карточек детей: " + childrenCardClass.getChildrenCardList().size());
        System.out.println();

        AuthorisationChildClass authorisationChildClass = new AuthorisationChildClass();
        authorisationChildClass.authorisationChildren();
        ProfileClass profileClass = new ProfileClass();
        profileClass.setProfileCard();
        List<ProfileCard> profileCardList = profileClass.getProfileList();
        System.out.println(profileCardList.size());
    }

    @org.junit.Test
    public void test3() throws Exception {
        AuthorisationUserClass authorisationUserClass = new AuthorisationUserClass();
        authorisationUserClass.authorisationUser();

        AuthorisationChildClass authorisationChildClass = new AuthorisationChildClass();
        authorisationChildClass.authorisationChildren();
    }

}

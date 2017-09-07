package ChildrenTests;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.Authorisation.ChildrenAuthorisationResponseClass;
import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileListClass;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileSetClass;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.AddChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.Logout.LogoutClass;
import com.dubtsov._2bsafe.Parents.Functions.PasswordChange.PasswordChangeClass;
import com.dubtsov._2bsafe.Parents.Functions.RecoveryPassword.RecoveryPasswordClass;
import com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers.DeleteUserClass;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep1Class;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.prefs.BackingStoreException;

/**
 * Created by user on 23.08.17.
 */
public class ChildrenCardTest extends BaseClass{

    HashMap content = new LinkedHashMap();

    public ChildrenCardTest() throws IOException {
        registrationUserStep1Class = new RegistrationUserStep1Class();
        recoveryPasswordClass = new RecoveryPasswordClass();
        logoutClass = new LogoutClass();
        deleteUserClass = new DeleteUserClass();
        authorisationUserClass = new AuthorisationUserClass();
        passwordChangeClass = new PasswordChangeClass();
        authorisationChildClass = new AuthorisationChildClass();
        childrenAuthorisationResponseClass = new ChildrenAuthorisationResponseClass();
        childrenResponseAuthorisationModel = new ChildrenResponseAuthorisationModel();
        profileListClass = new ProfileListClass();
        addChildrenCardClass = new AddChildrenCardClass();
        profileSetClass = new ProfileSetClass();
    }


   /* @Test
    public void getChildrenCardList() throws Exception {
        response = authorisationUserClass.RegistrationAndAuthorisationWeb();
        addChildrenCardClass.addChildrenCard();
        content.put("cid","");
        content.put("em",superContent.get("login"));
        content.put("pwd",superContent.get("pwd"));
        content.put("token", GenerateTokenClass.getGeneratedToken());
        content.put("sname","TestDevice");
        content.put("os","Android");
        content.put("osv","10");
        content.put("scr","Doxya");
        content.put("man","TestMan");
        content.put("mod","TestMod");
        content.put("type",1);
        response = authorisationChildClass.authorisationChildren(content);
        childrenResponseAuthorisationModel = childrenAuthorisationResponseClass.childrenResponseAuthorisation(response);
        content.put("cid",childrenResponseAuthorisationModel.getCid());
        content.put("ckey",childrenResponseAuthorisationModel.getCkey());
        Assert.assertTrue(profileListClass.getProfileList(content).size() == 1);
    }

    @Test
    public void selectChildrenCard() throws Exception {
        response = authorisationUserClass.RegistrationAndAuthorisationWeb();
        addChildrenCardClass.addChildrenCard();
        content.put("cid","");
        content.put("em",superContent.get("login"));
        content.put("pwd",superContent.get("pwd"));
        content.put("token", GenerateTokenClass.getGeneratedToken());
        content.put("sname","TestDevice");
        content.put("os","Android");
        content.put("osv","10");
        content.put("scr","Doxya");
        content.put("man","TestMan");
        content.put("mod","TestMod");
        content.put("type",1);
        response = authorisationChildClass.authorisationChildren(content);
        childrenResponseAuthorisationModel = childrenAuthorisationResponseClass.childrenResponseAuthorisation(response);
        content.put("cid",childrenResponseAuthorisationModel.getCid());
        content.put("ckey",childrenResponseAuthorisationModel.getCkey());
        content.put("profile_id", profileListClass.getProfileList(content).get(0).getProfile_id());
        String result = profileSetClass.selectProfileCardResponse(content).body().string();
        System.out.println("selectChildrenCard " + result);
        Assert.assertTrue(result.contains("\"scs\": true"));
    }*/

}

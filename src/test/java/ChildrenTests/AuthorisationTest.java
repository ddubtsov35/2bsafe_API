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
import com.dubtsov._2bsafe.Parents.Models.AuthorisationUser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 16.08.17.
 */
public class AuthorisationTest extends BaseClass{

    HashMap content = new LinkedHashMap();
    AuthorisationUser authorisationUser;

    public AuthorisationTest() throws IOException, ParseException, java.text.ParseException {
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

    @Test
    public void authorisation() throws IOException, ParseException, java.text.ParseException {
        authorisationUser = authorisationUserClass.RegistrationAndAuthorisationWeb();
        System.out.println(authorisationUser.toString());
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
        response = authorisationChildClass.authorisationChildren();
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": true"));
    }







}

package ChildrenTests;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.Authorisation.ChildrenAuthorisationResponseClass;
import com.dubtsov._2bsafe.Childrens.ConditionInformationFromDevice.GenerationRequestJsonClass;
import com.dubtsov._2bsafe.Childrens.ConditionInformationFromDevice.GetConditionInformation;
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
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 23.08.17.
 */
public class GetConditionInformationTest extends BaseClass{

    HashMap content = new LinkedHashMap();

    public GetConditionInformationTest() throws IOException, ParseException, java.text.ParseException {
        authorisationUserClass = new AuthorisationUserClass();
        authorisationChildClass = new AuthorisationChildClass();
        childrenAuthorisationResponseClass = new ChildrenAuthorisationResponseClass();
        childrenResponseAuthorisationModel = new ChildrenResponseAuthorisationModel();
        profileListClass = new ProfileListClass();
        addChildrenCardClass = new AddChildrenCardClass();
        profileSetClass = new ProfileSetClass();
        generationRequestJsonClass = new GenerationRequestJsonClass();
        getConditionInformation = new GetConditionInformation();
    }

    @Test
    public void getConditionInformation() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
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
        response = authorisationChildClass.authorisationChildren();
        childrenResponseAuthorisationModel = childrenAuthorisationResponseClass.childrenResponseAuthorisation(response);
        content.put("cid",childrenResponseAuthorisationModel.getCid());
        content.put("ckey",childrenResponseAuthorisationModel.getCkey());
        content.put("profile_id", profileListClass.getProfileList(content).get(0).getProfile_id());
        profileSetClass.selectProfileCardResponse(content);
        response = getConditionInformation.getConditionInformationResponse(generationRequestJsonClass.getGenerationRequestJson(content));
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": true") && response.code() == 200);
    }


}

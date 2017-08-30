package ChildrenTests;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.Authorisation.ChildrenAuthorisationResponseClass;
import com.dubtsov._2bsafe.Childrens.HelpMe.GenerateRequestJsonHelpMeClass;
import com.dubtsov._2bsafe.Childrens.HelpMe.HelpMeClass;
import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Childrens.NotifyChangeApp.GeneratedRequestJsonClass;
import com.dubtsov._2bsafe.Childrens.NotifyChangeApp.NotifyChangeAppClass;
import com.dubtsov._2bsafe.Childrens.PackageProcessingCommands.GenerateJsonPackageProcessingCommandClass;
import com.dubtsov._2bsafe.Childrens.PackageProcessingCommands.PackageProcessingCommandsClass;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileListClass;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileSetClass;
import com.dubtsov._2bsafe.Childrens.RulesTrigger.GeneratedJsonRulesTriggerClass;
import com.dubtsov._2bsafe.Childrens.RulesTrigger.RulesTriggerClass;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.AddChildrenCardClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 24.08.17.
 */
public class HelpMeTest extends BaseClass{
    HashMap content = new LinkedHashMap();

    public HelpMeTest() throws IOException {
        generatedRequestJsonClass = new GeneratedRequestJsonClass();
        authorisationUserClass = new AuthorisationUserClass();
        addChildrenCardClass = new AddChildrenCardClass();
        authorisationChildClass = new AuthorisationChildClass();
        childrenResponseAuthorisationModel = new ChildrenResponseAuthorisationModel();
        childrenAuthorisationResponseClass = new ChildrenAuthorisationResponseClass();
        notifyChangeAppClass = new NotifyChangeAppClass();
        profileListClass = new ProfileListClass();
        profileSetClass = new ProfileSetClass();
        helpMeClass = new HelpMeClass();
    }

    @Test
    public void helpMe() throws Exception {
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
        response = authorisationChildClass.authorisationChildren(content);
        childrenResponseAuthorisationModel = childrenAuthorisationResponseClass.childrenResponseAuthorisation(response);
        content.put("cid",childrenResponseAuthorisationModel.getCid());
        content.put("ckey",childrenResponseAuthorisationModel.getCkey());
        content.put("profile_id", profileListClass.getProfileList(content).get(0).getProfile_id());
        profileSetClass.selectProfileCardResponse(content);

        response = helpMeClass.helpMe(GenerateRequestJsonHelpMeClass.generatedJsonHelpMe(content));
        String result = response.body().string();
        System.out.println("RESULT " + result);
        Assert.assertTrue(result.contains("\"scs\": true") && response.code() == 200);
    }
}

package ChildrenTests;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Childrens.NotifyChangeApp.GenerateNotifyChangeAppContent;
import com.dubtsov._2bsafe.Childrens.NotifyChangeApp.NotifyChangeAppClass;
import com.dubtsov._2bsafe.Childrens.PackageProcessingCommands.PackageProcessingCommandsClass;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileClass;
import com.dubtsov._2bsafe.Childrens.RulesTrigger.GeneratedRulesTriggerContent;
import com.dubtsov._2bsafe.Childrens.RulesTrigger.RulesTriggerClass;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.ChildrenCardClass;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 24.08.17.
 */
public class PackageProcessingCommandsTest extends BaseClass{

    public PackageProcessingCommandsTest() throws IOException, ParseException, java.text.ParseException {
        authorisationUserClass = new AuthorisationUserClass();
        childrenCardClass = new ChildrenCardClass();
        authorisationChildClass = new AuthorisationChildClass();
        packageProcessingCommandsClass = new PackageProcessingCommandsClass();
    }

    @Ignore
    @Test
    public void packageProcessingCommands() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        childrenCardClass.addChildrenCard();
        authorisationChildClass.authorisationChildren();
        response = packageProcessingCommandsClass.packageProcessingCommands();
        String result = response.body().string();
        System.out.println("RESULT " + result);
        Assert.assertTrue(result.contains("\"scs\": true") && response.code() == 200);
    }
}

package ParentsTests;

import ChildrenTests.LogoutTest;
import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.HelpMe.GenerateHelpMeContent;
import com.dubtsov._2bsafe.Childrens.RulesTrigger.GeneratedRulesTriggerContent;
import com.dubtsov._2bsafe.Parents.Functions.Account.AccountSettingClass;
import com.dubtsov._2bsafe.Parents.Functions.Account.GenerateAccountContent;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.ChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.Logout.LogoutClass;
import com.dubtsov._2bsafe.Parents.Models.AccountSettings;
import com.dubtsov._2bsafe.Parents.Models.ChildrenCard;
import com.dubtsov._2bsafe.Parents.Pool.*;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import junitparams.naming.TestCaseName;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 30.08.17.
 */
@RunWith(JUnitParamsRunner.class)
public class AccountSettingsTest extends BaseClass{

    public AccountSettingsTest() throws IOException, ParseException, java.text.ParseException {}

    @Before
    public void before() throws Exception {
        authorisationChildClass = new AuthorisationChildClass();
        authorisationUserClass = new AuthorisationUserClass();
        childrenCardClass = new ChildrenCardClass();
        setAccountSettingClass = new AccountSettingClass();
        accountSettingClass = new AccountSettingClass();

        authorisationUserClass.RegistrationAndAuthorisationWeb();
        childrenCardClass.addChildrenCard();
        authorisationChildClass.authorisationChildren();
    }
    @Test
    public void getAccountSettings() throws Exception {
        AccountSettings accountSettings = accountSettingClass.getAccountSetting();
        System.out.println(accountSettings.toString());
        Assert.assertTrue(accountSettings.getScs().equals("true"));
    }
}

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
        Assert.assertTrue(accountSettings.getScs().equals("true"));
    }
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateAccountContent.class)
    public void NegativeAccountSettings(JSONObject jsonObject) throws Exception {
        AccountSettings accountSettings = accountSettingClass.NegativeGetAccountSetting(jsonObject);
        System.out.println("accountSettings " + accountSettings);
        Assert.assertTrue(accountSettings.getScs().equals("false"));
    }


    @Test
    public void setAccountSettings() throws Exception {
        AccountSettings accountSettingsBefore = accountSettingClass.getAccountSetting();
        response = setAccountSettingClass.setAccountSetting();
        AccountSettings accountSettingsAfter = accountSettingClass.getAccountSetting();
        Assert.assertTrue(accountSettingsBefore != accountSettingsAfter && accountSettingsAfter.getNbat() == 1);
    }
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateAccountContent.class)
    public void NegativeSetAccountSettings(JSONObject jsonObject) throws Exception {
        response = setAccountSettingClass.NegativeSetAccountSetting(jsonObject);
        String result = response.body().string();
        System.out.println("RESULT " + result);
        Assert.assertTrue(result.contains("\"scs\": false"));
    }


    @Test
    public void setAllAccountSettings() throws Exception {
        AccountSettings accountSettingsBefore = accountSettingClass.getAccountSetting();
        response = setAccountSettingClass.setAllAccountSetting();
        AccountSettings accountSettingsAfter = accountSettingClass.getAccountSetting();
        System.out.println("accountSettingsBefore " + accountSettingsBefore.toString());
        System.out.println("accountSettingsAfter " + accountSettingsAfter.toString());
        Assert.assertTrue(accountSettingsBefore != accountSettingsAfter &&
                accountSettingsAfter.getLbat() == 1 &&
                accountSettingsAfter.getNbat() == 1 &&
                accountSettingsAfter.getLsig() == 1 &&
                accountSettingsAfter.getNsig() == 1 &&
                accountSettingsAfter.getLunav() == 1 &&
                accountSettingsAfter.getNunav() == 1 &&
                accountSettingsAfter.getNph() == 1 &&
                accountSettingsAfter.getNsms() == 1 &&
                accountSettingsAfter.getNgps() == 1 &&
                accountSettingsAfter.getName().equals("Толян"));
    }
}

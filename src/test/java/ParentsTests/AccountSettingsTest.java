package ParentsTests;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Parents.Functions.Account.AccountSettingClass;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.ChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Models.AccountSettings;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 30.08.17.
 */
public class AccountSettingsTest extends BaseClass{

    public AccountSettingsTest() throws IOException, ParseException, java.text.ParseException {
        authorisationChildClass = new AuthorisationChildClass();
        authorisationUserClass = new AuthorisationUserClass();
        childrenCardClass = new ChildrenCardClass();
        setAccountSettingClass = new AccountSettingClass();
        accountSettingClass = new AccountSettingClass();
    }

    @Before
    public void before() throws Exception {
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
    public void setAccountSettings() throws Exception {
        AccountSettings accountSettingsBefore = accountSettingClass.getAccountSetting();
        response = setAccountSettingClass.setAccountSetting();
        AccountSettings accountSettingsAfter = accountSettingClass.getAccountSetting();
        Assert.assertTrue(accountSettingsBefore != accountSettingsAfter && accountSettingsAfter.getNbat() == 1);
    }

    @Ignore
    @Test
    public void setAllAccountSettings() throws Exception {
        AccountSettings accountSettingsBefore = accountSettingClass.getAccountSetting();
        response = setAccountSettingClass.setAllAccountSetting();
        AccountSettings accountSettingsAfter = accountSettingClass.getAccountSetting();
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

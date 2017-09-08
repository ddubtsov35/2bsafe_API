package ParentsTests;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Parents.Functions.Account.AccountSettingClass;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.AddChildrenCardClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Models.AccountSettings;
import com.dubtsov._2bsafe.Parents.Parse.GetAccountSetting;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 30.08.17.
 */
public class AccountSettingsTest extends BaseClass{

    HashMap content = new LinkedHashMap();

    public AccountSettingsTest() throws IOException, ParseException, java.text.ParseException {
        authorisationChildClass = new AuthorisationChildClass();
        authorisationUserClass = new AuthorisationUserClass();
        addChildrenCardClass = new AddChildrenCardClass();
        setAccountSettingClass = new AccountSettingClass();
        accountSettingClass = new AccountSettingClass();
    }

    @Test
    public void getAccountSettings() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addChildrenCardClass.addChildrenCard();
        authorisationChildClass.authorisationChildren();
        AccountSettings accountSettings = accountSettingClass.getAccountSetting();
        Assert.assertTrue(accountSettings.getScs().equals("true"));
    }

    @Test
    public void setAccountSettings() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addChildrenCardClass.addChildrenCard();
        authorisationChildClass.authorisationChildren();
        response = setAccountSettingClass.setAccountSetting();
        String res = response.body().string();
        System.out.println("res " + res);
        AccountSettings accountSettings = accountSettingClass.getAccountSetting();
        Assert.assertTrue(accountSettings.getNbat() == 2);
    }

    @Test
    public void setAllAccountSettings() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addChildrenCardClass.addChildrenCard();
        authorisationChildClass.authorisationChildren();
        response = setAccountSettingClass.setAllAccountSetting();
        AccountSettings accountSettings = accountSettingClass.getAccountSetting();
        Assert.assertTrue(accountSettings.getLbat() == 2 &&
                accountSettings.getNbat() == 2 &&
                accountSettings.getLsig() == 2 &&
                accountSettings.getNsig() == 2 &&
                accountSettings.getLunav() == 2 &&
                accountSettings.getNunav() == 2 &&
                accountSettings.getNph() == 2 &&
                accountSettings.getNsms() == 2 &&
                accountSettings.getNgps() == 2 &&
                accountSettings.getName().equals("Толян"));
    }
}

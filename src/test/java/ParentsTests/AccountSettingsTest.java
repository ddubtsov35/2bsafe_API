package ParentsTests;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Parents.Functions.Account.AccountSettingClass;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.AddChildrenCardClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Models.AccountSettings;
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
    public AccountSettingsTest() throws IOException {
    }

/*    HashMap content = new LinkedHashMap();

    public AccountSettingsTest() throws IOException, ParseException, java.text.ParseException {
        authorisationChildClass = new AuthorisationChildClass();
        authorisationUserClass = new AuthorisationUserClass();
        addChildrenCardClass = new AddChildrenCardClass();
        getAccountSettingsClass = new GetAccountSettingsClass();
        setAccountSettingClass = new AccountSettingClass();
    }

    @Test
    public void getAccountSettings() throws Exception {
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
        authorisationChildClass.authorisationChildren(content);
        content.put("rnd", GenerateTokenClass.getGeneratedToken());
        AccountSettings accountSettings = getAccountSettingsClass.getAccountSetting(content);
        Assert.assertTrue(accountSettings.getScs().equals("true"));
    }

    @Test
    public void setAccountSettings() throws Exception {
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
        authorisationChildClass.authorisationChildren(content);
        content.clear();
        content.put("rnd", GenerateTokenClass.getGeneratedToken());
        content.put("nbat", 2);
        response = setAccountSettingClass.setAccountSetting(content);
        String res = response.body().string();
        System.out.println("res " + res);
        AccountSettings accountSettings = getAccountSettingsClass.getAccountSetting(content);
        Assert.assertTrue(accountSettings.getNbat() == 2);
    }

    @Test
    public void setAllAccountSettings() throws Exception {
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
        authorisationChildClass.authorisationChildren(content);
        content.clear();
        content.put("rnd", GenerateTokenClass.getGeneratedToken());
        content.put("lbat", 2);
        content.put("nbat", 2);
        content.put("lsig", 2);
        content.put("nsig", 2);
        content.put("lunav", 2);
        content.put("nunav", 2);
        content.put("nph", 2);
        content.put("nsms", 2);
        content.put("ngps", 2);
        content.put("name", "Толян");
        response = setAccountSettingClass.setAllAccountSetting(content);
        String res = response.body().string();
        System.out.println("res " + res);
        AccountSettings accountSettings = getAccountSettingsClass.getAccountSetting(content);
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
    }*/
}

package ParentsTests;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Childrens.NotifyChangeApp.GenerateNotifyChangeAppContent;
import com.dubtsov._2bsafe.Childrens.NotifyChangeApp.NotifyChangeAppClass;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileClass;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.ChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.Rules.*;
import com.dubtsov._2bsafe.Parents.Functions.TurboButton.TurboButtonClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Models.GetRulesModel;
import com.dubtsov._2bsafe.Parents.Models.SetRulesModel;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 29.08.17.
 */
public class RulesTest extends BaseClass{

    public RulesTest() throws IOException, ParseException, java.text.ParseException {
        generatedRequestJsonClass = new GenerateNotifyChangeAppContent();
        authorisationUserClass = new AuthorisationUserClass();
        childrenCardClass = new ChildrenCardClass();
        authorisationChildClass = new AuthorisationChildClass();
        childrenResponseAuthorisationModel = new ChildrenResponseAuthorisationModel();
        notifyChangeAppClass = new NotifyChangeAppClass();
        profileClass = new ProfileClass();
        turboButtonClass = new TurboButtonClass();
        rulesClass = new RulesClass();
    }

    @Before
    public void before() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        childrenCardClass.addChildrenCard();
        authorisationChildClass.authorisationChildren();
    }

    @Test
    public void getRules() throws Exception {
        profileClass.selectProfileCardResponse();
        response = rulesClass.getRulesListResponse();
        String result = response.body().string();

        Assert.assertTrue(result.contains("\"scs\": true") && response.code() == 200);
    }

    @Test
    public void getRulesByProfile() throws Exception {
        profileClass.selectProfileCardResponse();
        response = rulesClass.getRulesByProfileResponse();
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": true") && response.code() == 200);
    }

    @Test
    public void addRule() throws Exception {
        int beforeRulesCount = rulesClass.getRulesList().size();
        SetRulesModel setRulesModel = rulesClass.addRule();
        System.out.println("setRulesModel " + setRulesModel.toString());
        int afterRulesCount = rulesClass.getRulesList().size();
        Assert.assertTrue(afterRulesCount - beforeRulesCount == 1);
    }

    @Test
    public void switchRule() throws Exception {
        response = rulesClass.switchRules();
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": true") && response.code() == 200);
    }

    @Test
    public void deleteRule() throws Exception {
        response = rulesClass.deleteRules();
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": true") && response.code() == 200);
    }
}

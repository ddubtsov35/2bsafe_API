package ParentsTests;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Childrens.NotifyChangeApp.GenerateNotifyChangeAppContent;
import com.dubtsov._2bsafe.Childrens.NotifyChangeApp.NotifyChangeAppClass;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileClass;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.ChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.Registration.GenerateRegistrationContent;
import com.dubtsov._2bsafe.Parents.Functions.Rules.*;
import com.dubtsov._2bsafe.Parents.Functions.TurboButton.TurboButtonClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Models.GetRulesModel;
import com.dubtsov._2bsafe.Parents.Models.SetRulesModel;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import junitparams.naming.TestCaseName;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 29.08.17.
 */
@RunWith(JUnitParamsRunner.class)
public class RulesTest extends BaseClass{

    public RulesTest() throws IOException, ParseException, java.text.ParseException {}

    @Before
    public void before() throws Exception {
        generatedRequestJsonClass = new GenerateNotifyChangeAppContent();
        authorisationUserClass = new AuthorisationUserClass();
        childrenCardClass = new ChildrenCardClass();
        authorisationChildClass = new AuthorisationChildClass();
        childrenResponseAuthorisationModel = new ChildrenResponseAuthorisationModel();
        notifyChangeAppClass = new NotifyChangeAppClass();
        profileClass = new ProfileClass();
        turboButtonClass = new TurboButtonClass();
        rulesClass = new RulesClass();

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
    public void NegativeGetRules() throws Exception {
        response = rulesClass.getRulesListResponse();
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("\"scs\": false"));
    }




    @Test
    public void getRulesByProfile() throws Exception {
        profileClass.selectProfileCardResponse();
        response = rulesClass.getRulesByProfileResponse();
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": true") && response.code() == 200);
    }
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateRequestAddRule.class)
    public void NegativeGetRulesByProfile(JSONObject jsonObject) throws Exception {
        profileClass.selectProfileCardResponse();
        response = rulesClass.NegativeGetRulesByProfileResponse(jsonObject);
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("\"scs\": false"));
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
    public void addRule2() throws Exception {
        SetRulesModel setRulesModel = rulesClass.addRule();
        Assert.assertTrue(setRulesModel.getScs().equals("true"));
    }
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateRequestAddRule.class)
    public void NegativeAddRule(JSONObject jsonObject) throws Exception {
        SetRulesModel setRulesModel = rulesClass.NegativeAddRule(jsonObject);
        Assert.assertTrue(setRulesModel.getScs().equals("false"));
    }





    @Test
    public void switchRule() throws Exception {
        response = rulesClass.switchRules();
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("\"scs\": true") && response.code() == 200);
    }
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateRequestAddRule.class)
    public void NegativeSwitchRule(JSONObject jsonObject) throws Exception {
        response = rulesClass.NegativeSwitchRules(jsonObject);
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": false"));
    }





    @Test
    public void deleteRule() throws Exception {
        response = rulesClass.deleteRules();
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": true") && response.code() == 200);
    }
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateRequestAddRule.class)
    public void NegativeDeleteRule(JSONObject jsonObject) throws Exception {
        response = rulesClass.NegativeDeleteRules(jsonObject);
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": false"));
    }
}
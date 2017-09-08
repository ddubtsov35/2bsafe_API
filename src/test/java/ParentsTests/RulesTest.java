package ParentsTests;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.Authorisation.ChildrenAuthorisationResponseClass;
import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Childrens.NotifyChangeApp.GeneratedRequestJsonClass;
import com.dubtsov._2bsafe.Childrens.NotifyChangeApp.NotifyChangeAppClass;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileListClass;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileSetClass;
import com.dubtsov._2bsafe.Childrens.RulesTrigger.GeneratedJsonRulesTriggerClass;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.AddChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.Rules.*;
import com.dubtsov._2bsafe.Parents.Functions.TurboButton.GetTurboButtonClass;
import com.dubtsov._2bsafe.Parents.Functions.TurboButton.SetTurboButtonClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Models.RulesModel;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 29.08.17.
 */
public class RulesTest extends BaseClass{
    HashMap content = new LinkedHashMap();
    RulesModel rulesModel;

    public RulesTest() throws IOException, ParseException, java.text.ParseException {
        generatedRequestJsonClass = new GeneratedRequestJsonClass();
        authorisationUserClass = new AuthorisationUserClass();
        addChildrenCardClass = new AddChildrenCardClass();
        authorisationChildClass = new AuthorisationChildClass();
        childrenResponseAuthorisationModel = new ChildrenResponseAuthorisationModel();
        childrenAuthorisationResponseClass = new ChildrenAuthorisationResponseClass();
        notifyChangeAppClass = new NotifyChangeAppClass();
        profileListClass = new ProfileListClass();
        profileSetClass = new ProfileSetClass();
        getTurboButtonClass = new GetTurboButtonClass();
        setTurboButtonClass = new SetTurboButtonClass();
        rulesListClass = new GetRulesListClass();
        addRulesClass = new AddRulesClass();
        switchRuleClass = new SwitchRuleClass();
        ruleDeleteClass = new RuleDeleteClass();
    }

    @Test
    public void getRules() throws Exception {
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

        response = rulesListClass.getRulesListResponse();
        String result = response.body().string();

        Assert.assertTrue(result.contains("\"scs\": true") && response.code() == 200);
    }

    @Test
    public void getRulesByProfile() throws Exception {
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

        content.put("rule_id",0);
        response = rulesListClass.getRulesByProfileResponse(content);
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": true") && response.code() == 200);
    }

    @Test
    public void addRule() throws Exception {
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

        int beforeRulesCount = rulesListClass.getRulesList().size();
        response = addRulesClass.addRule(GenerateRequestAddRule.generatedJsonRules(content));
        String result = response.body().string();
        System.out.println("result " + result);
        int afterRulesCount = rulesListClass.getRulesList().size();

        Assert.assertTrue(afterRulesCount - beforeRulesCount == 1);
    }

    @Test
    public void switchRule() throws Exception {
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
        content.put("enabled", 1);

        content.put("rule_id", addRulesClass.getRuleId(addRulesClass.addRule(GenerateRequestAddRule.generatedJsonRules(content))));
        response = switchRuleClass.switchRules(content);

        String result = response.body().string();

        Assert.assertTrue(result.contains("\"scs\": true") && response.code() == 200);
    }

    @Test
    public void deleteRule() throws Exception {
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

        content.put("rule_id", addRulesClass.getRuleId(addRulesClass.addRule(GenerateRequestAddRule.generatedJsonRules(content))));

        System.out.println("qweqweqwe1 " + rulesListClass.getRulesList().size());

        response = ruleDeleteClass.deleteRules(content);

        System.out.println("qweqweqwe2 " + rulesListClass.getRulesList().size());

        String result = response.body().string();

        Assert.assertTrue(result.contains("\"scs\": true") && response.code() == 200);
    }
}

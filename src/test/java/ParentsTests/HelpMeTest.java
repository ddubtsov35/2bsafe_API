package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.AddAndSelectChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.HelpMe.GenerateSetHelpMeJson;
import com.dubtsov._2bsafe.Parents.Functions.HelpMe.HelpMeParentClass;
import com.dubtsov._2bsafe.Parents.Models.AddIntervalBlock;
import com.dubtsov._2bsafe.Parents.Models.GroupApp;
import com.dubtsov._2bsafe.Parents.Models.HelpMe;
import com.dubtsov._2bsafe.Parents.Models.IntervalBlock;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by user on 31.08.17.
 */
public class HelpMeTest extends BaseClass {

    HashMap content = new LinkedHashMap();
    HelpMe helpMe;

    public HelpMeTest() throws IOException {
        helpMeParentClass = new HelpMeParentClass();
        authorisationUserClass = new AuthorisationUserClass();
        addAndSelectChildrenCardClass = new AddAndSelectChildrenCardClass();
    }

    @Test
    public void getHelpMe() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        content = addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        helpMe = helpMeParentClass.getHelpMe(content);
        System.out.println(helpMe.toString());
        Assert.assertTrue(helpMe.getScs().equals("true"));
    }

    @Test
    public void setHelpMe() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        content = addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        content.put("state",0);
        content.put("push",0);
        content.put("phone","79181111111");
        content.put("default",true);
        content.put("phone","79182222222");
        response = helpMeParentClass.setHelpMe(GenerateSetHelpMeJson.generatedAddGroup(content));
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("\"scs\": true") &&  response.code() == 200);
    }
}

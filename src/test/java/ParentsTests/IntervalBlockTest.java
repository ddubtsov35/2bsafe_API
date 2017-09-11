package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.AddAndSelectChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.GroupsApp.GroupsAppClass;
import com.dubtsov._2bsafe.Parents.Functions.IntervalBlock.GenerateAddBlockIntervalJson;
import com.dubtsov._2bsafe.Parents.Functions.IntervalBlock.IntervalBlockClass;
import com.dubtsov._2bsafe.Parents.Models.AddIntervalBlock;
import com.dubtsov._2bsafe.Parents.Models.GroupApp;
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
public class IntervalBlockTest extends BaseClass{

    HashMap content = new LinkedHashMap();
    List<IntervalBlock> intervalBlock;
    GroupApp groupApp;
    AddIntervalBlock addIntervalBlock;

    public IntervalBlockTest() throws IOException, ParseException, java.text.ParseException {
        authorisationUserClass = new AuthorisationUserClass();
        addAndSelectChildrenCardClass = new AddAndSelectChildrenCardClass();
        intervalBlockClass = new IntervalBlockClass();
        groupsAppClass = new GroupsAppClass();
    }

    @Test
    public void getIntervalBlockList() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        content.put("aliases", "qwe");
        content.put("name", "testName");
        groupApp = groupsAppClass.addGroupApp(GenerateSetGroupContent.generatedJsonRules(content));
        System.out.println(groupApp.toString());
        content.put("group_id", groupApp.getGroup_id());
        content.put("alias", "alias");
        intervalBlock = intervalBlockClass.getIntervalBlockList(content);
        System.out.println(intervalBlock.toString());
        Assert.assertTrue(intervalBlock.get(0).getScs().equals("true"));
    }

    @Test
    public void addIntervalBlockList() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        content.put("aliases", "qwe");
        content.put("name", "testName");
        groupApp = groupsAppClass.addGroupApp(GenerateSetGroupContent.generatedJsonRules(content));
        System.out.println(groupApp.toString());
        content.put("group_id", groupApp.getGroup_id());
        content.put("alias", "alias");
        content.put("type", 2);
        content.put("name", "TestName");
        content.put("repeat", 2);
        content.put("interval_start", "2001-12-12");
        content.put("interval_end", "2001-12-12");
        addIntervalBlock = intervalBlockClass.addIntervalBlockList(GenerateAddBlockIntervalJson.generatedAddBlockInterval(content));
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("\"scs\": true") &&  response.code() == 200);
    }

    @Test
    public void editIntervalBlockList() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        content.put("aliases", "qwe");
        content.put("name", "testName");
        groupApp = groupsAppClass.addGroupApp(GenerateSetGroupContent.generatedJsonRules(content));
        System.out.println(groupApp.toString());
        content.put("group_id", groupApp.getGroup_id());
        content.put("alias", "alias");
        content.put("type", 2);
        content.put("name", "TestName");
        content.put("repeat", 2);
        content.put("interval_start", "2001-12-12");
        content.put("interval_end", "2001-12-12");
        response = intervalBlockClass.editIntervalBlockList(content);
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("\"scs\": true") &&  response.code() == 200);
    }

    @Test
    public void deleteIntervalBlockList() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        content.put("aliases", "qwe");
        content.put("name", "testName");
        groupApp = groupsAppClass.addGroupApp(GenerateSetGroupContent.generatedJsonRules(content));
        System.out.println(groupApp.toString());
        content.put("group_id", groupApp.getGroup_id());
        content.put("alias", "alias");
        content.put("type", 2);
        content.put("name", "TestName");
        content.put("repeat", 2);
        content.put("interval_start", "2001-12-12");
        content.put("interval_end", "2001-12-12");
        addIntervalBlock = intervalBlockClass.addIntervalBlockList(GenerateAddBlockIntervalJson.generatedAddBlockInterval(content));
        content.put("interval_id", addIntervalBlock.getIntervals());
        response = intervalBlockClass.deleteIntervalBlockList(content);
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("\"scs\": true") &&  response.code() == 200);
    }
}

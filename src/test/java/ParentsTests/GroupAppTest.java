package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.AddAndSelectChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.AddChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.GroupsApp.GenerateAddGroupJson;
import com.dubtsov._2bsafe.Parents.Functions.GroupsApp.GenerateSetGroupJson;
import com.dubtsov._2bsafe.Parents.Functions.GroupsApp.GroupsAppClass;
import com.dubtsov._2bsafe.Parents.Functions.Push.PushClass;
import com.dubtsov._2bsafe.Parents.Models.AddSession;
import com.dubtsov._2bsafe.Parents.Models.GroupApp;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by user on 31.08.17.
 */
public class GroupAppTest extends BaseClass{

    HashMap content = new LinkedHashMap();
    GroupApp groupApp;
    List<String> aliases = new LinkedList<>();

    public GroupAppTest() throws IOException {
        addChildrenCardClass = new AddChildrenCardClass();
        authorisationUserClass = new AuthorisationUserClass();
        addAndSelectChildrenCardClass = new AddAndSelectChildrenCardClass();
        groupsAppClass = new GroupsAppClass();

    }

    @Test
    public void setGroupApp() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        content = addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        content.put("aliases", "TestAliases");
        content.put("group_id", 2);
        response = groupsAppClass.setGroupApp(GenerateSetGroupJson.generatedJsonRules(content));
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("\"scs\": true") &&  response.code() == 200);
    }

    @Test
    public void addGroupApp() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        content = addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        content.put("aliases", "TestAliases");
        content.put("name", "testName");
        groupApp = groupsAppClass.addGroupApp(GenerateAddGroupJson.generatedAddGroup(content));
        System.out.println(groupApp.toString());
        Assert.assertTrue(groupApp.getScs().equals("true") && groupApp.getGroup_id() != 0);
    }

    @Test
    public void editGroupApp() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        content = addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        content.put("aliases", "TestAliases");
        content.put("name", "testName");
        groupApp = groupsAppClass.addGroupApp(GenerateAddGroupJson.generatedAddGroup(content));
        content.put("blocked", false);
        content.put("name", "EditedName");
        content.put("group_id", groupApp.getGroup_id());
        response = groupsAppClass.editGroupApp(content);
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": true") &&  response.code() == 200);
    }

    @Test
    public void deleteGroupApp() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        content = addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        content.put("aliases", "TestAliases");
        content.put("name", "testName");
        groupApp = groupsAppClass.addGroupApp(GenerateAddGroupJson.generatedAddGroup(content));
        content.put("group_id", groupApp.getGroup_id());
        response = groupsAppClass.deleteGroupApp(content);
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": true") &&  response.code() == 200);
    }
}

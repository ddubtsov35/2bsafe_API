package ParentsTests;

import com.dubtsov._2bsafe.Childrens.Models.ConditionInformationFromDevice;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.AddAndSelectChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.ChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.GroupsApp.GroupsAppClass;
import com.dubtsov._2bsafe.Parents.Models.GroupApp;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Before;
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

    GroupApp groupApp;

    public GroupAppTest() throws IOException, ParseException, java.text.ParseException {
        childrenCardClass = new ChildrenCardClass();
        authorisationUserClass = new AuthorisationUserClass();
        addAndSelectChildrenCardClass = new AddAndSelectChildrenCardClass();
        groupsAppClass = new GroupsAppClass();
    }

    @Before
    public void before() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
    }

    @Test
    public void setGroupApp() throws Exception {
        response = groupsAppClass.setGroupApp();
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("\"scs\": true"));
    }

    @Test
    public void addGroupApp() throws Exception {
        groupApp = groupsAppClass.addGroupApp();
        System.out.println(groupApp.toString());
        Assert.assertTrue(groupApp.getScs().equals("true") && groupApp.getGroup_id() != null);
    }

    @Test
    public void editGroupApp() throws Exception {
        groupApp = groupsAppClass.addGroupApp();
        response = groupsAppClass.editGroupApp();
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": true"));
    }

    @Test
    public void deleteGroupApp() throws Exception {
        groupApp = groupsAppClass.addGroupApp();
        response = groupsAppClass.deleteGroupApp(groupApp);
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": true"));
    }
}

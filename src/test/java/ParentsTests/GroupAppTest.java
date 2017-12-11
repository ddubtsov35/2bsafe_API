package ParentsTests;

import com.dubtsov._2bsafe.Childrens.Models.ConditionInformationFromDevice;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.AddAndSelectChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.ChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.GroupsApp.GenerateGroupContent;
import com.dubtsov._2bsafe.Parents.Functions.GroupsApp.GroupsAppClass;
import com.dubtsov._2bsafe.Parents.Functions.IntervalUpdate.GenerateIntervalUpdateContent;
import com.dubtsov._2bsafe.Parents.Models.GroupApp;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import junitparams.naming.TestCaseName;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by user on 31.08.17.
 */
@RunWith(JUnitParamsRunner.class)
public class GroupAppTest extends BaseClass{

    GroupApp groupApp;

    public GroupAppTest() throws IOException, ParseException, java.text.ParseException {}

    @Before
    public void before() throws Exception {
        childrenCardClass = new ChildrenCardClass();
        authorisationUserClass = new AuthorisationUserClass();
        addAndSelectChildrenCardClass = new AddAndSelectChildrenCardClass();
        groupsAppClass = new GroupsAppClass();
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

    @Ignore
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateGroupContent.class)
    public void NegativeChangeChildrenCardsPhone(JSONObject jsonObject) throws Exception {
        response = groupsAppClass.NegativeSetGroupApp(jsonObject);
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("\"scs\": false"));
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

    @Ignore
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateGroupContent.class)
    public void NegativeAddGroupApp(JSONObject jsonObject) throws Exception {
        groupApp = groupsAppClass.addGroupApp();
        response = groupsAppClass.NegativeEditGroupApp(jsonObject);
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": false"));
    }




    @Test
    public void deleteGroupApp() throws Exception {
        groupApp = groupsAppClass.addGroupApp();
        response = groupsAppClass.deleteGroupApp(groupApp);
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": true"));
    }

    @Ignore
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateGroupContent.class)
    public void NegativeDeleteGroupApp(JSONObject jsonObject) throws Exception {
        groupApp = groupsAppClass.addGroupApp();
        response = groupsAppClass.NegativeDeleteGroupApp(jsonObject);
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": false"));
    }
}

package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.AddAndSelectChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.GroupsApp.GroupsAppClass;
import com.dubtsov._2bsafe.Parents.Functions.IntervalBlock.GenerateData.*;
import com.dubtsov._2bsafe.Parents.Functions.IntervalBlock.IntervalBlockClass;
import com.dubtsov._2bsafe.Parents.Models.AddIntervalBlock;
import com.dubtsov._2bsafe.Parents.Models.GroupApp;
import com.dubtsov._2bsafe.Parents.Models.IntervalBlock;
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
import java.util.List;

/**
 * Created by user on 31.08.17.
 */
@RunWith(JUnitParamsRunner.class)
public class IntervalBlockTest extends BaseClass {
    List<IntervalBlock> intervalBlock;
    GroupApp groupApp;
    AddIntervalBlock addIntervalBlock;
    IntervalBlockClass intervalBlockClass;

    public IntervalBlockTest() throws IOException, ParseException, java.text.ParseException {}

    @Before
    public void before() throws Exception {
        authorisationUserClass = new AuthorisationUserClass();
        addAndSelectChildrenCardClass = new AddAndSelectChildrenCardClass();
        intervalBlockClass = new IntervalBlockClass();
        groupsAppClass = new GroupsAppClass();
        intervalBlockClass = new IntervalBlockClass();

        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
    }

    @Test
    public void getIntervalBlockList() throws Exception {
        intervalBlockClass.addIntervalBlockList();
        intervalBlock = intervalBlockClass.getIntervalBlockList();
        System.out.println("result " + intervalBlock.toString());
        Assert.assertTrue(intervalBlock.size() > 0);
    }

    @Test
    @TestCaseName("{0}")
    @Parameters(source = ProvideGetListInterval.class)
    public void NegativeGetIntervalBlockList(JSONObject jsonObject) throws Exception {
        intervalBlockClass.addIntervalBlockList();
        intervalBlock = intervalBlockClass.NegativeGetIntervalBlockList(jsonObject);
        System.out.println("result " + intervalBlock.toString());
        Assert.assertTrue(intervalBlock.size() == 0);
    }



    @Test
    public void addIntervalBlockList() throws Exception {
        groupApp = groupsAppClass.addGroupApp();
        addIntervalBlock = intervalBlockClass.addIntervalBlockList();
        System.out.println("result " + addIntervalBlock.toString());
        Assert.assertTrue(addIntervalBlock.getScs().equals("true"));
    }

    @Test
    @TestCaseName("{0}")
    @Parameters(source = ProvideAddInterval.class)
    public void NegativeAddIntervalBlockList(JSONObject jsonObject) throws Exception {
        groupApp = groupsAppClass.addGroupApp();
        addIntervalBlock = intervalBlockClass.NegativeAddIntervalBlockList(jsonObject);
        System.out.println("result " + addIntervalBlock.toString());
        Assert.assertTrue(addIntervalBlock.getScs().equals("false"));
    }




    @Test
    public void editIntervalBlockList() throws Exception {
        groupApp = groupsAppClass.addGroupApp();
        System.out.println(groupApp.toString());
        response = intervalBlockClass.editIntervalBlockList();
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("\"scs\": true") && response.code() == 200);
    }

    @Test
    @TestCaseName("{0}")
    @Parameters(source = ProvideEditInterval.class)
    public void NegativeEditIntervalBlockList(JSONObject jsonObject) throws Exception {
        groupApp = groupsAppClass.addGroupApp();
        System.out.println(groupApp.toString());
        response = intervalBlockClass.NegativeEditIntervalBlockList(jsonObject);
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("\"scs\": false"));
    }



    @Test
    public void deleteIntervalBlockList() throws Exception {
        groupApp = groupsAppClass.addGroupApp();
        addIntervalBlock = intervalBlockClass.addIntervalBlockList();
        response = intervalBlockClass.deleteIntervalBlockList();
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("\"scs\": true") && response.code() == 200);
    }

    @Test
    @TestCaseName("{0}")
    @Parameters(source = ProvideDeleteInterval.class)
    public void NegativeDeleteIntervalBlockList(JSONObject jsonObject) throws Exception {
        groupApp = groupsAppClass.addGroupApp();
        addIntervalBlock = intervalBlockClass.addIntervalBlockList();
        response = intervalBlockClass.NegativeDeleteIntervalBlockList(jsonObject);
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("\"scs\": false"));
    }
}

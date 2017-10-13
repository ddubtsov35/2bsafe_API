package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.AddAndSelectChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.GroupsApp.GroupsAppClass;
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
    List<IntervalBlock> intervalBlock;
    GroupApp groupApp;
    AddIntervalBlock addIntervalBlock;
    IntervalBlockClass intervalBlockClass;

    public IntervalBlockTest() throws IOException, ParseException, java.text.ParseException {
        authorisationUserClass = new AuthorisationUserClass();
        addAndSelectChildrenCardClass = new AddAndSelectChildrenCardClass();
        intervalBlockClass = new IntervalBlockClass();
        groupsAppClass = new GroupsAppClass();
        intervalBlockClass = new IntervalBlockClass();
    }

    @Test
    public void getIntervalBlockList() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        intervalBlockClass.addIntervalBlockList();
        intervalBlock = intervalBlockClass.getIntervalBlockList();
        System.out.println("result " +
                intervalBlock.toString());
        Assert.assertTrue(intervalBlock.size() > 0);
    }

    @Test
    public void addIntervalBlockList() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        groupApp = groupsAppClass.addGroupApp();
        addIntervalBlock = intervalBlockClass.addIntervalBlockList();
        System.out.println("result " + addIntervalBlock.toString());
        Assert.assertTrue(addIntervalBlock.getScs().equals("true"));
    }

    @Test
    public void editIntervalBlockList() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        groupApp = groupsAppClass.addGroupApp();
        System.out.println(groupApp.toString());
        response = intervalBlockClass.editIntervalBlockList();
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("\"scs\": true") &&  response.code() == 200);
    }

    @Test
    public void deleteIntervalBlockList() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        groupApp = groupsAppClass.addGroupApp();
        addIntervalBlock = intervalBlockClass.addIntervalBlockList();
        response = intervalBlockClass.deleteIntervalBlockList();
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("\"scs\": true") &&  response.code() == 200);
    }
}

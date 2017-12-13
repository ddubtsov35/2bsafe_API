package ParentsTests;

import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileClass;
import com.dubtsov._2bsafe.Parents.Functions.Account.GenerateAccountContent;
import com.dubtsov._2bsafe.Parents.Functions.Apps.AppsClass;
import com.dubtsov._2bsafe.Parents.Functions.Apps.GenerateAppsContent;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.AddAndSelectChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.GroupsApp.GenerateGroupContent;
import com.dubtsov._2bsafe.Parents.Functions.GroupsApp.GroupsAppClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Models.AccountSettings;
import com.dubtsov._2bsafe.Parents.Models.Apps;
import com.dubtsov._2bsafe.Parents.Models.AppsDetailInfo;
import com.dubtsov._2bsafe.Parents.Models.AppsInGroup;
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

/**
 * Created by user on 04.09.17.
 */
@RunWith(JUnitParamsRunner.class)
public class AppsTest extends BaseClass{

    Apps app;
    AppsInGroup appsInGroup;
    AppsDetailInfo appsDetailInfo;

    public AppsTest() throws IOException, ParseException, java.text.ParseException {}

    @Before
    public void before() throws Exception {
        authorisationUserClass = new AuthorisationUserClass();
        addAndSelectChildrenCardClass = new AddAndSelectChildrenCardClass();
        appsClass = new AppsClass();
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
    }

    @Test
    public void getMainInfoApps() throws Exception {
        app = appsClass.getAppsInfo();
        System.out.println(app);
        Assert.assertTrue(app.getScs().contains("true"));
    }

    @Ignore
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateAppsContent.class)
    public void NegativeNotifyChangeApp(JSONObject jsonObject) throws Exception {
        app = appsClass.NegativeGetAppsInfo(jsonObject);
        System.out.println(app);
        Assert.assertTrue(app.getScs().contains("false"));
    }

    @Test
    public void getAppsInGroup() throws Exception {
        appsInGroup = appsClass.getAppsInGroup();
        System.out.println(appsInGroup.toString());
        Assert.assertTrue(appsInGroup.getScs().contains("true"));
    }

    @Ignore
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateAppsContent.class)
    public void NegativeGetAppsInGroup(JSONObject jsonObject) throws Exception {
        appsInGroup = appsClass.NegativeGetAppsInGroup(jsonObject);
        System.out.println(appsInGroup.toString());
        Assert.assertTrue(appsInGroup.getScs().equals("false"));
    }


    @Test
    public void getDetailInfo() throws Exception {
        appsDetailInfo = appsClass.getDetailInfo();
        System.out.println(appsDetailInfo.toString());
        Assert.assertTrue(appsDetailInfo.getScs().equals("true"));
    }

    @Ignore
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateAppsContent.class)
    public void NegativeGetDetailInfo(JSONObject jsonObject) throws Exception {
        appsDetailInfo = appsClass.NegativeGetDetailInfo(jsonObject);
        System.out.println(appsDetailInfo.toString());
        Assert.assertTrue(appsDetailInfo.getScs().equals("false"));
    }


    @Test
    public void getAppsBlock() throws Exception {
        response = appsClass.getAppsBlock();
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("true"));
    }

    @Ignore
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateAppsContent.class)
    public void NegativeGetAppsBlock(JSONObject jsonObject) throws Exception {
        response = appsClass.NegativeGetAppsBlock(jsonObject);
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("false"));
    }


    @Test
    public void getAppsBlockUpdate() throws Exception {
        response = appsClass.getAppsBlockUpdate();
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("true"));
    }

    @Ignore
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateAppsContent.class)
    public void NegativeGetAppsBlockUpdate(JSONObject jsonObject) throws Exception {
        response = appsClass.NegativeGetAppsBlockUpdate(jsonObject);
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("false"));
    }


    @Test
    public void getAppsUpdate() throws Exception {
        response = appsClass.getAppsUpdate();
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("true"));
    }

    @Ignore
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateAppsContent.class)
    public void NegativeGetAppsUpdate(JSONObject jsonObject) throws Exception {
        response = appsClass.NegativeGetAppsUpdate(jsonObject);
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("false"));
    }



    @Test
    public void getAppsDelete() throws Exception {
        response = appsClass.getAppsDelete();
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("\"scs\": true") && response.code() == 200);
    }

    @Ignore
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateAppsContent.class)
    public void NegativeGetAppsDelete(JSONObject jsonObject) throws Exception {
        response = appsClass.NegativeGetAppsDelete(jsonObject);
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("\"scs\": false"));
    }


}

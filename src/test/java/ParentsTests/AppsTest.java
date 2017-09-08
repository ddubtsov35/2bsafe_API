package ParentsTests;

import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileListClass;
import com.dubtsov._2bsafe.Parents.Functions.Apps.AppsClass;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.AddAndSelectChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.GroupsApp.GenerateAddGroupJson;
import com.dubtsov._2bsafe.Parents.Functions.GroupsApp.GroupsAppClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Models.Apps;
import com.dubtsov._2bsafe.Parents.Models.AppsDetailInfo;
import com.dubtsov._2bsafe.Parents.Models.AppsInGroup;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 04.09.17.
 */
public class AppsTest extends BaseClass{

    HashMap content = new LinkedHashMap();
    Apps app;
    AppsInGroup appsInGroup;
    AppsDetailInfo appsDetailInfo;

    public AppsTest() throws IOException, ParseException, java.text.ParseException {
        authorisationUserClass = new AuthorisationUserClass();
        addAndSelectChildrenCardClass = new AddAndSelectChildrenCardClass();
        appsClass = new AppsClass();
        profileListClass = new ProfileListClass();
        groupsAppClass = new GroupsAppClass();
    }

    @Test
    public void getMainInfoApps() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        content = addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        content.put("rnd", GenerateTokenClass.getGeneratedToken());
        content.put("aliases", "qwe");
        content.put("name", "qwe");
        content.put("group_id", groupsAppClass.addGroupApp(GenerateAddGroupJson.generatedAddGroup(content)).getGroup_id());
        app = appsClass.getAppsInfo();
        Assert.assertTrue(app.getScs().contains("true"));
    }

    @Test
    public void getAppsInGroup() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        content = addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        content.put("rnd", GenerateTokenClass.getGeneratedToken());
        content.put("aliases", "qwe");
        content.put("name", "qwe");
        content.put("group_id", groupsAppClass.addGroupApp(GenerateAddGroupJson.generatedAddGroup(content)).getGroup_id());
        appsInGroup = appsClass.getAppsInGroup();
        System.out.println(appsInGroup.toString());
        Assert.assertTrue(appsInGroup.getScs().contains("true"));
    }

    @Test
    public void getDetailInfo() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        content = addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        content.put("aliases", "qwe");
        appsDetailInfo = appsClass.getDetailInfo();
        System.out.println(appsDetailInfo.toString());
        Assert.assertTrue(appsDetailInfo.getScs().contains("true"));
    }

    @Test
    public void getAppsBlock() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        content = addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        content.put("aliases", "qwe");
        content.put("block", "0");
        response = appsClass.getAppsBlock();
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("true"));
    }

    @Test
    public void getAppsBlockUpdate() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        content = addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        content.put("aliases", "qwe");
        content.put("block", "0");
        response = appsClass.getAppsBlockUpdate();
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("true"));
    }

    @Test
    public void getAppsUpdate() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        content = addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        content.put("aliases", "qwe");
        response = appsClass.getAppsUpdate();
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("true"));
    }

    @Test
    public void getAppsDelete() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        content = addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        content.put("aliases", "qwe");
        response = appsClass.getAppsDelete();
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("\"scs\": false") && response.code() == 200);
    }



}

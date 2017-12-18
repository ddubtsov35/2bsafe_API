package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.AddAndSelectChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.HelpMe.GenerateHelpMeContent;
import com.dubtsov._2bsafe.Parents.Functions.Permissions.GenerateSetPermissionContent;
import com.dubtsov._2bsafe.Parents.Functions.Permissions.PermissionsClass;
import com.dubtsov._2bsafe.Parents.Models.Permission;
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
 * Created by user on 01.09.17.
 */
@RunWith(JUnitParamsRunner.class)
public class PermissionTest extends BaseClass{

    Permission permission;

    public PermissionTest() throws IOException, ParseException, java.text.ParseException {}

    @Before
    public void before() throws Exception {
        permissionsClass = new PermissionsClass();
        authorisationUserClass = new AuthorisationUserClass();
        addAndSelectChildrenCardClass = new AddAndSelectChildrenCardClass();

        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
    }

    @Test
    public void getPermission() throws Exception {
        permission = permissionsClass.getPermission();
        System.out.println(permission.toString());
        Assert.assertTrue(permission.getScs().equals("true"));
    }

    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateSetPermissionContent.class)
    public void NegativeGetPermission(JSONObject jsonObject) throws Exception {
        permission = permissionsClass.NegativeGetPermission(jsonObject);
        System.out.println(permission.toString());
        Assert.assertTrue(permission.getScs().equals("false"));
    }



    @Test
    public void setPermission() throws Exception {
        response = permissionsClass.setPermission();
        permission = permissionsClass.getPermission();
        JSONObject jsonObjectResult = GenerateSetPermissionContent.setPermissionObject;
        Assert.assertTrue(
                permission.getScs().equals("true")
                && permission.getGeo() == Integer.parseInt(jsonObjectResult.get("geo").toString())
                && permission.getDatetime() == Integer.parseInt(jsonObjectResult.get("datetime").toString())
                && permission.getWifi() == Integer.parseInt(jsonObjectResult.get("wifi").toString())
                && permission.getGsm() == Integer.parseInt(jsonObjectResult.get("gsm").toString())
                && permission.getTether() == Integer.parseInt(jsonObjectResult.get("tether").toString())
                && permission.getBt() == Integer.parseInt(jsonObjectResult.get("bt").toString()));
    }

    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateSetPermissionContent.class)
    public void NegativeGetHelpMe(JSONObject jsonObject) throws Exception {
            response = permissionsClass.NegativeSetPermission(jsonObject);
            String result = response.body().string();
            System.out.println("result " + result);
            Assert.assertTrue(result.contains("\"scs\": false"));

    }


}

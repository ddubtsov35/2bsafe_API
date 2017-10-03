package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.AddAndSelectChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.Permissions.GenerateSetPermissionContent;
import com.dubtsov._2bsafe.Parents.Functions.Permissions.PermissionsClass;
import com.dubtsov._2bsafe.Parents.Models.Permission;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 01.09.17.
 */
public class PermissionTest extends BaseClass{

    Permission permission;

    public PermissionTest() throws IOException, ParseException, java.text.ParseException {
        permissionsClass = new PermissionsClass();
        authorisationUserClass = new AuthorisationUserClass();
        addAndSelectChildrenCardClass = new AddAndSelectChildrenCardClass();
    }

    @Test
    public void getPermission() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        permission = permissionsClass.getPermission();
        System.out.println(permission.toString());
        Assert.assertTrue(permission.getScs().equals("true"));
    }

    @Test
    public void setPermission() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        response = permissionsClass.setPermission();
        String result = response.body().string();
        System.out.println("result " + result);
        permission = permissionsClass.getPermission();
        System.out.println("123 " + permission.toString());
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


}

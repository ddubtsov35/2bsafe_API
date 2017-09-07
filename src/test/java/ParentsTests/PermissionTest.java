package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.AddAndSelectChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.Permissions.PermissionsClass;
import com.dubtsov._2bsafe.Parents.Models.Permission;
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

    HashMap content = new LinkedHashMap();
    Permission permission;

    public PermissionTest() throws IOException {
        permissionsClass = new PermissionsClass();
        authorisationUserClass = new AuthorisationUserClass();
        addAndSelectChildrenCardClass = new AddAndSelectChildrenCardClass();
    }

    @Test
    public void getPermission() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        content = addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        permission = permissionsClass.getPermission(content);
        System.out.println(permission.toString());
        Assert.assertTrue(permission.getScs().equals("true"));
    }

    @Test
    public void setPermission() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        content = addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        content.put("geo", 0);
        content.put("wifi", 0);
        content.put("datetime", 0);
        content.put("bt", 0);
        content.put("tether", 0);
        content.put("gsm", 0);
        response = permissionsClass.setPermission(content);
        String result = response.body().string();
        System.out.println("result " + result);
        Assert.assertTrue(result.contains("\"scs\": true") && response.code() == 200);
    }


}

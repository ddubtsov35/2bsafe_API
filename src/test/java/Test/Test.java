package Test;

import com.dubtsov._2bsafe.Admin.GetActCode;
import com.dubtsov._2bsafe.Admin.Model.UserModel;
import com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers.ListRegisteredUsersClass;
import org.junit.Assert;

import java.io.IOException;

/**
 * Created by user on 23.11.17.
 */
public class Test {

    @org.junit.Test
    public void test() throws Exception {
        ListRegisteredUsersClass listRegisteredUsersClass = new ListRegisteredUsersClass();
        listRegisteredUsersClass.getListRegisteredUsers();
       /* GetActCode getActCode = new GetActCode();
        UserModel userModel = getActCode.getCode("www19888@p33.org");*/
        System.out.println(new GetActCode().getCode("www19888@p33.org").getAct_code());
        Assert.assertTrue(true);
    }

}

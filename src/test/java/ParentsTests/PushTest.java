package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.AddAndSelectChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.AddChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.Push.GenerateJsonNotifyList;
import com.dubtsov._2bsafe.Parents.Functions.Push.PushClass;
import com.dubtsov._2bsafe.Parents.Models.AddSession;
import com.dubtsov._2bsafe.Parents.Models.NotifyList;
import com.dubtsov._2bsafe.Parents.Parse.GetDeviceShortInfo;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 31.08.17.
 */
public class PushTest extends BaseClass {

    HashMap content = new LinkedHashMap();
    NotifyList notifyList;
    AddSession addSession;

    public PushTest() throws IOException, ParseException, java.text.ParseException {
        addChildrenCardClass = new AddChildrenCardClass();
        authorisationUserClass = new AuthorisationUserClass();
        addAndSelectChildrenCardClass = new AddAndSelectChildrenCardClass();
        pushClass = new PushClass();

    }

    @Test
    public void initSession() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        content = addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        addSession = pushClass.InitSession(content);
        System.out.println(addSession.toString());
        Assert.assertTrue(addSession.getScs().equals("true") && !addSession.getSes_key().equals(""));
    }

    @Test
    public void lockScreen() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        content = addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        content.put("text", "TestText");
        content.put("pin", "111111");
        response = pushClass.lockScreen(content);
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": true") &&  response.code() == 200);
    }

    @Test
    public void onSound() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        content = addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        response = pushClass.onSound(content);
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": true") &&  response.code() == 200);
    }

    @Test
    public void update() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        content = addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        response = pushClass.update(content);
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": true") &&  response.code() == 200);
    }

    @Ignore
    @Test
    public void updateLong() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        content = addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        response = pushClass.updateLong(content);
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": true") &&  response.code() == 200);
    }

    @Test
    public void getNotifyList() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        content = addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        notifyList = pushClass.getNotifyList(GenerateJsonNotifyList.generatedJsonRules(content));
        Assert.assertTrue(notifyList.getScs().contains("\"scs\": true"));
    }
}

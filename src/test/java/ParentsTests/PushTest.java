package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.AddAndSelectChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.ChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.FAQ.GenerateFaqContent;
import com.dubtsov._2bsafe.Parents.Functions.Push.GenerateNotifyListContent;
import com.dubtsov._2bsafe.Parents.Functions.Push.PushClass;
import com.dubtsov._2bsafe.Parents.Models.AddSession;
import com.dubtsov._2bsafe.Parents.Models.NotifyList;
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
 * Created by user on 31.08.17.
 */
@RunWith(JUnitParamsRunner.class)
public class PushTest extends BaseClass {

    NotifyList notifyList;
    AddSession addSession;

    public PushTest() throws IOException, ParseException, java.text.ParseException {}

    @Before
    public void before() throws Exception {
        childrenCardClass = new ChildrenCardClass();
        authorisationUserClass = new AuthorisationUserClass();
        addAndSelectChildrenCardClass = new AddAndSelectChildrenCardClass();
        pushClass = new PushClass();

        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
    }

    //Не используется
    @Ignore
    @Test
    public void initSession() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        addSession = pushClass.InitSession();
        System.out.println(addSession.toString());
        Assert.assertTrue(addSession.getScs().equals("true") && !addSession.getSes_key().equals(""));
    }

    @Test
    public void lockScreen() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        response = pushClass.lockScreen();
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": true") &&  response.code() == 200);
    }
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateNotifyListContent.class)
    public void NegativeChangeChildrenCardsPhone(JSONObject jsonObject) throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        response = pushClass.NegativeLockScreen(jsonObject);
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": false"));
    }




    @Test
    public void onSound() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        response = pushClass.onSound();
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": true") &&  response.code() == 200);
    }
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateNotifyListContent.class)
    public void NegativeOnSound(JSONObject jsonObject) throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        response = pushClass.NegativeOnSound(jsonObject);
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": false"));
    }






    @Test
    public void update() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        response = pushClass.update();
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": true") &&  response.code() == 200);
    }
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateNotifyListContent.class)
    public void NegativeUpdate(JSONObject jsonObject) throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        response = pushClass.NegativeUpdate(jsonObject);
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": false"));
    }






    @Ignore
    @Test
    public void updateLong() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        response = pushClass.updateLong();
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": true") &&  response.code() == 200);
    }
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateNotifyListContent.class)
    public void NegativeUpdateLong(JSONObject jsonObject) throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        response = pushClass.NegativeUpdateLong(jsonObject);
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": false"));
    }





    @Test
    public void getNotifyList() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        notifyList = pushClass.getNotifyList();
        System.out.println(notifyList.toString());
        Assert.assertTrue(notifyList.getScs().contains("true"));
    }
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateNotifyListContent.class)
    public void NegativeGetNotifyList(JSONObject jsonObject) throws Exception {
            authorisationUserClass.RegistrationAndAuthorisationWeb();
            addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
            notifyList = pushClass.NegativeGetNotifyList(jsonObject);
            System.out.println(notifyList.toString());
            Assert.assertTrue(notifyList.getScs().contains("false"));
    }
}

package ParentsTests;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Childrens.NotifyChangeApp.GenerateNotifyChangeAppContent;
import com.dubtsov._2bsafe.Childrens.NotifyChangeApp.NotifyChangeAppClass;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileClass;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.AddAndSelectChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.ChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.HelpMe.GenerateHelpMeContent;
import com.dubtsov._2bsafe.Parents.Functions.IntervalUpdate.GenerateIntervalUpdateContent;
import com.dubtsov._2bsafe.Parents.Functions.IntervalUpdate.GetIntervalUpdateClass;
import com.dubtsov._2bsafe.Parents.Functions.IntervalUpdate.SetIntervalUpdateClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Models.DataUpdate;
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
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 29.08.17.
 */
@RunWith(JUnitParamsRunner.class)
public class IntervalTest extends BaseClass{


    public IntervalTest() throws IOException, ParseException, java.text.ParseException {}

    @Before
    public void before() throws Exception {
        authorisationUserClass = new AuthorisationUserClass();
        childrenCardClass = new ChildrenCardClass();
        authorisationChildClass = new AuthorisationChildClass();
        profileClass = new ProfileClass();
        getIntervalUpdateClass = new GetIntervalUpdateClass();
        setIntervalUpdateClass = new SetIntervalUpdateClass();
        addAndSelectChildrenCardClass = new AddAndSelectChildrenCardClass();

        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
    }

    @Test
    public void setInterval() throws Exception {
        profileClass.selectProfileCardResponse();
        response = setIntervalUpdateClass.setIntervalUpdate();
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": true") && response.code() == 200);
    }
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateIntervalUpdateContent.class)
    public void NegativeSetInterval(JSONObject jsonObject) throws Exception {
        profileClass.selectProfileCardResponse();
        response = setIntervalUpdateClass.NegativeSetIntervalUpdate(jsonObject);
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": false"));
    }



    @Test
    public void getInterval() throws Exception {
        setIntervalUpdateClass.setIntervalUpdate();
        DataUpdate getDataUpdate = getIntervalUpdateClass.getIntervalUpdateResponse();
        String resultResponse = getDataUpdate.toString();
        System.out.println("resultResponse " + resultResponse);
        int resultData = getDataUpdate.getIto();
        System.out.println("result " + resultData);
        Assert.assertTrue(resultResponse.contains("\"scs\": true") && resultData == GenerateIntervalUpdateContent.itoRandom);
    }

    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateIntervalUpdateContent.class)
    public void NegativeGetHelpMe(JSONObject jsonObject) throws Exception {
        setIntervalUpdateClass.setIntervalUpdate();
        DataUpdate getDataUpdate = getIntervalUpdateClass.NegativeGetIntervalUpdateResponse(jsonObject);
        String resultResponse = getDataUpdate.toString();
        System.out.println("resultResponse " + resultResponse);
        int resultData = getDataUpdate.getIto();
        System.out.println("result " + resultData);
        Assert.assertTrue(resultResponse.contains("\"scs\": true") && resultData == GenerateIntervalUpdateContent.itoRandom);
    }


}

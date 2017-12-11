package ChildrenTests;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.ConditionInformationFromDevice.GenerateConditionInformationContent;
import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Childrens.Models.ConditionInformationFromDevice;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileClass;
import com.dubtsov._2bsafe.Childrens.StatisticsInformation.GenerateStatisticInfoContent;
import com.dubtsov._2bsafe.Childrens.StatisticsInformation.GetStatisticsInformationClass;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.ChildrenCardClass;
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
 * Created by user on 24.08.17.
 */
@RunWith(JUnitParamsRunner.class)
public class GetStatisticsInformationTest extends BaseClass{

    public GetStatisticsInformationTest() throws IOException, ParseException, java.text.ParseException {}

    @Before
    public void before() throws IOException, ParseException, java.text.ParseException {
        getStatisticsInformationClass = new GetStatisticsInformationClass();
        authorisationUserClass = new AuthorisationUserClass();
        childrenCardClass = new ChildrenCardClass();
        authorisationChildClass = new AuthorisationChildClass();
        profileClass = new ProfileClass();
    }

    @Test
    public void getStatisticsInformation() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        childrenCardClass.addChildrenCard();
        authorisationChildClass.authorisationChildren();
        profileClass.setProfileCard();
        response = getStatisticsInformationClass.getStatisticsInformation();
        String result = response.body().string();
        System.out.println("Result string " + result);
        Assert.assertTrue(result.contains("\"scs\": true") && response.code() == 200);
    }

    @Ignore
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateStatisticInfoContent.class)
    public void NegativeGetStatisticsInformation(JSONObject jsonObject) throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        childrenCardClass.addChildrenCard();
        authorisationChildClass.authorisationChildren();
        profileClass.setProfileCard();
        response = getStatisticsInformationClass.NegativeGetStatisticsInformation(jsonObject);
        String result = response.body().string();
        System.out.println("Result string " + result);
        Assert.assertTrue(result.contains("\"scs\": false"));
    }
}

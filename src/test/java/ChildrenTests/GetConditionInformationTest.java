package ChildrenTests;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.ConditionInformationFromDevice.GenerateConditionInformationContent;
import com.dubtsov._2bsafe.Childrens.ConditionInformationFromDevice.GetConditionInformation;
import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Childrens.Models.ConditionInformationFromDevice;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileClass;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.ChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent.GenerateSelectChildrenCardContent;
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
 * Created by user on 23.08.17.
 */
@RunWith(JUnitParamsRunner.class)
public class GetConditionInformationTest extends BaseClass{

    public GetConditionInformationTest() throws IOException, ParseException, java.text.ParseException {}

    @Before
    public void before() throws ParseException, java.text.ParseException, IOException {
        authorisationUserClass = new AuthorisationUserClass();
        authorisationChildClass = new AuthorisationChildClass();
        childrenCardClass = new ChildrenCardClass();
        profileClass = new ProfileClass();
        generationRequestJsonClass = new GenerateConditionInformationContent();
        getConditionInformation = new GetConditionInformation();
    }


    @Test
    public void getConditionInformation() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        childrenCardClass.addChildrenCard();
        authorisationChildClass.authorisationChildren();
        profileClass.selectProfileCardResponse();
        ConditionInformationFromDevice conditionInformationFromDevice = getConditionInformation.getConditionInformation();
        Assert.assertTrue(conditionInformationFromDevice.getScs().equals("true"));
    }


    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateConditionInformationContent.class)
    public void NegativeGetConditionInformation(JSONObject jsonObject) throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        childrenCardClass.addChildrenCard();
        authorisationChildClass.authorisationChildren();
        profileClass.selectProfileCardResponse();
        ConditionInformationFromDevice conditionInformationFromDevice = getConditionInformation.NegativeGetConditionInformation(jsonObject);
        Assert.assertTrue(conditionInformationFromDevice.getScs().equals("false"));
    }


}
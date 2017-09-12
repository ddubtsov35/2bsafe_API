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
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 23.08.17.
 */
public class GetConditionInformationTest extends BaseClass{

    HashMap content = new LinkedHashMap();

    public GetConditionInformationTest() throws IOException, ParseException, java.text.ParseException {
        authorisationUserClass = new AuthorisationUserClass();
        authorisationChildClass = new AuthorisationChildClass();
        childrenResponseAuthorisationModel = new ChildrenResponseAuthorisationModel();
        childrenCardClass = new ChildrenCardClass();
        profileClass = new ProfileClass();
        generationRequestJsonClass = new GenerateConditionInformationContent();
        getConditionInformation = new GetConditionInformation();

    }

    @Test
    public void getConditionInformation() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        childrenCardClass.addChildrenCard();
        childrenResponseAuthorisationModel = authorisationChildClass.authorisationChildren();
        profileClass.selectProfileCardResponse();
        ConditionInformationFromDevice conditionInformationFromDevice = getConditionInformation.getConditionInformation();
        Assert.assertTrue(conditionInformationFromDevice.getScs().contains("\"scs\": true"));
    }


}

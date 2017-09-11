package ChildrenTests;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.Authorisation.ChildrenAuthorisationResponseClass;
import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileListClass;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileSetClass;
import com.dubtsov._2bsafe.Childrens.StatisticsInformation.GetStatisticsInformationClass;
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
 * Created by user on 24.08.17.
 */
public class GetStatisticsInformationTest extends BaseClass{

    HashMap content = new LinkedHashMap();

    public GetStatisticsInformationTest() throws IOException, ParseException, java.text.ParseException {
        getStatisticsInformationClass = new GetStatisticsInformationClass();
        authorisationUserClass = new AuthorisationUserClass();
        addChildrenCardClass = new ChildrenCardClass();
        authorisationChildClass = new AuthorisationChildClass();
        childrenResponseAuthorisationModel = new ChildrenResponseAuthorisationModel();
        profileSetClass = new ProfileSetClass();
    }

    @Test
    public void getStatisticsInformation() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addChildrenCardClass.addChildrenCard();
        childrenResponseAuthorisationModel = authorisationChildClass.authorisationChildren();
        profileSetClass.selectProfileCardResponse();
        response = getStatisticsInformationClass.getStatisticsInformation();
        String result = response.body().string();
        System.out.println("Result string " + result);
        Assert.assertTrue(result.contains("\"scs\": true") && response.code() == 200);
    }
}

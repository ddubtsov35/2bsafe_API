package ParentsTests;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Childrens.NotifyChangeApp.GenerateNotifyChangeAppContent;
import com.dubtsov._2bsafe.Childrens.NotifyChangeApp.NotifyChangeAppClass;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileClass;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.ChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.Tickets.GenerateTicketContent;
import com.dubtsov._2bsafe.Parents.Functions.TurboButton.GenerateTurboContent;
import com.dubtsov._2bsafe.Parents.Functions.TurboButton.TurboButtonClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Models.TurboButton;
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
public class TurboButtonTest extends BaseClass{

    public TurboButtonTest() throws IOException, ParseException, java.text.ParseException {}

    @Before
    public void before() throws Exception {
        generatedRequestJsonClass = new GenerateNotifyChangeAppContent();
        authorisationUserClass = new AuthorisationUserClass();
        childrenCardClass = new ChildrenCardClass();
        authorisationChildClass = new AuthorisationChildClass();
        childrenResponseAuthorisationModel = new ChildrenResponseAuthorisationModel();
        notifyChangeAppClass = new NotifyChangeAppClass();
        profileClass = new ProfileClass();
        turboButtonClass = new TurboButtonClass();

        authorisationUserClass.RegistrationAndAuthorisationWeb();
        childrenCardClass.addChildrenCard();
        authorisationChildClass.authorisationChildren();
    }

    @Test
    public void setTurbo() throws Exception {
        profileClass.setProfileCard();
        response = turboButtonClass.setTurbo();
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": true") && response.code() == 200);
    }
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateTurboContent.class)
    public void NegativeSetTurbo(JSONObject jsonObject) throws Exception {
        profileClass.setProfileCard();
        response = turboButtonClass.NegativeSetTurbo(jsonObject);
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": false") && response.code() != 200);
    }



    @Test
    public void getInterval() throws Exception {
        profileClass.setProfileCard();
        turboButtonClass.setTurbo();
        TurboButton turboButton = turboButtonClass.getTurboButton();
        Assert.assertTrue(turboButton.getScs().equals("true") && turboButton.getTurbo() == GenerateTurboContent.turboStatic);
    }
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateTurboContent.class)
    public void NegativeSendTicketWithAuthorisation(JSONObject jsonObject) throws Exception {
        profileClass.setProfileCard();
        turboButtonClass.setTurbo();
        TurboButton turboButton = turboButtonClass.NegativeGetTurboButton(jsonObject);
        System.out.println("turboButton " + turboButton);
        System.out.println("turbo " + turboButton.getTurbo());
        System.out.println(GenerateTurboContent.turboStatic);
        Assert.assertTrue(turboButton.getScs().equals("false") && turboButton.getTurbo() != GenerateTurboContent.turboStatic);
    }
}

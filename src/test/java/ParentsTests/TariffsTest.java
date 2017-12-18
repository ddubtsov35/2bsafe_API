package ParentsTests;

import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileClass;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.AddAndSelectChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.Tariffs.TariffsClass;
import com.dubtsov._2bsafe.Parents.Functions.Tickets.GenerateTicketContent;
import com.dubtsov._2bsafe.Parents.Models.Tariff;
import com.dubtsov._2bsafe.Parents.Models.TariffList;
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
import java.util.List;

/**
 * Created by user on 06.09.17.
 */
@RunWith(JUnitParamsRunner.class)
public class TariffsTest extends BaseClass{

    Tariff tariff;
    List<TariffList> tariffList;

    public TariffsTest() throws IOException, ParseException, java.text.ParseException {}

    @Before
    public void before() throws IOException, ParseException, java.text.ParseException {
        tariffsClass = new TariffsClass();
        authorisationUserClass = new AuthorisationUserClass();
        profileClass = new ProfileClass();
        addAndSelectChildrenCardClass = new AddAndSelectChildrenCardClass();
    }

    @Test
    public void getTariffsList() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        tariffList = tariffsClass.getTariffsList();
        System.out.println("tariffList " + tariffList.toString());
        Assert.assertTrue(tariffList != null);
    }

    @Test
    public void getCurrentTariff() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        tariff = tariffsClass.getCurrentTariff();
        System.out.println(tariff.toString());
        Assert.assertTrue(tariff != null);
    }

    @Test
    public void getChangeTariff() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        authorisationUserClass.authorisationUser();
        response = tariffsClass.setTariff();
        System.out.println("response " + response);
        Assert.assertTrue(response.code() == 200);
    }

    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateTicketContent.class)
    public void NegativeSendTicketWithAuthorisation(JSONObject jsonObject) throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addAndSelectChildrenCardClass.AddAndSelectChildrenCard();
        authorisationUserClass.authorisationUser();
        response = tariffsClass.NegativeSetTariff(jsonObject);
        System.out.println("response " + response);
        Assert.assertTrue(response.code() != 200);
    }
}

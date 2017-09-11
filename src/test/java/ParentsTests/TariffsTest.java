package ParentsTests;

import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileListClass;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.AddAndSelectChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.Tariffs.TariffsClass;
import com.dubtsov._2bsafe.Parents.Models.Tariff;
import com.dubtsov._2bsafe.Parents.Models.TariffList;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by user on 06.09.17.
 */
public class TariffsTest extends BaseClass{

    Tariff tariff;
    List<TariffList> tariffList;
    HashMap content = new LinkedHashMap();

    public TariffsTest() throws IOException, ParseException, java.text.ParseException {
        tariffsClass = new TariffsClass();
        authorisationUserClass = new AuthorisationUserClass();
        profileListClass = new ProfileListClass();
        addAndSelectChildrenCardClass = new AddAndSelectChildrenCardClass();
    }

    @Test
    public void getTariffsList() throws ParseException, java.text.ParseException, IOException {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        tariffList = tariffsClass.getTariffsList();
        System.out.println("tariffList " + tariffList.toString());
        Assert.assertTrue(tariffList != null);
    }

    @Test
    public void getCurrentTariff() throws ParseException, java.text.ParseException, IOException {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        tariff = tariffsClass.getCurrentTariff();
        System.out.println(tariff.toString());
        Assert.assertTrue(tariff != null);
    }

    @Test
    public void getChangeTariff() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addAndSelectChildrenCardClass.AddAndSelectChildrenCard();

        int targetId = 0;
        int idCurrentTariff = tariffsClass.getCurrentTariff().getTariff();
        tariffList = tariffsClass.getTariffsList();
        for(int i = 0; i < tariffList.size(); i++){
            if(idCurrentTariff != tariffList.get(i).getId()){
                targetId = tariffList.get(i).getId();
                break;
            }
        }

        content.put("tariff_id", targetId);
        response = tariffsClass.setTariff(content);
        System.out.println("response " + response);
        Assert.assertTrue(response.code() == 200);
    }
}

package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.Zone.ZoneClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Models.AddZone;
import com.dubtsov._2bsafe.Parents.Models.Zone;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by user on 30.08.17.
 */
public class ZoneTest extends BaseClass{
    List<Zone> zone;
    AddZone addZone;


    public ZoneTest() throws IOException, ParseException, java.text.ParseException {
        authorisationUserClass = new AuthorisationUserClass();
        zoneClass = new ZoneClass();
    }

    @Test
    public void getZoneList() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        zone = zoneClass.getZoneList();
        System.out.println(zone);
        Assert.assertTrue(zone.get(0).getScs().equals("true"));
    }

    @Test
    public void addZone() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addZone = zoneClass.addZone();
        System.out.println(addZone);
        Assert.assertTrue(addZone.getScs().equals("true") && addZone.getZone_id() != 0);
    }

    @Test
    public void deleteZone() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addZone = zoneClass.addZone();
        response = zoneClass.deleteZone();
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": true") && response.code() == 200);
    }
}

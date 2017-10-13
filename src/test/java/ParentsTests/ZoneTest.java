package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.Zone.ZoneClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Models.AddZone;
import com.dubtsov._2bsafe.Parents.Models.Zone;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Before;
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

    @Before
    public void before() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
    }

    @Test
    public void getZoneList() throws Exception {
        zone = zoneClass.getZoneList();
        System.out.println("Test zone " + zone.toString());
        Assert.assertTrue(zone.size() > 0);
    }

    @Test
    public void addZone() throws Exception {
        addZone = zoneClass.addZone();
        System.out.println(addZone);
        Assert.assertTrue(addZone.getScs().equals("true") && addZone.getZone_id() != 0);
    }

    @Test
    public void deleteZone() throws Exception {
        response = zoneClass.deleteZone();
        String result = response.body().string();
        System.out.println(result);
        Assert.assertTrue(result.contains("\"scs\": true") && response.code() == 200);
    }
}

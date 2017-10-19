package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.TurboButton.GenerateTurboContent;
import com.dubtsov._2bsafe.Parents.Functions.Zone.GenerateZoneContent;
import com.dubtsov._2bsafe.Parents.Functions.Zone.ZoneClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Models.AddZone;
import com.dubtsov._2bsafe.Parents.Models.Zone;
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
import java.util.List;

/**
 * Created by user on 30.08.17.
 */
@RunWith(JUnitParamsRunner.class)
public class ZoneTest extends BaseClass{
    List<Zone> zone;
    AddZone addZone;

    public ZoneTest() throws IOException, ParseException, java.text.ParseException {}

    @Before
    public void before() throws Exception {
        authorisationUserClass = new AuthorisationUserClass();
        zoneClass = new ZoneClass();
        authorisationUserClass.RegistrationAndAuthorisationWeb();
    }

    @Test
    public void getZoneList() throws Exception {
        zone = zoneClass.getZoneList();
        System.out.println("Test zone " + zone.toString());
        Assert.assertTrue(zone.size() > 0);
    }
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateZoneContent.class)
    public void NegativeGetZoneList(JSONObject jsonObject) throws Exception {
        zone = zoneClass.NegativeGetZoneList(jsonObject);
        System.out.println("Test zone " + zone.toString());
        Assert.assertTrue(zone.isEmpty());
    }



    @Test
    public void addZone() throws Exception {
        addZone = zoneClass.addZone();
        System.out.println(addZone);
        Assert.assertTrue(addZone.getScs().equals("true") && addZone.getZone_id() != 0);
    }
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateZoneContent.class)
    public void NegativeAddZone(JSONObject jsonObject) throws Exception {
        addZone = zoneClass.NegativeAddZone(jsonObject);
        System.out.println(addZone);
        Assert.assertTrue(addZone.getScs().equals("false"));
    }



    @Test
    public void deleteZone() throws Exception {
        response = zoneClass.deleteZone();
        String result = response.body().string();
        System.out.println(result);
        Assert.assertTrue(result.contains("\"scs\": true") && response.code() == 200);
    }
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateZoneContent.class)
    public void NegativeDeleteZone(JSONObject jsonObject) throws Exception {
        response = zoneClass.NegativeDeleteZone(jsonObject);
        String result = response.body().string();
        System.out.println(result);
        Assert.assertTrue(result.contains("\"scs\": false") && response.code() != 200);
    }
}

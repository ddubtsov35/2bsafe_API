package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.Zone.AddZoneClass;
import com.dubtsov._2bsafe.Parents.Functions.Zone.DeleteZoneClass;
import com.dubtsov._2bsafe.Parents.Functions.Zone.GetZoneClass;
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

    HashMap content = new LinkedHashMap();
    List<Zone> zone;
    AddZone addZone;


    public ZoneTest() throws IOException {
        authorisationUserClass = new AuthorisationUserClass();
        getZoneClass = new GetZoneClass();
        addZoneClass = new AddZoneClass();
        deleteZoneClass = new DeleteZoneClass();
    }

    @Test
    public void getZoneList() throws ParseException, java.text.ParseException, IOException {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        content.put("type", 0);
        content.put("rnd", GenerateTokenClass.getGeneratedToken());
        zone = getZoneClass.getZoneList(content);
        System.out.println(zone);
        Assert.assertTrue(zone.get(0).getScs().equals("true"));
    }

    @Test
    public void addZone() throws ParseException, java.text.ParseException, IOException {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        content.put("lat", 0);
        content.put("rnd", GenerateTokenClass.getGeneratedToken());
        content.put("long", 0);
        content.put("rad", 0);
        content.put("name", "ZONA");
        content.put("type", 0);
        addZone = addZoneClass.addZone(content);
        System.out.println(addZone);
        Assert.assertTrue(addZone.getScs().equals("true") && addZone.getZone_id() != 0);
    }

    @Test
    public void deleteZone() throws ParseException, java.text.ParseException, IOException {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        content.put("lat", 0);
        content.put("rnd", GenerateTokenClass.getGeneratedToken());
        content.put("long", 0);
        content.put("rad", 0);
        content.put("name", "ZONA");
        content.put("type", 0);
        addZone = addZoneClass.addZone(content);
        System.out.println(addZone);

        content.put("zone_id", addZone.getZone_id());
        content.put("confirm", false);

        response = deleteZoneClass.deleteZone(content);
        String result = response.body().string();
        System.out.println(result);
        Assert.assertTrue(result.contains("\"scs\": true") && response.code() == 200);
    }
}

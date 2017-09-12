package ParentsTests;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Childrens.NotifyChangeApp.GenerateNotifyChangeAppContent;
import com.dubtsov._2bsafe.Childrens.NotifyChangeApp.NotifyChangeAppClass;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileClass;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.ChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.IntervalUpdate.GetIntervalUpdateClass;
import com.dubtsov._2bsafe.Parents.Functions.IntervalUpdate.SetIntervalUpdateClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 29.08.17.
 */
public class IntervalTest extends BaseClass{

    HashMap content = new LinkedHashMap();

    public IntervalTest() throws IOException, ParseException, java.text.ParseException {
        authorisationUserClass = new AuthorisationUserClass();
        childrenCardClass = new ChildrenCardClass();
        authorisationChildClass = new AuthorisationChildClass();
        profileClass = new ProfileClass();
        getIntervalUpdateClass = new GetIntervalUpdateClass();
        setIntervalUpdateClass = new SetIntervalUpdateClass();
    }

    @Test
    public void setInterval() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        childrenCardClass.addChildrenCard();
        authorisationChildClass.authorisationChildren();
        profileClass.selectProfileCardResponse();
        response = setIntervalUpdateClass.setIntervalUpdate();
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": true") && response.code() == 200);
    }

    @Test
    public void getInterval() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        childrenCardClass.addChildrenCard();
        authorisationChildClass.authorisationChildren();
        setIntervalUpdateClass.setIntervalUpdate();
        getIntervalUpdateClass.getIntervalUpdateResponse();
        String resultResponse = response.body().string();
        System.out.println("resultResponse " + resultResponse);
        int resultData = getIntervalUpdateClass.getIntervalUpdateResponse().getIto();
        System.out.println("result " + resultData);
        Assert.assertTrue(resultResponse.contains("\"scs\": true") && response.code() == 200 && resultData == 888);
    }


}

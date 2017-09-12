package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.ChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.IntervalUpdate.SetIntervalUpdateClass;
import com.dubtsov._2bsafe.Parents.Models.AddChildrenCard;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by user on 20.07.17.
 */
public class GetInformationTests  extends BaseClass{
    public GetInformationTests() throws IOException, ParseException, java.text.ParseException {
        authorisationUserClass = new AuthorisationUserClass();
        setIntervalUpdateClass = new SetIntervalUpdateClass();
        childrenCardClass = new ChildrenCardClass();
    }

    @Test
    public void failSetIntervalUpdate() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationAndroid();
        System.out.println(response.body().string());
        childrenCardClass.addChildrenCard();
        response = setIntervalUpdateClass.setIntervalUpdate();
        //465 == success, потому что карточка не привязана к устройству
        Assert.assertTrue(response.body().string().contains("\"scs\": false") &&  response.code() == 465);
    }

    @Test
    public void getChildrenCardList() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationAndroid();
        System.out.println(response.body().string());
        childrenCardClass.addChildrenCard();
        Assert.assertTrue(childrenCardClass.getChildrenCardList().size() == 1);
    }

    @Ignore
    @Test
    public void getDeviceShortInfo() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationAndroid();
        System.out.println(response.body().string());
        childrenCardClass.addChildrenCard();
        //TODO присоединяем устройство

    }
}

package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.AddChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GetChildrenCardListClass;
import com.dubtsov._2bsafe.Parents.Functions.IntervalUpdate.SetIntervalUpdateClass;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by user on 20.07.17.
 */
public class GetInformationTests  extends BaseClass{
    public GetInformationTests() throws IOException, ParseException, java.text.ParseException {
        authorisationUserClass = new AuthorisationUserClass();
        setIntervalUpdateClass = new SetIntervalUpdateClass();
        addChildrenCardClass = new AddChildrenCardClass();
        getChildrenCardListClass = new GetChildrenCardListClass();
    }

    /*@Test
    public void failSetIntervalUpdate() throws Exception {
        response = authorisationUserClass.RegistrationAndAuthorisationAndroid();
        System.out.println(response.body().string());
        addChildrenCardClass.addChildrenCard();
        response = setIntervalUpdateClass.setIntervalUpdate(content);
        //465 == success, потому что карточка не привязана к устройству
        Assert.assertTrue(response.body().string().contains("\"scs\": false") &&  response.code() == 465);
    }*/

    /*@Test
    public void getChildrenCardList() throws Exception {
        response = authorisationUserClass.RegistrationAndAuthorisationAndroid();
        System.out.println(response.body().string());
        response = addChildrenCardClass.addChildrenCard();
        Assert.assertTrue(getChildrenCardListClass.getChildrenCardListCount() == 1);
    }

    @Test
    public void getDeviceShortInfo() throws Exception {
        response = authorisationUserClass.RegistrationAndAuthorisationAndroid();
        System.out.println(response.body().string());
        response = addChildrenCardClass.addChildrenCard();
        //TODO присоединяем устройство

    }*/
}

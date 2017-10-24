package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.ChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.FAQ.GenerateFaqContent;
import com.dubtsov._2bsafe.Parents.Functions.IntervalUpdate.GenerateIntervalUpdateContent;
import com.dubtsov._2bsafe.Parents.Functions.IntervalUpdate.SetIntervalUpdateClass;
import com.dubtsov._2bsafe.Parents.Models.AddChildrenCard;
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

/**
 * Created by user on 20.07.17.
 */
@RunWith(JUnitParamsRunner.class)
public class GetInformationTests  extends BaseClass{
    public GetInformationTests() throws IOException, ParseException, java.text.ParseException {}

    @Before
    public void before() throws IOException, ParseException, java.text.ParseException {
        authorisationUserClass = new AuthorisationUserClass();
        setIntervalUpdateClass = new SetIntervalUpdateClass();
        childrenCardClass = new ChildrenCardClass();
    }



    @Ignore
    @Test
    public void failSetIntervalUpdate() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationAndroid();
        childrenCardClass.addChildrenCard();
        response = setIntervalUpdateClass.setIntervalUpdate();
        //465 == success, потому что карточка не привязана к устройству
        Assert.assertTrue(response.body().string().contains("\"scs\": false") &&  response.code() == 465);
    }
    @Test
    @TestCaseName("{0}")
    @Parameters(source = GenerateIntervalUpdateContent.class)
    public void NegativeChangeChildrenCardsPhone(JSONObject jsonObject) throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationAndroid();
        childrenCardClass.addChildrenCard();
        response = setIntervalUpdateClass.NegativeSetIntervalUpdate(jsonObject);
        //465 == success, потому что карточка не привязана к устройству
        String result = response.body().string();
        System.out.println("Result " + result);
        Assert.assertTrue(result.contains("\"scs\": false"));
    }



    @Test
    public void getChildrenCardList() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationAndroid();
        childrenCardClass.addChildrenCard();
        Assert.assertTrue(childrenCardClass.getChildrenCardList().size() != 0);
    }
}

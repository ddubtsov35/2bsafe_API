import authorisation.AuthorisationPage;
import baseTest.BaseTest;
import com.codeborne.selenide.Condition;
import map.MapPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by user on 24.01.18.
 */
public class AuthorisationTest extends BaseTest {

    AuthorisationPage authorisationPage;

    @Before
    public void before(){
        authorisationPage = new AuthorisationPage();
    }

    @Test
    public void positiveAuthorisationTest(){
        MapPage mapPage = authorisationPage.authorisationUser(login, password);
        Assert.assertTrue(!mapPage.equals(null));
    }

}

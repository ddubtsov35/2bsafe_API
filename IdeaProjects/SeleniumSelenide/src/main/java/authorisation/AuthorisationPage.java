package authorisation;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import map.MapPage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by user on 24.01.18.
 */
public class AuthorisationPage {

        private String  pathCss = "body > app-root > auth-component > div.auth > ";

        private SelenideElement login = $(By.name("auth_login"));

        private SelenideElement password = $(By.name("auth_pwd"));

        private SelenideElement submitButton = $(By.cssSelector(pathCss + "form > button"));


        public MapPage authorisationUser(String email, String pwd){
            getLogin().setValue(email);
            getPassword().setValue(pwd);
            getSubmitButton().click();
            MapPage mapPage = new MapPage();
            try{
                mapPage.getMap().shouldBe(Condition.visible);
            } catch (Exception e){
                return null;
            }
            return mapPage;
        }


        public SelenideElement getLogin() {
            return login;
        }
        public SelenideElement getPassword() {
            return password;
        }
        public SelenideElement getSubmitButton() {
            return submitButton;
        }
}

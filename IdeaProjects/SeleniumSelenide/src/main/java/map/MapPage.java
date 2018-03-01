package map;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by user on 24.01.18.
 */
public class MapPage {

    protected SelenideElement map = $(By.id("map"));

    public SelenideElement getMap() {
        return map;
    }
}

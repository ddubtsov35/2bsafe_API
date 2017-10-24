package Selenium;

import org.junit.Ignore;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by user on 16.10.17.
 */
public class Test {

    @Ignore
    @org.junit.Test
    public void test(){
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://www.jabong.com/");
    }

}

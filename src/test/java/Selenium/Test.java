package Selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by user on 16.10.17.
 */
public class Test {

    @org.junit.Test
    public void test(){
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://google.ru");
    }

}

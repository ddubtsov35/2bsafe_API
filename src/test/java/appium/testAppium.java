package appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.NetworkConnectionSetting;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by user on 01.08.17.
 */
public class testAppium {

    private AndroidDriver<AndroidElement> appiumDriver;

    @Test
    public void test() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","6.0.1");
        capabilities.setCapability("deviceName","test");
        capabilities.setCapability("app","/home/user/Загрузки/client-v211.1-pp.apk");

        appiumDriver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        appiumDriver.setConnection(Connection.WIFI);
        System.out.println(appiumDriver.manage().window().getSize());
        System.out.println("Get " + appiumDriver.getConnection());
        //System.out.println("Get " + appiumDriver());
        Assert.assertEquals(Connection.WIFI, appiumDriver.getConnection());
    }

}

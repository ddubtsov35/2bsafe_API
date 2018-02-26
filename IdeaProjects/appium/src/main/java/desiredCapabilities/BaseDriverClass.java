package desiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;

/**
 * Created by user on 15.02.18.
 */
public class BaseDriverClass {

    AppiumDriver driver;
    AppiumDriverLocalService appiumDriverLocalService;

    private AppiumDriverLocalService getAppiumDriverLocalService(){
        AppiumServiceBuilder builder = new AppiumServiceBuilder()
                .withAppiumJS(new File("/home/user/node_modules/appium/build/lib/main.js"))
                .withArgument(GeneralServerFlag.LOG_LEVEL, "info")
                .withIPAddress("")
                .usingAnyFreePort();
        appiumDriverLocalService = builder.build();
        return appiumDriverLocalService;
    }

    public AppiumDriver getDriver() throws MalformedURLException {
        //Start local server
        getAppiumDriverLocalService().start();
        System.out.println(appiumDriverLocalService.getUrl());

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "TestDevice");
        capabilities.setCapability(MobileCapabilityType.APP, "/home/user/Загрузки/test.apk");

        return driver = new AppiumDriver(appiumDriverLocalService.getUrl(), capabilities);
    }

    public AppiumDriver getDriver2() throws MalformedURLException {
        //Start local server
        getAppiumDriverLocalService().start();
        System.out.println(appiumDriverLocalService.getUrl());

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "TestDevice2");
        capabilities.setCapability(MobileCapabilityType.APP, "/home/user/Загрузки/test.apk");

        return driver = new AppiumDriver(appiumDriverLocalService.getUrl(), capabilities);
    }

}

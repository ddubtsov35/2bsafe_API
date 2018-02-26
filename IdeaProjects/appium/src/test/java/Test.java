import desiredCapabilities.BaseDriverClass;

import java.net.MalformedURLException;

/**
 * Created by user on 12.02.18.
 */
public class Test extends BaseDriverClass{

    @org.junit.Test
    public void test() throws MalformedURLException {

        getDriver();
        //getDriver2();

    }

    /*@org.junit.Test
    public void test2() throws MalformedURLException {

        System.out.println(System.getenv("ANDROID_HOME"));

    }*/

}

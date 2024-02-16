package FirstPackage;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class AppiumTest {

    public static void main(String[] args) throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "13.0");
        capabilities.setCapability("deviceName", "Pixel_3_API_30");
        capabilities.setCapability("app", "C:\\Users\\Dell\\.android\\avd\\Pixel_7_Pro_API_30.avd");
        capabilities.setCapability("automationName", "UiAutomator2");
    

        // Initialize the driver
        AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        // Your test code goes here

        // Close the session
        driver.quit();
    }
}


package Generic_Utility;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Base_Class {
@Test
public void login() throws MalformedURLException {
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("deviceName", "Xiaomi redmi Note 5 pro");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "9");
	cap.setCapability("automationName", "uiautomator2");
	cap.setCapability("browserName", "Chrome");
	cap.setCapability("chromedriverExecutable", "C:\\Users\\Dell\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	
    URL url = URI.create("http://127.0.0.1:4723").toURL();
	AndroidDriver driver = new AndroidDriver(url, cap);	
}
}

package APK;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

public class Dummy {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Xiaomi Redmi Note 5 pro");
		cap.setCapability("platformName", "Android");
		cap.setCapability("automationName", "uiautomator2");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("app", "C:\\Users\\Dell\\Downloads\\Ausaf.apk");
		cap.setCapability("appPackage", "com.freekaamaalindia");
		cap.setCapability("appActivity", "com.freekaamaalindia.MainActivity");
		
		URL url = URI.create("http://127.0.0.1:4723").toURL();
		AndroidDriver driver = new AndroidDriver(url, cap);
		Thread.sleep(2000);
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String PackageName = "com.freekaamaalindia";
	
//		if(!driver.isAppInstalled(PackageName)) {
//			System.out.println("Installing");
//			driver.installApp("C:\\Users\\Dell\\Downloads\\appfkm.apk");
//		}
//		else {
//			System.out.println("Already installed");
//		}
//		System.out.println("Launching your app");
//		driver.activateApp(PackageName);
	
		
		
		
		
		
		
		
		
		
	}
}

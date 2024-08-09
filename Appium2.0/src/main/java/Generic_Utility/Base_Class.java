package Generic_Utility;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;


import io.appium.java_client.android.AndroidDriver;

public class Base_Class {
//	public AndroidDriver driver ;  
	public static WebDriver driver; 
	public  WebDriver edriver =null;
@BeforeMethod
public void login() throws MalformedURLException, InterruptedException {
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("deviceName", "Xiaomi redmi Note 5 pro");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "9");
	cap.setCapability("automationName", "uiautomator2");
	cap.setCapability("browserName", "Chrome");
	cap.setCapability("autoGrantPermissions", true);
	cap.setCapability("newCommandTimeout", 300); // 5 minutes

	cap.setCapability("chromedriverExecutable", "C:\\Users\\Dell\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	
    URL url = URI.create("http://127.0.0.1:4723/").toURL();
	driver = new AndroidDriver(url, cap);	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://desktop.freekaamaal.com/");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='SignIn'])[2]")));

	driver.findElement(By.xpath("(//span[text()='SignIn'])[2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("number")).sendKeys("3322332233");
	driver.findElement(By.xpath("//button[text()='Get OTP']")).click();
	driver.findElement(By.xpath("//button[text()='Get OTP']")).click();
	
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@inputmode='numeric'])[1]")));
	
	
	driver.findElement(By.xpath("(//input[@inputmode='numeric'])[1]")).sendKeys("2");
	driver.findElement(By.xpath("(//input[@inputmode='numeric'])[2]")).sendKeys("2");
	driver.findElement(By.xpath("(//input[@inputmode='numeric'])[3]")).sendKeys("4");
	driver.findElement(By.xpath("(//input[@inputmode='numeric'])[4]")).sendKeys("4");
	driver.findElement(By.xpath("(//input[@inputmode='numeric'])[5]")).sendKeys("2");
	driver.findElement(By.xpath("(//input[@inputmode='numeric'])[6]")).sendKeys("2");
	driver.findElement(By.xpath("//button[text()='Proceed']")).click();
	driver.findElement(By.xpath("//button[text()='Proceed']")).click();
	Thread.sleep(1000);
	
	
	
	
	
}
}

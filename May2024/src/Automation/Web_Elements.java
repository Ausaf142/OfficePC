package Automation;

/*
 * getText
 * sendKeys
 * click
 * Submit
 * Clear
 * isDisplayed
 * IsEnabled
 * getAttributes
 * getTagname
 * getSize*/


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Elements {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://omayo.blogspot.com/");
	System.out.println(driver);
	

}
}

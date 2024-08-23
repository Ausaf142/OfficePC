package Automation;

/*WebDriver Methods*/
/* Get
 * quit
 * close
 * getWindowHandle
 * getWindowHandles
 * getPageSource
 * getCurrentUrl
 * getTitle
 * manage
 * switchTo
 * Navigate
 * FindElement
 * FindElements
 * */

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Methods {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://cashora.com");
	driver.findElement(By.className("already-user")).click();
	driver.findElement(By.id("login_mobile")).sendKeys("8800877601");
	driver.findElement(By.id("login_password")).sendKeys("admin123");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	System.out.println( driver.getCurrentUrl());
	System.out.println( driver.getPageSource());
	System.out.println( driver.getTitle());
	System.out.println( driver.getWindowHandle());
	System.out.println( driver.getWindowHandles());
//	driver.manage().deleteAllCookies();
//	driver.manage().window().minimize();
	
	
	
}
}

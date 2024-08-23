package Interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/* get
 * getTitle
 * getpagesource
 * getwindohandle
 * getwindowhandles
 * findelement
 * findelements
 * close
 * quit
 * navigate
 * manage
 * getcurrenturl
 * switchTo*/
public class AllWebElements {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://omayo.blogspot.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getPageSource());
	System.out.println(driver.getWindowHandle());
	System.out.println(driver.getWindowHandles());
	System.out.println(driver.getCurrentUrl());
	driver.navigate().to("https://desktop.freekaamaal.com");
	Thread.sleep(2000);
	driver.navigate().back();
	driver.switchTo().frame("iframe1");
}
}

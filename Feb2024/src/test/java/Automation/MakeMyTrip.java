package Automation;

import java.awt.Point;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTrip {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");
//	Thread.sleep(4000);
//	driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();

//	Actions act =new Actions(driver);
//	act.scrollByAmount(0, 800).perform();
	WebElement targetElement =driver.findElement(By.xpath("//h2[text()='Ordered List']"));
	JavascriptExecutor js =(JavascriptExecutor)driver;
//	js.executeScript("window.scrollBy(0,800)");
	js.executeScript("arguments[0].scrollIntoView(true);", targetElement);


}
}

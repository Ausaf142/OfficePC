package FKM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic_Utility.Base_class;


public class CouponsFunctionality extends Base_class {
@Test
public void coupon() throws InterruptedException {
	Thread.sleep(5000);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	WebElement couponHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Coupons']")));
	Actions act = new Actions(driver);
	act.moveToElement(couponHeader).perform();
	Thread.sleep(1000);
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 160);");
//	driver.navigate().refresh();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[text()='Show code'])[5]")).click();
//	driver.findElement(By.xpath("//span[text()='Show code']")).click();

	js.executeScript("window.scrollBy(0, 200);");
	Thread.sleep(2000);
	WebElement code = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Show code']")));
	act.moveToElement(code).click().perform();
	String couponCode = driver.findElement(By.xpath("//div[@style='position: relative;']")).getText();
	System.out.println(couponCode);
	Reporter.log("Code is "+couponCode+"",true);


	
	
	
	
	
}
}

package Fkm_WEB_Chrome;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Generic_Utility.Base_Class;
import Generic_Utility.Try;

public class Notification_Search_ButtonFunction extends Base_Class {
	@Test(retryAnalyzer = Try.class)
public void notification() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='notification-icon']")));
	driver.findElement(By.xpath("//button[@class='notification-icon']")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='Search'])[2]")));
	driver.findElement(By.xpath("(//span[text()='Search'])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@placeholder,\"Enter min 3 chr...\")]")).sendKeys("myn");
	Thread.sleep(6000);
	driver.findElement(By.xpath("//img[@alt=\"close icon\"]")).click();
	
//	driver.navigate().back();
	
}
}

package FKM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Generic_Utility.Base_class;

public class Account_Summary extends Base_class{
@Test
public void Account() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	Thread.sleep(5000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='menuButton']"))).click();
	driver.findElement(By.xpath("//a[text()='Cashback summary']")).click();
	driver.findElement(By.xpath("(//p[text()='Cashback History'])[1]")).click();
	
	
}
}

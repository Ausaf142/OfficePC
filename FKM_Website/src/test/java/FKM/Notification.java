package FKM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Generic_Utility.Base_class;

public class Notification extends Base_class {
@Test
public void notification() throws InterruptedException {
	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='notification-icon']"))).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[@class='dealdetail-icon-shadow']")).click();
	
	
	
	
	
}
}

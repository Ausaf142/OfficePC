package FKM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Generic_Utility.Base_class;

public class WebStory extends Base_class {
@Test
public void Web() throws InterruptedException {
	Thread.sleep(5000);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='dealstories-card'])[1]"))).click();
	driver.findElement(By.xpath("(//div[contains(@class,'desktop_webst')])[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[contains(@class,'desktop_webst')])[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[contains(@class,'desktop_webst')])[2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[contains(@class,'desktop_webst')])[2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[@class='webstories_details_tool_span1']")).click();
	
	
	
	
	
	
}
}

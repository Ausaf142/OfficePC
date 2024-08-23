package FKM;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Generic_Utility.Base_class;
public class Mouse_Hover extends Base_class {
@Test
public void HoverAtHeader() throws InterruptedException {
	Thread.sleep(5000);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement AllCategory = driver.findElement(By.xpath("//span[text()='All Categories']"));
	Actions act = new Actions(driver);
	act.moveToElement(AllCategory).perform();
	Thread.sleep(5000);
	WebElement topStores = driver.findElement(By.xpath("//span[text()='Top tores']"));
	act.moveToElement(topStores).perform();

}
}

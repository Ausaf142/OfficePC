package FKM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Generic_Utility.Base_class;

public class SearchBar_Functionality extends Base_class {
@Test
public void searchBar() throws InterruptedException, AWTException {
	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement search = driver.findElement(By.xpath("//span[text()='Search']"));
    wait.until(ExpectedConditions.elementToBeClickable(search));
    Thread.sleep(4000);
    driver.findElement(By.xpath("//span[text()='Search']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@class='h-input-text__']")).click();
	driver.findElement(By.xpath("//input[@class='h-input-text__']")).sendKeys("tata");
	Thread.sleep(5000);
	
	Robot rob = new Robot();
	rob.keyPress(KeyEvent.VK_ENTER);
	rob.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(5000);
	driver.navigate().back();
	
}
}

package Fkm_WEB_Chrome;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Generic_Utility.Base_Class;
import Generic_Utility.Try;

public class TrendingShort extends Base_Class {
	@Test(retryAnalyzer = Try.class)
    public void shorts() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	WebElement load = driver.findElement(By.xpath("//span[text()='Load More']"));


	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);",load );
	
	Thread.sleep(3000);
	WebElement frame = driver.findElement(By.tagName("iframe"));
	driver.switchTo().frame(frame);

//	WebElement play = driver.findElement(By.id("player"));
//	wait.until(ExpectedConditions.elementToBeClickable(play)).click();                                                                                                                                                                                                                                                                                                                                                                                                                                          
	driver.findElement(By.id("player")).click();
	driver.findElement(By.id("player")).click();

	
	}


}




package Fkm_WEB_Chrome;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Generic_Utility.Base_Class;
import Generic_Utility.Try;

public class AllStore_Tabsfunctonality extends Base_Class {
	@Test(retryAnalyzer = Try.class)
public void tabs() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	for(int i=0;i<3;i++) {
		try {
			WebElement hamburger = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class=\"fkm-newheader-menuButton\"]")));
			wait.until(ExpectedConditions.elementToBeClickable(hamburger));
			hamburger.click();
			break;
		  }
		catch (StaleElementReferenceException e) {
            System.out.println("StaleElementReferenceException caught. Retrying... " + (i + 1));
            Thread.sleep(1000); // Adjust sleep time before retrying
          }
	  }
	
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='All Stores']"))).click();
	WebElement tab= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='All Stores']")));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);", tab);
	System.out.println("Clicked 100% Cashback");
	Thread.sleep(1500);
	driver.findElement(By.xpath("//button[text()='Newest']")).click();
	System.out.println("Clicked Newest");
	Thread.sleep(1500);
	driver.findElement(By.xpath("//button[text()='All']")).click();
	System.out.println("Clicked All");
	Thread.sleep(1500);
	System.out.println("All tabs section has been clicked once");
	
	
	
	
	
	
	
}
}

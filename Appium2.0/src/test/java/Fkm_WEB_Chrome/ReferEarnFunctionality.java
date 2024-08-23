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

public class ReferEarnFunctionality extends Base_Class {
	@Test(retryAnalyzer = Try.class)
	public void referEarn() throws InterruptedException {
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
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[text()='Refer and Earn']")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Refer and Earn']"))).click();
		WebElement reff = driver.findElement(By.xpath("//h3[text()='Referral link']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", reff);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@alt='copy code'])[1]"))).click();
		WebElement msg = driver.findElement(By.xpath("//span[@class='copy_clip']"));
		if(msg.getText()!=null) {
			System.out.println(msg.getText());
		}
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@alt='copy code'])[2]"))).click();
		WebElement msg2 = driver.findElement(By.xpath("//span[@class='copy_clip']"));
		if(msg2.getText()!=null) {
			System.out.println(msg2.getText());
		}
		
		
		
		
		
		
		
	}

}

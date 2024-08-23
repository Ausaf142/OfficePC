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

public class WithdrawAmount extends Base_Class {
	@Test(retryAnalyzer = Try.class)
	public void WithdrawCB() throws InterruptedException {
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
		
		driver.findElement(By.xpath("(//a[@class=\"sidebar-gmail-section-1\"])[1]")).click();
		WebElement Withdraw = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//h3[text()='Withdraw Money'])[2]")));

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", Withdraw);
		Thread.sleep(2000);
	    wait.until(ExpectedConditions.visibilityOf(Withdraw));
	    Withdraw.click();
	    
	  WebElement Amount = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("amount")));
	  Amount.sendKeys("101");
	  driver.findElement(By.xpath("//div[@class='raidio_container']")).click();
	  driver.findElement(By.xpath("//button[text()='Withdraw']")).click();
	  
	   WebElement alert = driver.findElement(By.xpath("//p[text()='Select your withdrawal account']"));
	   wait.until(ExpectedConditions.visibilityOf(alert));
		System.out.println(alert.getText());
		
		
		
		
	}
}

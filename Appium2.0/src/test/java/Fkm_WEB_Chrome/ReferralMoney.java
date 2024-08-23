package Fkm_WEB_Chrome;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic_Utility.Base_Class;
import Generic_Utility.Try;

public class ReferralMoney extends Base_Class{
//	(retryAnalyzer = Try.class)
	@Test
	public void RefWithdraw() throws InterruptedException {
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
		WebElement referral = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//h3[text()='Referral Money'])[2]")));

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", referral);
		Thread.sleep(2000);
	    wait.until(ExpectedConditions.visibilityOf(referral));
	    referral.click();	
		WebElement Amnt = driver.findElement(By.id("amount"));
		wait.until(ExpectedConditions.elementToBeClickable(Amnt)).sendKeys("250");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Withdraw']"))).click();
	
		
		  Alert alertElement = wait.until(ExpectedConditions.alertIsPresent());
		    String alertText = driver.switchTo().alert().getText();
		    System.out.println("Alert text: " + alertText);
		
		
		
		
//		wait.until(ExpectedConditions.alertIsPresent(By.xpath("//p[text()='Select your withdrawal account']")));
//		String alert = driver.findElement(By.xpath("//p[text()='Select your withdrawal account']")).getText();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Select your withdrawal account']")));
//		if(!(alertText==null)) {
//			System.out.println("Please add bank Accout first ");
//			Reporter.log("Please add bank Accout first", true);
//		}
		
	}
}

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

public class ReferralMoney extends Base_Class{
	@Test
	public void RF() throws InterruptedException {
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
		String alert = driver.findElement(By.xpath("//p[text()='Select your withdrawal account']")).getText();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Select your withdrawal account']")));
		if(alert!=null) {
			System.out.println("Please add first bank Accout");
		}
		
	}
}

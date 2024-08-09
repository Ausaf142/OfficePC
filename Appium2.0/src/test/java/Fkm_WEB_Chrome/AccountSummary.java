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

public class AccountSummary extends Base_Class {

	@Test(retryAnalyzer = Try.class)
public void summary() throws InterruptedException {
	
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
	
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Cashback summary']"))).click();
	
	WebElement pp = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//p[text()='Missing History'])[2]")));
	
//	WebElement scrollTo = driver.findElement(By.xpath("(//p[text()='Click History'])[2]"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);", pp);
	
	//click to the module of CB history 
	System.out.println("Looking for Cashback History");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@href='/cashback/cashback-history'])[4]"))).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Pending']"))).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Confirmed']"))).click();
	Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Declined']"))).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dealdetail-icon-shadow']"))).click();
	Thread.sleep(2000);
	
	System.out.println("Looking for Withdrawal History");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@href='/cashback/withdrawal-history'])[3]"))).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Pending']"))).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Paid']"))).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Declined']"))).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dealdetail-icon-shadow']"))).click();
	Thread.sleep(2000);
	
	WebElement ps = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//p[text()='Missing History'])[2]")));
	js.executeScript("arguments[0].scrollIntoView(true);", ps);
	System.out.println("Looking for Referral History");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[text()='Referral History'])[2]"))).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Pending']"))).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Confirmed']"))).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Debit']"))).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dealdetail-icon-shadow']"))).click();
	Thread.sleep(2000);
	
	WebElement p = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//p[text()='Missing History'])[2]")));
	js.executeScript("arguments[0].scrollIntoView(true);", p);
	System.out.println("Looking for Click History");
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//p[text()='Click History'])[2]")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//p[text()='Click History'])[2]"))).click();
	Thread.sleep(1000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dealdetail-icon-shadow']"))).click();
	Thread.sleep(2000);
	
	System.out.println("Looking for Missing History");
	WebElement page = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//p[text()='Missing History'])[2]")));
	js.executeScript("arguments[0].scrollIntoView(true);", page);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//p[text()='Missing History'])[2]"))).click();

	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Pending']"))).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Accepted']"))).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Declined']"))).click();
	Thread.sleep(1000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dealdetail-icon-shadow']")));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='dealdetail-icon-shadow']"))).click();
	
	Thread.sleep(3000);
	driver.quit();
	
	
	
	
	
	
	
	
	
	
}
}

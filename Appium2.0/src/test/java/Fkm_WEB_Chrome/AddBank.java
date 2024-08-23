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

public class AddBank extends Base_Class {

	@Test(retryAnalyzer = Try.class)
public void bank() throws InterruptedException {
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
		WebElement bank = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//h3[text()='Add account'])[2]")));

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", bank);
		Thread.sleep(2000);
	    wait.until(ExpectedConditions.visibilityOf(bank));
	    bank.click();
	    
	    driver.findElement(By.id("bankname")).sendKeys("ICICI");
	    driver.findElement(By.id("bahn")).sendKeys("Tester");
	    driver.findElement(By.id("ban")).sendKeys("56987412365");
	    driver.findElement(By.id("IFSC")).sendKeys("ICIC0089741");
	    
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[text()='Save']")).click();
	    driver.findElement(By.xpath("//button[text()='Save']")).click();
	    Thread.sleep(3000);
	    WebElement save = driver.findElement(By.xpath("//button[text()='Save']"));
	
	    Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@inputmode='numeric'])[1]")).sendKeys("2");
		driver.findElement(By.xpath("(//input[@inputmode='numeric'])[2]")).sendKeys("2");
		driver.findElement(By.xpath("(//input[@inputmode='numeric'])[3]")).sendKeys("4");
		driver.findElement(By.xpath("(//input[@inputmode='numeric'])[4]")).sendKeys("4");
		driver.findElement(By.xpath("(//input[@inputmode='numeric'])[5]")).sendKeys("2");
		driver.findElement(By.xpath("(//input[@inputmode='numeric'])[6]")).sendKeys("2");
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
}
}

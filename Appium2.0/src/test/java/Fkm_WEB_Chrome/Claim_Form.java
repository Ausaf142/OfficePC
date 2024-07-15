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

public class Claim_Form extends Base_Class {
@Test
public void claimForm() throws InterruptedException {
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
	WebElement form = driver.findElement(By.xpath("(//h3[text()='Submit claim form'])[2]"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);", form);
     WebElement Clickform = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//h3[text()='Submit claim form'])[2]")));
     Clickform.click();
	
}
}

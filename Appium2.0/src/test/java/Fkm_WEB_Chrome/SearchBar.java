package Fkm_WEB_Chrome;

import java.sql.Time;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Generic_Utility.Base_Class;
import Generic_Utility.Try;

public class SearchBar extends Base_Class {
	@Test(retryAnalyzer = Try.class)
	public void serach() throws InterruptedException
{
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[contains(@alt,'search icon')])[3]")));
//	driver.findElement(By.xpath("(//img[contains(@alt,'search icon')])[3]")).click();
	
	 try {
         search.click();
         
     } catch (StaleElementReferenceException e) {
         // Re-locate the element and perform the action again
    	 search = driver.findElement(By.xpath("(//img[contains(@alt,'search icon')])[3]"));
    	 search.click();
     }
	


	WebElement searchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='h-input-text__']")));
	searchInput.sendKeys("Myn");
	Thread.sleep(5000);
	searchInput.sendKeys(Keys.ENTER);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@class='dealdetail-icon-shadow']")).click();
	
	
	
		}
}

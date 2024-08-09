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

public class ShopNow_byStorePg extends Base_Class {
	@Test(retryAnalyzer = Try.class)
	public void ShopNow_Store() throws InterruptedException {


		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		JavascriptExecutor js = (JavascriptExecutor)driver;
	
	
		Thread.sleep(2000);
		 for (int i = 0; i < 3; i++) {
		        try {
		            WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class=\"hotdeal-bottom-wrapper\"])[1]")));
		            Thread.sleep(3000); // Adjust sleep time as necessary
		            js.executeScript("arguments[0].scrollIntoView(true);", ele);
		            wait.until(ExpectedConditions.elementToBeClickable(ele));
		            ele.click();
		            break; // Exit loop if click is successful
		        } catch (StaleElementReferenceException e) {
		            System.out.println("StaleElementReferenceException caught. Retrying... " + (i + 1));
		            Thread.sleep(1000); // Adjust sleep time before retrying
		        }
		    }
		 WebElement store = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class=\"dealdetail-simg-wrap\"]")));
		 store.click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[@class=\"storedetail-se-btn\"]")).click();
}
}
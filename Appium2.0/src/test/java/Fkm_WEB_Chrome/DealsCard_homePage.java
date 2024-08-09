package Fkm_WEB_Chrome;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Generic_Utility.Base_Class;
import Generic_Utility.Try;

public class DealsCard_homePage extends Base_Class{
	@Test(retryAnalyzer = Try.class)
public void deal() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	 WebElement card = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='hotdeal-bottom-wrapper'])[1]")));
	
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("arguments[0].scrollIntoView(true);", card);
	 
	 
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='hotdeal-bottom-wrapper'])[1]"))).click();
//	driver.navigate().back();
	
	
	
	
	
	
}
}

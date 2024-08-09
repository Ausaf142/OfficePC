package Fkm_WEB_Chrome;


import java.awt.AWTException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Generic_Utility.Base_Class;
import Generic_Utility.Try;

public class HowFKMworks extends Base_Class {     
	@Test(retryAnalyzer = Try.class)
	public void FKM() throws InterruptedException, AWTException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'h-fkm-work__ ')]")));
		driver.findElement(By.xpath("//div[contains(@class,'h-fkm-work__ ')]")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@alt='back arrow icon']")).click();
		
		
	}

}

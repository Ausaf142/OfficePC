package Fkm_WEB_Chrome;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Generic_Utility.Base_Class;
import Generic_Utility.Try;

public class CategoriesFunctionality extends Base_Class {
	@Test(retryAnalyzer = Try.class)
	public void category() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement category = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='allcategories-img-wrap'])[1]")));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", category);
		category.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dealdetail-icon-shadow']"))).click();
		
		
	}

}

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

public class EditProfile extends Base_Class {
	
	public String name="Testing Account";
	@Test(retryAnalyzer = Try.class)
public void  profile() throws InterruptedException {
	
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
	
		driver.findElement(By.xpath("//a[@class='sidebar-user-wrap']")).click();
		WebElement box = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fullname")));
		box.clear();
		Thread.sleep(1000);
		box.sendKeys(name);
		WebElement saveBtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Save Changes']")));

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", saveBtn);
		saveBtn.click();
		saveBtn.click();
	
		System.out.println(box.getText());
		if((box.getText().equalsIgnoreCase(name))) {
			System.out.println("The name of yours has been successfully changed");
		}
		
}
}

package FKM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Generic_Utility.Base_class;

public class Withdrawal_Money extends Base_class {
	@Test
	public void withdraw_Money() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='menuButton']"))).click();
		driver.findElement(By.xpath("//a[text()='Cashback summary']")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()=' Shop Smart']")));
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//h3[text()='Withdraw Money'])[1]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount"))).sendKeys("99");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Withdraw']"))).click();

		
	}

}

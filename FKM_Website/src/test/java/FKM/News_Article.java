package FKM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Generic_Utility.Base_class;

public class News_Article extends Base_class {
	@Test
	public void newsArticle() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[text()='News & Articles']")));
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement news = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[text()='News & Articles']")));
		js.executeScript("arguments[0].scrollIntoView(true);",news);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='articles_card false'])[1]")));
		driver.findElement(By.xpath("(//div[@class='articles_card false'])[1]")).click();
	}
}

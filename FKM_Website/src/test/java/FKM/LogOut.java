package FKM;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Generic_Utility.Base_class;

public class LogOut extends Base_class {
	@Test
	public void logout() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	Thread.sleep(5000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='menuButton']"))).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='About']"))).click();
//	JavascriptExecutor js = (JavascriptExecutor)driver;
//	js.executeScript("window.scrollBy(0,500);");
	Thread.sleep(2000);
	WebElement log = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Log out ']")));
	Actions act= new Actions(driver);
	act.moveToElement(log).click().perform();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Logout ']"))).click();
	
	//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Log out ']"))).click();
}
}
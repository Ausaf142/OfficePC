package FKM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Generic_Utility.Base_class;

public class DealOfTheDay extends Base_class{
@Test
public void DealOftheDay() throws InterruptedException {
	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='swiper-slide swiper-slide-active']/ancestor::div[@class='swiper-wrapper']/descendant::img[@alt='deal of the day']")));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);", ele);
	Thread.sleep(2000);
	WebElement ele2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='swiper-slide swiper-slide-active']/ancestor::div[@class='swiper-wrapper']/descendant::img[@alt='deal of the day'])[1]")));
	ele2.click();
	
	
	
}
}

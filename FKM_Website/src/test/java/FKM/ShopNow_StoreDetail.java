package FKM;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Generic_Utility.Base_class;

public class ShopNow_StoreDetail extends Base_class{
	
@Test
	public void shopNow_ByStore() throws AWTException, InterruptedException {
	Actions act = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement deal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='hotdeals-wrapper padding-16']/div[@class='hotdeal-main-wrapper']")));
	act.moveToElement(deal).perform();
	WebElement dealCard = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='hotdeals-wrapper padding-16']/div[@class='hotdeal-main-wrapper'])[5]")));
	dealCard.click();
	String shopButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='storedetail-se-btn']"))).getText();
  
    driver.findElement(By.xpath("//div[@class='dealdetail-simg-wrap']")).click();
    Thread.sleep(3000);
    switch (shopButton) {
        case "Shop & Earn":
        	WebElement bt1 = driver.findElement(By.xpath("//a[text()='Shop & Earn']"));
        	act.moveToElement(bt1).click().perform();
            break;
        case "Shop Now":
        	WebElement bt2 = driver.findElement(By.xpath("//a[text()='Shop Now']"));
        	act.moveToElement(bt2).click().perform();
            break;
        default:
        	System.out.println("Invalid button choice.");
            break;
    }
	
}
}
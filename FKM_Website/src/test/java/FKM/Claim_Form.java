package FKM;

import java.awt.AWTException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Generic_Utility.Base_class;

public class Claim_Form extends Base_class {
	String store="indusindcc";
	public String timeStamp = new SimpleDateFormat("dd-MM-yyyy").format(new Date());

@Test
public void claim() throws InterruptedException, AWTException, IOException {
	System.out.println(timeStamp);
	Actions act = new Actions(driver);
	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement search = driver.findElement(By.xpath("//span[text()='Search']"));
    wait.until(ExpectedConditions.elementToBeClickable(search));
    Thread.sleep(4000);
    driver.findElement(By.xpath("//span[text()='Search']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@class='h-input-text__']")).click();
	driver.findElement(By.xpath("//input[@class='h-input-text__']")).sendKeys(store);
	Thread.sleep(8000);
	driver.findElement(By.xpath("(//div[@class='topbrands-wrap'])[1]")).click();
	
	String shopButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='storedetail-se-btn']"))).getText();
	  

    Thread.sleep(3000);
    String parentId = driver.getWindowHandle();
   ;
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
	Set<String> Ids = driver.getWindowHandles();

	for(String allids:Ids) {
		if (!parentId.equals(allids)) {
			driver.switchTo().window(allids);
			Thread.sleep(5000);
			// Perform actions in the new window if necessary.
			// Close the new window.
			driver.close(); 
			driver.switchTo().window(parentId);  // Switch back to the parent window
			break;
		}
	 }

	driver.navigate().refresh();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Cashback claim form']"))).click();
	WebElement dropList = driver.findElement(By.name("select_store"));
	Select sel = new Select(dropList);
	List<WebElement> options = sel.getOptions();
	int length = options.size();
	sel.selectByIndex(length-1);
	driver.findElement(By.id("fd2")).sendKeys("amisha@gmail.com");
	driver.findElement(By.id("fd3")).sendKeys("6598659865");
	driver.findElement(By.id("fd7")).sendKeys("Tester");
	driver.findElement(By.id("fd8")).sendKeys(timeStamp);
	driver.findElement(By.id("fd9")).sendKeys("658");
	WebElement upload = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Upload here']")));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);", upload);
	Thread.sleep(2000);
	
	
	driver.findElement(By.xpath("//img[@alt='upload file']")).click();	
	Runtime.getRuntime().exec("./ClaimFormImg.exe");
	Thread.sleep(5000); 
	//afterr autoIt apply wait for some second for proper execution
	driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();


}
}

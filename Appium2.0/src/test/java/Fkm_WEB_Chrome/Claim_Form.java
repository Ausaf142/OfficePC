package Fkm_WEB_Chrome;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Generic_Utility.Base_Class;
import Generic_Utility.Try;


public class Claim_Form extends Base_Class {
	
	public String store="tataaig";
	public String Date="09-08-2024";
	
@Test(retryAnalyzer = Try.class)
public void claimForm() throws InterruptedException {
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
	
	driver.findElement(By.xpath("(//a[@class=\"sidebar-gmail-section-1\"])[1]")).click();
	WebElement Clickform = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//h3[text()='Submit claim form'])[2]")));

	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);", Clickform);
	Thread.sleep(2000);
    wait.until(ExpectedConditions.visibilityOf(Clickform));
    Clickform.click();
	Thread.sleep(2000);
	 WebElement drop = driver.findElement(By.id("select_store"));
	 drop.click();
	
	driver.findElement(By.xpath("//input[@placeholder='Search Store']")).sendKeys(store);
    WebElement storename = driver.findElement(By.xpath("//p[text()='"+store+"']"));
    WebElement clickedStore = wait.until(ExpectedConditions.visibilityOf(storename));
    clickedStore.click();
	Thread.sleep(2000);
	WebElement clicks = driver.findElement(By.name("select_store"));
	Select select = new Select(clicks);
//	clicks.click();
//	driver.findElements(By.className("android.widget.CheckedTextView")).get(1).click();
	select.selectByIndex(0);
	driver.findElement(By.id("fd2")).sendKeys("Tester@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.id("fd3")).sendKeys("9876543210");
	Thread.sleep(2000);
	driver.findElement(By.id("fd7")).sendKeys("LIFE");
	Thread.sleep(2000);
    WebElement calender = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@aria-label='calendar']"))));
//	WebElement calender = wait.until(ExpectedConditions.visibilityOf(driver.findElement (MobileBy.AccessibilityId("22 July 2024"))));
	calender.click();
	calender.click();
	

//	WebElement selectDate = driver.findElement(By.xpath("//android.view.View[@content-desc='"+Date+"']"));
//	WebElement selectDate = driver.findElement(By.xpath("//android.view.View[@content-desc='16 July 2024']"));
//	WebElement date = wait.until(ExpectedConditions.visibilityOf(selectDate));
//	date.click();
//	WebElement set = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]"));
	Thread.sleep(2000);
	WebElement selectDate = driver.findElement(MobileBy.AccessibilityId("Date"));
	WebElement setDate = wait.until(ExpectedConditions.presenceOfElementLocated((MobileBy.AccessibilityId("Date"))));
	setDate.click();
	
	driver.findElement(By.id("fd9")).sendKeys("120");
	Thread.sleep(2000);
	WebElement file = driver.findElement(By.xpath("//img[@alt='upload file']"));
	file.click();
	Thread.sleep(1000);
	file.click();

	allowAppPermissions(driver);
	
	file.sendKeys("./ss.png");
	driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
}			
public static void allowAppPermissions(WebDriver driver) {
    // Wait for the permission dialog to appear
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    // Click on "Allow" button for permissions
    						
    try {
        WebElement allowButton = driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button"));
        if (allowButton != null) {
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        	WebElement button = wait.until(ExpectedConditions.elementToBeClickable(allowButton));
        	button.click();
        }
    } catch (Exception e) {
        System.out.println("Permission dialog not found: " + e.getMessage());
    }
}
}

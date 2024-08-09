package Generic_Utility;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_class {
	public WebDriver driver;
@BeforeMethod
public void baseClass(){
	driver =new ChromeDriver() ;     
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
 	 driver.get("https://desktop.freekaamaal.com/");
 	 WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
 	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='d_flex']"))).click();
 	 wait.until(ExpectedConditions.elementToBeClickable(By.id("number"))).sendKeys("33223322333");
 	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Get OTP']"))).click();

     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@inputmode='numeric'])[1]")));
	 driver.findElement(By.xpath("(//input[@inputmode='numeric'])[1]")).sendKeys("2");
	 driver.findElement(By.xpath("(//input[@inputmode='numeric'])[2]")).sendKeys("2");
	 driver.findElement(By.xpath("(//input[@inputmode='numeric'])[3]")).sendKeys("4");
	 driver.findElement(By.xpath("(//input[@inputmode='numeric'])[4]")).sendKeys("4");
	 driver.findElement(By.xpath("(//input[@inputmode='numeric'])[5]")).sendKeys("2");
	 driver.findElement(By.xpath("(//input[@inputmode='numeric'])[6]")).sendKeys("2");
	 driver.findElement(By.xpath("//button[text()='Proceed']")).click();
}
@AfterMethod
public void AM() throws InterruptedException {
//	Thread.sleep(2000);
//	driver.close();
}
}

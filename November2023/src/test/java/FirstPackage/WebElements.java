package FirstPackage;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericUtility.Base_Class;
import dev.failsafe.internal.util.Assert;

/* click
 * clear
 * submit
 * isEnable
 * isDisplayed
 * isSelected
 * getText
 * getAttributes
 * getCssValue
 * */

public class WebElements extends Base_Class {
	@Test (groups = "smoke")
	public void WB() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
//		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		boolean result = driver.findElement(By.id("myBtn")).isEnabled();//--isEnable()
		assertEquals(result, null);
		System.out.println(result);
		System.out.println(driver.findElement(By.id("myBtn")).getCssValue("color"));//--CssValue()
		System.out.println(driver.findElement(By.id("myBtn")).getAttribute("id"));//--GetAttribute()
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(3000);
		boolean result2 = driver.findElement(By.id("myBtn")).isEnabled();//--isEnable()

		System.out.println(result2);
		
//		driver.close();
		
}
} 
package FirstPackage;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import GenericUtility.Base;
import GenericUtility.Base_Class;
/*get
 *close
 *quit
 *manage
 *navigate
 *getcurrenturl
 *getpagesoursce
 *getwindowhandle
 *getwindowhandles
 *gettitle
 *switchto */
import GenericUtility.re_Try;

public class WebDriversMethods extends Base_Class{
	
	
	@Test (retryAnalyzer = GenericUtility.re_Try.class)//package.className
	public  void methods() {
//		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
//		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
//		Assert.assertTrue(false);--for retry method
//		driver.findElement(By.id("email")).sendKeys("anaadimika@gmail.com");
		System.out.println("Executed");
		
		
	}
}


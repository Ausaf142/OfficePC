package Website_Automation;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Login {
public static void main(String[]args) throws InterruptedException {
	 WebDriver driver =new ChromeDriver() ;     
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
 	driver.get("https://beta.freekaamaal.com/");
 	driver.findElement(By.xpath("(//span[text()='SignIn'])[2]")).click();
     
     
     
     
     
     
     
     
}
}

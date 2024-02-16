package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Leads {
@Test
public void createLead() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("http://localhost:8888/");
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys(Keys.ENTER);
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.xpath("//img[@alt=\"Create Lead...\"]")).click();
	driver.findElement(By.name("lastname")).sendKeys("adeeb");
	driver.findElement(By.name("company")).sendKeys("FKM");
	driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
	
}
}

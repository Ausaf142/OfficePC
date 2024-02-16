package TestNG;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Organisation {
	public int number() {
	Random ran = new Random();
	int value=ran.nextInt(100);
	return value;
	
	}
@Test
public void Create_organisation() {
	int key=number();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("http://localhost:8888/");
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys(Keys.ENTER);
	driver.findElement(By.linkText("Organizations")).click();
	driver.findElement(By.xpath("//img[@alt=\"Create Organization...\"]")).click();
	driver.findElement(By.name("accountname")).sendKeys("WOOST"+key+"");
	driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
}
@Test  
public void demo() {
	System.out.println("Demo");
}
}
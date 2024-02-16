package Letz_Begin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://omayo.blogspot.com/");
	WebElement drop = driver.findElement(By.id("multiselect1"));
	Select sel =new Select(drop);
	sel.selectByIndex(0);
	sel.selectByValue("swiftx");
	sel.selectByVisibleText("Hyundai");
	
	
	
}
}

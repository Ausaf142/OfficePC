package dekho;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ActionMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");
	Actions act = new Actions(driver);
//	act.scrollByAmount(0, 500).perform();//
	 WebElement scroll = driver.findElement(By.xpath("//button[text()='Try it']"));
	act.scrollToElement(scroll).perform();
//	act.contextClick(scroll).perform();//--contextclick
	
	act.doubleClick(driver.findElement(By.xpath("//button[contains(text() ,' Double')]"))).perform();
	driver.switchTo().alert().dismiss();
	driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/");

	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"))); 
	WebElement src = driver.findElement(By.xpath("//h5[text()='High Tatras 3']"));
	WebElement target = driver.findElement(By.id("trash"));
	act.dragAndDrop(src, target).perform();
	driver.close();
}
}

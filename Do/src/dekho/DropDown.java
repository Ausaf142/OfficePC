package dekho;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement drop = driver.findElement(By.id("drop1"));
		WebElement drop2 = driver.findElement(By.id("multiselect1"));
		Select sel = new Select(drop);
		Select sel2 = new Select(drop2);
		//--checked whether multiple or single select
		System.out.println(sel.isMultiple());
		System.out.println(sel2.isMultiple());
		//Now go For Multiselect
//		sel2.selectByIndex(0);
//		sel2.selectByValue("Hyundaix");
//		sel2.selectByVisibleText("Swift");

		
		
}
}
